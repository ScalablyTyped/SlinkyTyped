package typingsSlinky.koaMulter.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /** A Buffer of the entire file (MemoryStorage) */
  var buffer: Buffer = js.native
  /** The folder to which the file has been saved (DiskStorage) */
  var destination: String = js.native
  /** Encoding type of the file */
  var encoding: String = js.native
  /** Field name specified in the form */
  var fieldname: String = js.native
  /** The name of the file within the destination (DiskStorage) */
  var filename: String = js.native
  /** Mime type of the file */
  var mimetype: String = js.native
  /** Name of the file on the user's computer */
  var originalname: String = js.native
  /** Location of the uploaded file (DiskStorage) */
  var path: String = js.native
  /** Size of the file in bytes */
  var size: Double = js.native
}

object File {
  @scala.inline
  def apply(
    buffer: Buffer,
    destination: String,
    encoding: String,
    fieldname: String,
    filename: String,
    mimetype: String,
    originalname: String,
    path: String,
    size: Double
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldname")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withOriginalname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

