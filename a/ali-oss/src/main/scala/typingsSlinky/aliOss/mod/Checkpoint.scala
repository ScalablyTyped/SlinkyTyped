package typingsSlinky.aliOss.mod

import typingsSlinky.aliOss.anon.Etag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkpoint extends js.Object {
  var doneParts: js.Array[Etag] = js.native
  var file: js.Any = js.native
   //  object key
  var fileSize: Double = js.native
   // The file object selected by the user, if the browser is restarted, it needs the user to manually trigger the settings
  var name: String = js.native
  var partSize: Double = js.native
  var uploadId: String = js.native
}

object Checkpoint {
  @scala.inline
  def apply(
    doneParts: js.Array[Etag],
    file: js.Any,
    fileSize: Double,
    name: String,
    partSize: Double,
    uploadId: String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(doneParts = doneParts.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partSize = partSize.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkpoint]
  }
  @scala.inline
  implicit class CheckpointOps[Self <: Checkpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoneParts(value: js.Array[Etag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

