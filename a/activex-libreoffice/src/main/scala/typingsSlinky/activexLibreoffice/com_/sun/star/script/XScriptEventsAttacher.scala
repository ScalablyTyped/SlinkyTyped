package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface can be used to attach script events to a number of objects that give access to the definition of events that should be attached to
  * them, e.g., by supporting XEventsSupplier
  */
@js.native
trait XScriptEventsAttacher extends XInterface {
  
  /**
    * Attaches the events defined by {@link XScriptEventsSupplier} to the corresponding object implementing {@link XScriptEventsSupplier} .
    * @param Objects Sequence of all objects. Usually the objects should directly support {@link XScriptEventsAttacher} to define the events but this is not s
    * @param xListener All events (if defined by {@link XScriptEventsSupplier} ) that are fired by one of the objects are mapped into a {@link ScriptEvent} an
    * @param Helper Helper object for the implementation. This value will be passed to the {@link XScriptListener} as Helper property in the {@link ScriptEvent} .
    */
  def attachEvents(Objects: SeqEquiv[XInterface], xListener: XScriptListener, Helper: js.Any): Unit = js.native
}
object XScriptEventsAttacher {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    attachEvents: (SeqEquiv[XInterface], XScriptListener, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptEventsAttacher = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachEvents = js.Any.fromFunction3(attachEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptEventsAttacher]
  }
  
  @scala.inline
  implicit class XScriptEventsAttacherMutableBuilder[Self <: XScriptEventsAttacher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachEvents(value: (SeqEquiv[XInterface], XScriptListener, js.Any) => Unit): Self = StObject.set(x, "attachEvents", js.Any.fromFunction3(value))
  }
}
