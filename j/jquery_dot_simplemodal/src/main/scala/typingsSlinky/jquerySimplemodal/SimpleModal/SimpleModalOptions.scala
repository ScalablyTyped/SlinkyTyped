package typingsSlinky.jquerySimplemodal.SimpleModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleModalOptions extends js.Object {
  /** The jQuery selector to append the elements to. For ASP.NET, use 'form'. Default: 'body'. */
  var appendTo: js.UndefOr[String] = js.native
  /** Automatically position the container upon creation and on window resize? Default: true. (Changed in 1.4) */
  var autoPosition: js.UndefOr[Boolean] = js.native
  /** Resize the container if it exceeds the browser window dimensions? Default: false. (Changed in 1.4) */
  var autoResize: js.UndefOr[Boolean] = js.native
  /** If true, closeHTML, escClose and overlayClose will be used if set. If false, none of them will be used. Default: true. */
  var close: js.UndefOr[Boolean] = js.native
  /** The CSS class used to bind to the close event. Default: 'simplemodal-close'. */
  var closeClass: js.UndefOr[String] = js.native
  /** The HTML for the default close link. SimpleModal will automatically add the closeClass to this element. Default: ''. */
  var closeHTML: js.UndefOr[String] = js.native
  /** The CSS styling for the container div. Default: {}. */
  var containerCss: js.UndefOr[js.Object] = js.native
  /** The DOM element id for the container div. Default: 'simplemodal-container'. */
  var containerId: js.UndefOr[String] = js.native
  /** The CSS styling for the data div. Default: {}. */
  var dataCss: js.UndefOr[js.Object] = js.native
  /** The DOM element id for the data div. Default: 'simplemodal-data'. */
  var dataId: js.UndefOr[String] = js.native
  /** Allow Esc keypress to close the dialog? Default: true. */
  var escClose: js.UndefOr[Boolean] = js.native
  /** Focus in the first visible, enabled element? Default: true. */
  var focus: js.UndefOr[Boolean] = js.native
  /** The maximum height for the container. If not specified, the window height is used. Default: null. */
  var maxHeight: js.UndefOr[Double] = js.native
  /** The maximum width for the container. If not specified, the window width is used. Default: null. */
  var maxWidth: js.UndefOr[Double] = js.native
  /** The minimum height for the container. Default: null. */
  var minHeight: js.UndefOr[Double] = js.native
  /** The minimum width for the container. Default: null. */
  var minWidth: js.UndefOr[Double] = js.native
  /** User will be unable to interact with the page below the modal or tab away from the dialog. If false, the overlay, iframe, and certain events will be disabled allowing the user to interact with the page below the dialog. Default: true. (Added in 1.3.4. Name changed from transient in 1.3.5) */
  var modal: js.UndefOr[Boolean] = js.native
  /** The callback function used in place of SimpleModal's close. Default: null. */
  var onClose: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  /** The callback function used in place of SimpleModal's open. Default: null. */
  var onOpen: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  /** The callback function used after the modal dialog has opened. Default: null. */
  var onShow: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  /** The opacity value for the overlay div, from 0 - 100. Default: 50. */
  var opacity: js.UndefOr[Double] = js.native
  /** Allow click on overlay to close the dialog? Default: false. */
  var overlayClose: js.UndefOr[Boolean] = js.native
  /** The CSS styling for the overlay div. Default: {}. */
  var overlayCss: js.UndefOr[js.Object] = js.native
  /** The DOM element id for the overlay div. Default: 'simplemodal-overlay'. */
  var overlayId: js.UndefOr[String] = js.native
  /** Persist the data across modal calls? Only used for existing DOM elements. If true, the data will be maintained across modal calls, if false, the data will be reverted to its original state. Default: true. */
  var persist: js.UndefOr[Boolean] = js.native
  /** Position of container [top, left]. Can be number of pixels or percentage. Default: null. */
  var position: js.UndefOr[js.Array[_]] = js.native
  /** Starting z-index value. Default: 1000. */
  var zIndex: js.UndefOr[Double] = js.native
}

object SimpleModalOptions {
  @scala.inline
  def apply(): SimpleModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleModalOptions]
  }
  @scala.inline
  implicit class SimpleModalOptionsOps[Self <: SimpleModalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerCss(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCss")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCss(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCss")(js.undefined)
        ret
    }
    @scala.inline
    def withDataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataId")(js.undefined)
        ret
    }
    @scala.inline
    def withEscClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escClose")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* dialog */ SimpleModalDialog => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* dialog */ SimpleModalDialog => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* dialog */ SimpleModalDialog => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayCss(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCss")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayId")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Array[_]): Self = {
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
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

