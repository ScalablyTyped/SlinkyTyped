package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.AnonAlias
import typingsSlinky.elasticsearch.AnonIndexString
import typingsSlinky.elasticsearch.AnonIndices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[AnonAlias] = js.native
  var remove: js.UndefOr[AnonIndices] = js.native
  var remove_index: js.UndefOr[AnonIndexString] = js.native
}

object IndicesUpdateAliasesParamsAction {
  @scala.inline
  def apply(): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
  @scala.inline
  implicit class IndicesUpdateAliasesParamsActionOps[Self <: IndicesUpdateAliasesParamsAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: AnonIndices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_index(value: AnonIndexString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_index")(js.undefined)
        ret
    }
  }
  
}

