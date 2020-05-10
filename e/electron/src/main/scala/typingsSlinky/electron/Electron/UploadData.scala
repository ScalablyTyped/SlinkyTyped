package typingsSlinky.electron.Electron

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-data
  /**
    * UUID of blob data. Use method to retrieve the data.
    */
  var blobUUID: String = js.native
  /**
    * Content being sent.
    */
  var bytes: Buffer = js.native
  /**
    * Path of file being uploaded.
    */
  var file: String = js.native
}

object UploadData {
  @scala.inline
  def apply(blobUUID: String, bytes: Buffer, file: String): UploadData = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  @scala.inline
  implicit class UploadDataOps[Self <: UploadData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobUUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

