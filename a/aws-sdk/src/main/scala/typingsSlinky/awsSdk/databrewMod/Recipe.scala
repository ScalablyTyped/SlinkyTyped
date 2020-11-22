package typingsSlinky.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipe extends js.Object {
  
  /**
    * The date and time that the recipe was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier (the user name) of the user who created the recipe.
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
    * The last modification date and time of the recipe.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The unique name for the recipe.
    */
  var Name: RecipeName = js.native
  
  /**
    * The name of the project that the recipe is associated with.
    */
  var ProjectName: js.UndefOr[typingsSlinky.awsSdk.databrewMod.ProjectName] = js.native
  
  /**
    * The identifier (the user name) of the user who published the recipe.
    */
  var PublishedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.PublishedBy] = js.native
  
  /**
    * The date and time when the recipe was published.
    */
  var PublishedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier for the version for the recipe. 
    */
  var RecipeVersion: js.UndefOr[typingsSlinky.awsSdk.databrewMod.RecipeVersion] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the recipe.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * A list of steps that are defined by the recipe.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.native
  
  /**
    * Metadata tags that have been applied to the recipe.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object Recipe {
  
  @scala.inline
  def apply(Name: RecipeName): Recipe = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipe]
  }
  
  @scala.inline
  implicit class RecipeOps[Self <: Recipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: RecipeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectName: Self = this.set("ProjectName", js.undefined)
    
    @scala.inline
    def setPublishedBy(value: PublishedBy): Self = this.set("PublishedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedBy: Self = this.set("PublishedBy", js.undefined)
    
    @scala.inline
    def setPublishedDate(value: js.Date): Self = this.set("PublishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedDate: Self = this.set("PublishedDate", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = this.set("RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeVersion: Self = this.set("RecipeVersion", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("Steps", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
