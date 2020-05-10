package typingsSlinky.rcDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSwitchScrollingEffect extends js.Object {
  def switchScrollingEffect(): Unit = js.native
}

object AnonSwitchScrollingEffect {
  @scala.inline
  def apply(switchScrollingEffect: () => Unit): AnonSwitchScrollingEffect = {
    val __obj = js.Dynamic.literal(switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
    __obj.asInstanceOf[AnonSwitchScrollingEffect]
  }
  @scala.inline
  implicit class AnonSwitchScrollingEffectOps[Self <: AnonSwitchScrollingEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwitchScrollingEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchScrollingEffect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

