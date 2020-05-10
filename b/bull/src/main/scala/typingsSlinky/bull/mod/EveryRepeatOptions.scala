package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EveryRepeatOptions extends RepeatOptions {
  /**
    * Repeat every millis (cron setting cannot be used together with this setting.)
    */
  var every: Double = js.native
}

object EveryRepeatOptions {
  @scala.inline
  def apply(every: Double): EveryRepeatOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    __obj.asInstanceOf[EveryRepeatOptions]
  }
  @scala.inline
  implicit class EveryRepeatOptionsOps[Self <: EveryRepeatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("every")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

