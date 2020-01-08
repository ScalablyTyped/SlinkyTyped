package typingsSlinky.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionStatus extends js.Object {
  /**
    * A timestamp for when this option was created.
    */
  var CreationDate: js.Date = js.native
  /**
    * Indicates that the option will be deleted once processing is complete.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  /**
    * The state of processing a change to an option. Possible values: RequiresIndexDocuments: the option's latest value will not be deployed until IndexDocuments has been called and indexing is complete. Processing: the option's latest value is in the process of being activated.  Active: the option's latest value is completely deployed. FailedToValidate: the option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents. 
    */
  var State: OptionState = js.native
  /**
    * A timestamp for when this option was last updated.
    */
  var UpdateDate: js.Date = js.native
  /**
    * A unique integer that indicates when this option was last updated.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}

object OptionStatus {
  @scala.inline
  def apply(
    CreationDate: js.Date,
    State: OptionState,
    UpdateDate: js.Date,
    PendingDeletion: js.UndefOr[scala.Boolean] = js.undefined,
    UpdateVersion: Int | scala.Double = null
  ): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    if (!js.isUndefined(PendingDeletion)) __obj.updateDynamic("PendingDeletion")(PendingDeletion.asInstanceOf[js.Any])
    if (UpdateVersion != null) __obj.updateDynamic("UpdateVersion")(UpdateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
}

