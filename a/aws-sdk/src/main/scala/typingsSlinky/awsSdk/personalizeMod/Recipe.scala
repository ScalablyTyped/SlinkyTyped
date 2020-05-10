package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipe extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The description of the recipe.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The ARN of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the recipe was last updated.
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
    * One of the following values:   PERSONALIZED_RANKING   RELATED_ITEMS   USER_PERSONALIZATION  
    */
  var recipeType: js.UndefOr[RecipeType] = js.native
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.native
}

object Recipe {
  @scala.inline
  def apply(): Recipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipe]
  }
  @scala.inline
  implicit class RecipeOps[Self <: Recipe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureTransformationArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTransformationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureTransformationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTransformationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipeArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipeType(value: RecipeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

