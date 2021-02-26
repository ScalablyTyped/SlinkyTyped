package typingsSlinky.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends ListBase {
  
  /**
    * Adds some column to the aggregation <code>columns</code>.
    * @param oColumn the column to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addColumn(oColumn: Column): List = js.native
  
  /**
    * Destroys all the columns in the aggregation <code>columns</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyColumns(): List = js.native
  
  /**
    * Gets current value of property <code>backgroundDesign</code>.Sets the background style of the list.
    * Depending on the theme, you can change the state of the background from <code>Solid</code> to
    * <code>Translucent</code> or to <code>Transparent</code>.Default value is <code>Solid</code>.
    * @since 1.14
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  
  /**
    * Gets content of aggregation <code>columns</code>.Defines columns of the list.
    */
  def getColumns(): js.Array[Column] = js.native
  
  /**
    * Checks for the provided <code>sap.m.Column</code> in the aggregation <code>columns</code>.and
    * returns its index if found or -1 otherwise.
    * @param oColumn The column whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumn(oColumn: Column): Double = js.native
  
  /**
    * Inserts a column into the aggregation <code>columns</code>.
    * @param oColumn the column to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the column should be inserted at; for             a
    * negative value of <code>iIndex</code>, the column is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the column is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertColumn(oColumn: Column, iIndex: Double): List = js.native
  
  /**
    * Removes all the controls from the aggregation <code>columns</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllColumns(): js.Array[Column] = js.native
  
  def removeColumn(vColumn: String): Column = js.native
  /**
    * Removes a column from the aggregation <code>columns</code>.
    * @param vColumn The column to remove or its index or id
    * @returns The removed column or <code>null</code>
    */
  def removeColumn(vColumn: Double): Column = js.native
  def removeColumn(vColumn: Column): Column = js.native
  
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Sets the background style of the list.
    * Depending on the theme, you can change the state of the background from <code>Solid</code> to
    * <code>Translucent</code> or to <code>Transparent</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Solid</code>.
    * @since 1.14
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): List = js.native
}
