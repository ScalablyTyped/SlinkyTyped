package typingsSlinky.reactNativeSettingsList.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeSettingsList.mod.SettingsListProps
import typingsSlinky.reactNativeSettingsList.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSettingsList {
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultItemSize(value: Double): this.type = set("defaultItemSize", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultTitleInfoPosition(value: String): this.type = set("defaultTitleInfoPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultTitleStyle(value: StyleProp[TextStyle]): this.type = set("defaultTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultTitleStyleNull: this.type = set("defaultTitleStyle", null)
    @scala.inline
    def scrollViewProps(value: js.Object): this.type = set("scrollViewProps", value.asInstanceOf[js.Any])
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SettingsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeSettingsList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

