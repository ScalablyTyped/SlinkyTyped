package typingsSlinky.reactNativeSettingsList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSettingsList.mod.HeaderProps
import typingsSlinky.reactNativeSettingsList.mod.ItemProps
import typingsSlinky.reactNativeSettingsList.mod.SettingsListProps
import typingsSlinky.reactNativeSettingsList.mod.default
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typingsSlinky.reactNativeSettingsList.reactNativeSettingsListStrings.Top
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
  object Header {
    @JSImport("react-native-settings-list", "default.Header")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Header] {
      @scala.inline
      def headerNumberOfLines(value: Double): this.type = set("headerNumberOfLines", value.asInstanceOf[js.Any])
      @scala.inline
      def headerRef(value: () => Unit): this.type = set("headerRef", js.Any.fromFunction0(value))
      @scala.inline
      def headerStyle(value: StyleProp[TextStyle]): this.type = set("headerStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def headerStyleNull: this.type = set("headerStyle", null)
      @scala.inline
      def headerText(value: String): this.type = set("headerText", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: HeaderProps): typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder = new typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder = new typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Item {
    @JSImport("react-native-settings-list", "default.Item")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Item] {
      @scala.inline
      def arrowIconReactElement(value: ReactElement): this.type = set("arrowIcon", value.asInstanceOf[js.Any])
      @scala.inline
      def arrowIcon(value: ReactElement): this.type = set("arrowIcon", value.asInstanceOf[js.Any])
      @scala.inline
      def arrowStyle(value: StyleProp[ImageStyle]): this.type = set("arrowStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def arrowStyleNull: this.type = set("arrowStyle", null)
      @scala.inline
      def authPropsPW(value: js.Object): this.type = set("authPropsPW", value.asInstanceOf[js.Any])
      @scala.inline
      def authPropsUser(value: js.Object): this.type = set("authPropsUser", value.asInstanceOf[js.Any])
      @scala.inline
      def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      @scala.inline
      def borderHide(value: Top | Bottom | Both): this.type = set("borderHide", value.asInstanceOf[js.Any])
      @scala.inline
      def editableTextStyle(value: StyleProp[TextStyle]): this.type = set("editableTextStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def editableTextStyleNull: this.type = set("editableTextStyle", null)
      @scala.inline
      def hasNavArrow(value: Boolean): this.type = set("hasNavArrow", value.asInstanceOf[js.Any])
      @scala.inline
      def hasSwitch(value: Boolean): this.type = set("hasSwitch", value.asInstanceOf[js.Any])
      @scala.inline
      def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
      @scala.inline
      def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
      @scala.inline
      def isAuth(value: Boolean): this.type = set("isAuth", value.asInstanceOf[js.Any])
      @scala.inline
      def itemBoxStyle(value: StyleProp[ViewStyle]): this.type = set("itemBoxStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def itemBoxStyleNull: this.type = set("itemBoxStyle", null)
      @scala.inline
      def itemRef(value: () => Unit): this.type = set("itemRef", js.Any.fromFunction0(value))
      @scala.inline
      def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
      @scala.inline
      def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
      @scala.inline
      def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
      @scala.inline
      def rightSideContentReactElement(value: ReactElement): this.type = set("rightSideContent", value.asInstanceOf[js.Any])
      @scala.inline
      def rightSideContent(value: ReactElement): this.type = set("rightSideContent", value.asInstanceOf[js.Any])
      @scala.inline
      def rightSideStyle(value: StyleProp[ViewStyle]): this.type = set("rightSideStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def rightSideStyleNull: this.type = set("rightSideStyle", null)
      @scala.inline
      def switchOnValueChange(value: () => Unit): this.type = set("switchOnValueChange", js.Any.fromFunction0(value))
      @scala.inline
      def switchProps(value: js.Object): this.type = set("switchProps", value.asInstanceOf[js.Any])
      @scala.inline
      def switchState(value: Boolean): this.type = set("switchState", value.asInstanceOf[js.Any])
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def titleBoxStyle(value: StyleProp[ViewStyle]): this.type = set("titleBoxStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def titleBoxStyleNull: this.type = set("titleBoxStyle", null)
      @scala.inline
      def titleInfo(value: String): this.type = set("titleInfo", value.asInstanceOf[js.Any])
      @scala.inline
      def titleInfoPosition(value: String): this.type = set("titleInfoPosition", value.asInstanceOf[js.Any])
      @scala.inline
      def titleInfoStyle(value: StyleProp[TextStyle]): this.type = set("titleInfoStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def titleInfoStyleNull: this.type = set("titleInfoStyle", null)
      @scala.inline
      def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
      @scala.inline
      def titleStyleNull: this.type = set("titleStyle", null)
      @scala.inline
      def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ItemProps): typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder = new typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Item.type): typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder = new typingsSlinky.reactNativeSettingsList.components.ReactNativeSettingsList.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

