package typingsSlinky.pizzip.anon

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.Platform
import typingsSlinky.pizzip.mod.Compression
import typingsSlinky.pizzip.pizzipStrings.DOS
import typingsSlinky.pizzip.pizzipStrings.UNIX
import typingsSlinky.pizzip.pizzipStrings.arraybuffer
import typingsSlinky.pizzip.pizzipStrings.base64
import typingsSlinky.pizzip.pizzipStrings.blob
import typingsSlinky.pizzip.pizzipStrings.nodebuffer
import typingsSlinky.pizzip.pizzipStrings.string
import typingsSlinky.pizzip.pizzipStrings.uint8array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pizzip.pizzip.GenerateOptions & {  type ? :'string' | 'base64'} */
@js.native
trait GenerateOptionstypestring extends js.Object {
  /**
    * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * The comment to use for the zip file.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
    * @default "STORE"
    */
  var compression: js.UndefOr[Compression] = js.native
  /**
    * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
    * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
    * (or any level between 1 (best speed) and 9 (best compression)).
    *
    * Note : if the entry is already compressed (coming from a compressed zip file),
    * calling `generate()` with a different compression level won't update the entry.
    * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
    */
  var compressionOptions: js.UndefOr[Level | Null] = js.native
  /**
    * the function to encode the file name / comment.
    * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
    * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
    * The function takes a string and returns a bytes array (Uint8Array or Array).
    */
  var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
  /**
    * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
    *
    * @default "application/zip"
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
    * When using `UNIX`, the attribute `unixPermissions` of each file is used.
    * If you set the platform value on nodejs, be sure to use `process.platform`.
    * `fs.stats` returns a non executable mode for folders on windows,
    * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
    * @default "DOS"
    */
  var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
  /**
    * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
    * be sure to check if the browser supports it (you can use PizZip.support)
    *
    * `base64` : the result will be a string, the binary in a base64 form.
    *
    * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
    *
    * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
    *
    * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
    *
    * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
    *
    * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
    *
    * @default "base64"
    */
  var `type`: js.UndefOr[
    (base64 | string | uint8array | arraybuffer | blob | nodebuffer) with (string | base64)
  ] = js.native
}

object GenerateOptionstypestring {
  @scala.inline
  def apply(): GenerateOptionstypestring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptionstypestring]
  }
  @scala.inline
  implicit class GenerateOptionstypestringOps[Self <: GenerateOptionstypestring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Compression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionOptions(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(null)
        ret
    }
    @scala.inline
    def withEncodeFileName(value: /* name */ String => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: DOS | UNIX | Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: (base64 | string | uint8array | arraybuffer | blob | nodebuffer) with (string | base64)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

