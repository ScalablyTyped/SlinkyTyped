package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsCustomTransition extends js.Object {
  var animations: js.Array[OptionsCustomTransitionAnimation] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object OptionsCustomTransition {
  @scala.inline
  def apply(animations: js.Array[OptionsCustomTransitionAnimation]): OptionsCustomTransition = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransition]
  }
  @scala.inline
  implicit class OptionsCustomTransitionOps[Self <: OptionsCustomTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: js.Array[OptionsCustomTransitionAnimation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

