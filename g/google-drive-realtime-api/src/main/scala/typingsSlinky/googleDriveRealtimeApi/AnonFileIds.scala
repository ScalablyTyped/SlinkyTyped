package typingsSlinky.googleDriveRealtimeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileIds extends js.Object {
  // string containing one or more file ids separated by spaces.
  var fileIds: String = js.native
}

object AnonFileIds {
  @scala.inline
  def apply(fileIds: String): AnonFileIds = {
    val __obj = js.Dynamic.literal(fileIds = fileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileIds]
  }
  @scala.inline
  implicit class AnonFileIdsOps[Self <: AnonFileIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

