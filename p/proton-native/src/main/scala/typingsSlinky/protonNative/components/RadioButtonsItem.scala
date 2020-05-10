package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.protonNative.mod.RadioButtonsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButtonsItem {
  @JSImport("proton-native", "RadioButtonsItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioButtonsItemProps): Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem] = new Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RadioButtonsItem.type): Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem] = new Default[tag.type, typingsSlinky.protonNative.mod.RadioButtonsItem](js.Array(this.component, js.Dictionary.empty))()
}

