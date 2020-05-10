package typingsSlinky.archiver.mod

import typingsSlinky.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipOptions extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var forceLocalTime: js.UndefOr[Boolean] = js.native
  var forceZip64: js.UndefOr[Boolean] = js.native
  var store: js.UndefOr[Boolean] = js.native
  var zlib: js.UndefOr[ZlibOptions] = js.native
}

object ZipOptions {
  @scala.inline
  def apply(): ZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipOptions]
  }
  @scala.inline
  implicit class ZipOptionsOps[Self <: ZipOptions] (val x: Self) extends AnyVal {
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
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withForceLocalTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLocalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withForceZip64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceZip64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withZlib(value: ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(js.undefined)
        ret
    }
  }
  
}

