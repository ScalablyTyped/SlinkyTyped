package typingsSlinky.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataField extends js.Object {
  var dataField: js.Any = js.native
  var newValue: js.Any = js.native
  var rowId: String = js.native
}

object DataField {
  @scala.inline
  def apply(dataField: js.Any, newValue: js.Any, rowId: String): DataField = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
  @scala.inline
  implicit class DataFieldOps[Self <: DataField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

