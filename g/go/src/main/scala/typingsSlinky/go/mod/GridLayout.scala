package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
@JSImport("go", "GridLayout")
@js.native
/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
class GridLayout () extends Layout {
  
  /**Gets or sets whether the Part.location or the position should be used to arrange each part.*/
  var alignment: EnumValue = js.native
  
  /**Gets or sets how to arrange the parts.*/
  var arrangement: EnumValue = js.native
  
  /**Gets or sets the minimum part size by which each part is positioned in the grid.*/
  var cellSize: Size = js.native
  
  /**Gets or sets the comparison function used to sort the parts.*/
  def comparer(a: Part, b: Part): Double = js.native
  
  /**Gets or sets what order to place the parts.*/
  var sorting: EnumValue = js.native
  
  /**Gets or sets the minimum horizontal and vertical space between parts.*/
  var spacing: Size = js.native
  
  /**Gets or sets the maximum number of columns.*/
  var wrappingColumn: Double = js.native
  
  /**Gets or sets the wrapping width.*/
  var wrappingWidth: Double = js.native
}
/* static members */
@JSImport("go", "GridLayout")
@js.native
object GridLayout extends js.Object {
  
  /**Lay out each child according to the sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  var Ascending: EnumValue = js.native
  
  /**Lay out each child in reverse sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  var Descending: EnumValue = js.native
  
  /**Lay out each child in the order in which they were found; This value is used for GridLayout.sorting.*/
  var Forward: EnumValue = js.native
  
  /**Fill each row from left to right; This value is used for GridLayout.arrangement.*/
  var LeftToRight: EnumValue = js.native
  
  /**Position the part's Part.location at a grid point; This value is used for GridLayout.alignment.*/
  var Location: EnumValue = js.native
  
  /**Position the top-left corner of each part at a grid point; This value is used for GridLayout.alignment.*/
  var Position: EnumValue = js.native
  
  /**Lay out each child in reverse order from which they were found; This value is used for GridLayout.sorting.*/
  var Reverse: EnumValue = js.native
  
  /**Fill each row from right to left; This value is used for GridLayout.arrangement.*/
  var RightToLeft: EnumValue = js.native
}
