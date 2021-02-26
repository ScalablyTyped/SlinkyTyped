package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface should be implemented by an internal {@link XCommandEnvironment} that can not supply an {@link com.sun.star.task.XInteractionHandler} ,
  * but instead wants interaction requests to be handled by other internal error handling mechanism.
  */
@js.native
trait XInteractionHandlerSupplier extends XInterface {
  
  /**
    * Returns whether an {@link com.sun.star.task.XInteractionHandler} can be supplied.
    * @returns `TRUE` , if an {@link com.sun.star.task.XInteractionHandler} can be supplied, `FALSE` otherwise.
    */
  def hasInteractionHandler(): Boolean = js.native
}
object XInteractionHandlerSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasInteractionHandler: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionHandlerSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasInteractionHandler = js.Any.fromFunction0(hasInteractionHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionHandlerSupplier]
  }
  
  @scala.inline
  implicit class XInteractionHandlerSupplierMutableBuilder[Self <: XInteractionHandlerSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasInteractionHandler(value: () => Boolean): Self = StObject.set(x, "hasInteractionHandler", js.Any.fromFunction0(value))
  }
}
