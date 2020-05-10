package typingsSlinky.pulumiKubernetes.outputMod.coordination.v1beta1

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
  val acquireTime: String = js.native
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  val holderIdentity: String = js.native
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
    * acquire it. This is measure against time of last observed RenewTime.
    */
  val leaseDurationSeconds: Double = js.native
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  val leaseTransitions: Double = js.native
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  val renewTime: String = js.native
}

object LeaseSpec {
  @scala.inline
  def apply(
    acquireTime: String,
    holderIdentity: String,
    leaseDurationSeconds: Double,
    leaseTransitions: Double,
    renewTime: String
  ): LeaseSpec = {
    val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseSpec]
  }
  @scala.inline
  implicit class LeaseSpecOps[Self <: LeaseSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolderIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaseDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaseTransitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenewTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

