package typingsSlinky.bootstrap3Dialog.BootstrapDialog

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogOptions extends js.Object {
  /** Whether fade-out background while showing the dialog. TRUE by default. */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * When it's true, all modal stuff will be removed from the DOM tree after the dialog is popped down,
    * set it to false if you need your dialog (same instance) pups up and down again and again.
    * Default is true.
    */
  var autodestroy: js.UndefOr[Boolean] = js.native
  /** 'Cancel' by default. */
  var btnCancelLabel: js.UndefOr[String] = js.native
  /** If you didn't specify it, dialog type will be used. */
  var btnOKClass: js.UndefOr[String] = js.native
  /** 'OK' by default. */
  var btnOKLabel: js.UndefOr[String] = js.native
  /** Default button title. OK by default. */
  var buttonLabel: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.native
  /** Result will be true if button was click, while it will be false if users close the dialog directly. */
  var callback: js.UndefOr[js.Function1[/* result */ Boolean, Unit]] = js.native
  /**
    * When set to true, you can close the dialog by:
    *  - Clicking the close icon in dialog header.
    *  - Clicking outside the dialog.
    *  - ESC key.
    *
    * FALSE by default.
    */
  var closable: js.UndefOr[Boolean] = js.native
  /** Whether dialog will close by clicking outside of it. */
  var closeByBackdrop: js.UndefOr[Boolean] = js.native
  /** Whether dialog will close by ESC. */
  var closeByKeyboard: js.UndefOr[Boolean] = js.native
  /** Additional css classes that will be added to your dialog. */
  var cssClass: js.UndefOr[String] = js.native
  /** Data to be bound to the dialog. */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * If provided, 'aria-describedby' attribute will be added to the dialog with the description string as its value. This can improve accessibility, as the description can be read by screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
  /** Whether dialog could be dragged by its header. Cursor could be changed (see doc)! FALSE by default. */
  var draggable: js.UndefOr[Boolean] = js.native
  /** Dialog message. Either string, JQuery element, or function that returns either string or JQuery element. */
  var message: js.UndefOr[
    String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
  ] = js.native
  /**
    * Automatically convert line breaking character to <br /> if it's set to true,
    * everything keeps original if it's false.
    */
  var nl2br: js.UndefOr[Boolean] = js.native
  /** If provided, it will be invoked when the dialog is popped down. */
  var onhidden: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /**
    * If provided, it will be invoked when the dialog is popping down.
    * Return FALSE to don`t close the dialog. Don`t return anything by default.
    */
  var onhide: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], _]] = js.native
  /** If provided, it will be invoked when the dialog is popping up. */
  var onshow: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /** If provided, it will be invoked when the dialog is popped up. */
  var onshown: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /** Text size. See BootstrapDialog.SIZE_xxx constants. By default - SIZE_NORMAL */
  var size: js.UndefOr[String] = js.native
  /** Icon class name, for example 'glyphicon glyphicon-check'. */
  var spinicon: js.UndefOr[String] = js.native
  /** Dialog title. Either string or JQuery element. */
  var title: js.UndefOr[String | JQuery[HTMLElement]] = js.native
  /** Dialog header type. See BootstrapDialog.TYPE_xxx constants. */
  var `type`: js.UndefOr[String] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
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
    def withAutodestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutodestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnCancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnCancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnOKClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnOKClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnOKClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnOKClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnOKLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnOKLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnOKLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnOKLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[DialogButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* result */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withMessageFunction1(value: /* dialog */ js.UndefOr[DialogContext] => String | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(
      value: String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNl2br(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl2br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNl2br: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl2br")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhidden(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnhidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhide(value: /* dialog */ js.UndefOr[DialogContext] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnhide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnshow(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnshown(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnshown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshown")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinicon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinicon")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | JQuery[HTMLElement]): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

