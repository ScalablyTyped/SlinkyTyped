package typingsSlinky.materialUiCore.createPaletteMod

import typingsSlinky.materialUiCore.anon.PartialCommonColors
import typingsSlinky.materialUiCore.anon.PartialTypeAction
import typingsSlinky.materialUiCore.anon.PartialTypeBackground
import typingsSlinky.materialUiCore.anon.PartialTypeText
import typingsSlinky.materialUiCore.mod.PaletteType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteOptions extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.native
  var background: js.UndefOr[PartialTypeBackground] = js.native
  var common: js.UndefOr[PartialCommonColors] = js.native
  var contrastThreshold: js.UndefOr[Double] = js.native
  var divider: js.UndefOr[String] = js.native
  var error: js.UndefOr[PaletteColorOptions] = js.native
  var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.native
  var grey: js.UndefOr[ColorPartial] = js.native
  var primary: js.UndefOr[PaletteColorOptions] = js.native
  var secondary: js.UndefOr[PaletteColorOptions] = js.native
  var text: js.UndefOr[PartialTypeText] = js.native
  var tonalOffset: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[PaletteType] = js.native
}

object PaletteOptions {
  @scala.inline
  def apply(): PaletteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaletteOptions]
  }
  @scala.inline
  implicit class PaletteOptionsOps[Self <: PaletteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: PartialTypeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: PartialTypeBackground): Self = {
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
    def withCommon(value: PartialCommonColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: PaletteColorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContrastText(value: /* background */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContrastText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContrastText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContrastText")(js.undefined)
        ret
    }
    @scala.inline
    def withGrey(value: ColorPartial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: PaletteColorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondary(value: PaletteColorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: PartialTypeText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTonalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tonalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTonalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tonalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PaletteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

