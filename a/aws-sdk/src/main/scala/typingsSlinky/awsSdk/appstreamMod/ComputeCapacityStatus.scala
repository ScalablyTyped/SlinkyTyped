package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeCapacityStatus extends js.Object {
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.native
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer = js.native
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.native
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.native
}

object ComputeCapacityStatus {
  @scala.inline
  def apply(Desired: Integer): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
  @scala.inline
  implicit class ComputeCapacityStatusOps[Self <: ComputeCapacityStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesired(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Desired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailable(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(js.undefined)
        ret
    }
    @scala.inline
    def withInUse(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUse")(js.undefined)
        ret
    }
    @scala.inline
    def withRunning(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Running")(js.undefined)
        ret
    }
  }
  
}

