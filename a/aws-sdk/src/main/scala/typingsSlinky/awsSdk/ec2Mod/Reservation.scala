package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reservation extends js.Object {
  /**
    * [EC2-Classic only] The security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The ID of the AWS account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.native
}

object Reservation {
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: GroupIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: InstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationId")(js.undefined)
        ret
    }
  }
  
}

