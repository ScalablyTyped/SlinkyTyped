package typingsSlinky.babylonjs.renderingManagerMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/renderingManager", "RenderingGroupInfo")
@js.native
class RenderingGroupInfo () extends js.Object {
  
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double = js.native
  
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}
