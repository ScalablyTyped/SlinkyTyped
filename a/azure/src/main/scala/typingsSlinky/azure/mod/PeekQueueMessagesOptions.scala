package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeekQueueMessagesOptions extends TimeoutIntervalOptions {
  
  var numofmessages: js.UndefOr[Double] = js.native
}
object PeekQueueMessagesOptions {
  
  @scala.inline
  def apply(): PeekQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeekQueueMessagesOptions]
  }
  
  @scala.inline
  implicit class PeekQueueMessagesOptionsMutableBuilder[Self <: PeekQueueMessagesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumofmessages(value: Double): Self = StObject.set(x, "numofmessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumofmessagesUndefined: Self = StObject.set(x, "numofmessages", js.undefined)
  }
}
