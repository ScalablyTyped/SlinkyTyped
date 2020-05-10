package typingsSlinky.cassandraDriver.concurrentMod.concurrent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var collectResults: js.UndefOr[Boolean] = js.native
  var concurrencyLevel: js.UndefOr[Double] = js.native
  var executionProfile: js.UndefOr[String] = js.native
  var maxErrors: js.UndefOr[Double] = js.native
  var raiseOnFirstError: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResults")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrencyLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withRaiseOnFirstError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseOnFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaiseOnFirstError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseOnFirstError")(js.undefined)
        ret
    }
  }
  
}

