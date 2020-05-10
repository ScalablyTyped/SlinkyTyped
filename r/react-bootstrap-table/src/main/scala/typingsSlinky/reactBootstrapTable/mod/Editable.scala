package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable.AnonValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends js.Object {
  /**
  	 * Additional attributes for the editor component.
  	 */
  var attrs: js.UndefOr[EditableAttrs] = js.native
  /**
  	 * Class name to use for the editor component.
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Number of columns to display for a text area component.
  	 */
  var cols: js.UndefOr[Double] = js.native
  /**
  	 * Default value to show in the edit field in the Insert Modal for this column.
  	 */
  var defaultValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any
  ] = js.native
  /**
  	 * Data in a select or checkbox. If a checkbox, use a string with a ':'(colon) to separate the two values, ex: Y:N
  	 * The callback function can be used to customize the select options based on other field values within the row.
  	 * If the array is an array of objects, the fields 'text' can be used for the display text and 'value' to specify
  	 * the option's value.
  	 */
  var options: js.UndefOr[AnonValues[TRow]] = js.native
  /**
  	 * @deprecated Use placeholder inside the attrs field instead.
  	 * Text to display as placeholder text in the editor component.
  	 */
  var placeholder: js.UndefOr[String] = js.native
  /**
  	 * Used to specify a field that can be modified in the insert modal when adding a new row, but cannot be edited
  	 * inside the table after the row has been inserted.
  	 */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Number of rows to display for a text area component.
  	 */
  var rows: js.UndefOr[Double] = js.native
  /**
  	 * CSS Style to use for the editor component.
  	 */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Edit field type, avaiable value is 'textarea', 'select', 'checkbox' and 'datetime'
  	 */
  var `type`: js.UndefOr[EditCellType] = js.native
  /**
  	 * Validation function for the column. It takes the new "cell value" as argument. This function should return
  	 * a boolean true/false for isValid, or an EditValidatorObject (so that an error message can be provided).
  	 */
  var validator: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, 
      /* row */ TRow, 
      Boolean | String | EditValidatorObject
    ]
  ] = js.native
}

object Editable {
  @scala.inline
  def apply[TRow, K](): Editable[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editable[TRow, K]]
  }
  @scala.inline
  implicit class EditableOps[Self[trow, k] <: Editable[trow, k], TRow, K] (val x: Self[TRow, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRow, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRow, K]) with Other]
    @scala.inline
    def withAttrs(value: EditableAttrs): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonValues[TRow]): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: EditCellType): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, /* row */ TRow) => Boolean | String | EditValidatorObject
    ): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidator: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

