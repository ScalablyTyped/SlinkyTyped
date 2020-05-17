package typingsSlinky.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoThreshold extends js.Object {
  var autoThreshold: Boolean = js.native
  var delay: Double = js.native
  var shortcut: js.Array[Code] = js.native
  var threshold: Double = js.native
}

object AutoThreshold {
  @scala.inline
  def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[Code], threshold: Double): AutoThreshold = {
    val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoThreshold]
  }
  @scala.inline
  implicit class AutoThresholdOps[Self <: AutoThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoThreshold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: js.Array[Code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

