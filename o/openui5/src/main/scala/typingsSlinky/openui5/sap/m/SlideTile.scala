package typingsSlinky.openui5.sap.m

import typingsSlinky.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideTile extends Control {
  
  /**
    * Adds some tile to the aggregation <code>tiles</code>.
    * @param oTile the tile to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addTile(oTile: GenericTile): SlideTile = js.native
  
  /**
    * Destroys all the tiles in the aggregation <code>tiles</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTiles(): SlideTile = js.native
  
  /**
    * Gets current value of property <code>displayTime</code>.The time of the slide display in
    * milliseconds.Default value is <code>5000</code>.
    * @returns Value of property <code>displayTime</code>
    */
  def getDisplayTime(): Double = js.native
  
  /**
    * Gets content of aggregation <code>tiles</code>.The set of Generic Tiles to be shown in the control.
    */
  def getTiles(): js.Array[GenericTile] = js.native
  
  /**
    * Gets current value of property <code>transitionTime</code>.The time of the slide changing in
    * milliseconds.Default value is <code>500</code>.
    * @returns Value of property <code>transitionTime</code>
    */
  def getTransitionTime(): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.GenericTile</code> in the aggregation <code>tiles</code>.and
    * returns its index if found or -1 otherwise.
    * @param oTile The tile whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfTile(oTile: GenericTile): Double = js.native
  
  /**
    * Inserts a tile into the aggregation <code>tiles</code>.
    * @param oTile the tile to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the tile should be inserted at; for             a
    * negative value of <code>iIndex</code>, the tile is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the tile is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertTile(oTile: GenericTile, iIndex: Double): SlideTile = js.native
  
  /**
    * Removes all the controls from the aggregation <code>tiles</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTiles(): js.Array[GenericTile] = js.native
  
  def removeTile(vTile: String): GenericTile = js.native
  /**
    * Removes a tile from the aggregation <code>tiles</code>.
    * @param vTile The tile to remove or its index or id
    * @returns The removed tile or <code>null</code>
    */
  def removeTile(vTile: Double): GenericTile = js.native
  def removeTile(vTile: GenericTile): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>displayTime</code>.The time of the slide display in
    * milliseconds.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>5000</code>.
    * @param iDisplayTime New value for property <code>displayTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayTime(iDisplayTime: Double): SlideTile = js.native
  
  /**
    * Sets a new value for property <code>transitionTime</code>.The time of the slide changing in
    * milliseconds.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>500</code>.
    * @param iTransitionTime New value for property <code>transitionTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTransitionTime(iTransitionTime: Double): SlideTile = js.native
}
