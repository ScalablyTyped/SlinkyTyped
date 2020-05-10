package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecipeResponse extends js.Object {
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.native
}

object DescribeRecipeResponse {
  @scala.inline
  def apply(): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
  @scala.inline
  implicit class DescribeRecipeResponseOps[Self <: DescribeRecipeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipe(value: Recipe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(js.undefined)
        ret
    }
  }
  
}

