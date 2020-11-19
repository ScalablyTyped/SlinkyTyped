package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryAssociation extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the repository association.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.AssociationId] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see Connection in the AWS CodeStar Connections API Reference. 
    */
  var ConnectionArn: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ConnectionArn] = js.native
  
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
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Owner] = js.native
  
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderType] = js.native
  
  /**
    * The state of the repository association. The valid repository association states are:    Associated: The repository association is complete.     Associating: CodeGuru Reviewer is:     Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.    If your repository ProviderType is GitHub or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.      Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.       Failed: The repository failed to associate or disassociate.     Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.   
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociationArn(value: Arn): Self = this.set("AssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationArn: Self = this.set("AssociationArn", js.undefined)
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setConnectionArn(value: ConnectionArn): Self = this.set("ConnectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionArn: Self = this.set("ConnectionArn", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: js.Date): Self = this.set("CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimeStamp: Self = this.set("CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimeStamp(value: js.Date): Self = this.set("LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimeStamp: Self = this.set("LastUpdatedTimeStamp", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
    
    @scala.inline
    def setState(value: RepositoryAssociationState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
}
