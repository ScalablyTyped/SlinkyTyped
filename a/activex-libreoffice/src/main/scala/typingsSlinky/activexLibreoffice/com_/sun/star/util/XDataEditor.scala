package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects to a model and broadcasts status change events. */
@js.native
trait XDataEditor extends XInterface {
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  var Model: XInterface = js.native
  /** registers a listener to receive `DataEditorEvent` s. */
  def addDataEditorListener(listener: XDataEditorListener): Unit = js.native
  /** @returns the data model which was set by {@link XDataEditor.setModel()} . */
  def getModel(): XInterface = js.native
  /** unregisters a listener. */
  def removeDataEditorListener(listener: XDataEditorListener): Unit = js.native
  /** connects the data editor to a data model. */
  def setModel(model: XInterface): Unit = js.native
  /** makes the data editor visible to the user. */
  def show(): Unit = js.native
}

object XDataEditor {
  @scala.inline
  def apply(
    Model: XInterface,
    acquire: () => Unit,
    addDataEditorListener: XDataEditorListener => Unit,
    getModel: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDataEditorListener: XDataEditorListener => Unit,
    setModel: XInterface => Unit,
    show: () => Unit
  ): XDataEditor = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataEditorListener = js.Any.fromFunction1(addDataEditorListener), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataEditorListener = js.Any.fromFunction1(removeDataEditorListener), setModel = js.Any.fromFunction1(setModel), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[XDataEditor]
  }
  @scala.inline
  implicit class XDataEditorOps[Self <: XDataEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDataEditorListener(value: XDataEditorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDataEditorListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetModel(value: () => XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveDataEditorListener(value: XDataEditorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDataEditorListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModel(value: XInterface => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

