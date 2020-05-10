package typingsSlinky.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TintConfig extends js.Object {
  /**
    * The bottom left tint value. Always zero in canvas.
    */
  var bottomLeft: Double = js.native
  /**
    * The bottom right tint value. Always zero in canvas.
    */
  var bottomRight: Double = js.native
  /**
    * The top left tint value. Always zero in canvas.
    */
  var topLeft: Double = js.native
  /**
    * The top right tint value. Always zero in canvas.
    */
  var topRight: Double = js.native
}

object TintConfig {
  @scala.inline
  def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TintConfig = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintConfig]
  }
  @scala.inline
  implicit class TintConfigOps[Self <: TintConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

