package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.mod.ListItemCenterElement
import typingsSlinky.reactNativeMaterialUi.mod.ListItemProps
import typingsSlinky.reactNativeMaterialUi.mod.ListItemStyle
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("react-native-material-ui", "ListItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ListItem] {
    @scala.inline
    def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def leftElementReactElement(value: ReactElement): this.type = set("leftElement", value.asInstanceOf[js.Any])
    @scala.inline
    def leftElement(value: ReactElement | String): this.type = set("leftElement", value.asInstanceOf[js.Any])
    @scala.inline
    def numberOfLines(value: `1` | `2` | `3` | dynamic): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def onPressValue(value: js.Any): this.type = set("onPressValue", value.asInstanceOf[js.Any])
    @scala.inline
    def onRightElementPress(value: () => Unit): this.type = set("onRightElementPress", js.Any.fromFunction0(value))
    @scala.inline
    def rightElementReactElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def rightElement(value: ReactElement | String): this.type = set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ListItemStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(centerElement: ReactElement | String | ListItemCenterElement): Builder = {
    val __props = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ListItemProps]))
  }
}

