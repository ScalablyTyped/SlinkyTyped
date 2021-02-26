package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends typingsSlinky.babylonjs.renderingIndexMod.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object OutlineRenderer {
  
  @JSImport("babylonjs/index", "OutlineRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  @JSImport("babylonjs/index", "OutlineRenderer._StencilReference")
  @js.native
  def _StencilReference: js.Any = js.native
  @scala.inline
  def _StencilReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StencilReference")(x.asInstanceOf[js.Any])
}
