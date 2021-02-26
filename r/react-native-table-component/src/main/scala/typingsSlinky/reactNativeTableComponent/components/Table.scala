package typingsSlinky.reactNativeTableComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTableComponent.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("react-native-table-component", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTableComponent.mod.Table] {
    
    @scala.inline
    def borderStyle(value: ViewStyle): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
