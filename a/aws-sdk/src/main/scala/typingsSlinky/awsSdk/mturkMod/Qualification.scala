package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qualification extends js.Object {
  /**
    *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
    */
  var GrantTime: js.UndefOr[js.Date] = js.native
  /**
    *  The value (score) of the Qualification, if the Qualification has an integer value.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  var LocaleValue: js.UndefOr[Locale] = js.native
  /**
    *  The ID of the Qualification type for the Qualification.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the Qualification. Valid values are Granted | Revoked.
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
  /**
    *  The ID of the Worker who possesses the Qualification. 
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Qualification {
  @scala.inline
  def apply(): Qualification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Qualification]
  }
  @scala.inline
  implicit class QualificationOps[Self <: Qualification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValue(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleValue(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocaleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocaleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQualificationTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: QualificationStatus): Self = {
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
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(js.undefined)
        ret
    }
  }
  
}

