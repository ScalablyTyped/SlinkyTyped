package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InconclusiveDetail extends js.Object {
  /**
    * If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to
    * the test runner while the test was running.
    */
  var abortedByUser: js.UndefOr[Boolean] = js.native
  /**
    * If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed.
    *
    * For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
    */
  var infrastructureFailure: js.UndefOr[Boolean] = js.native
}

object InconclusiveDetail {
  @scala.inline
  def apply(): InconclusiveDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InconclusiveDetail]
  }
  @scala.inline
  implicit class InconclusiveDetailOps[Self <: InconclusiveDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortedByUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortedByUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedByUser")(js.undefined)
        ret
    }
    @scala.inline
    def withInfrastructureFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfrastructureFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureFailure")(js.undefined)
        ret
    }
  }
  
}

