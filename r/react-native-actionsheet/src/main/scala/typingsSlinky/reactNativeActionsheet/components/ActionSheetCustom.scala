package typingsSlinky.reactNativeActionsheet.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeActionsheet.mod.ActionSheetCustomProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionSheetCustom {
  @JSImport("react-native-actionsheet", "ActionSheetCustom")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeActionsheet.mod.ActionSheetCustom] {
    @scala.inline
    def buttonUnderlayColor(value: String): this.type = set("buttonUnderlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelButtonIndex(value: Double): this.type = set("cancelButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def destructiveButtonIndex(value: Double): this.type = set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetCustomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onPress: Double => Unit, options: js.Array[TagMod[Any]]): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetCustomProps]))
  }
}

