package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationNotWorkingEvidence extends StObject {
  
  /** DNS lookup errors. */
  var dnsError: js.UndefOr[String] = js.native
  
  /** The full non-working URL. */
  var expandedUrl: js.UndefOr[String] = js.native
  
  /** HTTP error code (e.g. 404 or 5xx) */
  var httpError: js.UndefOr[Double] = js.native
  
  /** Page was crawled successfully, but was detected as either a page with no content or an error page. */
  var invalidPage: js.UndefOr[String] = js.native
  
  /** Approximate time when the ad destination was last checked. */
  var lastCheckTime: js.UndefOr[String] = js.native
  
  /** Platform of the non-working URL. */
  var platform: js.UndefOr[String] = js.native
  
  /** HTTP redirect chain error. */
  var redirectionError: js.UndefOr[String] = js.native
  
  /** Rejected because of malformed URLs or invalid requests. */
  var urlRejected: js.UndefOr[String] = js.native
}
object DestinationNotWorkingEvidence {
  
  @scala.inline
  def apply(): DestinationNotWorkingEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationNotWorkingEvidence]
  }
  
  @scala.inline
  implicit class DestinationNotWorkingEvidenceMutableBuilder[Self <: DestinationNotWorkingEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsError(value: String): Self = StObject.set(x, "dnsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsErrorUndefined: Self = StObject.set(x, "dnsError", js.undefined)
    
    @scala.inline
    def setExpandedUrl(value: String): Self = StObject.set(x, "expandedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUrlUndefined: Self = StObject.set(x, "expandedUrl", js.undefined)
    
    @scala.inline
    def setHttpError(value: Double): Self = StObject.set(x, "httpError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpErrorUndefined: Self = StObject.set(x, "httpError", js.undefined)
    
    @scala.inline
    def setInvalidPage(value: String): Self = StObject.set(x, "invalidPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidPageUndefined: Self = StObject.set(x, "invalidPage", js.undefined)
    
    @scala.inline
    def setLastCheckTime(value: String): Self = StObject.set(x, "lastCheckTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCheckTimeUndefined: Self = StObject.set(x, "lastCheckTime", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRedirectionError(value: String): Self = StObject.set(x, "redirectionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectionErrorUndefined: Self = StObject.set(x, "redirectionError", js.undefined)
    
    @scala.inline
    def setUrlRejected(value: String): Self = StObject.set(x, "urlRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRejectedUndefined: Self = StObject.set(x, "urlRejected", js.undefined)
  }
}
