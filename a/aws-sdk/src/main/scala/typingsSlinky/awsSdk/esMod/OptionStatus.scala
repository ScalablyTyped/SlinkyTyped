package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionStatus extends js.Object {
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: js.Date = js.native
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState = js.native
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: js.Date = js.native
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}

object OptionStatus {
  @scala.inline
  def apply(CreationDate: js.Date, State: OptionState, UpdateDate: js.Date): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  @scala.inline
  implicit class OptionStatusOps[Self <: OptionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: OptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingDeletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingDeletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingDeletion")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateVersion(value: UIntValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateVersion")(js.undefined)
        ret
    }
  }
  
}

