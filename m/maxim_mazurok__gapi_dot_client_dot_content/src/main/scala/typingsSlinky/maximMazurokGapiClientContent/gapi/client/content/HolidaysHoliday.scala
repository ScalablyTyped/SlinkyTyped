package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolidaysHoliday extends StObject {
  
  /**
    * The CLDR territory code of the country in which the holiday is available. E.g. "US", "DE", "GB". A holiday cutoff can only be configured in a shipping settings service with matching
    * delivery country. Always present.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /** Date of the holiday, in ISO 8601 format. E.g. "2016-12-25" for Christmas 2016. Always present. */
  var date: js.UndefOr[String] = js.native
  
  /** Date on which the order has to arrive at the customer's, in ISO 8601 format. E.g. "2016-12-24" for 24th December 2016. Always present. */
  var deliveryGuaranteeDate: js.UndefOr[String] = js.native
  
  /**
    * Hour of the day in the delivery location's timezone on the guaranteed delivery date by which the order has to arrive at the customer's. Possible values are: 0 (midnight), 1, ..., 12
    * (noon), 13, ..., 23. Always present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String] = js.native
  
  /** Unique identifier for the holiday to be used when configuring holiday cutoffs. Always present. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The holiday type. Always present. Acceptable values are: - "`Christmas`" - "`Easter`" - "`Father's Day`" - "`Halloween`" - "`Independence Day (USA)`" - "`Mother's Day`" -
    * "`Thanksgiving`" - "`Valentine's Day`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object HolidaysHoliday {
  
  @scala.inline
  def apply(): HolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidaysHoliday]
  }
  
  @scala.inline
  implicit class HolidaysHolidayMutableBuilder[Self <: HolidaysHoliday] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDeliveryGuaranteeDate(value: String): Self = StObject.set(x, "deliveryGuaranteeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryGuaranteeDateUndefined: Self = StObject.set(x, "deliveryGuaranteeDate", js.undefined)
    
    @scala.inline
    def setDeliveryGuaranteeHour(value: String): Self = StObject.set(x, "deliveryGuaranteeHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryGuaranteeHourUndefined: Self = StObject.set(x, "deliveryGuaranteeHour", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
