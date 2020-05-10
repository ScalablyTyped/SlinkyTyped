package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQIsDesktop extends js.Object {
  var qIsDesktop: Boolean = js.native
  var qSSOEnabled: Boolean = js.native
}

object AnonQIsDesktop {
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): AnonQIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQIsDesktop]
  }
  @scala.inline
  implicit class AnonQIsDesktopOps[Self <: AnonQIsDesktop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSSOEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSSOEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

