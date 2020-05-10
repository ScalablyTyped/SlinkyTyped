package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEditor[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends js.Object {
  /**
  	 * Additional parameters to pass to the getElement function inside the props argument.
  	 */
  var customEditorParameters: js.UndefOr[js.Object] = js.native
  /**
  	 * Required. Function to use to create the custom cell editor. Takes two parameters:
  	 *   `onUpdate`: callback function to call to update the value inside the cell.
  	 *   `props`:
  	 */
  def getElement(
    onUpdate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ],
    props: CustomEditorProps[TRow, K]
  ): ReactElement = js.native
}

object CustomEditor {
  @scala.inline
  def apply[TRow, K](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => ReactElement
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction2(getElement))
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
  @scala.inline
  implicit class CustomEditorOps[Self[trow, k] <: CustomEditor[trow, k], TRow, K] (val x: Self[TRow, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRow, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRow, K]) with Other]
    @scala.inline
    def withGetElement(
      value: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
          Unit
        ], CustomEditorProps[TRow, K]) => ReactElement
    ): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCustomEditorParameters(value: js.Object): Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditorParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEditorParameters: Self[TRow, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditorParameters")(js.undefined)
        ret
    }
  }
  
}

