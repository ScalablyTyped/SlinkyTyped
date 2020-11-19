package typingsSlinky.babylonjs.renderingIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends typingsSlinky.babylonjs.outlineRendererMod.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: Scene) = this()
}
/* static members */
@JSImport("babylonjs/Rendering/index", "OutlineRenderer")
@js.native
object OutlineRenderer extends js.Object {
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  var _StencilReference: js.Any = js.native
}
