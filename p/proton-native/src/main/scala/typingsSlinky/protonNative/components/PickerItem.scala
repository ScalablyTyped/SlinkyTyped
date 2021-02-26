package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.protonNative.mod.PickerItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerItem {
  
  @scala.inline
  def apply(children: String): Default[tag.type, typingsSlinky.protonNative.mod.PickerItem] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.protonNative.mod.PickerItem](js.Array(this.component, __props.asInstanceOf[PickerItemProps]))
  }
  
  @JSImport("proton-native", "PickerItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PickerItemProps): Default[tag.type, typingsSlinky.protonNative.mod.PickerItem] = new Default[tag.type, typingsSlinky.protonNative.mod.PickerItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
