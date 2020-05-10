package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrossOriginInjection extends js.Object {
  var crossOriginInjection: js.UndefOr[Boolean] = js.native
  var sameOriginInjection: js.UndefOr[Boolean] = js.native
}

object AnonCrossOriginInjection {
  @scala.inline
  def apply(): AnonCrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCrossOriginInjection]
  }
  @scala.inline
  implicit class AnonCrossOriginInjectionOps[Self <: AnonCrossOriginInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOriginInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withSameOriginInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameOriginInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameOriginInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameOriginInjection")(js.undefined)
        ret
    }
  }
  
}

