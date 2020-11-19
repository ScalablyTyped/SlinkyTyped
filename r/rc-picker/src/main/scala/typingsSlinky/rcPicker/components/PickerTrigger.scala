package typingsSlinky.rcPicker.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.pickerTriggerMod.PickerTriggerProps
import typingsSlinky.rcPicker.pickerTriggerMod.Placement
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerTrigger {
  
  @JSImport("rc-picker/es/PickerTrigger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def popupPlacement(value: Placement): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickerTriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(popupElement: ReactElement, prefixCls: String, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickerTriggerProps]))
  }
}
