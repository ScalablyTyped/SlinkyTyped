package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.protonNative.mod.RadioButtonsItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonsItem {
  
  @scala.inline
  def apply(children: String): Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem](js.Array(this.component, __props.asInstanceOf[RadioButtonsItemProps]))
  }
  
  @JSImport("proton-native", "RadioButtonsItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadioButtonsItemProps): Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem] = new Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
