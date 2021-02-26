package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicAccessBlockOutput extends StObject {
  
  /**
    * The PublicAccessBlock configuration currently in effect for this Amazon S3 bucket.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PublicAccessBlockConfiguration] = js.native
}
object GetPublicAccessBlockOutput {
  
  @scala.inline
  def apply(): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
  
  @scala.inline
  implicit class GetPublicAccessBlockOutputMutableBuilder[Self <: GetPublicAccessBlockOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
  }
}
