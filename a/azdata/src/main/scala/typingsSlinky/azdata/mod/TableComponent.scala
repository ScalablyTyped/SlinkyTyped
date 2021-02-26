package typingsSlinky.azdata.mod

import typingsSlinky.vscode.mod.Disposable
import typingsSlinky.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.azdata.mod.ComponentProperties because Already inherited
- typingsSlinky.azdata.mod.TableComponentProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined data, columns, fontSize, selectedRows, forceFitColumns, title, ariaRowCount, ariaColumnCount, updateCells, moveFocusOutWithTab */ @js.native
trait TableComponent extends Component {
  
  var ariaColumnCount: js.UndefOr[Double] = js.native
  
  var ariaRowCount: js.UndefOr[Double] = js.native
  
  var columns: js.Array[String | TableColumn] = js.native
  
  var data: js.Array[js.Array[_]] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.native
  
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.native
  
  var onCellAction: js.UndefOr[Event[ICellActionEventArgs]] = js.native
  
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onRowSelected(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onRowSelected")
  var onRowSelected_Original: Event[_] = js.native
  
  var selectedRows: js.UndefOr[js.Array[Double]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.native
}
