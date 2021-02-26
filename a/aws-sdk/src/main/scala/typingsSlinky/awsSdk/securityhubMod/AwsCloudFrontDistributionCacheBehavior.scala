package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionCacheBehavior extends StObject {
  
  /**
    * The protocol that viewers can use to access the files in an origin. You can specify the following options:    allow-all - Viewers can use HTTP or HTTPS.    redirect-to-https - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.    https-only - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).  
    */
  var ViewerProtocolPolicy: js.UndefOr[NonEmptyString] = js.native
}
object AwsCloudFrontDistributionCacheBehavior {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionCacheBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehavior]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionCacheBehaviorMutableBuilder[Self <: AwsCloudFrontDistributionCacheBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewerProtocolPolicy(value: NonEmptyString): Self = StObject.set(x, "ViewerProtocolPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerProtocolPolicyUndefined: Self = StObject.set(x, "ViewerProtocolPolicy", js.undefined)
  }
}
