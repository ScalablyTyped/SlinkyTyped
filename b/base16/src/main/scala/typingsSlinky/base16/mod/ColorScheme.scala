package typingsSlinky.base16.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScheme extends js.Object {
  var author: String = js.native
  var base00: String = js.native
  var base01: String = js.native
  var base02: String = js.native
  var base03: String = js.native
  var base04: String = js.native
  var base05: String = js.native
  var base06: String = js.native
  var base07: String = js.native
  var base08: String = js.native
  var base09: String = js.native
  var base0A: String = js.native
  var base0B: String = js.native
  var base0C: String = js.native
  var base0D: String = js.native
  var base0E: String = js.native
  var base0F: String = js.native
  var scheme: String = js.native
}

object ColorScheme {
  @scala.inline
  def apply(
    author: String,
    base00: String,
    base01: String,
    base02: String,
    base03: String,
    base04: String,
    base05: String,
    base06: String,
    base07: String,
    base08: String,
    base09: String,
    base0A: String,
    base0B: String,
    base0C: String,
    base0D: String,
    base0E: String,
    base0F: String,
    scheme: String
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], base00 = base00.asInstanceOf[js.Any], base01 = base01.asInstanceOf[js.Any], base02 = base02.asInstanceOf[js.Any], base03 = base03.asInstanceOf[js.Any], base04 = base04.asInstanceOf[js.Any], base05 = base05.asInstanceOf[js.Any], base06 = base06.asInstanceOf[js.Any], base07 = base07.asInstanceOf[js.Any], base08 = base08.asInstanceOf[js.Any], base09 = base09.asInstanceOf[js.Any], base0A = base0A.asInstanceOf[js.Any], base0B = base0B.asInstanceOf[js.Any], base0C = base0C.asInstanceOf[js.Any], base0D = base0D.asInstanceOf[js.Any], base0E = base0E.asInstanceOf[js.Any], base0F = base0F.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
  @scala.inline
  implicit class ColorSchemeOps[Self <: ColorScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase00(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base00")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase04(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base04")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase05(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base05")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase06(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base06")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase07(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base07")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase08(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base08")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase09(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base09")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0A(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0B(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0C(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0D(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0E(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase0F(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base0F")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

