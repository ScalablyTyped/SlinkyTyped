package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellTypeSettings extends js.Object {
  /** Specifies the button background color of Custom Cell type.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the dropdown list data source range of Custom Cell type.
    */
  var dataSourceRange: js.UndefOr[String] = js.native
  /** Specifies the dropdown list data source sheet index of Custom Cell type.
    */
  var dataSourceSheetIndex: js.UndefOr[Double] = js.native
  /** Specifies the text and value of field in dropdown list.
    */
  var field: js.UndefOr[js.Any] = js.native
  /** Specifies the checkbox is set true or false of Custom Cell type.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  /** Specifies the button text of Custom Cell type.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the button type of Custom Cell type.
    */
  var `type`: js.UndefOr[CustomCellType] = js.native
  /** Specifies the value for datepicker of Custom Cell type.
    */
  var value: js.UndefOr[String] = js.native
}

object CellTypeSettings {
  @scala.inline
  def apply(): CellTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellTypeSettings]
  }
  @scala.inline
  implicit class CellTypeSettingsOps[Self <: CellTypeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceSheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceSheetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CustomCellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

