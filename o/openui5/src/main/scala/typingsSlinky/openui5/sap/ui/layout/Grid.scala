package typingsSlinky.openui5.sap.ui.layout

import typingsSlinky.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid extends Control {
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): Grid = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): Grid = js.native
  
  /**
    * Gets current value of property <code>containerQuery</code>.If true then not the media Query ( device
    * screen size), but the size of the container surrounding the grid defines the current range (large,
    * medium or small).Default value is <code>false</code>.
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.Controls that are placed into Grid layout.
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>defaultIndent</code>.Optional. Defines default for the whole
    * Grid numbers of empty columns before the current span begins. It can be defined for large, medium
    * and small screens. Allowed values are separated by space Letters L, M or S followed by number of
    * columns from 0 to 11 that the container has to take, for example: "L2 M4 S6", "M11", "s10" or "l4
    * m4". Note that the parameters has to be provided in the order large medium small.Default value is
    * <code>XL0 L0 M0 S0</code>.
    * @returns Value of property <code>defaultIndent</code>
    */
  def getDefaultIndent(): js.Any = js.native
  
  /**
    * Gets current value of property <code>defaultSpan</code>.Optional. A string type that represents
    * Grid's default span values for large, medium and small screens for the whole Grid. Allowed values
    * are separated by space Letters L, M or S followed by number of columns from 1 to 12 that the
    * container has to take, for example: "L2 M4 S6", "M12", "s10" or "l4 m4". Note that the parameters
    * has to be provided in the order large medium small.Default value is <code>XL3 L3 M6 S12</code>.
    * @returns Value of property <code>defaultSpan</code>
    */
  def getDefaultSpan(): js.Any = js.native
  
  /**
    * Gets current value of property <code>hSpacing</code>.Optional. Horizontal spacing between the
    * content in the Grid. In rem, allowed values are 0, 0.5 , 1 or 2.Default value is <code>1</code>.
    * @returns Value of property <code>hSpacing</code>
    */
  def getHSpacing(): Double = js.native
  
  /**
    * Gets current value of property <code>position</code>.Optional. Position of the Grid in the window or
    * surrounding container. Possible values are "Center", "Left" and "Right".Default value is
    * <code>Left</code>.
    * @returns Value of property <code>position</code>
    */
  def getPosition(): GridPosition = js.native
  
  /**
    * Gets current value of property <code>vSpacing</code>.Optional. Vertical spacing between the rows in
    * the Grid. In rem, allowed values are 0, 0.5, 1 and 2.Default value is <code>1</code>.
    * @returns Value of property <code>vSpacing</code>
    */
  def getVSpacing(): Double = js.native
  
  /**
    * Gets current value of property <code>width</code>.Optional. Width of the Grid. If not specified,
    * then 100%.Default value is <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): Grid = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>containerQuery</code>.If true then not the media Query ( device
    * screen size), but the size of the container surrounding the grid defines the current range (large,
    * medium or small).When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bContainerQuery New value for property <code>containerQuery</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContainerQuery(bContainerQuery: Boolean): Grid = js.native
  
  /**
    * Sets a new value for property <code>defaultIndent</code>.Optional. Defines default for the whole
    * Grid numbers of empty columns before the current span begins. It can be defined for large, medium
    * and small screens. Allowed values are separated by space Letters L, M or S followed by number of
    * columns from 0 to 11 that the container has to take, for example: "L2 M4 S6", "M11", "s10" or "l4
    * m4". Note that the parameters has to be provided in the order large medium small.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>XL0 L0 M0 S0</code>.
    * @param sDefaultIndent New value for property <code>defaultIndent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultIndent(sDefaultIndent: js.Any): Grid = js.native
  
  /**
    * Sets a new value for property <code>defaultSpan</code>.Optional. A string type that represents
    * Grid's default span values for large, medium and small screens for the whole Grid. Allowed values
    * are separated by space Letters L, M or S followed by number of columns from 1 to 12 that the
    * container has to take, for example: "L2 M4 S6", "M12", "s10" or "l4 m4". Note that the parameters
    * has to be provided in the order large medium small.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>XL3 L3 M6 S12</code>.
    * @param sDefaultSpan New value for property <code>defaultSpan</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultSpan(sDefaultSpan: js.Any): Grid = js.native
  
  /**
    * Sets a new value for property <code>hSpacing</code>.Optional. Horizontal spacing between the content
    * in the Grid. In rem, allowed values are 0, 0.5 , 1 or 2.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>1</code>.
    * @param fHSpacing New value for property <code>hSpacing</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHSpacing(fHSpacing: Double): Grid = js.native
  
  /**
    * Sets a new value for property <code>position</code>.Optional. Position of the Grid in the window or
    * surrounding container. Possible values are "Center", "Left" and "Right".When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Left</code>.
    * @param sPosition New value for property <code>position</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPosition(sPosition: GridPosition): Grid = js.native
  
  /**
    * Sets a new value for property <code>vSpacing</code>.Optional. Vertical spacing between the rows in
    * the Grid. In rem, allowed values are 0, 0.5, 1 and 2.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>1</code>.
    * @param fVSpacing New value for property <code>vSpacing</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVSpacing(fVSpacing: Double): Grid = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Optional. Width of the Grid. If not specified, then
    * 100%.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Grid = js.native
}
