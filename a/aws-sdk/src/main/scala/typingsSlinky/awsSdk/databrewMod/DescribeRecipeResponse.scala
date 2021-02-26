package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecipeResponse extends StObject {
  
  /**
    * The date and time that the recipe was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier (user name) of the user who created the recipe.
    */
  var CreatedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * The description of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.native
  
  /**
    * The identifier (user name) of the user who last modified the recipe.
    */
  var LastModifiedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The date and time that the recipe was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the recipe.
    */
  var Name: RecipeName = js.native
  
  /**
    * The name of the project associated with this recipe.
    */
  var ProjectName: js.UndefOr[typingsSlinky.awsSdk.databrewMod.ProjectName] = js.native
  
  /**
    * The identifier (user name) of the user who last published the recipe.
    */
  var PublishedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.PublishedBy] = js.native
  
  /**
    * The date and time when the recipe was last published.
    */
  var PublishedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The recipe version identifier.
    */
  var RecipeVersion: js.UndefOr[typingsSlinky.awsSdk.databrewMod.RecipeVersion] = js.native
  
  /**
    * The ARN of the recipe.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which the action should succeed.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.native
  
  /**
    * Metadata tags associated with this project.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object DescribeRecipeResponse {
  
  @scala.inline
  def apply(Name: RecipeName): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
  
  @scala.inline
  implicit class DescribeRecipeResponseMutableBuilder[Self <: DescribeRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    @scala.inline
    def setPublishedBy(value: PublishedBy): Self = StObject.set(x, "PublishedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedByUndefined: Self = StObject.set(x, "PublishedBy", js.undefined)
    
    @scala.inline
    def setPublishedDate(value: js.Date): Self = StObject.set(x, "PublishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDateUndefined: Self = StObject.set(x, "PublishedDate", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
