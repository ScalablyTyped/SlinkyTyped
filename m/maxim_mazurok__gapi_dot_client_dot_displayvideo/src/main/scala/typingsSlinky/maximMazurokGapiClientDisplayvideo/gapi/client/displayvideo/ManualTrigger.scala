package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualTrigger extends StObject {
  
  /** Required. The maximum duration of each activation in minutes. Must be between 1 and 360 inclusive. After this duration, the trigger will be automatically deactivated. */
  var activationDurationMinutes: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The unique ID of the advertiser that the manual trigger belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the manual trigger. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp of the trigger's latest activation. */
  var latestActivationTime: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the manual trigger. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The state of the manual trigger. Will be set to the `INACTIVE` state upon creation. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the manual trigger. */
  var triggerId: js.UndefOr[String] = js.native
}
object ManualTrigger {
  
  @scala.inline
  def apply(): ManualTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualTrigger]
  }
  
  @scala.inline
  implicit class ManualTriggerMutableBuilder[Self <: ManualTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationDurationMinutes(value: String): Self = StObject.set(x, "activationDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationDurationMinutesUndefined: Self = StObject.set(x, "activationDurationMinutes", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLatestActivationTime(value: String): Self = StObject.set(x, "latestActivationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestActivationTimeUndefined: Self = StObject.set(x, "latestActivationTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}
