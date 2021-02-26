package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.PickerIOSItemProps
import typingsSlinky.reactNative.mod.ProcessedColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerIOSItem {
  
  @JSImport("react-native", "PickerIOSItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.PickerIOSItem] {
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textColor(value: ProcessedColorValue): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PickerIOSItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickerIOSItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
