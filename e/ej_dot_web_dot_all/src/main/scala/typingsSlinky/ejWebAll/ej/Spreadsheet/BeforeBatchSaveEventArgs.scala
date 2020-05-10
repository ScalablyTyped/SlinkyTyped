package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeBatchSaveEventArgs extends js.Object {
  /** Returns the changed record object.
    */
  var batchChanges: js.UndefOr[js.Any] = js.native
  /** Returns the query, primary key,batch changes for the data Source.
    */
  var dataSetting: js.UndefOr[js.Any] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
}

object BeforeBatchSaveEventArgs {
  @scala.inline
  def apply(): BeforeBatchSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeBatchSaveEventArgs]
  }
  @scala.inline
  implicit class BeforeBatchSaveEventArgsOps[Self <: BeforeBatchSaveEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchChanges(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetIdx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIdx")(js.undefined)
        ret
    }
  }
  
}

