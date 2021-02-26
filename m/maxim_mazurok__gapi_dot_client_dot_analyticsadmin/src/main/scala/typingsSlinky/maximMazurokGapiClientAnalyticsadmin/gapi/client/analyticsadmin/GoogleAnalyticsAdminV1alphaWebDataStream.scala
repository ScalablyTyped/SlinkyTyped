package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaWebDataStream extends StObject {
  
  /** Output only. Time when this stream was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Immutable. Domain name of the web app being measured, or empty. Example: "http://www.google.com", "https://www.google.com" */
  var defaultUri: js.UndefOr[String] = js.native
  
  /** Required. Human-readable display name for the Data Stream. The max allowed display name length is 100 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.native
  
  /** Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would just be "1A2BCD345E" */
  var measurementId: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this Data Stream. Format: properties/{property_id}/webDataStreams/{stream_id} Example: "properties/1000/webDataStreams/2000" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when stream payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaWebDataStream {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaWebDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaWebDataStream]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaWebDataStreamMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaWebDataStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDefaultUri(value: String): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    @scala.inline
    def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
