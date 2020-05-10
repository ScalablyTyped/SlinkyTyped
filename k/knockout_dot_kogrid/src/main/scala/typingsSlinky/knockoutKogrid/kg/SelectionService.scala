package typingsSlinky.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionService[EntityType] extends js.Object {
  var lastClickedRow: Row[EntityType] = js.native
  var multi: Boolean = js.native
  def setSelection(row: Row[EntityType], selected: Boolean): Unit = js.native
}

object SelectionService {
  @scala.inline
  def apply[EntityType](lastClickedRow: Row[EntityType], multi: Boolean, setSelection: (Row[EntityType], Boolean) => Unit): SelectionService[EntityType] = {
    val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[SelectionService[EntityType]]
  }
  @scala.inline
  implicit class SelectionServiceOps[Self[entitytype] <: SelectionService[entitytype], EntityType] (val x: Self[EntityType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EntityType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EntityType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EntityType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EntityType] with Other]
    @scala.inline
    def withLastClickedRow(value: Row[EntityType]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastClickedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSelection(value: (Row[EntityType], Boolean) => Unit): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

