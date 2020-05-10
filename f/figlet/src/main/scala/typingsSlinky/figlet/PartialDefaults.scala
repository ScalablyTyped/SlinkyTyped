package typingsSlinky.figlet

import typingsSlinky.figlet.mod.Fonts_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<figlet.figlet.Defaults> */
@js.native
trait PartialDefaults extends js.Object {
  var font: js.UndefOr[Fonts_] = js.native
  var fontPath: js.UndefOr[String] = js.native
}

object PartialDefaults {
  @scala.inline
  def apply(): PartialDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDefaults]
  }
  @scala.inline
  implicit class PartialDefaultsOps[Self <: PartialDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: Fonts_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontPath")(js.undefined)
        ret
    }
  }
  
}

