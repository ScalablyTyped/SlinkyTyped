package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XDataEditorMutableBuilder[Self <: XDataEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDataEditorListener(value: XDataEditorListener => Unit): Self = StObject.set(x, "addDataEditorListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModel(value: () => XInterface): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModel(value: XInterface): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveDataEditorListener(value: XDataEditorListener => Unit): Self = StObject.set(x, "removeDataEditorListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModel(value: XInterface => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
