package typingsSlinky.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
@js.native
trait PartialPullUpOption extends js.Object {
  var threshold: js.UndefOr[Double] = js.native
}

object PartialPullUpOption {
  @scala.inline
  def apply(): PartialPullUpOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPullUpOption]
  }
  @scala.inline
  implicit class PartialPullUpOptionOps[Self <: PartialPullUpOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

