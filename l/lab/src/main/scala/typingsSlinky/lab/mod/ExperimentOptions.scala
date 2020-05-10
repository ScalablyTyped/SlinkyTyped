package typingsSlinky.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[Boolean] = js.native
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[Boolean] = js.native
  /** Skip execution? (false) */
  var skip: js.UndefOr[Boolean] = js.native
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[Double] = js.native
}

object ExperimentOptions {
  @scala.inline
  def apply(): ExperimentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentOptions]
  }
  @scala.inline
  implicit class ExperimentOptionsOps[Self <: ExperimentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

