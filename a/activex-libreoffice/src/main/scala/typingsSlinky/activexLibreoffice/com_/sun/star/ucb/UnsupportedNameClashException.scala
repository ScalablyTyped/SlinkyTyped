package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception must be thrown in case the requested name clash directive is not supported, because it is not possible to implement it or if it is just
  * not (yet) implemented.
  *
  * {@link Command} "transfer": Used if the name clash directive specified in parameter {@link NameClash} of the supplied {@link TransferInfo} is not
  * supported. For example, if the {@link NameClash} was set to {@link NameClash.ERROR} , to {@link NameClash.RENAME} or to {@link NameClash.ASK} , the
  * implementation must be able determine whether there are existing data. This exception must also be used if {@link NameClash.RENAME} was specified and
  * the implementation is unable to create a valid new name after a suitable number of tries.
  *
  * {@link Command} "insert": Used if the parameter ReplaceExisting of the supplied {@link InsertCommandArgument} was set to `FALSE` and the
  * implementation is unable to determine whether there are existing data. The member {@link NameClash} of the exception must be set to {@link
  * NameClash.ERROR}
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
@js.native
trait UnsupportedNameClashException extends Exception {
  
  /** contains the {@link NameClash} that is not supported. */
  var NameClash: Double = js.native
}
object UnsupportedNameClashException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, NameClash: Double): UnsupportedNameClashException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedNameClashException]
  }
  
  @scala.inline
  implicit class UnsupportedNameClashExceptionMutableBuilder[Self <: UnsupportedNameClashException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameClash(value: Double): Self = StObject.set(x, "NameClash", value.asInstanceOf[js.Any])
  }
}
