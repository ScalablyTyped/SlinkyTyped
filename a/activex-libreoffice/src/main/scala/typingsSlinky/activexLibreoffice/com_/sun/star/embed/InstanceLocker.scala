package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main task of this service is to prevent closing, terminating and/or etc. of controlled object.
  *
  * After creation the service adds a listener of requested type ( close, terminate and/or etc. ) to the controlled object and let the listener throw
  * related veto exception until the service is disposed.
  */
@js.native
trait InstanceLocker extends XComponent {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    */
  def InstanceLockerCtor1(xInstance: XInterface, nActions: Double): Unit = js.native
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    * @param xApprove The object implementing {@link XActionsApproval} interface. If this parameter is an empty reference the object will proceed with the spe
    */
  def InstanceLockerCtor2(xInstance: XInterface, nActions: Double, xApprove: XActionsApproval): Unit = js.native
}
object InstanceLocker {
  
  @scala.inline
  def apply(
    InstanceLockerCtor1: (XInterface, Double) => Unit,
    InstanceLockerCtor2: (XInterface, Double, XActionsApproval) => Unit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): InstanceLocker = {
    val __obj = js.Dynamic.literal(InstanceLockerCtor1 = js.Any.fromFunction2(InstanceLockerCtor1), InstanceLockerCtor2 = js.Any.fromFunction3(InstanceLockerCtor2), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[InstanceLocker]
  }
  
  @scala.inline
  implicit class InstanceLockerMutableBuilder[Self <: InstanceLocker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceLockerCtor1(value: (XInterface, Double) => Unit): Self = StObject.set(x, "InstanceLockerCtor1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInstanceLockerCtor2(value: (XInterface, Double, XActionsApproval) => Unit): Self = StObject.set(x, "InstanceLockerCtor2", js.Any.fromFunction3(value))
  }
}
