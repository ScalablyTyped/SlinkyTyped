package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottledSaveDrainOptions extends js.Object {
  var recursiveWait: Boolean = js.native
  var recursiveWaitLimit: Boolean = js.native
  var recursiveWaitLimitDuration: Double = js.native
  var started: Double = js.native
}

object ThrottledSaveDrainOptions {
  @scala.inline
  def apply(
    recursiveWait: Boolean,
    recursiveWaitLimit: Boolean,
    recursiveWaitLimitDuration: Double,
    started: Double
  ): ThrottledSaveDrainOptions = {
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait.asInstanceOf[js.Any], recursiveWaitLimit = recursiveWaitLimit.asInstanceOf[js.Any], recursiveWaitLimitDuration = recursiveWaitLimitDuration.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
  @scala.inline
  implicit class ThrottledSaveDrainOptionsOps[Self <: ThrottledSaveDrainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecursiveWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursiveWaitLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursiveWaitLimitDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

