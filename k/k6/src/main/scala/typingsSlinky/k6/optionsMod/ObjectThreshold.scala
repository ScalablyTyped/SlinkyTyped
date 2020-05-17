package typingsSlinky.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectThreshold extends Threshold {
  /** Abort test if threshold violated. */
  var abortOnFail: js.UndefOr[Boolean] = js.native
  /** Duration to delay evaluation. Enables collecting additional metrics. */
  var delayAbortEval: js.UndefOr[String] = js.native
  /** Threshold expression. */
  var threshold: String = js.native
}

object ObjectThreshold {
  @scala.inline
  def apply(threshold: String): ObjectThreshold = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectThreshold]
  }
  @scala.inline
  implicit class ObjectThresholdOps[Self <: ObjectThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortOnFail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnFail")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayAbortEval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayAbortEval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayAbortEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayAbortEval")(js.undefined)
        ret
    }
  }
  
}

