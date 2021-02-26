package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceStartTimeInput extends StObject {
  
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
    */
  var DayOfMonth: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DayOfMonth] = js.native
  
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DayOfWeek] = js.native
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typingsSlinky.awsSdk.storagegatewayMod.HourOfDay = js.native
  
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typingsSlinky.awsSdk.storagegatewayMod.MinuteOfHour = js.native
}
object UpdateMaintenanceStartTimeInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceStartTimeInputMutableBuilder[Self <: UpdateMaintenanceStartTimeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
  }
}
