package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesModification extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[js.Date] = js.native
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.native
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.native
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.native
}

object ReservedInstancesModification {
  @scala.inline
  def apply(): ReservedInstancesModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModification]
  }
  @scala.inline
  implicit class ReservedInstancesModificationOps[Self <: ReservedInstancesModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveDate")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationResults(value: ReservedInstancesModificationResultList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationResults")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesIds(value: ReservedIntancesIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesIds")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesModificationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesModificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesModificationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesModificationId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(js.undefined)
        ret
    }
  }
  
}

