package typingsSlinky.officeUiFabricReact.themeGeneratorDocMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.ithemerulesMod.IThemeRules
import typingsSlinky.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeGeneratorPageState extends js.Object {
  var colorPickerElement: HTMLElement | Null = js.native
  var colorPickerSlotRule: IThemeSlotRule | Null = js.native
  var colorPickerVisible: Boolean = js.native
  var themeRules: IThemeRules = js.native
}

object IThemeGeneratorPageState {
  @scala.inline
  def apply(colorPickerVisible: Boolean, themeRules: IThemeRules): IThemeGeneratorPageState = {
    val __obj = js.Dynamic.literal(colorPickerVisible = colorPickerVisible.asInstanceOf[js.Any], themeRules = themeRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGeneratorPageState]
  }
  @scala.inline
  implicit class IThemeGeneratorPageStateOps[Self <: IThemeGeneratorPageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeRules(value: IThemeRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorPickerElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorPickerElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerElement")(null)
        ret
    }
    @scala.inline
    def withColorPickerSlotRule(value: IThemeSlotRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerSlotRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorPickerSlotRuleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPickerSlotRule")(null)
        ret
    }
  }
  
}

