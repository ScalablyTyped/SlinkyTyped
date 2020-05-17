package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.IGridDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Grid` module contains methods for creating and manipulating collision broadphase grid structures.
  *
  * @class Grid
  */
@JSGlobal("MatterJS.Grid")
@js.native
class Grid ()
  extends typingsSlinky.phaser.MatterJS.Grid

/* static members */
@JSGlobal("MatterJS.Grid")
@js.native
object Grid extends js.Object {
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  def clear(grid: typingsSlinky.phaser.MatterJS.Grid): Unit = js.native
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  def create(): typingsSlinky.phaser.MatterJS.Grid = js.native
  def create(options: IGridDefinition): typingsSlinky.phaser.MatterJS.Grid = js.native
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  def update(
    grid: typingsSlinky.phaser.MatterJS.Grid,
    bodies: js.Array[BodyType],
    engine: typingsSlinky.phaser.MatterJS.Engine,
    forceUpdate: Boolean
  ): Unit = js.native
}

