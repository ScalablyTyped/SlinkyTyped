package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ExecOptions> */
@js.native
trait PartialExecOptions extends js.Object {
  var env: js.UndefOr[js.Object] = js.native
  var failOnNonZeroExit: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PartialExecOptions {
  @scala.inline
  def apply(): PartialExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExecOptions]
  }
  @scala.inline
  implicit class PartialExecOptionsOps[Self <: PartialExecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnNonZeroExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnNonZeroExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnNonZeroExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnNonZeroExit")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
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

