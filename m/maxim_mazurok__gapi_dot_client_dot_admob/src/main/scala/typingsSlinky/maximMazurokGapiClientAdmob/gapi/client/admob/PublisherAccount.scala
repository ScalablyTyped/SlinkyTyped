package typingsSlinky.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherAccount extends StObject {
  
  /** Currency code of the earning-related metrics, which is the 3-letter code defined in ISO 4217. The daily average rate is used for the currency conversion. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Resource name of this account. Format is accounts/{publisher_id}. */
  var name: js.UndefOr[String] = js.native
  
  /** The unique ID by which this publisher account can be identified in the API requests (for example, pub-1234567890). */
  var publisherId: js.UndefOr[String] = js.native
  
  /** The time zone that is used in reports that are generated for this account. The value is a time-zone ID as specified by the CLDR project, for example, "America/Los_Angeles". */
  var reportingTimeZone: js.UndefOr[String] = js.native
}
object PublisherAccount {
  
  @scala.inline
  def apply(): PublisherAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherAccount]
  }
  
  @scala.inline
  implicit class PublisherAccountMutableBuilder[Self <: PublisherAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherIdUndefined: Self = StObject.set(x, "publisherId", js.undefined)
    
    @scala.inline
    def setReportingTimeZone(value: String): Self = StObject.set(x, "reportingTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingTimeZoneUndefined: Self = StObject.set(x, "reportingTimeZone", js.undefined)
  }
}
