package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.AWS
import typingsSlinky.awsLambda.awsLambdaStrings.ThirdParty
import typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  var category: CodePipelineActionCategory = js.native
  var owner: AWS | typingsSlinky.awsLambda.awsLambdaStrings.Custom | ThirdParty = js.native
  var provider: String = js.native
  var version: Double = js.native
}

object Category {
  @scala.inline
  def apply(
    category: CodePipelineActionCategory,
    owner: AWS | typingsSlinky.awsLambda.awsLambdaStrings.Custom | ThirdParty,
    provider: String,
    version: Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: CodePipelineActionCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AWS | typingsSlinky.awsLambda.awsLambdaStrings.Custom | ThirdParty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

