package typingsSlinky.openfin.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySnapshotOptions extends js.Object {
  var closeExistingWindows: Boolean = js.native
}

object ApplySnapshotOptions {
  @scala.inline
  def apply(closeExistingWindows: Boolean): ApplySnapshotOptions = {
    val __obj = js.Dynamic.literal(closeExistingWindows = closeExistingWindows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySnapshotOptions]
  }
  @scala.inline
  implicit class ApplySnapshotOptionsOps[Self <: ApplySnapshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseExistingWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeExistingWindows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

