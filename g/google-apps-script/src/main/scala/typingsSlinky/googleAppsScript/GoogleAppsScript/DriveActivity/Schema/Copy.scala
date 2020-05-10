package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Copy extends js.Object {
  var originalObject: js.UndefOr[TargetReference] = js.native
}

object Copy {
  @scala.inline
  def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  @scala.inline
  implicit class CopyOps[Self <: Copy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalObject(value: TargetReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(js.undefined)
        ret
    }
  }
  
}

