package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuOptionsRequest extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object CpuOptionsRequest {
  @scala.inline
  def apply(): CpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptionsRequest]
  }
  @scala.inline
  implicit class CpuOptionsRequestOps[Self <: CpuOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreCount")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadsPerCore(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreadsPerCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadsPerCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreadsPerCore")(js.undefined)
        ret
    }
  }
  
}

