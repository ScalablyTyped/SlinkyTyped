package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecipesResponse extends js.Object {
  /**
    * A token for getting the next set of recipes.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of available recipes.
    */
  var recipes: js.UndefOr[Recipes] = js.native
}

object ListRecipesResponse {
  @scala.inline
  def apply(): ListRecipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecipesResponse]
  }
  @scala.inline
  implicit class ListRecipesResponseOps[Self <: ListRecipesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipes(value: Recipes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipes")(js.undefined)
        ret
    }
  }
  
}

