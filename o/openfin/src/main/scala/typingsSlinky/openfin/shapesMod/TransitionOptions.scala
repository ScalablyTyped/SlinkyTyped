package typingsSlinky.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends js.Object {
  var interrupt: Boolean = js.native
  var tween: js.UndefOr[String] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(interrupt: Boolean): TransitionOptions = {
    val __obj = js.Dynamic.literal(interrupt = interrupt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterrupt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTween(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tween")(js.undefined)
        ret
    }
  }
  
}

