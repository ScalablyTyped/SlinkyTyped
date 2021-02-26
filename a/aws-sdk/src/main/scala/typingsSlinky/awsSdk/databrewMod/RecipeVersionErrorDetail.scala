package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeVersionErrorDetail extends StObject {
  
  /**
    * The HTTP status code for the error.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.databrewMod.ErrorCode] = js.native
  
  /**
    * The text of the error message.
    */
  var ErrorMessage: js.UndefOr[RecipeErrorMessage] = js.native
  
  /**
    * The identifier for the recipe version associated with this error.
    */
  var RecipeVersion: js.UndefOr[typingsSlinky.awsSdk.databrewMod.RecipeVersion] = js.native
}
object RecipeVersionErrorDetail {
  
  @scala.inline
  def apply(): RecipeVersionErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeVersionErrorDetail]
  }
  
  @scala.inline
  implicit class RecipeVersionErrorDetailMutableBuilder[Self <: RecipeVersionErrorDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: RecipeErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
