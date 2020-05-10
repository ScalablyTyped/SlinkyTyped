package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
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
  var backgroundImage: js.UndefOr[ImageRequireSource] = js.native
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
  /**
    * Custom Transition used for animate shared element between two screens
    * Example:
    ```js
    Navigation.push(this.props.componentId, {
    component: {
    name: 'second.screen',
    options: {
    customTransition: {
    animations: [
    { type: 'sharedElement', fromId: 'image1', toId: 'image2', startDelay: 0, springVelocity: 0.2, duration: 0.5 }
    ],
    duration: 0.8
    }
    }
    }
    });
    ```
    */
  var customTransition: js.UndefOr[OptionsCustomTransition] = js.native
  var fab: js.UndefOr[OptionsFab] = js.native
  /**
    * Configure the layout
    */
  var layout: js.UndefOr[OptionsLayout] = js.native
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
    * Configure the overlay
    */
  var overlay: js.UndefOr[OverlayOptions] = js.native
  /**
    * Props to pass to a component
    */
  var passProps: js.UndefOr[Record[String, _]] = js.native
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
  var rootBackgroundImage: js.UndefOr[ImageRequireSource] = js.native
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
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: AnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: ImageRequireSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurOnUnmount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurOnUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomTab(value: OptionsBottomTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTab")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomTabs(value: OptionsBottomTabs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTransition(value: OptionsCustomTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withFab(value: OptionsFab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fab")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: OptionsLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withModalPresentationStyle(value: OptionsModalPresentationStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalPresentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalPresentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalPresentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withModalTransitionStyle(value: OptionsModalTransitionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalTransitionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalTransitionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalTransitionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: OverlayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPassProps(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPopGesture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: OptionsPreview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withRootBackgroundImage(value: ImageRequireSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBackgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSideMenu(value: OptionsSideMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitView(value: OptionsSplitView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitView")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBar(value: OptionsStatusBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBar(value: OptionsTopBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBar")(js.undefined)
        ret
    }
  }
  
}

