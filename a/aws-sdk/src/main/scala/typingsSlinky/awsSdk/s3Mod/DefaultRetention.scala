package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRetention extends StObject {
  
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Days] = js.native
  
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Years] = js.native
}
object DefaultRetention {
  
  @scala.inline
  def apply(): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRetention]
  }
  
  @scala.inline
  implicit class DefaultRetentionMutableBuilder[Self <: DefaultRetention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    @scala.inline
    def setMode(value: ObjectLockRetentionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setYears(value: Years): Self = StObject.set(x, "Years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearsUndefined: Self = StObject.set(x, "Years", js.undefined)
  }
}
