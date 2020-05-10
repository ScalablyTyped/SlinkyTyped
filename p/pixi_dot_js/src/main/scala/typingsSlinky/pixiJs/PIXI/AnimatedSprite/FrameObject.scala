package typingsSlinky.pixiJs.PIXI.AnimatedSprite

import typingsSlinky.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.AnimatedSprite
  * @typedef {object} FrameObject
  * @type {object}
  * @property {PIXI.Texture} texture - The {@link PIXI.Texture} of the frame
  * @property {number} time - the duration of the frame in ms
  */
@js.native
trait FrameObject extends js.Object {
  var texture: Texture = js.native
  var time: Double = js.native
}

object FrameObject {
  @scala.inline
  def apply(texture: Texture, time: Double): FrameObject = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameObject]
  }
  @scala.inline
  implicit class FrameObjectOps[Self <: FrameObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTexture(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

