package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfigurationSetEventDestinationsResponse extends js.Object {
  
  /**
    * An array that includes all of the events destinations that have been configured for the configuration set.
    */
  var EventDestinations: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.EventDestinations] = js.native
}
object GetConfigurationSetEventDestinationsResponse {
  
  @scala.inline
  def apply(): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
  
  @scala.inline
  implicit class GetConfigurationSetEventDestinationsResponseOps[Self <: GetConfigurationSetEventDestinationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventDestinationsVarargs(value: EventDestination*): Self = this.set("EventDestinations", js.Array(value :_*))
    
    @scala.inline
    def setEventDestinations(value: EventDestinations): Self = this.set("EventDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDestinations: Self = this.set("EventDestinations", js.undefined)
  }
}
