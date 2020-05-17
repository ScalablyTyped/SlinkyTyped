package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loop extends js.Object {
  var fps: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var spriteAsset: js.UndefOr[Double] = js.native
}

object Loop {
  @scala.inline
  def apply(): Loop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loop]
  }
  @scala.inline
  implicit class LoopOps[Self <: Loop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSpriteAsset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpriteAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteAsset")(js.undefined)
        ret
    }
  }
  
}

