package typingsSlinky.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingOptions extends CommonMessagingProperties {
  
  var qos: js.UndefOr[MessagingQOS] = js.native
}
object MessagingOptions {
  
  @scala.inline
  def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  @scala.inline
  implicit class MessagingOptionsMutableBuilder[Self <: MessagingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
  }
}
