package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandwidthRateLimitInterval extends StObject {
  
  /**
    *  The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field does not appear in the response if the download rate limit is not set. 
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.native
  
  /**
    *  The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does not appear in the response if the upload rate limit is not set. 
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.native
  
  /**
    *  The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6, where 0 represents Sunday and 6 Saturday. 
    */
  var DaysOfWeek: typingsSlinky.awsSdk.storagegatewayMod.DaysOfWeek = js.native
  
  /**
    *  The hour of the day to end the bandwidth rate limit interval. 
    */
  var EndHourOfDay: HourOfDay = js.native
  
  /**
    *  The minute of the hour to end the bandwidth rate limit interval.    The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use the value 59.  
    */
  var EndMinuteOfHour: MinuteOfHour = js.native
  
  /**
    *  The hour of the day to start the bandwidth rate limit interval. 
    */
  var StartHourOfDay: HourOfDay = js.native
  
  /**
    *  The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that minute. To begin an interval exactly at the start of the hour, use the value 0. 
    */
  var StartMinuteOfHour: MinuteOfHour = js.native
}
object BandwidthRateLimitInterval {
  
  @scala.inline
  def apply(
    DaysOfWeek: DaysOfWeek,
    EndHourOfDay: HourOfDay,
    EndMinuteOfHour: MinuteOfHour,
    StartHourOfDay: HourOfDay,
    StartMinuteOfHour: MinuteOfHour
  ): BandwidthRateLimitInterval = {
    val __obj = js.Dynamic.literal(DaysOfWeek = DaysOfWeek.asInstanceOf[js.Any], EndHourOfDay = EndHourOfDay.asInstanceOf[js.Any], EndMinuteOfHour = EndMinuteOfHour.asInstanceOf[js.Any], StartHourOfDay = StartHourOfDay.asInstanceOf[js.Any], StartMinuteOfHour = StartMinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthRateLimitInterval]
  }
  
  @scala.inline
  implicit class BandwidthRateLimitIntervalMutableBuilder[Self <: BandwidthRateLimitInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageDownloadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", js.undefined)
    
    @scala.inline
    def setDaysOfWeek(value: DaysOfWeek): Self = StObject.set(x, "DaysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = StObject.set(x, "DaysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setEndHourOfDay(value: HourOfDay): Self = StObject.set(x, "EndHourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "EndMinuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHourOfDay(value: HourOfDay): Self = StObject.set(x, "StartHourOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "StartMinuteOfHour", value.asInstanceOf[js.Any])
  }
}
