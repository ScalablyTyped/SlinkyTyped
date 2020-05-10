package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.AnonRatio
import typingsSlinky.babylonjs.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MultiviewRenderTarget")
@js.native
class MultiviewRenderTarget protected () extends RenderTargetTexture {
  /**
    * Creates a multiview render target
    * @param scene scene used with the render target
    * @param size the size of the render target (used for each view)
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, size: Double) = this()
  def this(scene: Scene, size: AnonRatio) = this()
  def this(scene: Scene, size: AnonWidth) = this()
}

