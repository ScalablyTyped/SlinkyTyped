package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the controls within an {@link UnoControlContainer} . */
@js.native
trait XControlContainer extends XInterface {
  
  /** returns all controls. */
  val Controls: SafeArray[XControl] = js.native
  
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit = js.native
  
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl = js.native
  
  /** returns all controls. */
  def getControls(): SafeArray[XControl] = js.native
  
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit = js.native
  
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit = js.native
}
object XControlContainer {
  
  @scala.inline
  def apply(
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    setStatusText: String => Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
    __obj.asInstanceOf[XControlContainer]
  }
  
  @scala.inline
  implicit class XControlContainerMutableBuilder[Self <: XControlContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddControl(value: (String, XControl) => Unit): Self = StObject.set(x, "addControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setControls(value: SafeArray[XControl]): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetControl(value: String => XControl): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetControls(value: () => SafeArray[XControl]): Self = StObject.set(x, "getControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveControl(value: XControl => Unit): Self = StObject.set(x, "removeControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatusText(value: String => Unit): Self = StObject.set(x, "setStatusText", js.Any.fromFunction1(value))
  }
}
