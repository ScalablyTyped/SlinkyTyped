package typingsSlinky.multer.mod._Global_.Express.Multer

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing file metadata and access information. */
@js.native
trait File extends js.Object {
  /** `MemoryStorage` only: A Buffer containing the entire file. */
  var buffer: Buffer = js.native
  /** `DiskStorage` only: Directory to which this file has been uploaded. */
  var destination: String = js.native
  /**
    * Value of the `Content-Transfer-Encoding` header for this file.
    * @deprecated since July 2015
    * @see RFC 7578, Section 4.7
    */
  var encoding: String = js.native
  /** Name of the form field associated with this file. */
  var fieldname: String = js.native
  /** `DiskStorage` only: Name of this file within `destination`. */
  var filename: String = js.native
  /** Value of the `Content-Type` header for this file. */
  var mimetype: String = js.native
  /** Name of the file on the uploader's computer. */
  var originalname: String = js.native
  /** `DiskStorage` only: Full path to the uploaded file. */
  var path: String = js.native
  /** Size of the file in bytes. */
  var size: Double = js.native
  /**
    * A readable stream of this file. Only available to the `_handleFile`
    * callback for custom `StorageEngine`s.
    */
  var stream: Readable = js.native
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
    size: Double,
    stream: Readable
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
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
    @scala.inline
    def withStream(value: Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

