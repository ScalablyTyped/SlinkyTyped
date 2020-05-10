package typingsSlinky.pizzip.mod

import typingsSlinky.pizzip.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  /**
    * set to `true` if the data is base64 encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option.
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * set to `true` if the data should be treated as raw content, `false` if this is a text. If base64 is used, this defaults to `true`,
    * if the data is not a string, this will be set to `true`.
    * @default false
    */
  var binary: js.UndefOr[Boolean] = js.native
  /**
    * The comment for this file.
    * the zip format has no flag or field to give the encoding of this field and PizZip will use UTF-8.
    * With non ASCII characters you might get encoding issues if the file archiver doesn't use UTF-8 to decode the comment.
    * If not set, PizZip will use the field comment on its options.
    * @default null
    */
  var comment: js.UndefOr[String | Null] = js.native
  /**
    * If set, specifies compression method to use for this specific file. If not, the default file compression will be used (no compression)
    * @default "STORE"
    */
  var compression: js.UndefOr[Compression] = js.native
  /**
    * With `STORE` (no compression), this parameter is ignored.
    * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}` (or any level between 1 (best speed) and 9 (best compression)).
    */
  var compressionOptions: js.UndefOr[AnonLevel | Null] = js.native
  /**
    * Set to true if folders in the file path should be automatically created,
    * otherwise there will only be virtual folders that represent the path to the file.
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.native
  /**
    * the last modification date. defaults to the current date
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * Set to true if this is a directory and content should be ignored.
    * If true or if a permission says it's a folder, this entry be flagged as a folder and the content will be ignored.
    * @default false
    */
  var dir: js.UndefOr[Boolean] = js.native
  /**
    * The DOS  permissions of the file, if any.
    * @default null
    */
  var dosPermissions: js.UndefOr[Double | Null] = js.native
  /**
    * Set to true if (and only if) the input is a "binary string" and has already been prepared with a 0xFF mask.
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc.
    * On nodejs you can use the `mode` attribute of nodejs' fs.Stats.
    * @default null
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
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
    def withCommentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(null)
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
    def withCompressionOptions(value: AnonLevel): Self = {
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
    def withCreateFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDosPermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDosPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withDosPermissionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosPermissions")(null)
        ret
    }
    @scala.inline
    def withOptimizedBinaryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedBinaryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizedBinaryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedBinaryString")(js.undefined)
        ret
    }
    @scala.inline
    def withUnixPermissions(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnixPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnixPermissionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixPermissions")(null)
        ret
    }
  }
  
}

