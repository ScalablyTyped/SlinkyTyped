package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyRenderOptionsSprite extends js.Object {
  /**
    * An `String` that defines the path to the image to use as the sprite texture, if any.
    *
    * @property render.sprite.texture
    * @type string
    */
  var texture: String = js.native
  /**
    * A `Number` that defines the scaling in the x-axis for the sprite, if any.
    *
    * @property render.sprite.xScale
    * @type number
    * @default 1
    */
  var xScale: Double = js.native
  /**
    * A `Number` that defines the scaling in the y-axis for the sprite, if any.
    *
    * @property render.sprite.yScale
    * @type number
    * @default 1
    */
  var yScale: Double = js.native
}

object IBodyRenderOptionsSprite {
  @scala.inline
  def apply(texture: String, xScale: Double, yScale: Double): IBodyRenderOptionsSprite = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyRenderOptionsSprite]
  }
  @scala.inline
  implicit class IBodyRenderOptionsSpriteOps[Self <: IBodyRenderOptionsSprite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTexture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

