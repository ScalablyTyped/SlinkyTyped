package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TableCardRow. */
@js.native
trait ITableCardRow extends js.Object {
  /** TableCardRow cells */
  var cells: js.UndefOr[js.Array[ITableCardCell] | Null] = js.native
  /** TableCardRow dividerAfter */
  var dividerAfter: js.UndefOr[Boolean | Null] = js.native
}

object ITableCardRow {
  @scala.inline
  def apply(): ITableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableCardRow]
  }
  @scala.inline
  implicit class ITableCardRowOps[Self <: ITableCardRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[ITableCardCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withCellsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(null)
        ret
    }
    @scala.inline
    def withDividerAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerAfterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAfter")(null)
        ret
    }
  }
  
}

