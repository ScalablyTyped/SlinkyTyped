package typingsSlinky.antDesignReactNative.defaultTabBarMod

import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.antDesignReactNative.tabsStyleMod.TabBarStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType
  extends TabBarPropsType
     with WithThemeStyles[TabBarStyle] {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
  var scrollValue: js.UndefOr[js.Any] = js.native
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicTabUnderlineWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTabUnderlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTabUnderlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTabUnderlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShouldPersistTaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShouldPersistTaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsContainerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsContainerStyle")(js.undefined)
        ret
    }
  }
  
}

