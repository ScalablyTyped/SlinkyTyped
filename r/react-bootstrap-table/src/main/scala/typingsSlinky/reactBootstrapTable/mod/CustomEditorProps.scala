package typingsSlinky.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEditorProps[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */]
  extends EditableAttrs
     with /**
	 * Contents of the customEditorParameters object.
	 */
/* parameterName */ StringDictionary[js.Any] {
  /**
  	 * Default value for the editor cell.
  	 */
  var defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any = js.native
  /**
  	 * The row data for the cell being edited.
  	 */
  var row: TRow = js.native
}

object CustomEditorProps {
  @scala.inline
  def apply[TRow, K](
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
  @scala.inline
  implicit class CustomEditorPropsOps[Self[trow, k] <: CustomEditorProps[trow, k], TRow, K] (val x: Self[TRow, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRow, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRow, K]) with Other]
    @scala.inline
    def withDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: TRow): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

