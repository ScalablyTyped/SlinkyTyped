package typingsSlinky.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryPolicy extends StObject {
  
  /** The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds. */
  var maximumBackoff: js.UndefOr[String] = js.native
  
  /** The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds. */
  var minimumBackoff: js.UndefOr[String] = js.native
}
object RetryPolicy {
  
  @scala.inline
  def apply(): RetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryPolicy]
  }
  
  @scala.inline
  implicit class RetryPolicyMutableBuilder[Self <: RetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumBackoff(value: String): Self = StObject.set(x, "maximumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBackoffUndefined: Self = StObject.set(x, "maximumBackoff", js.undefined)
    
    @scala.inline
    def setMinimumBackoff(value: String): Self = StObject.set(x, "minimumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumBackoffUndefined: Self = StObject.set(x, "minimumBackoff", js.undefined)
  }
}
