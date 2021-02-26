package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * should be used for interaction to handle states of unknown filter during detection
  *
  * If during loading time the filter can't be detected and wasn't given at calling time, a possible {@link com.sun.star.task.InteractionHandler} will be
  * used. (it's a part of used {@link MediaDescriptor} ) Such "NoSuchFilterRequest" will be used then to start right interaction on that to get a decision
  * which filter should be used for given URL. A possible continuation of type {@link XInteractionFilterSelect} will transport this decision back to
  * generic filter detection and force using of it. Of course it's possible to abort the loading process by use another continuation {@link
  * com.sun.star.task.XInteractionAbort} .
  * @see MediaDescriptor
  * @see com.sun.star.task.InteractionHandler
  * @see XInteractionFilterSelect
  * @see com.sun.star.task.XInteractionAbort
  */
@js.native
trait NoSuchFilterRequest extends Exception {
  
  /** transport URL which couldn't be detected */
  var URL: String = js.native
}
object NoSuchFilterRequest {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, URL: String): NoSuchFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchFilterRequest]
  }
  
  @scala.inline
  implicit class NoSuchFilterRequestMutableBuilder[Self <: NoSuchFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
