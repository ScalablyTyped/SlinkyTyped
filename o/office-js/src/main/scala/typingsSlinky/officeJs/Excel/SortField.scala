package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.CellColor
import typingsSlinky.officeJs.officeJsStrings.FontColor
import typingsSlinky.officeJs.officeJsStrings.Normal
import typingsSlinky.officeJs.officeJsStrings.TextAsNumber
import typingsSlinky.officeJs.officeJsStrings.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a condition in a sorting operation.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait SortField extends js.Object {
  /**
    *
    * Represents whether the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the color that is the target of the condition if the sorting is on font or cell color.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents additional sorting options for this field.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dataOption: js.UndefOr[SortDataOption | Normal | TextAsNumber] = js.native
  /**
    *
    * Represents the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.native
  /**
    *
    * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double = js.native
  /**
    *
    * Represents the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typingsSlinky.officeJs.officeJsStrings.Icon
  ] = js.native
  /**
    *
    * Represents the subfield that is the target property name of a rich value to sort on.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.native
}

object SortField {
  @scala.inline
  def apply(key: Double): SortField = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  @scala.inline
  implicit class SortFieldOps[Self <: SortField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOption(value: SortDataOption | Normal | TextAsNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOption")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOn(value: SortOn | Value | CellColor | FontColor | typingsSlinky.officeJs.officeJsStrings.Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subField")(js.undefined)
        ret
    }
  }
  
}

