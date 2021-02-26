package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationPresignedUrlRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * The duration in seconds for which the returned URL will be valid.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SessionExpirationDurationInSeconds] = js.native
  
  /**
    * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is FLINK_DASHBOARD_URL. 
    */
  var UrlType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.UrlType = js.native
}
object CreateApplicationPresignedUrlRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, UrlType: UrlType): CreateApplicationPresignedUrlRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], UrlType = UrlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationPresignedUrlRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationPresignedUrlRequestMutableBuilder[Self <: CreateApplicationPresignedUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = StObject.set(x, "SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSecondsUndefined: Self = StObject.set(x, "SessionExpirationDurationInSeconds", js.undefined)
    
    @scala.inline
    def setUrlType(value: UrlType): Self = StObject.set(x, "UrlType", value.asInstanceOf[js.Any])
  }
}
