package typingsSlinky.rmcTabs.defaultTabBarNativeMod

import typingsSlinky.rmcTabs.anon.TabBar
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.propsTypeMod.TabBarPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends TabBarPropsType {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
  var scrollValue: js.UndefOr[js.Any] = js.native
  var styles: js.UndefOr[TabBar] = js.native
  var tabStyle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
  ] = js.native
  var tabsContainerStyle: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
  ] = js.native
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
    def withStyles(value: TabBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
    ): Self = {
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
    def withTabsContainerStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
    ): Self = {
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

