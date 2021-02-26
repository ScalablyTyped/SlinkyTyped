package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemUpdate extends StObject {
  
  /**
    * If the type is WINDOWED, the end of the maintenance window, measured as the number of minutes after midnight in device's local time. This value must be between 0 and 1439,
    * inclusive. If this value is less than start_minutes, then the maintenance window spans midnight. If the maintenance window specified is smaller than 30 minutes, the actual window is
    * extended to 30 minutes beyond the start time.
    */
  var endMinutes: js.UndefOr[Double] = js.native
  
  /**
    * An annually repeating time period in which over-the-air (OTA) system updates are postponed to freeze the OS version running on a device. To prevent freezing the device indefinitely,
    * each freeze period must be separated by at least 60 days.
    */
  var freezePeriods: js.UndefOr[js.Array[FreezePeriod]] = js.native
  
  /**
    * If the type is WINDOWED, the start of the maintenance window, measured as the number of minutes after midnight in the device's local time. This value must be between 0 and 1439,
    * inclusive.
    */
  var startMinutes: js.UndefOr[Double] = js.native
  
  /** The type of system update to configure. */
  var `type`: js.UndefOr[String] = js.native
}
object SystemUpdate {
  
  @scala.inline
  def apply(): SystemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemUpdate]
  }
  
  @scala.inline
  implicit class SystemUpdateMutableBuilder[Self <: SystemUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndMinutes(value: Double): Self = StObject.set(x, "endMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMinutesUndefined: Self = StObject.set(x, "endMinutes", js.undefined)
    
    @scala.inline
    def setFreezePeriods(value: js.Array[FreezePeriod]): Self = StObject.set(x, "freezePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreezePeriodsUndefined: Self = StObject.set(x, "freezePeriods", js.undefined)
    
    @scala.inline
    def setFreezePeriodsVarargs(value: FreezePeriod*): Self = StObject.set(x, "freezePeriods", js.Array(value :_*))
    
    @scala.inline
    def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinutesUndefined: Self = StObject.set(x, "startMinutes", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
