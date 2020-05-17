package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ComponentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridEditing extends GridBaseEditing {
  /** Specifies whether a user can add new rows. */
  var allowAdding: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can delete rows. It is called for each data row when defined as a function. */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.native
  /** Specifies whether a user can update rows. It is called for each data row when defined as a function. */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.native
  /** Contains options that specify texts for editing-related UI elements. */
  @JSName("texts")
  var texts_dxDataGridEditing: js.UndefOr[js.Any] = js.native
}

object dxDataGridEditing {
  @scala.inline
  def apply(): dxDataGridEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridEditing]
  }
  @scala.inline
  implicit class dxDataGridEditingOps[Self <: dxDataGridEditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeletingFunction1(value: /* options */ ComponentRow => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowDeleting(value: Boolean | (js.Function1[/* options */ ComponentRow, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUpdatingFunction1(value: /* options */ ComponentRow => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpdating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowUpdating(value: Boolean | (js.Function1[/* options */ ComponentRow, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
  }
  
}

