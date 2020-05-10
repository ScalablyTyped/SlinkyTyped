package typingsSlinky.appdmg.mod

import typingsSlinky.appdmg.appdmgStrings.UDBZ
import typingsSlinky.appdmg.appdmgStrings.UDCO
import typingsSlinky.appdmg.appdmgStrings.UDRO
import typingsSlinky.appdmg.appdmgStrings.UDRW
import typingsSlinky.appdmg.appdmgStrings.UDZO
import typingsSlinky.appdmg.appdmgStrings.ULFO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Specification extends js.Object {
  var background: js.UndefOr[String] = js.native
  var `background-color`: js.UndefOr[String] = js.native
  var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.native
  var contents: js.Array[SpecificationContents] = js.native
  var format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO = js.native
  var icon: js.UndefOr[String] = js.native
  var `icon-size`: js.UndefOr[Double] = js.native
  var title: String = js.native
  var window: js.UndefOr[SpecificationWindow] = js.native
}

object Specification {
  @scala.inline
  def apply(
    contents: js.Array[SpecificationContents],
    format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO,
    title: String
  ): Specification = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specification]
  }
  @scala.inline
  implicit class SpecificationOps[Self <: Specification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: js.Array[SpecificationContents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withCode-sign`(value: SpecificationCodeSign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code-sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCode-sign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code-sign")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-size")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: SpecificationWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

