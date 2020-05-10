package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSkipAccessControl extends js.Object {
  var skipAccessControl: Boolean = js.native
}

object AnonSkipAccessControl {
  @scala.inline
  def apply(skipAccessControl: Boolean): AnonSkipAccessControl = {
    val __obj = js.Dynamic.literal(skipAccessControl = skipAccessControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipAccessControl]
  }
  @scala.inline
  implicit class AnonSkipAccessControlOps[Self <: AnonSkipAccessControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipAccessControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAccessControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

