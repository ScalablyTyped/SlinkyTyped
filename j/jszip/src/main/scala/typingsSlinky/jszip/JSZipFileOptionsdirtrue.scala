package typingsSlinky.jszip

import typingsSlinky.jszip.jszipBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jszip.jszip.JSZipFileOptions & {  dir  :true} */
@js.native
trait JSZipFileOptionsdirtrue extends js.Object {
  /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
    * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
    */
  var binary: js.UndefOr[Boolean] = js.native
  var comment: js.UndefOr[String] = js.native
  var compression: js.UndefOr[String] = js.native
  /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
  var createFolders: js.UndefOr[Boolean] = js.native
  /**
    * The last modification date, defaults to the current date.
    */
  var date: js.UndefOr[js.Date] = js.native
  /** Set to `true` if this is a directory and content should be ignored. */
  var dir: js.UndefOr[Boolean with `true`] = js.native
  /** 6 bits number. The DOS permissions of the file, if any. */
  var dosPermissions: js.UndefOr[Double | Null] = js.native
  /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
  /**
    * 16 bits number. The UNIX permissions of the file, if any.
    * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.native
}

object JSZipFileOptionsdirtrue {
  @scala.inline
  def apply(): JSZipFileOptionsdirtrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSZipFileOptionsdirtrue]
  }
  @scala.inline
  implicit class JSZipFileOptionsdirtrueOps[Self <: JSZipFileOptionsdirtrue] (val x: Self) extends AnyVal {
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
    def withCompression(value: String): Self = {
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
    def withDir(value: Boolean with `true`): Self = {
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

