package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELangEdit
@js.native
trait IELangEditDelegates extends js.Object {
  var btnAddClickHandler: js.Function = js.native
  var btnAddHandler: js.Function = js.native
  var insertCallback: js.Function = js.native
  var insertHandler: js.Function = js.native
  var modifyCallback: js.Function = js.native
  var modifyHandler: js.Function = js.native
  var removeCallback: js.Function = js.native
  var removeHandler: js.Function = js.native
  var selectCallback: js.Function = js.native
  var selectHandler: js.Function = js.native
}

object IELangEditDelegates {
  @scala.inline
  def apply(
    btnAddClickHandler: js.Function,
    btnAddHandler: js.Function,
    insertCallback: js.Function,
    insertHandler: js.Function,
    modifyCallback: js.Function,
    modifyHandler: js.Function,
    removeCallback: js.Function,
    removeHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangEditDelegates = {
    val __obj = js.Dynamic.literal(btnAddClickHandler = btnAddClickHandler.asInstanceOf[js.Any], btnAddHandler = btnAddHandler.asInstanceOf[js.Any], insertCallback = insertCallback.asInstanceOf[js.Any], insertHandler = insertHandler.asInstanceOf[js.Any], modifyCallback = modifyCallback.asInstanceOf[js.Any], modifyHandler = modifyHandler.asInstanceOf[js.Any], removeCallback = removeCallback.asInstanceOf[js.Any], removeHandler = removeHandler.asInstanceOf[js.Any], selectCallback = selectCallback.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditDelegates]
  }
  @scala.inline
  implicit class IELangEditDelegatesOps[Self <: IELangEditDelegates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnAddClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnAddClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtnAddHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnAddHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectCallback")(value.asInstanceOf[js.Any])
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

