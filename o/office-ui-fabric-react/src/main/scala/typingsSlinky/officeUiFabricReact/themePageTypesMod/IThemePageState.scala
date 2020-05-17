package typingsSlinky.officeUiFabricReact.themePageTypesMod

import typingsSlinky.officeUiFabricReact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemePageState extends js.Object {
  var activeList: js.UndefOr[String] = js.native
  var colorPickerProps: js.UndefOr[Index] = js.native
  var palette: js.Array[IThemePagePalette] = js.native
  var semanticColors: js.Array[IThemePagePalette] = js.native
}

object IThemePageState {
  @scala.inline
  def apply(palette: js.Array[IThemePagePalette], semanticColors: js.Array[IThemePagePalette]): IThemePageState = {
    val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePageState]
  }
  @scala.inline
  implicit class IThemePageStateOps[Self <: IThemePageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPalette(value: js.Array[IThemePagePalette]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticColors(value: js.Array[IThemePagePalette]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeList")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPickerProps(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerProps")(js.undefined)
        ret
    }
  }
  
}

