package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.IGridDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Grid` module contains methods for creating and manipulating collision broadphase grid structures.
  *
  * @class Grid
  */
@JSGlobal("MatterJS.Grid")
@js.native
class Grid ()
  extends typingsSlinky.phaser.MatterJS.Grid
object Grid {
  
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  /* static member */
  @JSGlobal("MatterJS.Grid.clear")
  @js.native
  def clear(grid: typingsSlinky.phaser.MatterJS.Grid): Unit = js.native
  
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  /* static member */
  @JSGlobal("MatterJS.Grid.create")
  @js.native
  def create(): typingsSlinky.phaser.MatterJS.Grid = js.native
  @JSGlobal("MatterJS.Grid.create")
  @js.native
  def create(options: IGridDefinition): typingsSlinky.phaser.MatterJS.Grid = js.native
  
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  /* static member */
  @JSGlobal("MatterJS.Grid.update")
  @js.native
  def update(
    grid: typingsSlinky.phaser.MatterJS.Grid,
    bodies: js.Array[BodyType],
    engine: typingsSlinky.phaser.MatterJS.Engine,
    forceUpdate: Boolean
  ): Unit = js.native
}
