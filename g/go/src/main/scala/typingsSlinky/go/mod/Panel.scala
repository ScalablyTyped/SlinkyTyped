package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Panel is a GraphObject that holds other GraphObjects as its elements.
  * A Panel is responsible for sizing and positioning its elements.
  * Every Panel has a .type and establishes its own coordinate system. The .type of a Panel
  * determines how it will size and arrange its elements.
  */
@JSImport("go", "Panel")
@js.native
/**
  * Constructs an empty Panel of the given .type.
  * @param {EnumValue=} type If not supplied, the default Panel type is Panel.Position.
  */
class Panel () extends GraphObject {
  def this(`type`: EnumValue) = this()
  
  /**
    * Adds a GraphObject to the end of this Panel's list of elements, visually in front of all of the other elements.
    * @param {GraphObject} element A GraphObject.
    */
  def add(element: GraphObject): Unit = js.native
  
  /**This read-only property returns the number of columns in this Panel if it is of .type Panel.Table.*/
  var columnCount: Double = js.native
  
  /**Gets or sets how this Panel's columns deal with extra space if the Panel is of .type Panel.Table.*/
  var columnSizing: EnumValue = js.native
  
  /**Gets or sets the optional model data to which this panel is data-bound.*/
  var data: js.Any = js.native
  
  /**Gets or sets the default alignment spot of this Panel, used as the alignment for an element when its GraphObject.alignment value is Spot.Default.*/
  var defaultAlignment: Spot = js.native
  
  /**Gets or sets the default dash array for a particular column's separator.*/
  var defaultColumnSeparatorDashArray: js.Array[Double] = js.native
  
  /**Gets or sets the default Brush stroke (or CSS color string) for columns in a Table Panel provided a given column has a nonzero RowColumnDefinition.separatorStrokeWidth.*/
  var defaultColumnSeparatorStroke: BrushLike = js.native
  
  /**Gets or sets the default stroke width for a particular column's separator.*/
  var defaultColumnSeparatorStrokeWidth: Double = js.native
  
  /**Gets or sets the default dash array for a particular row's separator.*/
  var defaultRowSeparatorDashArray: js.Array[Double] = js.native
  
  /**Gets or sets the default Brush stroke (or CSS color string) for rows in a Table Panel provided a given row has a nonzero RowColumnDefinition.separatorStrokeWidth.*/
  var defaultRowSeparatorStroke: BrushLike = js.native
  
  /**Gets or sets the default stroke width for a particular row's separator.*/
  var defaultRowSeparatorStrokeWidth: Double = js.native
  
  /**Gets or sets the additional padding for a particular row or column, a Margin (or number for a uniform Margin).*/
  var defaultSeparatorPadding: MarginLike = js.native
  
  /**Gets or sets the default stretch of this Panel, used as the stretch for an element when its GraphObject.stretch value is GraphObject.Default.*/
  var defaultStretch: EnumValue = js.native
  
  /**This read-only property returns an iterator over the collection of the GraphObjects that this panel manages.*/
  var elements: Iterator[GraphObject] = js.native
  
  /**
    * Returns the GraphObject in this Panel's list of elements at the specified index.
    * @param {number} idx a zero-based index
    */
  def elt(idx: Double): GraphObject = js.native
  
  /**
    * Returns the cell at a given x-coordinate in local coordinates.
    * @param {number} x
    */
  def findColumnForLocalX(x: Double): Double = js.native
  
  /**
    * Return the Panel that was made for a particular data object in this panel's itemArray.
    * If this returns a Panel, its data property will be the argument data object.
    */
  def findItemPanelForData(data: js.Object): Panel = js.native
  
  /**
    * Returns the first immediate child element with GraphObject.isPanelMain set to true,
    * or if there is no such child element, just the first element.
    */
  def findMainElement(): GraphObject = js.native
  
  /**
    * Search the visual tree starting at this Panel for a GraphObject whose GraphObject.name is the given name.
    * @param {string} name The name to search for, using a case-sensitive string comparison.
    */
  def findObject(name: String): GraphObject = js.native
  
  /**
    * Returns the row at a given y-coordinate in local coordinates.
    * @param {number} y
    */
  def findRowForLocalY(y: Double): Double = js.native
  
  /**
    * Gets the RowColumnDefinition for a particular column in this Table Panel.
    * @param {number} idx the non-negative zero-based integer column index.
    */
  def getColumnDefinition(idx: Double): RowColumnDefinition = js.native
  
  /**
    * Gets the RowColumnDefinition for a particular row in this Table Panel.
    * @param {number} idx the non-negative zero-based integer row index.
    */
  def getRowDefinition(idx: Double): RowColumnDefinition = js.native
  
  /**Gets or sets the distance between lines in a .Grid panel.*/
  var gridCellSize: Size = js.native
  
  /**Gets or sets an origin point for the grid cells in a .Grid panel.*/
  var gridOrigin: Point = js.native
  
  /**
    * Adds a GraphObject to the Panel's list of elements at the specified index.
    * @param {number} index
    * @param {GraphObject} element A GraphObject.
    */
  def insertAt(index: Double, element: GraphObject): Unit = js.native
  
  /**Gets or sets a JavaScript Array of values or objects, each of which will be represented by a Panel as elements in this Panel.*/
  var itemArray: js.Array[_] = js.native
  
  /**Gets or sets the name of the item data property that returns a string describing that data's category, or a function that takes an item data object and returns that string; the default value is the name 'category'.*/
  var itemCategoryProperty: PropertyAccessor = js.native
  
  /**This read-only property returns the index of the item in the containing Panel's Panel.itemArray that this Panel represents.*/
  var itemIndex: Double = js.native
  
  /**Gets or sets the default Panel template used as the archetype for item data that are in .itemArray.*/
  var itemTemplate: Panel = js.native
  
  /**Gets or sets a Map mapping template names to Panels.*/
  var itemTemplateMap: Map[String, Panel] = js.native
  
  /**Gets or sets the first column that this Panel of .type Panel.Table displays.*/
  var leftIndex: Double = js.native
  
  /**Gets or sets the space between this Panel's border and its content, as a Margin (or number for a uniform Margin), depending on the type of panel.*/
  var padding: MarginLike = js.native
  
  /**
    * Create and add new GraphObjects corresponding to and bound to the data in the .itemArray, after removing all existing elements from this Panel.
    */
  def rebuildItemElements(): Unit = js.native
  
  /**
    * Removes a GraphObject from this Panel's list of elements.
    * @param {GraphObject} element A GraphObject.
    */
  def remove(element: GraphObject): Unit = js.native
  
  /**
    * Removes an GraphObject from this Panel's list of elements at the specified index.
    * @param {number} idx
    */
  def removeAt(idx: Double): Unit = js.native
  
  /**
    * Removes the RowColumnDefinition for a particular row in this Table Panel.
    * @param {number} idx the non-negative zero-based integer row index.
    */
  def removeColumnDefinition(idx: Double): Unit = js.native
  
  /**
    * Removes the RowColumnDefinition for a particular row in this Table Panel.
    * @param {number} idx the non-negative zero-based integer row index.
    */
  def removeRowDefinition(idx: Double): Unit = js.native
  
  /**This read-only property returns the number of row in this Panel if it is of .type Panel.Table.*/
  var rowCount: Double = js.native
  
  /**Gets or sets how this Panel's rows deal with extra space if the Panel is of .type Panel.Table.*/
  var rowSizing: EnumValue = js.native
  
  /**Gets or sets the first row that this this Panel of .type Panel.Table displays.*/
  var topIndex: Double = js.native
  
  /**Gets or sets the type of the Panel.*/
  var `type`: EnumValue = js.native
  
  /**
    * Re-evaluate all data bindings on this panel, in order to assign new property values to the GraphObjects in this visual tree based on this this object's .data property values.
    * @param {string=} srcprop An optional source data property name:
    *   when provided, only evaluates those Bindings that use that particular property;
    *   when not provided or when it is the empty string, all bindings are evaluated.
    */
  def updateTargetBindings(): Unit = js.native
  def updateTargetBindings(srcprop: String): Unit = js.native
  
  /**Gets or sets how a .Viewbox panel will resize its content.*/
  var viewboxStretch: EnumValue = js.native
}
/* static members */
@JSImport("go", "Panel")
@js.native
object Panel extends js.Object {
  
  /**This value for .type resizes the main element to fit around the other elements; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  var Auto: EnumValue = js.native
  
  /**This value for .type is used to draw regular patterns of lines.*/
  var Grid: EnumValue = js.native
  
  /**This value for .type lays out the elements horizontally with their GraphObject.alignment property dictating their alignment on the Y-axis.*/
  var Horizontal: EnumValue = js.native
  
  /**This value for .type is used for Links and adornments that act as Links.*/
  var Link: EnumValue = js.native
  
  /**The default .type arranges each element according to their GraphObject.position.*/
  var Position: EnumValue = js.native
  
  /**This value for .type arranges GraphObjects about a main element using the GraphObject.alignment and GraphObject.alignmentFocus properties; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  var Spot: EnumValue = js.native
  
  /**This value for .type arranges GraphObjects into rows and columns; set the GraphObject.row and GraphObject.column properties on each element.*/
  var Table: EnumValue = js.native
  
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  var TableColumn: EnumValue = js.native
  
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  var TableRow: EnumValue = js.native
  
  /**This value for .type lays out the elements vertically with their GraphObject.alignment property dictating their alignment on the X-axis.*/
  var Vertical: EnumValue = js.native
  
  /**This value for .type rescales a single GraphObject to fit inside the panel depending on the element's GraphObject.stretch property.*/
  var Viewbox: EnumValue = js.native
}
