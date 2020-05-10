package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DedicatedIp extends js.Object {
  /**
    * An IP address that is reserved for use by your Amazon Pinpoint account.
    */
  var Ip: typingsSlinky.awsSdk.pinpointemailMod.Ip = js.native
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.PoolName] = js.native
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: typingsSlinky.awsSdk.pinpointemailMod.WarmupStatus = js.native
}

object DedicatedIp {
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper, WarmupStatus: WarmupStatus): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any], WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIp]
  }
  @scala.inline
  implicit class DedicatedIpOps[Self <: DedicatedIp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: Ip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarmupPercentage(value: Percentage100Wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmupPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarmupStatus(value: WarmupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolName(value: PoolName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolName")(js.undefined)
        ret
    }
  }
  
}

