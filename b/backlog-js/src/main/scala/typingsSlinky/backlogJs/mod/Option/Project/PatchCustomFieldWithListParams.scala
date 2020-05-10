package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchCustomFieldWithListParams extends PatchCustomFieldParams {
  var allowAddItem: js.UndefOr[Boolean] = js.native
  var allowInput: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[String]] = js.native
}

object PatchCustomFieldWithListParams {
  @scala.inline
  def apply(): PatchCustomFieldWithListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithListParams]
  }
  @scala.inline
  implicit class PatchCustomFieldWithListParamsOps[Self <: PatchCustomFieldWithListParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAddItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAddItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInput")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

