package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng.$sceDelegate
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any = js.native
  def trustAs(`type`: String, value: js.Any): js.Any = js.native
  def valueOf(value: js.Any): js.Any = js.native
}

object ISCEDelegateService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    trustAs: (String, js.Any) => js.Any,
    valueOf: js.Any => js.Any
  ): ISCEDelegateService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), trustAs = js.Any.fromFunction2(trustAs), valueOf = js.Any.fromFunction1(valueOf))
    __obj.asInstanceOf[ISCEDelegateService]
  }
  @scala.inline
  implicit class ISCEDelegateServiceOps[Self <: ISCEDelegateService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTrusted(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrusted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrustAs(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValueOf(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOf")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

