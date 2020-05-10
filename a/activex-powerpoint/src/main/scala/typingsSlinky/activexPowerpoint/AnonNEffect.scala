package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.Effect
import typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNEffect extends js.Object {
  val Wn: SlideShowWindow = js.native
  val nEffect: Effect = js.native
}

object AnonNEffect {
  @scala.inline
  def apply(Wn: SlideShowWindow, nEffect: Effect): AnonNEffect = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any], nEffect = nEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNEffect]
  }
  @scala.inline
  implicit class AnonNEffectOps[Self <: AnonNEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWn(value: SlideShowWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEffect(value: Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nEffect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

