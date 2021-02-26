package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInTimeRecoveryDescription extends StObject {
  
  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.PointInTimeRecoveryStatus] = js.native
}
object PointInTimeRecoveryDescription {
  
  @scala.inline
  def apply(): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
  
  @scala.inline
  implicit class PointInTimeRecoveryDescriptionMutableBuilder[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarliestRestorableDateTime(value: js.Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setLatestRestorableDateTime(value: js.Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
    
    @scala.inline
    def setPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
  }
}
