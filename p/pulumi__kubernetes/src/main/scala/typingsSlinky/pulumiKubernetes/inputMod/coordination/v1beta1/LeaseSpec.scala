package typingsSlinky.pulumiKubernetes.inputMod.coordination.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LeaseSpec is a specification of a Lease.
  */
@js.native
trait LeaseSpec extends js.Object {
  /**
    * acquireTime is a time when the current lease was acquired.
    */
  var acquireTime: js.UndefOr[Input[String]] = js.native
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  var holderIdentity: js.UndefOr[Input[String]] = js.native
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
    * acquire it. This is measure against time of last observed RenewTime.
    */
  var leaseDurationSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  var leaseTransitions: js.UndefOr[Input[Double]] = js.native
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  var renewTime: js.UndefOr[Input[String]] = js.native
}

object LeaseSpec {
  @scala.inline
  def apply(): LeaseSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseSpec]
  }
  @scala.inline
  implicit class LeaseSpecOps[Self <: LeaseSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquireTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHolderIdentity(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolderIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaseDurationSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaseTransitions(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewTime")(js.undefined)
        ret
    }
  }
  
}

