package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.none
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
@js.native
trait PartialIColorPickerProps extends js.Object {
  
  var alphaLabel: js.UndefOr[String] = js.native
  
  var alphaSliderHidden: js.UndefOr[Boolean] = js.native
  
  var alphaType: js.UndefOr[alpha | transparency | none] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlphaLabel(value: String): Self = this.set("alphaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaLabel: Self = this.set("alphaLabel", js.undefined)
    
    @scala.inline
    def setAlphaSliderHidden(value: Boolean): Self = this.set("alphaSliderHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaSliderHidden: Self = this.set("alphaSliderHidden", js.undefined)
    
    @scala.inline
    def setAlphaType(value: alpha | transparency | none): Self = this.set("alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaType: Self = this.set("alphaType", js.undefined)
    
    @scala.inline
    def setBlueLabel(value: String): Self = this.set("blueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueLabel: Self = this.set("blueLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: IColor | String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorPicker | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IColorPicker]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorPicker]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setGreenLabel(value: String): Self = this.set("greenLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenLabel: Self = this.set("greenLabel", js.undefined)
    
    @scala.inline
    def setHexLabel(value: String): Self = this.set("hexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexLabel: Self = this.set("hexLabel", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* ev */ SyntheticEvent[Event, HTMLElement], /* color */ IColor) => scala.Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRedLabel(value: String): Self = this.set("redLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedLabel: Self = this.set("redLabel", js.undefined)
    
    @scala.inline
    def setShowPreview(value: Boolean): Self = this.set("showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreview: Self = this.set("showPreview", js.undefined)
    
    @scala.inline
    def setStrings(value: IColorPickerStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
