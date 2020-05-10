package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.protonNative.mod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerItem {
  @JSImport("proton-native", "PickerItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickerItemProps): Default[tag.type, typingsSlinky.protonNative.mod.PickerItem] = new Default[tag.type, typingsSlinky.protonNative.mod.PickerItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickerItem.type): Default[tag.type, typingsSlinky.protonNative.mod.PickerItem] = new Default[tag.type, typingsSlinky.protonNative.mod.PickerItem](js.Array(this.component, js.Dictionary.empty))()
}

