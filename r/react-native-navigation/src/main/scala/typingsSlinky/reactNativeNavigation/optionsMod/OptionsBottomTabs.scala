package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.afterInitialTab
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.alwaysHide
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.alwaysShow
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.black
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.default
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.onSwitchToTab
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.showWhenActive
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.showWhenActiveForce
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.together
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBottomTabs extends StObject {
  
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
    * Hides the BottomTabs on scroll to increase the amount of content visible to the user.
    * The options requires that the scrollable view will be the root view of the screen and that it specifies `nestedScrollEnabled: true`.
    * #### (Android specific)
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the top line of the Tab Bar
    * #### (iOS specific)
    */
  var hideShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * Use large icons when possible, even when three tabs without titles are displayed
    * #### (android specific)
    * @default false
    */
  var preferLargeIcons: js.UndefOr[Boolean] = js.native
  
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
  var titleDisplayMode: js.UndefOr[alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce] = js.native
  
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
  implicit class OptionsBottomTabsMutableBuilder[Self <: OptionsBottomTabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBarStyle(value: default | black): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setCurrentTabId(value: String): Self = StObject.set(x, "currentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTabIdUndefined: Self = StObject.set(x, "currentTabId", js.undefined)
    
    @scala.inline
    def setCurrentTabIndex(value: Double): Self = StObject.set(x, "currentTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTabIndexUndefined: Self = StObject.set(x, "currentTabIndex", js.undefined)
    
    @scala.inline
    def setDrawBehind(value: Boolean): Self = StObject.set(x, "drawBehind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBehindUndefined: Self = StObject.set(x, "drawBehind", js.undefined)
    
    @scala.inline
    def setElevation(value: AndroidDensityNumber): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
    
    @scala.inline
    def setPreferLargeIcons(value: Boolean): Self = StObject.set(x, "preferLargeIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferLargeIconsUndefined: Self = StObject.set(x, "preferLargeIcons", js.undefined)
    
    @scala.inline
    def setTabsAttachMode(value: together | afterInitialTab | onSwitchToTab): Self = StObject.set(x, "tabsAttachMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsAttachModeUndefined: Self = StObject.set(x, "tabsAttachMode", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTitleDisplayMode(value: alwaysShow | showWhenActive | alwaysHide | showWhenActiveForce): Self = StObject.set(x, "titleDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleDisplayModeUndefined: Self = StObject.set(x, "titleDisplayMode", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
