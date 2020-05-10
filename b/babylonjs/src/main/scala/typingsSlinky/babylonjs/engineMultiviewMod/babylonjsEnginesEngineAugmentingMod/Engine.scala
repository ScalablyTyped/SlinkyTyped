package typingsSlinky.babylonjs.engineMultiviewMod.babylonjsEnginesEngineAugmentingMod

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  /**
    * Binds a multiview framebuffer to be drawn to
    * @param multiviewTexture texture to bind
    */
  def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit = js.native
  /**
    * Creates a new multiview render target
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @returns the created multiview texture
    */
  def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture = js.native
}

object Engine {
  @scala.inline
  def apply(
    bindMultiviewFramebuffer: InternalTexture => Unit,
    createMultiviewRenderTargetTexture: (Double, Double) => InternalTexture
  ): Engine = {
    val __obj = js.Dynamic.literal(bindMultiviewFramebuffer = js.Any.fromFunction1(bindMultiviewFramebuffer), createMultiviewRenderTargetTexture = js.Any.fromFunction2(createMultiviewRenderTargetTexture))
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindMultiviewFramebuffer(value: InternalTexture => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindMultiviewFramebuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateMultiviewRenderTargetTexture(value: (Double, Double) => InternalTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultiviewRenderTargetTexture")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

