package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RenderingGroupInfo")
@js.native
class RenderingGroupInfo ()
  extends typingsSlinky.babylonjs.BABYLON.RenderingGroupInfo {
  /**
    * The camera currently used for the rendering pass
    */
  /* CompleteClass */
  override var camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera] = js.native
  /**
    * The ID of the renderingGroup being processed
    */
  /* CompleteClass */
  override var renderingGroupId: Double = js.native
  /**
    * The Scene that being rendered
    */
  /* CompleteClass */
  override var scene: typingsSlinky.babylonjs.BABYLON.Scene = js.native
}

