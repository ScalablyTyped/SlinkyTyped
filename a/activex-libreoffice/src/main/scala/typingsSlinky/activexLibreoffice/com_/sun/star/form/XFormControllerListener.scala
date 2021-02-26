package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to be notified when the activation status of a {@link FormController} changes.
  *
  * A form controller is activated if a form control gains the focus and none of its controls currently owned the focus before.
  * @see XFormController
  */
@js.native
trait XFormControllerListener extends XEventListener {
  
  /**
    * is invoked when a control of the controller gained the focus and the controller was not previously activated.
    * @param rEvent the event happened.
    */
  def formActivated(rEvent: EventObject): Unit = js.native
  
  /**
    * is invoked when a control of the "XFormController" lost the focus and no control of the controller received the focus. In other words, no control of
    * the controller owns the focus.
    * @param rEvent the event happened.
    */
  def formDeactivated(rEvent: EventObject): Unit = js.native
}
object XFormControllerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    formActivated: EventObject => Unit,
    formDeactivated: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormControllerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), formActivated = js.Any.fromFunction1(formActivated), formDeactivated = js.Any.fromFunction1(formDeactivated), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormControllerListener]
  }
  
  @scala.inline
  implicit class XFormControllerListenerMutableBuilder[Self <: XFormControllerListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormActivated(value: EventObject => Unit): Self = StObject.set(x, "formActivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormDeactivated(value: EventObject => Unit): Self = StObject.set(x, "formDeactivated", js.Any.fromFunction1(value))
  }
}
