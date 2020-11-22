package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
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

object ColorPickerBase {
  
  @JSImport("office-ui-fabric-react", "ColorPickerBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ColorPickerBase] {
    
    @scala.inline
    def alphaLabel(value: String): this.type = set("alphaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alphaSliderHidden(value: Boolean): this.type = set("alphaSliderHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alphaType(value: alpha | transparency | none): this.type = set("alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blueLabel(value: String): this.type = set("blueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IColorPicker | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IColorPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IColorPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def greenLabel(value: String): this.type = set("greenLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hexLabel(value: String): this.type = set("hexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* ev */ SyntheticEvent[Event, HTMLElement], /* color */ IColor) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def redLabel(value: String): this.type = set("redLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPreview(value: Boolean): this.type = set("showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strings(value: IColorPickerStrings): this.type = set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(color: IColor | String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IColorPickerProps]))
  }
}
