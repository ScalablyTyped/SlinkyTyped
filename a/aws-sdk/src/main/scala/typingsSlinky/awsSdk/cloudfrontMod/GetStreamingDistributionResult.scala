package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamingDistributionResult extends StObject {
  
  /**
    * The current version of the streaming distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.StreamingDistribution] = js.native
}
object GetStreamingDistributionResult {
  
  @scala.inline
  def apply(): GetStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingDistributionResult]
  }
  
  @scala.inline
  implicit class GetStreamingDistributionResultMutableBuilder[Self <: GetStreamingDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setStreamingDistribution(value: StreamingDistribution): Self = StObject.set(x, "StreamingDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionUndefined: Self = StObject.set(x, "StreamingDistribution", js.undefined)
  }
}
