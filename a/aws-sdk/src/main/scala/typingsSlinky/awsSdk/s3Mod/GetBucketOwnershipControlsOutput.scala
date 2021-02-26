package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketOwnershipControlsOutput extends StObject {
  
  /**
    * The OwnershipControls (BucketOwnerPreferred or ObjectWriter) currently in effect for this Amazon S3 bucket.
    */
  var OwnershipControls: js.UndefOr[typingsSlinky.awsSdk.s3Mod.OwnershipControls] = js.native
}
object GetBucketOwnershipControlsOutput {
  
  @scala.inline
  def apply(): GetBucketOwnershipControlsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOwnershipControlsOutput]
  }
  
  @scala.inline
  implicit class GetBucketOwnershipControlsOutputMutableBuilder[Self <: GetBucketOwnershipControlsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnershipControls(value: OwnershipControls): Self = StObject.set(x, "OwnershipControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnershipControlsUndefined: Self = StObject.set(x, "OwnershipControls", js.undefined)
  }
}
