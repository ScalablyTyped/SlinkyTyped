package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng.$sceProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEProvider extends IServiceProvider {
  def enabled(value: Boolean): Unit = js.native
}

object ISCEProvider {
  @scala.inline
  def apply($get: js.Any, enabled: Boolean => Unit): ISCEProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
    __obj.asInstanceOf[ISCEProvider]
  }
  @scala.inline
  implicit class ISCEProviderOps[Self <: ISCEProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

