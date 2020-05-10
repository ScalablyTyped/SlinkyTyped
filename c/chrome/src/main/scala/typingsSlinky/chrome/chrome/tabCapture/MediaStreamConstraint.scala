package typingsSlinky.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamConstraint extends js.Object {
  var mandatory: js.Object = js.native
  var optional: js.UndefOr[js.Object] = js.native
}

object MediaStreamConstraint {
  @scala.inline
  def apply(mandatory: js.Object): MediaStreamConstraint = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraint]
  }
  @scala.inline
  implicit class MediaStreamConstraintOps[Self <: MediaStreamConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMandatory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

