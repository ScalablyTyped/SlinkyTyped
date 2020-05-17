package typingsSlinky.ractive.anon

import typingsSlinky.ractive.ractiveStrings.fast
import typingsSlinky.ractive.ractiveStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ractive.ractive.TransitionOpts & {} */
@js.native
trait TransitionOpts extends js.Object {
  /** The delay in milliseconds to wait before triggering the transition. */
  var delay: js.UndefOr[Double] = js.native
  /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
  var duration: js.UndefOr[Double | slow | fast | String] = js.native
  /** The easing to use for the transition. */
  var easing: js.UndefOr[String] = js.native
}

object TransitionOpts {
  @scala.inline
  def apply(): TransitionOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOpts]
  }
  @scala.inline
  implicit class TransitionOptsOps[Self <: TransitionOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | slow | fast | String): Self = {
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
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
  }
  
}

