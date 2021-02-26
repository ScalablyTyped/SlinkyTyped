package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyImageResult extends StObject {
  
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
}
object CopyImageResult {
  
  @scala.inline
  def apply(): CopyImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResult]
  }
  
  @scala.inline
  implicit class CopyImageResultMutableBuilder[Self <: CopyImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
