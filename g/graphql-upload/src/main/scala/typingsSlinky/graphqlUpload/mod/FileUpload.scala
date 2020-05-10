package typingsSlinky.graphqlUpload.mod

import typingsSlinky.fsCapacitor.mod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUpload extends js.Object {
  var encoding: String = js.native
  var filename: String = js.native
  var mimetype: String = js.native
  def createReadStream(): ReadStream = js.native
}

object FileUpload {
  @scala.inline
  def apply(createReadStream: () => ReadStream, encoding: String, filename: String, mimetype: String): FileUpload = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpload]
  }
  @scala.inline
  implicit class FileUploadOps[Self <: FileUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateReadStream(value: () => ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReadStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

