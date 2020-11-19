package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StereoscopicInterlacePostProcess")
@js.native
class StereoscopicInterlacePostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.StereoscopicInterlacePostProcess {
  /**
    * Initializes a StereoscopicInterlacePostProcess
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be appled to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsSlinky.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
