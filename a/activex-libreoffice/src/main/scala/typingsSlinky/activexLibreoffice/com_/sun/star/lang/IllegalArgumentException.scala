package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This exception is thrown to indicate that a method has passed an illegal or inappropriate argument. */
@js.native
trait IllegalArgumentException extends Exception {
  
  /**
    * identifies the position of the illegal argument.
    *
    * This field is -1 if the position is not known.
    */
  var ArgumentPosition: Double = js.native
}
object IllegalArgumentException {
  
  @scala.inline
  def apply(ArgumentPosition: Double, Context: XInterface, Message: String): IllegalArgumentException = {
    val __obj = js.Dynamic.literal(ArgumentPosition = ArgumentPosition.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllegalArgumentException]
  }
  
  @scala.inline
  implicit class IllegalArgumentExceptionMutableBuilder[Self <: IllegalArgumentException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentPosition(value: Double): Self = StObject.set(x, "ArgumentPosition", value.asInstanceOf[js.Any])
  }
}
