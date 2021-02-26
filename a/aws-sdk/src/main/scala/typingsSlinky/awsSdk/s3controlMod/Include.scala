package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends StObject {
  
  /**
    * A container for the S3 Storage Lens bucket includes.
    */
  var Buckets: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.Buckets] = js.native
  
  /**
    * A container for the S3 Storage Lens Region includes.
    */
  var Regions: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.Regions] = js.native
}
object Include {
  
  @scala.inline
  def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  @scala.inline
  implicit class IncludeMutableBuilder[Self <: Include] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: S3BucketArnString*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: S3AWSRegion*): Self = StObject.set(x, "Regions", js.Array(value :_*))
  }
}
