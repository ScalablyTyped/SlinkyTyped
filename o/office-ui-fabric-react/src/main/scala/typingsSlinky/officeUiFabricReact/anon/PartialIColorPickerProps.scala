package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
@js.native
trait PartialIColorPickerProps extends js.Object {
  var alphaLabel: js.UndefOr[String] = js.native
  var alphaSliderHidden: js.UndefOr[Boolean] = js.native
  var blueLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[IColor | String] = js.native
  var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.native
  var greenLabel: js.UndefOr[String] = js.native
  var hexLabel: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[Event, HTMLElement], /* color */ IColor, scala.Unit]
  ] = js.native
  var redLabel: js.UndefOr[String] = js.native
  var showPreview: js.UndefOr[Boolean] = js.native
  var strings: js.UndefOr[IColorPickerStrings] = js.native
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object PartialIColorPickerProps {
  @scala.inline
  def apply(): PartialIColorPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorPickerProps]
  }
  @scala.inline
  implicit class PartialIColorPickerPropsOps[Self <: PartialIColorPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaSliderHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaSliderHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaSliderHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaSliderHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: IColor | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IColorPicker | Null => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IColorPicker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IColorPicker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHexLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* ev */ SyntheticEvent[Event, HTMLElement], /* color */ IColor) => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: IColorPickerStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IColorPickerStyleProps => Partial[IColorPickerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

