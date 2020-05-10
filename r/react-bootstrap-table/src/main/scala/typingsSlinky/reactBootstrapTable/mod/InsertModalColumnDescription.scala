package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModalColumnDescription[TRow /* <: js.Object */] extends js.Object {
   // children.props.keyValidator
  /**
  	 * Flag to indicate that the field should be auto-generated rather than edited. It is only present if there is more
  	 * than one column in the table.
  	 * Comes from TableHeader.autoValue.
  	 */
  var autoValue: js.UndefOr[Boolean] = js.native
   // children.props.dataField,
  /**
  	 * Flag to indicate whether this column is editable.
  	 * Comes from TableHeader.editable.
  	 */
  var editable: Boolean | (Editable[TRow, /* keyof TRow */ String]) | (js.Function4[
    /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    Boolean | String | EditValidatorObject
  ]) = js.native
  /**
  	 * Field name for the column data.
  	 * Comes from TableHeader.dataField.
  	 */
  var field: /* keyof TRow */ String = js.native
  /**
  	 * Format function for the field. It is only present if there is more than one column in the table. Value is either
  	 * 'false', meaning that there is no format function present, or a wrapper function that returns the formatted string
  	 * content for the field using the TableHeader.dataFormat function to generate that string.
  	 *
  	 * Based on from TableHeader.dataFormat, but is applied as a wrapper function around that function.
  	 */
  var format: js.UndefOr[
    Boolean | (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
      String
    ])
  ] = js.native
  /**
  	 * Flag to indicate whether this column should be hidden on the Insert Modal page.
  	 * Comes from TableHeader.hiddenOnInsert.
  	 */
  var hiddenOnInsert: Boolean = js.native
  /**
  	 * Flag to indicate that this is the key field for the column. It is only present if there is more than
  	 * one column in the table.
  	 * Comes from TableHeader.isKey field.
  	 */
  var isKey: js.UndefOr[Boolean] = js.native
   // children.props.hiddenOnInsert,
  /**
  	 * Flag to indicate whether the table should check that a key does not already exist.
  	 * Comes from TableHeader.keyValidator.
  	 */
  var keyValidator: Boolean = js.native
  /**
  	 * Header text/element for the column.
  	 * Comes from TableHeader.headerText or TableHeader.children.
  	 */
  var name: String | ReactElement = js.native
  /**
  	 * Custom element to use for the Insert field element.
  	 * Comes from TableHeader.customInsertEditor.
  	 */
  def customInsertEditor(
    column: InsertModalColumnDescription[TRow],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ js.Any
  ): ReactElement | Boolean = js.native
}

object InsertModalColumnDescription {
  @scala.inline
  def apply[TRow](
    customInsertEditor: (InsertModalColumnDescription[TRow], EditableAttrs, String, Boolean, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ js.Any) => ReactElement | Boolean,
    editable: Boolean | (Editable[TRow, /* keyof TRow */ String]) | (js.Function4[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]),
    field: /* keyof TRow */ String,
    hiddenOnInsert: Boolean,
    keyValidator: Boolean,
    name: String | ReactElement
  ): InsertModalColumnDescription[TRow] = {
    val __obj = js.Dynamic.literal(customInsertEditor = js.Any.fromFunction5(customInsertEditor), editable = editable.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hiddenOnInsert = hiddenOnInsert.asInstanceOf[js.Any], keyValidator = keyValidator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertModalColumnDescription[TRow]]
  }
  @scala.inline
  implicit class InsertModalColumnDescriptionOps[Self[trow] <: InsertModalColumnDescription[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withCustomInsertEditor(
      value: (InsertModalColumnDescription[TRow], EditableAttrs, String, Boolean, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ js.Any) => ReactElement | Boolean
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInsertEditor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withEditableFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEditable(
      value: Boolean | (Editable[TRow, /* keyof TRow */ String]) | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: /* keyof TRow */ String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenOnInsert(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyValidator(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameReactElement(value: ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String | ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoValue(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoValue: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any => String
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(
      value: Boolean | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
          String
        ])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIsKey(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsKey: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(js.undefined)
        ret
    }
  }
  
}

