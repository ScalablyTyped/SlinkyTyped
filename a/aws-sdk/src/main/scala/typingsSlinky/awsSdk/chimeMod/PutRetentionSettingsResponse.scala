package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionSettingsResponse extends StObject {
  
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typingsSlinky.awsSdk.chimeMod.RetentionSettings] = js.native
}
object PutRetentionSettingsResponse {
  
  @scala.inline
  def apply(): PutRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class PutRetentionSettingsResponseMutableBuilder[Self <: PutRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiateDeletionTimestamp(value: js.Date): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "RetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionSettingsUndefined: Self = StObject.set(x, "RetentionSettings", js.undefined)
  }
}
