package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Collector.
  *
  * This interface is used to control collecting a signature.
  */
@js.native
trait XReferenceCollector extends XInterface {
  
  /**
    * Sets the reference count of the signature.
    * @param count the reference count of the signature
    */
  def setReferenceCount(count: Double): Unit = js.native
  
  /**
    * Set the keeper id of the element collector of the referenced element.
    * @param id the keeper id of the element collector, which is collecting a referenced element
    */
  def setReferenceId(id: Double): Unit = js.native
}
object XReferenceCollector {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit
  ): XReferenceCollector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId))
    __obj.asInstanceOf[XReferenceCollector]
  }
  
  @scala.inline
  implicit class XReferenceCollectorMutableBuilder[Self <: XReferenceCollector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetReferenceCount(value: Double => Unit): Self = StObject.set(x, "setReferenceCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReferenceId(value: Double => Unit): Self = StObject.set(x, "setReferenceId", js.Any.fromFunction1(value))
  }
}
