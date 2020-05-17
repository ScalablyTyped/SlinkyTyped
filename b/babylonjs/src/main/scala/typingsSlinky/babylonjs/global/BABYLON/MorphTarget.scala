package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MorphTarget")
@js.native
class MorphTarget protected ()
  extends typingsSlinky.babylonjs.BABYLON.MorphTarget {
  /**
    * Creates a new MorphTarget
    * @param name defines the name of the target
    * @param influence defines the influence to use
    * @param scene defines the scene the morphtarget belongs to
    */
  def this(/** defines the name of the target */
  name: String) = this()
  def this(/** defines the name of the target */
  name: String, influence: Double) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Double,
    scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.MorphTarget")
@js.native
object MorphTarget extends js.Object {
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  def FromMesh(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh): typingsSlinky.babylonjs.BABYLON.MorphTarget = js.native
  def FromMesh(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh, name: String): typingsSlinky.babylonjs.BABYLON.MorphTarget = js.native
  def FromMesh(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh, name: String, influence: Double): typingsSlinky.babylonjs.BABYLON.MorphTarget = js.native
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @returns a new MorphTarget
    */
  def Parse(serializationObject: js.Any): typingsSlinky.babylonjs.BABYLON.MorphTarget = js.native
}

