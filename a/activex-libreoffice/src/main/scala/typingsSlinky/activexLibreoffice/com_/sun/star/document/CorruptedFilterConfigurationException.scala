package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is thrown in case the global filter configuration does not exists or contains corrupted data.
  * @since OOo 2.0
  */
@js.native
trait CorruptedFilterConfigurationException extends Exception {
  
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: String = js.native
}
object CorruptedFilterConfigurationException {
  
  @scala.inline
  def apply(Context: XInterface, Details: String, Message: String): CorruptedFilterConfigurationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorruptedFilterConfigurationException]
  }
  
  @scala.inline
  implicit class CorruptedFilterConfigurationExceptionMutableBuilder[Self <: CorruptedFilterConfigurationException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}
