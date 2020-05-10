package typingsSlinky.jsonfile

import typingsSlinky.jsonfile.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.native
  var flag: js.UndefOr[String] = js.native
  var fs: js.UndefOr[FS] = js.native
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
  var throws: js.UndefOr[Boolean] = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
    @scala.inline
    def withThrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throws")(js.undefined)
        ret
    }
  }
  
}

