package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCreateRowResult extends js.Object {
  var defaultValues: js.Array[String] = js.native
  var newRowId: Double = js.native
}

object EditCreateRowResult {
  @scala.inline
  def apply(defaultValues: js.Array[String], newRowId: Double): EditCreateRowResult = {
    val __obj = js.Dynamic.literal(defaultValues = defaultValues.asInstanceOf[js.Any], newRowId = newRowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCreateRowResult]
  }
  @scala.inline
  implicit class EditCreateRowResultOps[Self <: EditCreateRowResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewRowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

