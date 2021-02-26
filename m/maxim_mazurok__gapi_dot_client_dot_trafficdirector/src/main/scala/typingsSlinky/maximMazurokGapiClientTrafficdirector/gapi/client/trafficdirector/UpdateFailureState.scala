package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFailureState extends StObject {
  
  /** Details about the last failed update attempt. */
  var details: js.UndefOr[String] = js.native
  
  /** What the component configuration would have been if the update had succeeded. */
  var failedConfiguration: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState with TopLevel[js.Any]
  ] = js.native
  
  /** Time of the latest failed update attempt. */
  var lastUpdateAttempt: js.UndefOr[String] = js.native
}
object UpdateFailureState {
  
  @scala.inline
  def apply(): UpdateFailureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFailureState]
  }
  
  @scala.inline
  implicit class UpdateFailureStateMutableBuilder[Self <: UpdateFailureState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setFailedConfiguration(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState with TopLevel[js.Any]
    ): Self = StObject.set(x, "failedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedConfigurationUndefined: Self = StObject.set(x, "failedConfiguration", js.undefined)
    
    @scala.inline
    def setLastUpdateAttempt(value: String): Self = StObject.set(x, "lastUpdateAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateAttemptUndefined: Self = StObject.set(x, "lastUpdateAttempt", js.undefined)
  }
}
