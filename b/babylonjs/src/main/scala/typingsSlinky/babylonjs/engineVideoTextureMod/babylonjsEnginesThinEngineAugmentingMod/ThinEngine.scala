package typingsSlinky.babylonjs.engineVideoTextureMod.babylonjsEnginesThinEngineAugmentingMod

import typingsSlinky.babylonjs.HTMLVideoElement
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThinEngine extends js.Object {
  /**
    * Update a video texture
    * @param texture defines the texture to update
    * @param video defines the video element to use
    * @param invertY defines if data must be stored with Y axis inverted
    */
  def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
}

object ThinEngine {
  @scala.inline
  def apply(updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit): ThinEngine = {
    val __obj = js.Dynamic.literal(updateVideoTexture = js.Any.fromFunction3(updateVideoTexture))
    __obj.asInstanceOf[ThinEngine]
  }
  @scala.inline
  implicit class ThinEngineOps[Self <: ThinEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateVideoTexture(value: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateVideoTexture")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

