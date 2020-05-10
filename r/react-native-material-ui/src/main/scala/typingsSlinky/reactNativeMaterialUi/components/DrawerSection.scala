package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonItem
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Section
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionItem
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSection {
  @JSImport("react-native-material-ui", "Drawer.Section")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Section] {
    @scala.inline
    def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonItem): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerSectionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[DrawerSectionItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerSectionProps]))
  }
}

