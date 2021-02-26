package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.IBound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Bounds` module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
  *
  * @class Bounds
  */
@JSGlobal("MatterJS.Bounds")
@js.native
class Bounds ()
  extends typingsSlinky.phaser.MatterJS.Bounds
object Bounds {
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.contains")
  @js.native
  def contains(bounds: IBound, point: typingsSlinky.phaser.MatterJS.Vector): Boolean = js.native
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.create")
  @js.native
  def create(vertices: typingsSlinky.phaser.MatterJS.Vertices): IBound = js.native
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.overlaps")
  @js.native
  def overlaps(boundsA: IBound, boundsB: IBound): Boolean = js.native
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.shift")
  @js.native
  def shift(bounds: IBound, position: typingsSlinky.phaser.MatterJS.Vector): Unit = js.native
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.translate")
  @js.native
  def translate(bounds: IBound, vector: typingsSlinky.phaser.MatterJS.Vector): Unit = js.native
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  /* static member */
  @JSGlobal("MatterJS.Bounds.update")
  @js.native
  def update(
    bounds: IBound,
    vertices: typingsSlinky.phaser.MatterJS.Vertices,
    velocity: typingsSlinky.phaser.MatterJS.Vector
  ): Unit = js.native
}
