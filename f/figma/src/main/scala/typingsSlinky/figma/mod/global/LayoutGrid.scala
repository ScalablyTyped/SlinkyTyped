package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.CENTER
import typingsSlinky.figma.figmaStrings.COLUMNS
import typingsSlinky.figma.figmaStrings.GRID
import typingsSlinky.figma.figmaStrings.MAX
import typingsSlinky.figma.figmaStrings.MIN
import typingsSlinky.figma.figmaStrings.ROWS
import typingsSlinky.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.RowsColsLayoutGrid
  - typingsSlinky.figma.mod.global.GridLayoutGrid
*/
trait LayoutGrid extends js.Object
object LayoutGrid {
  
  @scala.inline
  def RowsColsLayoutGrid(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS
  ): LayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
  
  @scala.inline
  def GridLayoutGrid(pattern: GRID, sectionSize: Double): LayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
}
