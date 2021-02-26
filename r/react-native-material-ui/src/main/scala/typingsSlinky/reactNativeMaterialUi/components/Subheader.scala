package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Text
import typingsSlinky.reactNativeMaterialUi.mod.SubheaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subheader {
  
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SubheaderProps]))
  }
  
  @JSImport("react-native-material-ui", "Subheader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Subheader] {
    
    @scala.inline
    def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Text): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SubheaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
