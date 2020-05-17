package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.GroundMesh")
@js.native
class GroundMesh protected ()
  extends typingsSlinky.babylonjs.BABYLON.GroundMesh {
  def this(name: String, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
}

/* static members */
@JSGlobal("BABYLON.GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  def Parse(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.GroundMesh = js.native
}

