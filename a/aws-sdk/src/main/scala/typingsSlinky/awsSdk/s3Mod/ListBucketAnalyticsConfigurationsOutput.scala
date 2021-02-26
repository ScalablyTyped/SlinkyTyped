package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketAnalyticsConfigurationsOutput extends StObject {
  
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AnalyticsConfigurationList] = js.native
  
  /**
    * The marker that is used as a starting point for this analytics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    *  NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}
object ListBucketAnalyticsConfigurationsOutput {
  
  @scala.inline
  def apply(): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsOutputMutableBuilder[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsConfigurationList(value: AnalyticsConfigurationList): Self = StObject.set(x, "AnalyticsConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsConfigurationListUndefined: Self = StObject.set(x, "AnalyticsConfigurationList", js.undefined)
    
    @scala.inline
    def setAnalyticsConfigurationListVarargs(value: AnalyticsConfiguration*): Self = StObject.set(x, "AnalyticsConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
