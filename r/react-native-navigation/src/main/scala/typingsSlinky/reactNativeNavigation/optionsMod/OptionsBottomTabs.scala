package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.afterInitialTab
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.alwaysHide
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.alwaysShow
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.black
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.default
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.onSwitchToTab
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.showWhenActive
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.together
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBottomTabs extends js.Object {
  /**
    * Enable animations when toggling visibility
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Set a background color for the bottom tabs
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * Control the Bottom Tabs blur style
    * #### (iOS specific)
    * @requires translucent: true
    * @default 'default'
    */
  var barStyle: js.UndefOr[default | black] = js.native
  /**
    * Switch to another screen within the bottom tabs via screen name
    */
  var currentTabId: js.UndefOr[String] = js.native
  /**
    * Switch to another screen within the bottom tabs via index (starting from 0)
    */
  var currentTabIndex: js.UndefOr[Double] = js.native
  /**
    * Draw screen component under the tab bar
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  /**
    * Set the elevation of the Bottom Tabs in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[Boolean] = js.native
  /**
    * Set when tabs are attached to hierarchy consequently when the
    * RootView's constructor is called.
    */
  var tabsAttachMode: js.UndefOr[together | afterInitialTab | onSwitchToTab] = js.native
  /**
    * Set a testID to reference the bottom tabs
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Control the text display mode below the tab icon
    * #### (Android specific)
    */
  var titleDisplayMode: js.UndefOr[alwaysShow | showWhenActive | alwaysHide] = js.native
  /**
    * Allows the Bottom Tabs to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.native
  /**
    * Show or hide the bottom tabs
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsBottomTabs {
  @scala.inline
  def apply(): OptionsBottomTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTabs]
  }
  @scala.inline
  implicit class OptionsBottomTabsOps[Self <: OptionsBottomTabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyle(value: default | black): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTabId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTabId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBehind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBehind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBehind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBehind")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: AndroidDensityNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsAttachMode(value: together | afterInitialTab | onSwitchToTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsAttachMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsAttachMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsAttachMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleDisplayMode(value: alwaysShow | showWhenActive | alwaysHide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

