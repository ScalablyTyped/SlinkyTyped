package typingsSlinky.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /**
    * Animation used for navigation commands that modify the layout
    * hierarchy can be controlled in options.
    *
    * Animations can be modified per command and it's also possible
    * to change the default animation for each command.
    *
    * Example:
    ```js
    setRoot: {
    y: {
    from: 1000,
    to: 0,
    duration: 500,
    interpolation: 'accelerate',
    },
    alpha: {
    from: 0,
    to: 1,
    duration: 400,
    startDelay: 100,
    interpolation: 'accelerate'
    }
    }
    ```
    */
  var animations: js.UndefOr[AnimationOptions] = js.native
  
  /**
    * Background image for the screen
    * #### (iOS specific)
    */
  var backgroundImage: js.UndefOr[ImageResource] = js.native
  
  /**
    * Enable or disable automatically blurring focused input, dismissing keyboard on unmount
    * #### (Android specific)
    * @default false
    */
  var blurOnUnmount: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure the bottom tab associated to the screen
    */
  var bottomTab: js.UndefOr[OptionsBottomTab] = js.native
  
  /**
    * Configure the bottom tabs
    */
  var bottomTabs: js.UndefOr[OptionsBottomTabs] = js.native
  
  var fab: js.UndefOr[OptionsFab] = js.native
  
  /**
    * Configure the layout
    */
  var layout: js.UndefOr[OptionsLayout] = js.native
  
  /**
    * Configure the modal
    */
  var modal: js.UndefOr[ModalOptions] = js.native
  
  /**
    * Configure the presentation style of the modal
    */
  var modalPresentationStyle: js.UndefOr[OptionsModalPresentationStyle] = js.native
  
  /**
    * Configure the transition style of the modal
    *
    * #### (Android specific)
    */
  var modalTransitionStyle: js.UndefOr[OptionsModalTransitionStyle] = js.native
  
  /**
    * Configure Android's NavigationBar
    */
  var navigationBar: js.UndefOr[NavigationBarOptions] = js.native
  
  /**
    * Configure the overlay
    */
  var overlay: js.UndefOr[OverlayOptions] = js.native
  
  /**
    * Enable or disable swipe back to pop gesture
    * #### (iOS specific)
    * @default true
    */
  var popGesture: js.UndefOr[Boolean] = js.native
  
  /**
    * Preview configuration for Peek and Pop
    * #### (iOS specific)
    */
  var preview: js.UndefOr[OptionsPreview] = js.native
  
  /**
    * Background image for the Navigation View
    * #### (iOS specific)
    */
  var rootBackgroundImage: js.UndefOr[ImageResource] = js.native
  
  /**
    * Configure the side menu
    */
  var sideMenu: js.UndefOr[OptionsSideMenu] = js.native
  
  /**
    * Configure the splitView controller
    */
  var splitView: js.UndefOr[OptionsSplitView] = js.native
  
  /**
    * Configure the status bar
    */
  var statusBar: js.UndefOr[OptionsStatusBar] = js.native
  
  /**
    * Configure the top bar
    */
  var topBar: js.UndefOr[OptionsTopBar] = js.native
  
  /**
    * Provides a way to configure the overall presentation of your application's main user interface
    * #### (iOS specific)
    */
  var window: js.UndefOr[WindowOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: AnimationOptions): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: ImageResource): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBlurOnUnmount(value: Boolean): Self = StObject.set(x, "blurOnUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurOnUnmountUndefined: Self = StObject.set(x, "blurOnUnmount", js.undefined)
    
    @scala.inline
    def setBottomTab(value: OptionsBottomTab): Self = StObject.set(x, "bottomTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomTabUndefined: Self = StObject.set(x, "bottomTab", js.undefined)
    
    @scala.inline
    def setBottomTabs(value: OptionsBottomTabs): Self = StObject.set(x, "bottomTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomTabsUndefined: Self = StObject.set(x, "bottomTabs", js.undefined)
    
    @scala.inline
    def setFab(value: OptionsFab): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabUndefined: Self = StObject.set(x, "fab", js.undefined)
    
    @scala.inline
    def setLayout(value: OptionsLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setModal(value: ModalOptions): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalPresentationStyle(value: OptionsModalPresentationStyle): Self = StObject.set(x, "modalPresentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalPresentationStyleUndefined: Self = StObject.set(x, "modalPresentationStyle", js.undefined)
    
    @scala.inline
    def setModalTransitionStyle(value: OptionsModalTransitionStyle): Self = StObject.set(x, "modalTransitionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalTransitionStyleUndefined: Self = StObject.set(x, "modalTransitionStyle", js.undefined)
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setNavigationBar(value: NavigationBarOptions): Self = StObject.set(x, "navigationBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationBarUndefined: Self = StObject.set(x, "navigationBar", js.undefined)
    
    @scala.inline
    def setOverlay(value: OverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPopGesture(value: Boolean): Self = StObject.set(x, "popGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopGestureUndefined: Self = StObject.set(x, "popGesture", js.undefined)
    
    @scala.inline
    def setPreview(value: OptionsPreview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setRootBackgroundImage(value: ImageResource): Self = StObject.set(x, "rootBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBackgroundImageUndefined: Self = StObject.set(x, "rootBackgroundImage", js.undefined)
    
    @scala.inline
    def setSideMenu(value: OptionsSideMenu): Self = StObject.set(x, "sideMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideMenuUndefined: Self = StObject.set(x, "sideMenu", js.undefined)
    
    @scala.inline
    def setSplitView(value: OptionsSplitView): Self = StObject.set(x, "splitView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitViewUndefined: Self = StObject.set(x, "splitView", js.undefined)
    
    @scala.inline
    def setStatusBar(value: OptionsStatusBar): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    
    @scala.inline
    def setTopBar(value: OptionsTopBar): Self = StObject.set(x, "topBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBarUndefined: Self = StObject.set(x, "topBar", js.undefined)
    
    @scala.inline
    def setWindow(value: WindowOptions): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
