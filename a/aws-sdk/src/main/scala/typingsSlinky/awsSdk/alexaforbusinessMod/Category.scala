package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.CategoryId] = js.native
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.CategoryName] = js.native
}

object Category {
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
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
    def withoutCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryName(value: CategoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryName")(js.undefined)
        ret
    }
  }
  
}

