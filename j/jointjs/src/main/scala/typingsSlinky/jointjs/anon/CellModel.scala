package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellModel extends js.Object {
  var cellModel: js.UndefOr[TypeofCell] = js.native
  var cellNamespace: js.UndefOr[js.Any] = js.native
}

object CellModel {
  @scala.inline
  def apply(): CellModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellModel]
  }
  @scala.inline
  implicit class CellModelOps[Self <: CellModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellModel(value: TypeofCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellModel")(js.undefined)
        ret
    }
    @scala.inline
    def withCellNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNamespace")(js.undefined)
        ret
    }
  }
  
}

