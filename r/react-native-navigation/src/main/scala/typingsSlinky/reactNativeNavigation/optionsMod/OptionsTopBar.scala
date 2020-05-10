package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.black
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTopBar extends js.Object {
  /**
    * Controls whether TopBar visibility changes should be animated
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Back button configuration
    */
  var backButton: js.UndefOr[OptionsTopBarBackButton] = js.native
  /**
    * Background configuration
    */
  var background: js.UndefOr[OptionsTopBarBackground] = js.native
  /**
    * Control the NavBar blur style
    * #### (iOS specific)
    * @requires translucent: true
    * @default 'default'
    */
  var barStyle: js.UndefOr[default | black] = js.native
  /**
    * Change the navbar border color
    * #### (Android specific)
    */
  var borderColor: js.UndefOr[Color] = js.native
  /**
    * Set the border height of the navbar in dp
    * #### (Android specific)
    */
  var borderHeight: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Draw behind the navbar
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  /**
    * Set the elevation of the navbar in dp
    * #### (Android specific)
    */
  var elevation: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Set the height of the navbar in dp
    * #### (Android specific)
    */
  var height: js.UndefOr[AndroidDensityNumber] = js.native
  /**
    * Controls Hiding NavBar on focus UISearchBar
    * #### (iOS 11+ specific)
    */
  var hideNavBarOnFocusSearchBar: js.UndefOr[Boolean] = js.native
  /**
    * Top bar will hide and show based on users scroll direction
    */
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * Control the Large Title configuration
    * #### (iOS 11+ specific)
    */
  var largeTitle: js.UndefOr[OptionsTopBarLargeTitle] = js.native
  /**
    * Change button colors in the top bar
    */
  var leftButtonColor: js.UndefOr[Color] = js.native
  var leftButtonDisabledColor: js.UndefOr[Color] = js.native
  /**
    * List of buttons to the left
    */
  var leftButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.native
  /**
    * Disable the border on bottom of the navbar
    * #### (iOS specific)
    * @default false
    */
  var noBorder: js.UndefOr[Boolean] = js.native
  var rightButtonColor: js.UndefOr[Color] = js.native
  var rightButtonDisabledColor: js.UndefOr[Color] = js.native
  /**
    * List of buttons to the right
    */
  var rightButtons: js.UndefOr[js.Array[OptionsTopBarButton]] = js.native
  /**
    * Show a UISearchBar in the Top Bar
    * #### (iOS 11+ specific)
    */
  var searchBar: js.UndefOr[Boolean] = js.native
  /**
    * Hides the UISearchBar when scrolling
    * #### (iOS 11+ specific)
    */
  var searchBarHiddenWhenScrolling: js.UndefOr[Boolean] = js.native
  /**
    * The placeholder value in the UISearchBar
    * #### (iOS 11+ specific)
    */
  var searchBarPlaceholder: js.UndefOr[String] = js.native
  /**
    * Subtitle configuration
    */
  var subtitle: js.UndefOr[OptionsTopBarSubtitle] = js.native
  /**
    * Can be used to reference the top bar in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Title configuration
    */
  var title: js.UndefOr[OptionsTopBarTitle] = js.native
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.native
  /**
    * Show or hide the top bar
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsTopBar {
  @scala.inline
  def apply(): OptionsTopBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBar]
  }
  @scala.inline
  implicit class OptionsTopBarOps[Self <: OptionsTopBar] (val x: Self) extends AnyVal {
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
    def withBackButton(value: OptionsTopBarBackButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButton")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: OptionsTopBarBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
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
    def withBorderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderHeight(value: AndroidDensityNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderHeight")(js.undefined)
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
    def withHeight(value: AndroidDensityNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNavBarOnFocusSearchBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavBarOnFocusSearchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNavBarOnFocusSearchBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavBarOnFocusSearchBar")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeTitle(value: OptionsTopBarLargeTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButtonColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButtonColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButtonDisabledColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButtonDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButtons(value: js.Array[OptionsTopBarButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButtonColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButtonColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtonColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButtonDisabledColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtonDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButtonDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtonDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButtons(value: js.Array[OptionsTopBarButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBarHiddenWhenScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarHiddenWhenScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBarHiddenWhenScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarHiddenWhenScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBarPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBarPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: OptionsTopBarSubtitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
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
    def withTitle(value: OptionsTopBarTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(js.undefined)
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

