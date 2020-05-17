package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialThrottledSaveDrain extends js.Object {
  var recursiveWait: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  var started: js.UndefOr[Double] = js.native
}

object PartialThrottledSaveDrain {
  @scala.inline
  def apply(): PartialThrottledSaveDrain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThrottledSaveDrain]
  }
  @scala.inline
  implicit class PartialThrottledSaveDrainOps[Self <: PartialThrottledSaveDrain] (val x: Self) extends AnyVal {
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
    def withoutRecursiveWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWait")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveWaitLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWaitLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveWaitLimitDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWaitLimitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimitDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
  }
  
}

