package typingsSlinky.babylonjs.cullingIndexMod

import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Culling/index", "Ray")
@js.native
class Ray protected ()
  extends typingsSlinky.babylonjs.rayMod.Ray {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(/** origin point */
  origin: Vector3, /** direction */
  direction: Vector3) = this()
  def this(
    /** origin point */
  origin: Vector3,
    /** direction */
  direction: Vector3,
    /** length of the ray */
  length: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs/Culling/index", "Ray")
@js.native
object Ray extends js.Object {
  
  /**
    * Creates a new ray from screen space and viewport
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns new ray
    */
  def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix]
  ): typingsSlinky.babylonjs.rayMod.Ray = js.native
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  def CreateNewFromTo(origin: DeepImmutable[Vector3], end: DeepImmutable[Vector3]): typingsSlinky.babylonjs.rayMod.Ray = js.native
  def CreateNewFromTo(origin: DeepImmutable[Vector3], end: DeepImmutable[Vector3], world: DeepImmutable[Matrix]): typingsSlinky.babylonjs.rayMod.Ray = js.native
  
  val TmpVector3: js.Any = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  def Transform(ray: DeepImmutable[typingsSlinky.babylonjs.rayMod.Ray], matrix: DeepImmutable[Matrix]): typingsSlinky.babylonjs.rayMod.Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  def TransformToRef(
    ray: DeepImmutable[typingsSlinky.babylonjs.rayMod.Ray],
    matrix: DeepImmutable[Matrix],
    result: typingsSlinky.babylonjs.rayMod.Ray
  ): Unit = js.native
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  def Zero(): typingsSlinky.babylonjs.rayMod.Ray = js.native
  
  var rayl: js.Any = js.native
  
  var smallnum: js.Any = js.native
}
