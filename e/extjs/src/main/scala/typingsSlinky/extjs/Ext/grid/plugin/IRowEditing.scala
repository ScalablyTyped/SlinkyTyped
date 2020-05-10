package typingsSlinky.extjs.Ext.grid.plugin

import typingsSlinky.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowEditing extends IEditing {
  /** [Config Option] (Boolean) */
  var autoCancel: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var clicksToMoveEditor: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var errorSummary: js.UndefOr[Boolean] = js.native
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		* @returns Boolean true if editing was started, false otherwise.
  		*/
  @JSName("startEdit")
  var startEdit_IRowEditing: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Boolean]
  ] = js.native
}

object IRowEditing {
  @scala.inline
  def apply(): IRowEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowEditing]
  }
  @scala.inline
  implicit class IRowEditingOps[Self <: IRowEditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withClicksToMoveEditor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicksToMoveEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClicksToMoveEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicksToMoveEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStartEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEdit")(js.undefined)
        ret
    }
  }
  
}

