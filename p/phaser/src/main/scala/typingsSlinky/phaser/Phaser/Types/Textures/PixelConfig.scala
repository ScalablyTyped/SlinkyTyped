package typingsSlinky.phaser.Phaser.Types.Textures

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the position and color data for a single pixel in a CanvasTexture.
  */
@js.native
trait PixelConfig extends js.Object {
  /**
    * The alpha of the pixel, between 0 and 1.
    */
  var alpha: Double = js.native
  /**
    * The color of the pixel, not including the alpha channel.
    */
  var color: integer = js.native
  /**
    * The x-coordinate of the pixel.
    */
  var x: integer = js.native
  /**
    * The y-coordinate of the pixel.
    */
  var y: integer = js.native
}

object PixelConfig {
  @scala.inline
  def apply(alpha: Double, color: integer, x: integer, y: integer): PixelConfig = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelConfig]
  }
  @scala.inline
  implicit class PixelConfigOps[Self <: PixelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

