package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryAssociationSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  /**
    * The repository association ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.AssociationId] = js.native
  /**
    * The time, in milliseconds since the epoch, since the repository association was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the repository association.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Name] = js.native
  /**
    * The owner of the repository association.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    * The state of the repository association.  Associated  Amazon CodeGuru Reviewer is associated with the repository.   Associating  The association is in progress.   Failed  The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting topic].   Disassociating  Amazon CodeGuru Reviewer is in the process of disassociating with the repository.   
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.native
}

object RepositoryAssociationSummary {
  @scala.inline
  def apply(): RepositoryAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAssociationSummary]
  }
  @scala.inline
  implicit class RepositoryAssociationSummaryOps[Self <: RepositoryAssociationSummary] (val x: Self) extends AnyVal {
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
  }
  
}

