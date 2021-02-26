package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageRecipeResponse extends StObject {
  
  /**
    * The image recipe object. 
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetImageRecipeResponse {
  
  @scala.inline
  def apply(): GetImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageRecipeResponse]
  }
  
  @scala.inline
  implicit class GetImageRecipeResponseMutableBuilder[Self <: GetImageRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipe(value: ImageRecipe): Self = StObject.set(x, "imageRecipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeUndefined: Self = StObject.set(x, "imageRecipe", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
