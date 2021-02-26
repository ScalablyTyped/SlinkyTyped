package typingsSlinky.easystarjs

import typingsSlinky.easystarjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easystarjs", "BOTTOM")
  @js.native
  val BOTTOM: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM = js.native
  
  @JSImport("easystarjs", "BOTTOM_LEFT")
  @js.native
  val BOTTOM_LEFT: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_LEFT = js.native
  
  @JSImport("easystarjs", "BOTTOM_RIGHT")
  @js.native
  val BOTTOM_RIGHT: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_RIGHT = js.native
  
  @JSImport("easystarjs", "LEFT")
  @js.native
  val LEFT: typingsSlinky.easystarjs.easystarjsStrings.LEFT = js.native
  
  @JSImport("easystarjs", "RIGHT")
  @js.native
  val RIGHT: typingsSlinky.easystarjs.easystarjsStrings.RIGHT = js.native
  
  @JSImport("easystarjs", "TOP")
  @js.native
  val TOP: typingsSlinky.easystarjs.easystarjsStrings.TOP = js.native
  
  @JSImport("easystarjs", "TOP_LEFT")
  @js.native
  val TOP_LEFT: typingsSlinky.easystarjs.easystarjsStrings.TOP_LEFT = js.native
  
  @JSImport("easystarjs", "TOP_RIGHT")
  @js.native
  val TOP_RIGHT: typingsSlinky.easystarjs.easystarjsStrings.TOP_RIGHT = js.native
  
  @JSImport("easystarjs", "js")
  @js.native
  class js_ () extends StObject {
    
    /**
      * Avoid a particular point on the grid,
      * regardless of whether or not it is an acceptable tile.
      *
      * @param {Number} x The x value of the point to avoid.
      * @param {Number} y The y value of the point to avoid.
      */
    def avoidAdditionalPoint(x: Double, y: Double): Unit = js.native
    
    /**
      * This method steps through the A* Algorithm in an attempt to
      * find your path(s). It will search 4-8 tiles (depending on diagonals) for every calculation.
      * You can change the number of calculations done in a call by using
      * easystar.setIteratonsPerCalculation().
      */
    def calculate(): Unit = js.native
    
    /**
      * Cancel a path calculation.
      *
      * @param {Number} instanceId The instance ID of the path being calculated
      * @return {Boolean} True if an instance was found and cancelled.
      *
      **/
    def cancelPath(instanceId: Double): Boolean = js.native
    
    /**
      * Disables corner cutting in diagonal movement.
      */
    def disableCornerCutting(): Unit = js.native
    
    /**
      * Disable diagonal pathfinding.
      */
    def disableDiagonals(): Unit = js.native
    
    /**
      * Disables sync mode for this EasyStar instance.
      */
    def disableSync(): Unit = js.native
    
    /**
      * Enables corner cutting in diagonal movement.
      */
    def enableCornerCutting(): Unit = js.native
    
    /**
      * Enable diagonal pathfinding.
      */
    def enableDiagonals(): Unit = js.native
    
    /**
      * Enables sync mode for this EasyStar instance..
      * if you're into that sort of thing.
      */
    def enableSync(): Unit = js.native
    
    /**
      * Find a path.
      *
      * @param {Number} startX The X position of the starting point.
      * @param {Number} startY The Y position of the starting point.
      * @param {Number} endX The X position of the ending point.
      * @param {Number} endY The Y position of the ending point.
      * @param {Function} callback A function that is called when your path
      * is found, or no path is found.
      * @return {Number} A numeric, non-zero value which identifies the created instance. This value can be passed to cancelPath to cancel the path calculation.
      *
      */
    def findPath(
      startX: Double,
      startY: Double,
      endX: Double,
      endY: Double,
      callback: js.Function1[/* path */ js.Array[X], Unit]
    ): Double = js.native
    
    /**
      * Remove the additional cost for a particular point.
      *
      * @param {Number} x The x value of the point to stop costing.
      * @param {Number} y The y value of the point to stop costing.
      */
    def removeAdditionalPointCost(x: Double, y: Double): Unit = js.native
    
    /**
      * Remove all additional point costs.
      */
    def removeAllAdditionalPointCosts(): Unit = js.native
    
    /**
      * Remove all directional conditions
      */
    def removeAllDirectionalConditions(): Unit = js.native
    
    /**
      * Sets the collision grid that EasyStar uses.
      *
      * @param {Array|Number} tiles An array of numbers that represent
      * which tiles in your grid should be considered
      * acceptable, or "walkable".
      */
    def setAcceptableTiles(tiles: js.Array[Double]): Unit = js.native
    def setAcceptableTiles(tiles: Double): Unit = js.native
    
    /**
      * Sets the an additional cost for a particular point.
      * Overrides the cost from setTileCost.
      *
      * @param {Number} x The x value of the point to cost.
      * @param {Number} y The y value of the point to cost.
      * @param {Number} The multiplicative cost associated with the given point.
      */
    def setAdditionalPointCost(x: Double, y: Double, cost: Double): Unit = js.native
    
    /**
      * Sets a directional condition on a tile
      *
      * @param {Number} x The x value of the point.
      * @param {Number} y The y value of the point.
      * @param {Array.<String>} allowedDirections A list of all the allowed directions from which the tile is accessible.
      *
      * eg. easystar.setDirectionalCondition(1, 1, ['TOP']): You can only access the tile by walking down onto it,
      */
    def setDirectionalCondition(x: Double, y: Double, allowedDirections: js.Array[Direction]): Unit = js.native
    
    /**
      * Sets the collision grid that EasyStar uses.
      *
      * @param {Array} grid The collision grid that this EasyStar instance will read from.
      * This should be a 2D Array of Numbers.
      */
    def setGrid(grid: js.Array[js.Array[Double]]): Unit = js.native
    
    /**
      * Sets the number of search iterations per calculation.
      * A lower number provides a slower result, but more practical if you
      * have a large tile-map and don't want to block your thread while
      * finding a path.
      *
      * @param {Number} iterations The number of searches to prefrom per calculate() call.
      */
    def setIterationsPerCalculation(iterations: Double): Unit = js.native
    
    /**
      * Sets the tile cost for a particular tile type.
      *
      * @param {Number} The tile type to set the cost for.
      * @param {Number} The multiplicative cost associated with the given tile.
      */
    def setTileCost(tileType: Double, cost: Double): Unit = js.native
    
    /**
      * Stop avoiding a particular point on the grid.
      *
      * @param {Number} x The x value of the point to stop avoiding.
      * @param {Number} y The y value of the point to stop avoiding.
      */
    def stopAvoidingAdditionalPoint(x: Double, y: Double): Unit = js.native
    
    /**
      * Stop avoiding all additional points on the grid.
      */
    def stopAvoidingAllAdditionalPoints(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.easystarjs.easystarjsStrings.TOP
    - typingsSlinky.easystarjs.easystarjsStrings.TOP_RIGHT
    - typingsSlinky.easystarjs.easystarjsStrings.RIGHT
    - typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_RIGHT
    - typingsSlinky.easystarjs.easystarjsStrings.BOTTOM
    - typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_LEFT
    - typingsSlinky.easystarjs.easystarjsStrings.LEFT
    - typingsSlinky.easystarjs.easystarjsStrings.TOP_LEFT
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def BOTTOM: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM = "BOTTOM".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.BOTTOM]
    
    @scala.inline
    def BOTTOM_LEFT: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_LEFT = "BOTTOM_LEFT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_LEFT]
    
    @scala.inline
    def BOTTOM_RIGHT: typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_RIGHT = "BOTTOM_RIGHT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.BOTTOM_RIGHT]
    
    @scala.inline
    def LEFT: typingsSlinky.easystarjs.easystarjsStrings.LEFT = "LEFT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.LEFT]
    
    @scala.inline
    def RIGHT: typingsSlinky.easystarjs.easystarjsStrings.RIGHT = "RIGHT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.RIGHT]
    
    @scala.inline
    def TOP: typingsSlinky.easystarjs.easystarjsStrings.TOP = "TOP".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.TOP]
    
    @scala.inline
    def TOP_LEFT: typingsSlinky.easystarjs.easystarjsStrings.TOP_LEFT = "TOP_LEFT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.TOP_LEFT]
    
    @scala.inline
    def TOP_RIGHT: typingsSlinky.easystarjs.easystarjsStrings.TOP_RIGHT = "TOP_RIGHT".asInstanceOf[typingsSlinky.easystarjs.easystarjsStrings.TOP_RIGHT]
  }
}
