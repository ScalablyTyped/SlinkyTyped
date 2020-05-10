package typingsSlinky.officeUiFabricReact.themePageTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemePageStyles extends js.Object {
  var colorSwatch: IStyle = js.native
  var colorValue: IStyle = js.native
  var swatch: IStyle = js.native
}

object IThemePageStyles {
  @scala.inline
  def apply(): IThemePageStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemePageStyles]
  }
  @scala.inline
  implicit class IThemePageStylesOps[Self <: IThemePageStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSwatch(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSwatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSwatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSwatch")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSwatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSwatch")(null)
        ret
    }
    @scala.inline
    def withColorValue(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValue")(null)
        ret
    }
    @scala.inline
    def withSwatch(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSwatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatch")(null)
        ret
    }
  }
  
}

