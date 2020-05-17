package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Ratio
import typingsSlinky.babylonjs.anon.Width
import typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/MultiviewRenderTarget", JSImport.Namespace)
@js.native
object multiviewRenderTargetMod extends js.Object {
  @js.native
  class MultiviewRenderTarget protected () extends RenderTargetTexture {
    /**
      * Creates a multiview render target
      * @param scene scene used with the render target
      * @param size the size of the render target (used for each view)
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, size: Double) = this()
    def this(scene: Scene, size: Ratio) = this()
    def this(scene: Scene, size: Width) = this()
  }
  
}

