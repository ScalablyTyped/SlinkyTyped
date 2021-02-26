package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertModalColumnDescription[TRow /* <: js.Object */] extends StObject {
  
  // children.props.keyValidator
  /**
    * Flag to indicate that the field should be auto-generated rather than edited. It is only present if there is more
    * than one column in the table.
    * Comes from TableHeader.autoValue.
    */
  var autoValue: js.UndefOr[Boolean] = js.native
  
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
}
object InsertModalColumnDescription {
  
  @scala.inline
  def apply[TRow /* <: js.Object */](
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
  implicit class InsertModalColumnDescriptionMutableBuilder[Self <: InsertModalColumnDescription[_], TRow /* <: js.Object */] (val x: Self with InsertModalColumnDescription[TRow]) extends AnyVal {
    
    @scala.inline
    def setAutoValue(value: Boolean): Self = StObject.set(x, "autoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
    
    @scala.inline
    def setCustomInsertEditor(
      value: (InsertModalColumnDescription[TRow], EditableAttrs, String, Boolean, /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ js.Any) => ReactElement | Boolean
    ): Self = StObject.set(x, "customInsertEditor", js.Any.fromFunction5(value))
    
    @scala.inline
    def setEditable(
      value: Boolean | (Editable[TRow, /* keyof TRow */ String]) | (js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableFunction4(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self = StObject.set(x, "editable", js.Any.fromFunction4(value))
    
    @scala.inline
    def setField(value: /* keyof TRow */ String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(
      value: Boolean | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
          String
        ])
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any => String
    ): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHiddenOnInsert(value: Boolean): Self = StObject.set(x, "hiddenOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKeyUndefined: Self = StObject.set(x, "isKey", js.undefined)
    
    @scala.inline
    def setKeyValidator(value: Boolean): Self = StObject.set(x, "keyValidator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String | ReactElement): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameReactElement(value: ReactElement): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
