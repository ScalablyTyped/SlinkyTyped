package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a source for an image. */
@js.native
trait XImageProducer extends XInterface {
  
  /**
    * registers an image consumer with the image producer for accessing the image data during a later reconstruction of the image.
    *
    * The image producer may, at its discretion, start delivering the image data to the consumer using the {@link XImageConsumer} interface immediately, or
    * when the next available image reconstruction is triggered by a call to the startProduction method.
    */
  def addConsumer(xConsumer: XImageConsumer): Unit = js.native
  
  /**
    * removes the given {@link com.sun.star.awt.XImageConsumer} callback from the list of consumers currently registered to receive image data.
    *
    * It is not considered an error to remove a consumer that is not currently registered. The image producer should stop sending data to this consumer as
    * soon as it is feasible.
    */
  def removeConsumer(xConsumer: XImageConsumer): Unit = js.native
  
  /**
    * registers the given image consumer as a consumer and starts an immediate reconstruction of the image data.
    *
    * The image data will then be delivered to this consumer and any other consumer which may have already been registered with the producer. This method
    * differs from the addConsumer method in that a reproduction of the image data should be triggered as soon as possible.
    */
  def startProduction(): Unit = js.native
}
object XImageProducer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addConsumer: XImageConsumer => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeConsumer: XImageConsumer => Unit,
    startProduction: () => Unit
  ): XImageProducer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addConsumer = js.Any.fromFunction1(addConsumer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConsumer = js.Any.fromFunction1(removeConsumer), startProduction = js.Any.fromFunction0(startProduction))
    __obj.asInstanceOf[XImageProducer]
  }
  
  @scala.inline
  implicit class XImageProducerMutableBuilder[Self <: XImageProducer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddConsumer(value: XImageConsumer => Unit): Self = StObject.set(x, "addConsumer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveConsumer(value: XImageConsumer => Unit): Self = StObject.set(x, "removeConsumer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartProduction(value: () => Unit): Self = StObject.set(x, "startProduction", js.Any.fromFunction0(value))
  }
}
