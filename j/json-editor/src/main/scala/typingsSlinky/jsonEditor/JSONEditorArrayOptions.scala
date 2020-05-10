package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorArrayOptions extends js.Object {
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the "add row" button will be hidden
    */
  var disable_array_add: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, all of the "delete" buttons will be hidden
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, just the "delete all rows" button will be hidden
    */
  var disable_array_delete_all_rows: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, just the "delete last row" buttons will be hidden
    */
  var disable_array_delete_last_row: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the "move up/down" buttons will be hidden
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
}

object JSONEditorArrayOptions {
  @scala.inline
  def apply(): JSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorArrayOptions]
  }
  @scala.inline
  implicit class JSONEditorArrayOptionsOps[Self <: JSONEditorArrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_add(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_add: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_add")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_delete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_delete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_delete_all_rows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete_all_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_delete_all_rows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete_all_rows")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_delete_last_row(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete_last_row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_delete_last_row: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete_last_row")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_reorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_reorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_reorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_reorder")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_collapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_collapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(js.undefined)
        ret
    }
  }
  
}

