package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time (in Unix time) that the recipe was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the recipe.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the recipe.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.native
}
object RecipeSummary {
  
  @scala.inline
  def apply(): RecipeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeSummary]
  }
  
  @scala.inline
  implicit class RecipeSummaryMutableBuilder[Self <: RecipeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
