package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamFile extends js.Object {
  /**
    * The file ID.
    */
  var fileId: js.UndefOr[FileId] = js.native
  /**
    * The location of the file in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}

object StreamFile {
  @scala.inline
  def apply(): StreamFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamFile]
  }
  @scala.inline
  implicit class StreamFileOps[Self <: StreamFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileId(value: FileId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Location(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(js.undefined)
        ret
    }
  }
  
}

