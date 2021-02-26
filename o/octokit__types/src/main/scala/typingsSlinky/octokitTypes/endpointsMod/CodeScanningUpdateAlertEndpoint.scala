package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.dismissed
import typingsSlinky.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningUpdateAlertEndpoint extends StObject {
  
  /**
    * The code scanning alert number.
    */
  var alert_number: js.UndefOr[Double] = js.native
  
  /**
    * **Required when the state is dismissed.** The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    */
  var dismissed_reason: js.UndefOr[String | Null] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Sets the state of the code scanning alert. Can be one of `open` or `dismissed`. You must provide `dismissed_reason` when you set the state to `dismissed`.
    */
  var state: open | dismissed = js.native
}
object CodeScanningUpdateAlertEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, state: open | dismissed): CodeScanningUpdateAlertEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningUpdateAlertEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningUpdateAlertEndpointMutableBuilder[Self <: CodeScanningUpdateAlertEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlert_number(value: Double): Self = StObject.set(x, "alert_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlert_numberUndefined: Self = StObject.set(x, "alert_number", js.undefined)
    
    @scala.inline
    def setDismissed_reason(value: String): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    @scala.inline
    def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | dismissed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
