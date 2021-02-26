package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XReschedule} interface can be used to give control to the main thread to allow events processing.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 2.0
  */
@js.native
trait XReschedule extends XInterface {
  
  /** Allow the main thread to process some events. */
  def reschedule(): Unit = js.native
}
object XReschedule {
  
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, reschedule: () => Unit): XReschedule = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reschedule = js.Any.fromFunction0(reschedule))
    __obj.asInstanceOf[XReschedule]
  }
  
  @scala.inline
  implicit class XRescheduleMutableBuilder[Self <: XReschedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReschedule(value: () => Unit): Self = StObject.set(x, "reschedule", js.Any.fromFunction0(value))
  }
}
