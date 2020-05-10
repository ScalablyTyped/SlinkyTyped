package typingsSlinky.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipLoadOptions extends js.Object {
  var base64: js.UndefOr[Boolean] = js.native
  var checkCRC32: js.UndefOr[Boolean] = js.native
  var createFolders: js.UndefOr[Boolean] = js.native
  var decodeFileName: js.UndefOr[js.Function1[/* filenameBytes */ js.typedarray.Uint8Array, String]] = js.native
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
}

object JSZipLoadOptions {
  @scala.inline
  def apply(): JSZipLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSZipLoadOptions]
  }
  @scala.inline
  implicit class JSZipLoadOptionsOps[Self <: JSZipLoadOptions] (val x: Self) extends AnyVal {
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
    def withCheckCRC32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCRC32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC32")(js.undefined)
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
    def withDecodeFileName(value: /* filenameBytes */ js.typedarray.Uint8Array => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecodeFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFileName")(js.undefined)
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
  }
  
}

