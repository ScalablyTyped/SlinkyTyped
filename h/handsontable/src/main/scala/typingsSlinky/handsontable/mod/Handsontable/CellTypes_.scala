package typingsSlinky.handsontable.mod.Handsontable

import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Autocomplete
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Checkbox
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Date
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Dropdown
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Numeric
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Password
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Text
import typingsSlinky.handsontable.mod.Handsontable.cellTypes.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellTypes_ extends js.Object {
  var autocomplete: Autocomplete = js.native
  var checkbox: Checkbox = js.native
  var date: Date = js.native
  var dropdown: Dropdown = js.native
  var handsontable: typingsSlinky.handsontable.mod.Handsontable.cellTypes.Handsontable = js.native
  var numeric: Numeric = js.native
  var password: Password = js.native
  var text: Text = js.native
  var time: Time = js.native
  def getCellType(name: String): CellTypeObject = js.native
  def registerCellType(name: String, `type`: CellTypeObject): Unit = js.native
}

object CellTypes_ {
  @scala.inline
  def apply(
    autocomplete: Autocomplete,
    checkbox: Checkbox,
    date: Date,
    dropdown: Dropdown,
    getCellType: String => CellTypeObject,
    handsontable: typingsSlinky.handsontable.mod.Handsontable.cellTypes.Handsontable,
    numeric: Numeric,
    password: Password,
    registerCellType: (String, CellTypeObject) => Unit,
    text: Text,
    time: Time
  ): CellTypes_ = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], getCellType = js.Any.fromFunction1(getCellType), handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], registerCellType = js.Any.fromFunction2(registerCellType), text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTypes_]
  }
  @scala.inline
  implicit class CellTypes_Ops[Self <: CellTypes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: Autocomplete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckbox(value: Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: Dropdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellType(value: String => CellTypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandsontable(value: typingsSlinky.handsontable.mod.Handsontable.cellTypes.Handsontable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handsontable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeric(value: Numeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterCellType(value: (String, CellTypeObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCellType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

