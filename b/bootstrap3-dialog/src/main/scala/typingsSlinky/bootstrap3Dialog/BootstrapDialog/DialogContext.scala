package typingsSlinky.bootstrap3Dialog.BootstrapDialog

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogContext extends js.Object {
  /**  	Close the dialog. Usage: dialogInstance.close() */
  def close(): Unit = js.native
  /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
  def enableButtons(enable: Boolean): Unit = js.native
  def getButton(buttonId: String): JQuery_[HTMLElement] = js.native
  /** Get data entry according to the given key, returns null if no data entry found. */
  def getData(dataName: String): js.Any = js.native
  /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
  def getModal(): JQuery_[HTMLElement] = js.native
  /** Return the raw modal body. */
  def getModalBody(): JQuery_[HTMLElement] = js.native
  /** Return the raw modal content. */
  def getModalContent(): JQuery_[HTMLElement] = js.native
  /** Return the raw modal dialog. */
  def getModalDialog(): JQuery_[HTMLElement] = js.native
  /** Return the raw modal footer. */
  def getModalFooter(): JQuery_[HTMLElement] = js.native
  /** Return the raw modal header. */
  def getModalHeader(): JQuery_[HTMLElement] = js.native
  def getTitle(): String = js.native
  /** Open the dialog. Usage: dialogInstance.open() */
  def open(): Unit = js.native
  /**
    * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
    * before it's shown, you can manually call dialog.realize() before calling dialog.open().
    */
  def realize(): Unit = js.native
  /**
    * When set to true (default), dialog can be closed by clicking close icon in dialog header,
    * or by clicking outside the dialog, or, ESC key is pressed.
    */
  def setClosable(closable: Boolean): Unit = js.native
  /** Bind data entry to dialog instance, value can be any types that javascript supports. */
  def setData(dataName: String, value: js.Any): Unit = js.native
  def setMessage(message: String): Unit = js.native
  def setTitle(title: String): Unit = js.native
  /** See BootstrapDialog.TYPE_xxx constants. */
  def setType(dialogType: String): Unit = js.native
}

object DialogContext {
  @scala.inline
  def apply(
    close: () => Unit,
    enableButtons: Boolean => Unit,
    getButton: String => JQuery_[HTMLElement],
    getData: String => js.Any,
    getModal: () => JQuery_[HTMLElement],
    getModalBody: () => JQuery_[HTMLElement],
    getModalContent: () => JQuery_[HTMLElement],
    getModalDialog: () => JQuery_[HTMLElement],
    getModalFooter: () => JQuery_[HTMLElement],
    getModalHeader: () => JQuery_[HTMLElement],
    getTitle: () => String,
    open: () => Unit,
    realize: () => Unit,
    setClosable: Boolean => Unit,
    setData: (String, js.Any) => Unit,
    setMessage: String => Unit,
    setTitle: String => Unit,
    setType: String => Unit
  ): DialogContext = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), enableButtons = js.Any.fromFunction1(enableButtons), getButton = js.Any.fromFunction1(getButton), getData = js.Any.fromFunction1(getData), getModal = js.Any.fromFunction0(getModal), getModalBody = js.Any.fromFunction0(getModalBody), getModalContent = js.Any.fromFunction0(getModalContent), getModalDialog = js.Any.fromFunction0(getModalDialog), getModalFooter = js.Any.fromFunction0(getModalFooter), getModalHeader = js.Any.fromFunction0(getModalHeader), getTitle = js.Any.fromFunction0(getTitle), open = js.Any.fromFunction0(open), realize = js.Any.fromFunction0(realize), setClosable = js.Any.fromFunction1(setClosable), setData = js.Any.fromFunction2(setData), setMessage = js.Any.fromFunction1(setMessage), setTitle = js.Any.fromFunction1(setTitle), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[DialogContext]
  }
  @scala.inline
  implicit class DialogContextOps[Self <: DialogContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableButtons(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableButtons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetButton(value: String => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetData(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetModal(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModalBody(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModalBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModalContent(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModalContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModalDialog(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModalDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModalFooter(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModalFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModalHeader(value: () => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModalHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRealize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetClosable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClosable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetData(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

