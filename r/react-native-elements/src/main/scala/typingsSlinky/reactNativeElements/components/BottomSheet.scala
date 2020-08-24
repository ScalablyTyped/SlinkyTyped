package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeElements.mod.BottomSheetProps
import typingsSlinky.reactNativeElements.mod.ButtonProps
import typingsSlinky.reactNativeElements.mod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomSheet {
  @JSImport("react-native-elements", "BottomSheet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.BottomSheet] {
    @scala.inline
    def cancelButtonIndex(value: Double): this.type = set("cancelButtonIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomSheetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(buttonProps: ButtonProps, list: js.Array[ListItemProps]): Builder = {
    val __props = js.Dynamic.literal(buttonProps = buttonProps.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BottomSheetProps]))
  }
}

