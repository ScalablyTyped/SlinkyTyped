package typingsSlinky.jqgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColModel extends js.Object {
  var colModel: js.Any = js.native
  var rowId: js.Any = js.native
}

object ColModel {
  @scala.inline
  def apply(colModel: js.Any, rowId: js.Any): ColModel = {
    val __obj = js.Dynamic.literal(colModel = colModel.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColModel]
  }
  @scala.inline
  implicit class ColModelOps[Self <: ColModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

