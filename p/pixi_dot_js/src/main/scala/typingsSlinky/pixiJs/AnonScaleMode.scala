package typingsSlinky.pixiJs

import typingsSlinky.pixiJs.PIXI.SCALE_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScaleMode extends js.Object {
  var scaleMode: js.UndefOr[SCALE_MODES] = js.native
}

object AnonScaleMode {
  @scala.inline
  def apply(): AnonScaleMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonScaleMode]
  }
  @scala.inline
  implicit class AnonScaleModeOps[Self <: AnonScaleMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleMode(value: SCALE_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(js.undefined)
        ret
    }
  }
  
}

