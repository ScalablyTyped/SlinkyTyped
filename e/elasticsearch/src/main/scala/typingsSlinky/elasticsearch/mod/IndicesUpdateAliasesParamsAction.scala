package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.anon.Alias
import typingsSlinky.elasticsearch.anon.IndexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[Alias] = js.native
  var remove: js.UndefOr[typingsSlinky.elasticsearch.anon.Indices] = js.native
  var remove_index: js.UndefOr[IndexString] = js.native
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
    def withAdd(value: Alias): Self = {
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
    def withRemove(value: typingsSlinky.elasticsearch.anon.Indices): Self = {
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
    def withRemove_index(value: IndexString): Self = {
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

