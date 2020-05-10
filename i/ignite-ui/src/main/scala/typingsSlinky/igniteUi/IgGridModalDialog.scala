package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridModalDialog
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.native
  var buttonApplyDisabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired when the button Cancel is clicked
  	 */
  var buttonCancelClick: js.UndefOr[ButtonCancelClickEvent] = js.native
  /**
  	 * Event fired when the button OK/Apply is clicked
  	 */
  var buttonOKClick: js.UndefOr[ButtonOKClickEvent] = js.native
  /**
  	 * If true and Enter is pressed - close modal dialog(NOTE: buttonApplyDisabled should be set to false - otherwise this options is ignored)
  	 */
  var closeModalDialogOnEnter: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  /**
  	 * The default modal dialog height in pixels.
  	 */
  var modalDialogHeight: js.UndefOr[Double] = js.native
  /**
  	 * Event fired every time the modal dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  /**
  	 * The default modal dialog width in pixels.
  	 */
  var modalDialogWidth: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  var renderFooterButtons: js.UndefOr[Boolean] = js.native
  /**
  	 * Tab index to assign to containers and buttons inside the dialog
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
}

object IgGridModalDialog {
  @scala.inline
  def apply(): IgGridModalDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridModalDialog]
  }
  @scala.inline
  implicit class IgGridModalDialogOps[Self <: IgGridModalDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonApplyDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonApplyDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonApplyDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonApplyDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonCancelClick(value: (/* event */ Event_, /* ui */ ButtonCancelClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonCancelClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutButtonCancelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonCancelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonOKClick(value: (/* event */ Event_, /* ui */ ButtonOKClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOKClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutButtonOKClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOKClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseModalDialogOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModalDialogOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseModalDialogOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModalDialogOnEnter")(js.undefined)
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
    def withLocale(value: js.Any): Self = {
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
    def withModalDialogClosed(value: (/* event */ Event_, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogClosing(value: (/* event */ Event_, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendered(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogContentsRendering(value: (/* event */ Event_, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogContentsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogContentsRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogMoving(value: (/* event */ Event_, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpened(value: (/* event */ Event_, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogOpening(value: (/* event */ Event_, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModalDialogOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogWidth")(js.undefined)
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
    def withRenderFooterButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooterButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFooterButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooterButtons")(js.undefined)
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
  }
  
}

