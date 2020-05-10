package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonComponentDxLookup
import typingsSlinky.devextreme.AnonHide
import typingsSlinky.devextreme.AnonPreviousValueValue
import typingsSlinky.devextreme.AnonReachedLeft
import typingsSlinky.devextreme.AnonTitleElement
import typingsSlinky.devextreme.devextremeStrings.nextButton
import typingsSlinky.devextreme.devextremeStrings.scrollBottom
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLookupOptions extends dxDropDownListOptions[dxLookup] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  var animation: js.UndefOr[AnonHide] = js.native
  /** The text displayed on the Apply button. */
  var applyButtonText: js.UndefOr[String] = js.native
  /** The text displayed on the Cancel button. */
  var cancelButtonText: js.UndefOr[String] = js.native
  /** Specifies whether or not the widget cleans the search box when the popup window is displayed. */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.native
  /** The text displayed on the Clear button. */
  var clearButtonText: js.UndefOr[String] = js.native
  /** Specifies whether to close the drop-down menu if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  /** Specifies a custom template for the input field. */
  var fieldTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** A Boolean value specifying whether or not to display the lookup in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /** The text displayed on the button used to load the next page from the data source. */
  var nextButtonText: js.UndefOr[String] = js.native
  /** A function that is executed before the next page is loaded. */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ AnonComponentDxLookup, _]] = js.native
  /** A function that is executed when the "pull to refresh" gesture is performed on the drop-down item list. Supported in mobile themes only. */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ AnonComponentDxLookup, _]] = js.native
  /** A function that is executed on each scroll gesture performed on the drop-down item list. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedLeft, _]] = js.native
  /** A function that is executed when the drop-down list's title is rendered. */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ AnonTitleElement, _]] = js.native
  /** A function that is executed after the widget's value is changed. */
  @JSName("onValueChanged")
  var onValueChanged_dxLookupOptions: js.UndefOr[js.Function1[/* e */ AnonPreviousValueValue, _]] = js.native
  /** Specifies whether the next page is loaded when a user scrolls the widget to the bottom or when the "next" button is clicked. */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.native
  /** Specifies the text shown in the pullDown panel, which is displayed when the widget is scrolled to the bottom. */
  var pageLoadingText: js.UndefOr[String] = js.native
  /** Specifies the popup element's height. Applies only if fullScreen is false. */
  var popupHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** Specifies the popup element's width. Applies only if fullScreen is false. */
  var popupWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** An object defining widget positioning options. */
  var position: js.UndefOr[positionConfig] = js.native
  /** A Boolean value specifying whether or not the widget supports the "pull down to refresh" gesture. */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the text displayed in the pullDown panel when the widget is pulled below the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.native
  /** Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.native
  /** Specifies the text displayed in the pullDown panel while the widget is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.native
  /** The text that is provided as a hint in the lookup's search bar. */
  var searchPlaceholder: js.UndefOr[String] = js.native
  /** Specifies whether to shade the container when the lookup is active. Applies only if usePopover is false. */
  var shading: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the Cancel button in the lookup window. */
  var showCancelButton: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not to display the title in the popup window. */
  var showPopupTitle: js.UndefOr[Boolean] = js.native
  /** The title of the lookup window. */
  var title: js.UndefOr[String] = js.native
  /** Specifies a custom template for the title. */
  var titleTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies whether or not the widget uses native scrolling. */
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to show lookup contents in a Popover widget. */
  var usePopover: js.UndefOr[Boolean] = js.native
}

object dxLookupOptions {
  @scala.inline
  def apply(): dxLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLookupOptions]
  }
  @scala.inline
  implicit class dxLookupOptionsOps[Self <: dxLookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnonHide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanSearchOnOpening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSearchOnOpening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanSearchOnOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSearchOnOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnOutsideClickFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloseOnOutsideClick(value: Boolean | js.Function0[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutsideClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTemplateFunction2(value: (/* selectedItem */ js.Any, /* fieldElement */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFieldTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageLoading(value: /* e */ AnonComponentDxLookup => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullRefresh(value: /* e */ AnonComponentDxLookup => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPullRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* e */ AnonReachedLeft => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleRendered(value: /* e */ AnonTitleElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTitleRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonPreviousValueValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadMode(value: nextButton | scrollBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupHeightFunction0(value: () => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopupHeight(value: Double | String | (js.Function0[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidthFunction0(value: () => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopupWidth(value: Double | String | (js.Function0[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: positionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRefreshEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRefreshEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPulledDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulledDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullingDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullingDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withShading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shading")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopupTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withTitleTemplateFunction1(value: /* titleElement */ dxElement => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePopover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(js.undefined)
        ret
    }
  }
  
}

