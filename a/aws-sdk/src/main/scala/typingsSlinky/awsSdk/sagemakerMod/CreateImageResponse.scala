package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageArn] = js.native
}
object CreateImageResponse {
  
  @scala.inline
  def apply(): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResponse]
  }
  
  @scala.inline
  implicit class CreateImageResponseMutableBuilder[Self <: CreateImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
  }
}
