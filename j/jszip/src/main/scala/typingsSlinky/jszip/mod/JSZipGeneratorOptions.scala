package typingsSlinky.jszip.mod

import typingsSlinky.jszip.AnonLevel
import typingsSlinky.jszip.jszipStrings.DOS
import typingsSlinky.jszip.jszipStrings.UNIX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipGeneratorOptions[T /* <: OutputType */] extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var compression: js.UndefOr[Compression] = js.native
  var compressionOptions: js.UndefOr[Null | AnonLevel] = js.native
  var encodeFileName: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
  /**
    * mime-type for the generated file.
    * Useful when you need to generate a file with a different extension, ie: “.ods”.
    * @default 'application/zip'
    */
  var mimeType: js.UndefOr[String] = js.native
  /** DOS (default) or UNIX */
  var platform: js.UndefOr[DOS | UNIX] = js.native
  /** Stream the files and create file descriptors */
  var streamFiles: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[T] = js.native
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply[T](): JSZipGeneratorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSZipGeneratorOptions[T]]
  }
  @scala.inline
  implicit class JSZipGeneratorOptionsOps[Self[t] <: JSZipGeneratorOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComment(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Compression): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionOptions(value: AnonLevel): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionOptionsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(null)
        ret
    }
    @scala.inline
    def withEncodeFileName(value: /* filename */ String => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeFileName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: DOS | UNIX): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamFiles(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamFiles: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

