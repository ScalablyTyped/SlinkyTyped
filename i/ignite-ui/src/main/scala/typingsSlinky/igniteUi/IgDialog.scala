package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDialog
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised after the end of the animation when the dialog was closed or opened.
  	 */
  var animationEnded: js.UndefOr[AnimationEndedEvent] = js.native
  /**
  	 * Event which is raised when the dialog or its content loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.native
  /**
  	 * Gets/Sets the animation applied to the dialog when it is closed. That can be any object supported by the jquery hide(param) method.
  	 *
  	 */
  var closeAnimation: js.UndefOr[js.Any] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the close button in the dialog. Use option [locale.closeButtonTitle](ui.igdialog#options:locale.closeButtonTitle).
  	 */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether the dialog should close when Esc key is pressed.
  	 *
  	 */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the container html element for the dialog.
  	 * That can be reference to html element, jquery selector or jquery object.
  	 * By default the parent form of the original target element is used. If a form is not found, then the body is used.
  	 * Note: If the "position" of the container is not set or it is "static", then the position is set to "relative".
  	 *
  	 */
  var container: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the name of the css class which is applied to the main DIV element of the dialog.
  	 *
  	 */
  var dialogClass: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether the dialog can be dragged by the user.
  	 *
  	 */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the processing of the double-click on the dialog-header.If this option is not false and dialog was minimized, then its state will be set to normal.
  	 * If this option is set to "auto" and showMaximizeButton is enabled or if this option is set to true, then the dialog will be maximized when it was in normal state,
  	 * and dialog-state will be set to normal if it was maximized.
  	 *
  	 */
  var enableDblclick: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the ability to adjust the state of the header depending on focused and not-focused states. Note: the "trackFocus" option should be enabled.
  	 *
  	 */
  var enableHeaderFocus: js.UndefOr[Boolean] = js.native
  /**
  	 * Event which is raised when the dialog or its content gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.native
  /**
  	 * Gets/Sets the text which appears in the footer of the dialog.
  	 *
  	 */
  var footerText: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the text which appears in the header of the dialog.
  	 *
  	 */
  var headerText: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the initial height of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  	 * Gets the name of the css class which is applied to the SPAN element located on the left side of the header.
  	 *
  	 */
  var imageClass: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgDialogLocale] = js.native
  /**
  	 * Gets the jquery DIV object which is used as the main container for the dialog.
  	 * Notes:
  	 * 1. That object is optional and it should not contain any children.
  	 * 2. It should not have parent.
  	 * 3. It should not contain attributes which might destroy layout or appearance of the dialog.
  	 * 4. Change of that option is not supported.
  	 *
  	 */
  var mainElement: js.UndefOr[Element] = js.native
  /**
  	 * Gets/Sets the maximal height of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the maximal width of the dialog in normal state. Note: that option has effect only while resizing the dialog by the end user.
  	 *
  	 */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var maximizeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the minimal height of the dialog in normal state.
  	 *
  	 */
  var minHeight: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the minimal width of the dialog in normal state.
  	 *
  	 */
  var minWidth: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog. Use option [locale.minimizeButtonTitle](ui.igdialog#options:locale.minimizeButtonTitle).
  	 */
  var minimizeButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the modal state of the dialog.
  	 * If there are more than 1 modal igDialog, then the last opened dialog wins and becomes on the top.
  	 * Note: the modal functionality is not supported when the dialog is minimized or pinned, because that will trigger misbehavior.
  	 *
  	 */
  var modal: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the animation applied to the dialog when it is opened. That can be any object supported by the jquery show(param) method.
  	 *
  	 */
  var openAnimation: js.UndefOr[js.Any] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the pin button in the dialog. Use option [locale.pinButtonTitle](ui.igdialog#options:locale.pinButtonTitle).
  	 */
  var pinButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether the dialog will be pinned on minimize.
  	 *
  	 */
  var pinOnMinimized: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the dialog is pinned.
  	 * When the dialog is pinned, then the html element of the dialog is moved to the original container where the target element was located and position:absolute is removed.
  	 * The pinned dialog does not support modal state, maximized state and it can not be moved.
  	 * Notes:
  	 * 1. If the parent element of the original target-element is invisible, then the pinned dialog becomes invisible as well.
  	 * 2. Pinned state is not supported for modal dialog.
  	 *
  	 */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the initial position of the dialog. That should be an object, which contains "top" and "left" members or an object
  	 * supported by jquery.position(param) method. Examples: { left: 100, top: 200 }, { my: "left top", at: "left top", offset: "100 200" }
  	 *
  	 */
  var position: js.UndefOr[js.Any] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets/Sets whether the dialog can be resized by the user.
  	 *
  	 */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.  Use option [locale.restoreButtonTitle](ui.igdialog#options:locale.restoreButtonTitle).
  	 */
  var restoreButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether the close button in the dialog header should be visible.
  	 *
  	 */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the dialog footer should be visible.
  	 *
  	 */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the dialog header should be visible.
  	 *
  	 */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the maximize button in the dialog header should be visible.
  	 *
  	 */
  var showMaximizeButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the minimize button in the dialog header should be visible.
  	 *
  	 */
  var showMinimizeButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the pin button in the dialog header should be visible.
  	 *
  	 */
  var showPinButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the state of the dialog.Note: when the dialog is modal, then pinned and minimized states are not supported, because that will trigger misbehavior.
  	 *
  	 *
  	 * Valid values:
  	 * "opened" The dialog is opened.
  	 * "minimized" The dialog is minimized.
  	 * "maximized" The dialog is maximized.
  	 * "closed" The dialog is closed.
  	 */
  var state: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised after the state of the dialog was changed.
  	 */
  var stateChanged: js.UndefOr[StateChangedEvent] = js.native
  /**
  	 * Event which is raised before the state of the dialog was changed.
  	 * Return false in order to cancel the action.
  	 */
  var stateChanging: js.UndefOr[StateChangingEvent] = js.native
  /**
  	 * Gets/Sets the value for the tabIndex attribute applied to the main html element of the dialog.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the temporary value for src, which is used while changing the parent of the base element if it is an instance of IFRAME. That allows getting around possible JavaScript exceptions under IE.
  	 *
  	 */
  var temporaryUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the ability to process focus and blur events of the child elements located in the dialog in order to maintain the focused state.
  	 * Notes:
  	 * If that option is enabled, then focus and blur event handlers are added to all the child elements of the dialog.
  	 * If the dialog is modal or it can be maximized, then it is not recommended to disable that option.
  	 * If that option is modified after the igDialog was already created, then depending on current state of the dialog, it will be temporary closed-opened or opened-closed.
  	 *
  	 */
  var trackFocus: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets the title/tooltip for the unpin button in the dialog. Use option [locale.unpinButtonTitle](ui.igdialog#options:locale.unpinButtonTitle).
  	 */
  var unpinButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the initial width of the dialog in pixels for normal state.Besides numeric values, following units are supported: "px", "em" and "%".
  	 * In case of "%", the size of browser window is used and it has effect only on open action.
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.native
  /**
  	 * Gets/Sets the value of zIndex applied to the main html element of the dialog. If value is not set, then 1000 is used.
  	 *
  	 */
  var zIndex: js.UndefOr[Double] = js.native
}

object IgDialog {
  @scala.inline
  def apply(): IgDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDialog]
  }
  @scala.inline
  implicit class IgDialogOps[Self <: IgDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationEnded(value: (/* event */ Event_, /* ui */ AnimationEndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAnimationEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: (/* event */ Event_, /* ui */ BlurEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDblclick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHeaderFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeaderFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHeaderFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeaderFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: (/* event */ Event_, /* ui */ IgFocusEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withImageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgDialogLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMainElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainElement")(js.undefined)
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
    def withMaximizeButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizeButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeButtonTitle")(js.undefined)
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
    def withMinimizeButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizeButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeButtonTitle")(js.undefined)
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
    def withOpenAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withPinButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPinOnMinimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinOnMinimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinOnMinimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinOnMinimized")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
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
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaximizeButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaximizeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaximizeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaximizeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinimizeButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinimizeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinimizeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinimizeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPinButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPinButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPinButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPinButton")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChanged(value: (/* event */ Event_, /* ui */ StateChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChanging(value: (/* event */ Event_, /* ui */ StateChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporaryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpinButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpinButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpinButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
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

