package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangDBDelegates extends js.Object {
  var insertHandler: js.Function = js.native
  var modifyHandler: js.Function = js.native
  var removeHandler: js.Function = js.native
  var selectHandler: js.Function = js.native
}

object IELangDBDelegates {
  @scala.inline
  def apply(
    insertHandler: js.Function,
    modifyHandler: js.Function,
    removeHandler: js.Function,
    selectHandler: js.Function
  ): IELangDBDelegates = {
    val __obj = js.Dynamic.literal(insertHandler = insertHandler.asInstanceOf[js.Any], modifyHandler = modifyHandler.asInstanceOf[js.Any], removeHandler = removeHandler.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBDelegates]
  }
  @scala.inline
  implicit class IELangDBDelegatesOps[Self <: IELangDBDelegates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

