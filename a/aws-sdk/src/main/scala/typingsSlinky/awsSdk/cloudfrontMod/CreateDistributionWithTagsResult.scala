package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionWithTagsResult extends StObject {
  
  /**
    * The distribution's information. 
    */
  var Distribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Distribution] = js.native
  
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified URI of the new distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateDistributionWithTagsResult {
  
  @scala.inline
  def apply(): CreateDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDistributionWithTagsResult]
  }
  
  @scala.inline
  implicit class CreateDistributionWithTagsResultMutableBuilder[Self <: CreateDistributionWithTagsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
