package typingsSlinky.activexLibreoffice.com_.sun.star.bridge

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates, that a requested property change could not be executed by the remote counterpart.
  * @see XProtocolProperties
  */
@js.native
trait InvalidProtocolChangeException extends Exception {
  
  /** The first invalid property. */
  var invalidProperty: ProtocolProperty = js.native
  
  /** Contains 1, if the property name is unknown to the thrower; or contains 2, if the property's value can't be accepted by the thrower. */
  var reason: Double = js.native
}
object InvalidProtocolChangeException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, invalidProperty: ProtocolProperty, reason: Double): InvalidProtocolChangeException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], invalidProperty = invalidProperty.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidProtocolChangeException]
  }
  
  @scala.inline
  implicit class InvalidProtocolChangeExceptionMutableBuilder[Self <: InvalidProtocolChangeException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidProperty(value: ProtocolProperty): Self = StObject.set(x, "invalidProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Double): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
