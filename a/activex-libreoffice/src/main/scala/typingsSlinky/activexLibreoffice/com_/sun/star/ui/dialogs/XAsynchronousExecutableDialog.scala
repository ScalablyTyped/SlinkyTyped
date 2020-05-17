package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog in asynchronous mode. */
@js.native
trait XAsynchronousExecutableDialog extends XInterface {
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setDialogTitle(aTitle: String): Unit = js.native
  /**
    * Executes (shows) the dialog and returns immediately.
    * @param xListener This listener will be called when the dialog is closed.
    */
  def startExecuteModal(xListener: XDialogClosedListener): Unit = js.native
}

object XAsynchronousExecutableDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDialogTitle: String => Unit,
    startExecuteModal: XDialogClosedListener => Unit
  ): XAsynchronousExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDialogTitle = js.Any.fromFunction1(setDialogTitle), startExecuteModal = js.Any.fromFunction1(startExecuteModal))
    __obj.asInstanceOf[XAsynchronousExecutableDialog]
  }
  @scala.inline
  implicit class XAsynchronousExecutableDialogOps[Self <: XAsynchronousExecutableDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetDialogTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDialogTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartExecuteModal(value: XDialogClosedListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startExecuteModal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

