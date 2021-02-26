package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecipesRequest extends StObject {
  
  /**
    * The maximum number of results to return in this request. 
    */
  var MaxResults: js.UndefOr[MaxResults100] = js.native
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.databrewMod.NextToken] = js.native
  
  /**
    * A version identifier. Using this parameter indicates to return only those recipes that have this version identifier.
    */
  var RecipeVersion: js.UndefOr[typingsSlinky.awsSdk.databrewMod.RecipeVersion] = js.native
}
object ListRecipesRequest {
  
  @scala.inline
  def apply(): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesRequest]
  }
  
  @scala.inline
  implicit class ListRecipesRequestMutableBuilder[Self <: ListRecipesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
