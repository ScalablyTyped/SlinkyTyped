package typingsSlinky.reactNativeActionsheet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeActionsheet.mod.ActionSheetProps
import typingsSlinky.reactNativeActionsheet.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeActionsheet {
  
  @scala.inline
  def apply(onPress: Double => Unit, options: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetProps]))
  }
  
  @JSImport("react-native-actionsheet", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def cancelButtonIndex(value: Double): this.type = set("cancelButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destructiveButtonIndex(value: Double): this.type = set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
