package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TrailMesh")
@js.native
class TrailMesh protected ()
  extends typingsSlinky.babylonjs.BABYLON.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: js.UndefOr[scala.Nothing],
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsSlinky.babylonjs.BABYLON.TransformNode,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.TrailMesh")
@js.native
object TrailMesh extends js.Object {
  
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  def Parse(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.TrailMesh = js.native
}
