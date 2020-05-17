package typingsSlinky.multer.anon

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<multer.multer.<global>.Express.Multer.File> */
@js.native
trait PartialFile extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.native
  var destination: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldname: js.UndefOr[String] = js.native
  var filename: js.UndefOr[String] = js.native
  var mimetype: js.UndefOr[String] = js.native
  var originalname: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var stream: js.UndefOr[Readable] = js.native
}

object PartialFile {
  @scala.inline
  def apply(): PartialFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFile]
  }
  @scala.inline
  implicit class PartialFileOps[Self <: PartialFile] (val x: Self) extends AnyVal {
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
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldname")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withMimetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimetype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimetype")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalname")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

