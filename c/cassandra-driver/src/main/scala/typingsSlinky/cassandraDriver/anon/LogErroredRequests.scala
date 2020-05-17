package typingsSlinky.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogErroredRequests extends js.Object {
  var logErroredRequests: js.UndefOr[Boolean] = js.native
  var logNormalRequests: js.UndefOr[Boolean] = js.native
  var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.native
  var messageMaxParameterValueLength: js.UndefOr[Double] = js.native
  var messageMaxQueryLength: js.UndefOr[Double] = js.native
  var slowThreshold: js.UndefOr[Double] = js.native
}

object LogErroredRequests {
  @scala.inline
  def apply(): LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErroredRequests]
  }
  @scala.inline
  implicit class LogErroredRequestsOps[Self <: LogErroredRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogErroredRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErroredRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogErroredRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErroredRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withLogNormalRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logNormalRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogNormalRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logNormalRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageMaxErrorStackTraceLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxErrorStackTraceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageMaxErrorStackTraceLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxErrorStackTraceLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageMaxParameterValueLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxParameterValueLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageMaxParameterValueLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxParameterValueLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageMaxQueryLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxQueryLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageMaxQueryLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMaxQueryLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowThreshold")(js.undefined)
        ret
    }
  }
  
}

