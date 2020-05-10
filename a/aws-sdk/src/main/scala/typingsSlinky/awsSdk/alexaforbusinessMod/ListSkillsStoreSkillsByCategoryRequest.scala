package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
  /**
    * The category ID for which the skills are being retrieved from the skill store.
    */
  var CategoryId: typingsSlinky.awsSdk.alexaforbusinessMod.CategoryId = js.native
  /**
    * The maximum number of skills returned per paginated calls.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListSkillsStoreSkillsByCategoryRequest {
  @scala.inline
  def apply(CategoryId: CategoryId): ListSkillsStoreSkillsByCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryId = CategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
  }
  @scala.inline
  implicit class ListSkillsStoreSkillsByCategoryRequestOps[Self <: ListSkillsStoreSkillsByCategoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryId(value: CategoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: SkillListMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

