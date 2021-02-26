package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the state of a check box and makes it possible to register for events. */
@js.native
trait XCheckBox extends XInterface {
  
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  var State: Double = js.native
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  
  /** enables or disables the tri state mode. */
  def enableTriState(b: Boolean): Unit = js.native
  
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def getState(): Double = js.native
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  
  /** sets the label of the check box. */
  def setLabel(Label: String): Unit = js.native
  
  /**
    * sets the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def setState(n: Double): Unit = js.native
}
object XCheckBox {
  
  @scala.inline
  def apply(
    State: Double,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    enableTriState: Boolean => Unit,
    getState: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Double => Unit
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), enableTriState = js.Any.fromFunction1(enableTriState), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XCheckBox]
  }
  
  @scala.inline
  implicit class XCheckBoxMutableBuilder[Self <: XCheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableTriState(value: Boolean => Unit): Self = StObject.set(x, "enableTriState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => Double): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetState(value: Double => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
