package typingsSlinky.exceljs.mod.stream.xlsx

import typingsSlinky.exceljs.anon.PartialZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiverZipOptions extends js.Object {
  var comment: String = js.native
  var forceLocalTime: Boolean = js.native
  var forceZip64: Boolean = js.native
  var store: Boolean = js.native
  var zlib: PartialZlibOptions = js.native
}

object ArchiverZipOptions {
  @scala.inline
  def apply(
    comment: String,
    forceLocalTime: Boolean,
    forceZip64: Boolean,
    store: Boolean,
    zlib: PartialZlibOptions
  ): ArchiverZipOptions = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], forceLocalTime = forceLocalTime.asInstanceOf[js.Any], forceZip64 = forceZip64.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiverZipOptions]
  }
  @scala.inline
  implicit class ArchiverZipOptionsOps[Self <: ArchiverZipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceLocalTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceZip64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZlib(value: PartialZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

