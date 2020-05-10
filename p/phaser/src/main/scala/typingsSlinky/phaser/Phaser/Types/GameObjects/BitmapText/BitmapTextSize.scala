package typingsSlinky.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitmapTextSize extends js.Object {
  /**
    * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
    */
  var global: GlobalBitmapTextSize = js.native
  /**
    * The position and size of the BitmapText, taking just the font size into account.
    */
  var local: LocalBitmapTextSize = js.native
}

object BitmapTextSize {
  @scala.inline
  def apply(global: GlobalBitmapTextSize, local: LocalBitmapTextSize): BitmapTextSize = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextSize]
  }
  @scala.inline
  implicit class BitmapTextSizeOps[Self <: BitmapTextSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal(value: GlobalBitmapTextSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: LocalBitmapTextSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

