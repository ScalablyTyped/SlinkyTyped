package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when an embedded object changes it's state. */
@js.native
trait XStateChangeListener extends XEventListener {
  
  /**
    * is called just before the object changes state.
    *
    * Actually the listener can try to complain about state changing, but it is up to object to decide whether the state change can be prevented. Anyway the
    * possibility to complain must be used very carefully.
    * @param aEvent specifies the object that is going to change own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    * @throws com::sun::star::embed::WrongStateException the state change is unexpected by listener
    */
  def changingState(aEvent: EventObject, nOldState: Double, nNewState: Double): Unit = js.native
  
  /**
    * is called after the object has changed state.
    * @param aEvent specifies the object that has changed own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    */
  def stateChanged(aEvent: EventObject, nOldState: Double, nNewState: Double): Unit = js.native
}
object XStateChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    changingState: (EventObject, Double, Double) => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stateChanged: (EventObject, Double, Double) => Unit
  ): XStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changingState = js.Any.fromFunction3(changingState), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stateChanged = js.Any.fromFunction3(stateChanged))
    __obj.asInstanceOf[XStateChangeListener]
  }
  
  @scala.inline
  implicit class XStateChangeListenerOps[Self <: XStateChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangingState(value: (EventObject, Double, Double) => Unit): Self = this.set("changingState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateChanged(value: (EventObject, Double, Double) => Unit): Self = this.set("stateChanged", js.Any.fromFunction3(value))
  }
}
