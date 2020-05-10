package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryAssociation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  /**
    * The id of the repository association.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.AssociationId] = js.native
  /**
    * The time, in milliseconds since the epoch, when the repository association was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The time, in milliseconds since the epoch, when the repository association was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the repository.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Name] = js.native
  /**
    * The owner of the repository.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    * The state of the repository association.
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.native
  /**
    * A description of why the repository association is in the current state.
    */
  var StateReason: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.StateReason] = js.native
}

object RepositoryAssociation {
  @scala.inline
  def apply(): RepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAssociation]
  }
  @scala.inline
  implicit class RepositoryAssociationOps[Self <: RepositoryAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationId(value: AssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderType(value: ProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RepositoryAssociationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(js.undefined)
        ret
    }
  }
  
}

