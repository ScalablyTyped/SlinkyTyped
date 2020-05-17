package typingsSlinky.jsonfile.anon

import typingsSlinky.jsonfile.mod.FS
import typingsSlinky.jsonfile.mod.JFWriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EOL extends JFWriteOptions {
  var EOL: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var flag: js.UndefOr[String] = js.native
  var fs: js.UndefOr[FS] = js.native
  var mode: js.UndefOr[String | Double] = js.native
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var spaces: js.UndefOr[String | Double] = js.native
}

object EOL {
  @scala.inline
  def apply(): EOL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EOL]
  }
  @scala.inline
  implicit class EOLOps[Self <: EOL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEOL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EOL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEOL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EOL")(js.undefined)
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
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
        ret
    }
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: FS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
  }
  
}

