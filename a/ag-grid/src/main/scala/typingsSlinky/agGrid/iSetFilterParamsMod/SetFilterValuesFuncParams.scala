package typingsSlinky.agGrid.iSetFilterParamsMod

import typingsSlinky.agGrid.colDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFilterValuesFuncParams extends js.Object {
  var colDef: ColDef = js.native
  def success(values: js.Array[String]): Unit = js.native
}

object SetFilterValuesFuncParams {
  @scala.inline
  def apply(colDef: ColDef, success: js.Array[String] => Unit): SetFilterValuesFuncParams = {
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetFilterValuesFuncParams]
  }
  @scala.inline
  implicit class SetFilterValuesFuncParamsOps[Self <: SetFilterValuesFuncParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

