package typingsSlinky.awsSdk.codecommitMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCommit extends Service {
  
  /**
    * Creates an association between an approval rule template and a specified repository. Then, the next time a pull request is created in the repository where the destination reference (if specified) matches the destination reference (branch) for the pull request, an approval rule that matches the template conditions is automatically created for that pull request. If no destination references are specified in the template, an approval rule that matches the template contents is created for all pull requests in that repository.
    */
  def associateApprovalRuleTemplateWithRepository(): Request[js.Object, AWSError] = js.native
  def associateApprovalRuleTemplateWithRepository(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an association between an approval rule template and a specified repository. Then, the next time a pull request is created in the repository where the destination reference (if specified) matches the destination reference (branch) for the pull request, an approval rule that matches the template conditions is automatically created for that pull request. If no destination references are specified in the template, an approval rule that matches the template contents is created for all pull requests in that repository.
    */
  def associateApprovalRuleTemplateWithRepository(params: AssociateApprovalRuleTemplateWithRepositoryInput): Request[js.Object, AWSError] = js.native
  def associateApprovalRuleTemplateWithRepository(
    params: AssociateApprovalRuleTemplateWithRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates an association between an approval rule template and one or more specified repositories. 
    */
  def batchAssociateApprovalRuleTemplateWithRepositories(): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError] = js.native
  def batchAssociateApprovalRuleTemplateWithRepositories(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, 
      Unit
    ]
  ): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError] = js.native
  /**
    * Creates an association between an approval rule template and one or more specified repositories. 
    */
  def batchAssociateApprovalRuleTemplateWithRepositories(params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError] = js.native
  def batchAssociateApprovalRuleTemplateWithRepositories(
    params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, 
      Unit
    ]
  ): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError] = js.native
  
  /**
    * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the squash or three-way merge strategy.
    */
  def batchDescribeMergeConflicts(): Request[BatchDescribeMergeConflictsOutput, AWSError] = js.native
  def batchDescribeMergeConflicts(callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeMergeConflictsOutput, Unit]): Request[BatchDescribeMergeConflictsOutput, AWSError] = js.native
  /**
    * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the squash or three-way merge strategy.
    */
  def batchDescribeMergeConflicts(params: BatchDescribeMergeConflictsInput): Request[BatchDescribeMergeConflictsOutput, AWSError] = js.native
  def batchDescribeMergeConflicts(
    params: BatchDescribeMergeConflictsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeMergeConflictsOutput, Unit]
  ): Request[BatchDescribeMergeConflictsOutput, AWSError] = js.native
  
  /**
    * Removes the association between an approval rule template and one or more specified repositories. 
    */
  def batchDisassociateApprovalRuleTemplateFromRepositories(): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError] = js.native
  def batchDisassociateApprovalRuleTemplateFromRepositories(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, 
      Unit
    ]
  ): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError] = js.native
  /**
    * Removes the association between an approval rule template and one or more specified repositories. 
    */
  def batchDisassociateApprovalRuleTemplateFromRepositories(params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError] = js.native
  def batchDisassociateApprovalRuleTemplateFromRepositories(
    params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, 
      Unit
    ]
  ): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError] = js.native
  
  /**
    * Returns information about the contents of one or more commits in a repository.
    */
  def batchGetCommits(): Request[BatchGetCommitsOutput, AWSError] = js.native
  def batchGetCommits(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCommitsOutput, Unit]): Request[BatchGetCommitsOutput, AWSError] = js.native
  /**
    * Returns information about the contents of one or more commits in a repository.
    */
  def batchGetCommits(params: BatchGetCommitsInput): Request[BatchGetCommitsOutput, AWSError] = js.native
  def batchGetCommits(
    params: BatchGetCommitsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCommitsOutput, Unit]
  ): Request[BatchGetCommitsOutput, AWSError] = js.native
  
  /**
    * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def batchGetRepositories(): Request[BatchGetRepositoriesOutput, AWSError] = js.native
  def batchGetRepositories(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRepositoriesOutput, Unit]): Request[BatchGetRepositoriesOutput, AWSError] = js.native
  /**
    * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def batchGetRepositories(params: BatchGetRepositoriesInput): Request[BatchGetRepositoriesOutput, AWSError] = js.native
  def batchGetRepositories(
    params: BatchGetRepositoriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRepositoriesOutput, Unit]
  ): Request[BatchGetRepositoriesOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CodeCommit: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a template for approval rules that can then be associated with one or more repositories in your AWS account. When you associate a template with a repository, AWS CodeCommit creates an approval rule that matches the conditions of the template for all pull requests that meet the conditions of the template. For more information, see AssociateApprovalRuleTemplateWithRepository.
    */
  def createApprovalRuleTemplate(): Request[CreateApprovalRuleTemplateOutput, AWSError] = js.native
  def createApprovalRuleTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateApprovalRuleTemplateOutput, Unit]): Request[CreateApprovalRuleTemplateOutput, AWSError] = js.native
  /**
    * Creates a template for approval rules that can then be associated with one or more repositories in your AWS account. When you associate a template with a repository, AWS CodeCommit creates an approval rule that matches the conditions of the template for all pull requests that meet the conditions of the template. For more information, see AssociateApprovalRuleTemplateWithRepository.
    */
  def createApprovalRuleTemplate(params: CreateApprovalRuleTemplateInput): Request[CreateApprovalRuleTemplateOutput, AWSError] = js.native
  def createApprovalRuleTemplate(
    params: CreateApprovalRuleTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApprovalRuleTemplateOutput, Unit]
  ): Request[CreateApprovalRuleTemplateOutput, AWSError] = js.native
  
  /**
    * Creates a branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
    */
  def createBranch(): Request[js.Object, AWSError] = js.native
  def createBranch(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
    */
  def createBranch(params: CreateBranchInput): Request[js.Object, AWSError] = js.native
  def createBranch(params: CreateBranchInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a commit for a repository on the tip of a specified branch.
    */
  def createCommit(): Request[CreateCommitOutput, AWSError] = js.native
  def createCommit(callback: js.Function2[/* err */ AWSError, /* data */ CreateCommitOutput, Unit]): Request[CreateCommitOutput, AWSError] = js.native
  /**
    * Creates a commit for a repository on the tip of a specified branch.
    */
  def createCommit(params: CreateCommitInput): Request[CreateCommitOutput, AWSError] = js.native
  def createCommit(
    params: CreateCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCommitOutput, Unit]
  ): Request[CreateCommitOutput, AWSError] = js.native
  
  /**
    * Creates a pull request in the specified repository.
    */
  def createPullRequest(): Request[CreatePullRequestOutput, AWSError] = js.native
  def createPullRequest(callback: js.Function2[/* err */ AWSError, /* data */ CreatePullRequestOutput, Unit]): Request[CreatePullRequestOutput, AWSError] = js.native
  /**
    * Creates a pull request in the specified repository.
    */
  def createPullRequest(params: CreatePullRequestInput): Request[CreatePullRequestOutput, AWSError] = js.native
  def createPullRequest(
    params: CreatePullRequestInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePullRequestOutput, Unit]
  ): Request[CreatePullRequestOutput, AWSError] = js.native
  
  /**
    * Creates an approval rule for a pull request.
    */
  def createPullRequestApprovalRule(): Request[CreatePullRequestApprovalRuleOutput, AWSError] = js.native
  def createPullRequestApprovalRule(callback: js.Function2[/* err */ AWSError, /* data */ CreatePullRequestApprovalRuleOutput, Unit]): Request[CreatePullRequestApprovalRuleOutput, AWSError] = js.native
  /**
    * Creates an approval rule for a pull request.
    */
  def createPullRequestApprovalRule(params: CreatePullRequestApprovalRuleInput): Request[CreatePullRequestApprovalRuleOutput, AWSError] = js.native
  def createPullRequestApprovalRule(
    params: CreatePullRequestApprovalRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePullRequestApprovalRuleOutput, Unit]
  ): Request[CreatePullRequestApprovalRuleOutput, AWSError] = js.native
  
  /**
    * Creates a new, empty repository.
    */
  def createRepository(): Request[CreateRepositoryOutput, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryOutput, Unit]): Request[CreateRepositoryOutput, AWSError] = js.native
  /**
    * Creates a new, empty repository.
    */
  def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryOutput, Unit]
  ): Request[CreateRepositoryOutput, AWSError] = js.native
  
  /**
    * Creates an unreferenced commit that represents the result of merging two branches using a specified merge strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the fast-forward merge strategy because that strategy does not create a merge commit.  This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it. 
    */
  def createUnreferencedMergeCommit(): Request[CreateUnreferencedMergeCommitOutput, AWSError] = js.native
  def createUnreferencedMergeCommit(callback: js.Function2[/* err */ AWSError, /* data */ CreateUnreferencedMergeCommitOutput, Unit]): Request[CreateUnreferencedMergeCommitOutput, AWSError] = js.native
  /**
    * Creates an unreferenced commit that represents the result of merging two branches using a specified merge strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the fast-forward merge strategy because that strategy does not create a merge commit.  This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it. 
    */
  def createUnreferencedMergeCommit(params: CreateUnreferencedMergeCommitInput): Request[CreateUnreferencedMergeCommitOutput, AWSError] = js.native
  def createUnreferencedMergeCommit(
    params: CreateUnreferencedMergeCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUnreferencedMergeCommitOutput, Unit]
  ): Request[CreateUnreferencedMergeCommitOutput, AWSError] = js.native
  
  /**
    * Deletes a specified approval rule template. Deleting a template does not remove approval rules on pull requests already created with the template.
    */
  def deleteApprovalRuleTemplate(): Request[DeleteApprovalRuleTemplateOutput, AWSError] = js.native
  def deleteApprovalRuleTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApprovalRuleTemplateOutput, Unit]): Request[DeleteApprovalRuleTemplateOutput, AWSError] = js.native
  /**
    * Deletes a specified approval rule template. Deleting a template does not remove approval rules on pull requests already created with the template.
    */
  def deleteApprovalRuleTemplate(params: DeleteApprovalRuleTemplateInput): Request[DeleteApprovalRuleTemplateOutput, AWSError] = js.native
  def deleteApprovalRuleTemplate(
    params: DeleteApprovalRuleTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApprovalRuleTemplateOutput, Unit]
  ): Request[DeleteApprovalRuleTemplateOutput, AWSError] = js.native
  
  /**
    * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
    */
  def deleteBranch(): Request[DeleteBranchOutput, AWSError] = js.native
  def deleteBranch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchOutput, Unit]): Request[DeleteBranchOutput, AWSError] = js.native
  /**
    * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
    */
  def deleteBranch(params: DeleteBranchInput): Request[DeleteBranchOutput, AWSError] = js.native
  def deleteBranch(
    params: DeleteBranchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchOutput, Unit]
  ): Request[DeleteBranchOutput, AWSError] = js.native
  
  /**
    * Deletes the content of a comment made on a change, file, or commit in a repository.
    */
  def deleteCommentContent(): Request[DeleteCommentContentOutput, AWSError] = js.native
  def deleteCommentContent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCommentContentOutput, Unit]): Request[DeleteCommentContentOutput, AWSError] = js.native
  /**
    * Deletes the content of a comment made on a change, file, or commit in a repository.
    */
  def deleteCommentContent(params: DeleteCommentContentInput): Request[DeleteCommentContentOutput, AWSError] = js.native
  def deleteCommentContent(
    params: DeleteCommentContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCommentContentOutput, Unit]
  ): Request[DeleteCommentContentOutput, AWSError] = js.native
  
  /**
    * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file still exists in the commits earlier to the commit that contains the deletion.
    */
  def deleteFile(): Request[DeleteFileOutput, AWSError] = js.native
  def deleteFile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileOutput, Unit]): Request[DeleteFileOutput, AWSError] = js.native
  /**
    * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file still exists in the commits earlier to the commit that contains the deletion.
    */
  def deleteFile(params: DeleteFileInput): Request[DeleteFileOutput, AWSError] = js.native
  def deleteFile(
    params: DeleteFileInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFileOutput, Unit]
  ): Request[DeleteFileOutput, AWSError] = js.native
  
  /**
    * Deletes an approval rule from a specified pull request. Approval rules can be deleted from a pull request only if the pull request is open, and if the approval rule was created specifically for a pull request and not generated from an approval rule template associated with the repository where the pull request was created. You cannot delete an approval rule from a merged or closed pull request.
    */
  def deletePullRequestApprovalRule(): Request[DeletePullRequestApprovalRuleOutput, AWSError] = js.native
  def deletePullRequestApprovalRule(callback: js.Function2[/* err */ AWSError, /* data */ DeletePullRequestApprovalRuleOutput, Unit]): Request[DeletePullRequestApprovalRuleOutput, AWSError] = js.native
  /**
    * Deletes an approval rule from a specified pull request. Approval rules can be deleted from a pull request only if the pull request is open, and if the approval rule was created specifically for a pull request and not generated from an approval rule template associated with the repository where the pull request was created. You cannot delete an approval rule from a merged or closed pull request.
    */
  def deletePullRequestApprovalRule(params: DeletePullRequestApprovalRuleInput): Request[DeletePullRequestApprovalRuleOutput, AWSError] = js.native
  def deletePullRequestApprovalRule(
    params: DeletePullRequestApprovalRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePullRequestApprovalRuleOutput, Unit]
  ): Request[DeletePullRequestApprovalRuleOutput, AWSError] = js.native
  
  /**
    * Deletes a repository. If a specified repository was already deleted, a null repository ID is returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository fail. 
    */
  def deleteRepository(): Request[DeleteRepositoryOutput, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryOutput, Unit]): Request[DeleteRepositoryOutput, AWSError] = js.native
  /**
    * Deletes a repository. If a specified repository was already deleted, a null repository ID is returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository fail. 
    */
  def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryOutput, Unit]
  ): Request[DeleteRepositoryOutput, AWSError] = js.native
  
  /**
    * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the squash or three-way merge strategy. If the merge option for the attempted merge is specified as FAST_FORWARD_MERGE, an exception is thrown.
    */
  def describeMergeConflicts(): Request[DescribeMergeConflictsOutput, AWSError] = js.native
  def describeMergeConflicts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMergeConflictsOutput, Unit]): Request[DescribeMergeConflictsOutput, AWSError] = js.native
  /**
    * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the squash or three-way merge strategy. If the merge option for the attempted merge is specified as FAST_FORWARD_MERGE, an exception is thrown.
    */
  def describeMergeConflicts(params: DescribeMergeConflictsInput): Request[DescribeMergeConflictsOutput, AWSError] = js.native
  def describeMergeConflicts(
    params: DescribeMergeConflictsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMergeConflictsOutput, Unit]
  ): Request[DescribeMergeConflictsOutput, AWSError] = js.native
  
  /**
    * Returns information about one or more pull request events.
    */
  def describePullRequestEvents(): Request[DescribePullRequestEventsOutput, AWSError] = js.native
  def describePullRequestEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribePullRequestEventsOutput, Unit]): Request[DescribePullRequestEventsOutput, AWSError] = js.native
  /**
    * Returns information about one or more pull request events.
    */
  def describePullRequestEvents(params: DescribePullRequestEventsInput): Request[DescribePullRequestEventsOutput, AWSError] = js.native
  def describePullRequestEvents(
    params: DescribePullRequestEventsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePullRequestEventsOutput, Unit]
  ): Request[DescribePullRequestEventsOutput, AWSError] = js.native
  
  /**
    * Removes the association between a template and a repository so that approval rules based on the template are not automatically created when pull requests are created in the specified repository. This does not delete any approval rules previously created for pull requests through the template association.
    */
  def disassociateApprovalRuleTemplateFromRepository(): Request[js.Object, AWSError] = js.native
  def disassociateApprovalRuleTemplateFromRepository(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the association between a template and a repository so that approval rules based on the template are not automatically created when pull requests are created in the specified repository. This does not delete any approval rules previously created for pull requests through the template association.
    */
  def disassociateApprovalRuleTemplateFromRepository(params: DisassociateApprovalRuleTemplateFromRepositoryInput): Request[js.Object, AWSError] = js.native
  def disassociateApprovalRuleTemplateFromRepository(
    params: DisassociateApprovalRuleTemplateFromRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Evaluates whether a pull request has met all the conditions specified in its associated approval rules.
    */
  def evaluatePullRequestApprovalRules(): Request[EvaluatePullRequestApprovalRulesOutput, AWSError] = js.native
  def evaluatePullRequestApprovalRules(
    callback: js.Function2[/* err */ AWSError, /* data */ EvaluatePullRequestApprovalRulesOutput, Unit]
  ): Request[EvaluatePullRequestApprovalRulesOutput, AWSError] = js.native
  /**
    * Evaluates whether a pull request has met all the conditions specified in its associated approval rules.
    */
  def evaluatePullRequestApprovalRules(params: EvaluatePullRequestApprovalRulesInput): Request[EvaluatePullRequestApprovalRulesOutput, AWSError] = js.native
  def evaluatePullRequestApprovalRules(
    params: EvaluatePullRequestApprovalRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EvaluatePullRequestApprovalRulesOutput, Unit]
  ): Request[EvaluatePullRequestApprovalRulesOutput, AWSError] = js.native
  
  /**
    * Returns information about a specified approval rule template.
    */
  def getApprovalRuleTemplate(): Request[GetApprovalRuleTemplateOutput, AWSError] = js.native
  def getApprovalRuleTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetApprovalRuleTemplateOutput, Unit]): Request[GetApprovalRuleTemplateOutput, AWSError] = js.native
  /**
    * Returns information about a specified approval rule template.
    */
  def getApprovalRuleTemplate(params: GetApprovalRuleTemplateInput): Request[GetApprovalRuleTemplateOutput, AWSError] = js.native
  def getApprovalRuleTemplate(
    params: GetApprovalRuleTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApprovalRuleTemplateOutput, Unit]
  ): Request[GetApprovalRuleTemplateOutput, AWSError] = js.native
  
  /**
    * Returns the base-64 encoded content of an individual blob in a repository.
    */
  def getBlob(): Request[GetBlobOutput, AWSError] = js.native
  def getBlob(callback: js.Function2[/* err */ AWSError, /* data */ GetBlobOutput, Unit]): Request[GetBlobOutput, AWSError] = js.native
  /**
    * Returns the base-64 encoded content of an individual blob in a repository.
    */
  def getBlob(params: GetBlobInput): Request[GetBlobOutput, AWSError] = js.native
  def getBlob(params: GetBlobInput, callback: js.Function2[/* err */ AWSError, /* data */ GetBlobOutput, Unit]): Request[GetBlobOutput, AWSError] = js.native
  
  /**
    * Returns information about a repository branch, including its name and the last commit ID.
    */
  def getBranch(): Request[GetBranchOutput, AWSError] = js.native
  def getBranch(callback: js.Function2[/* err */ AWSError, /* data */ GetBranchOutput, Unit]): Request[GetBranchOutput, AWSError] = js.native
  /**
    * Returns information about a repository branch, including its name and the last commit ID.
    */
  def getBranch(params: GetBranchInput): Request[GetBranchOutput, AWSError] = js.native
  def getBranch(
    params: GetBranchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBranchOutput, Unit]
  ): Request[GetBranchOutput, AWSError] = js.native
  
  /**
    * Returns the content of a comment made on a change, file, or commit in a repository.   Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getComment(): Request[GetCommentOutput, AWSError] = js.native
  def getComment(callback: js.Function2[/* err */ AWSError, /* data */ GetCommentOutput, Unit]): Request[GetCommentOutput, AWSError] = js.native
  /**
    * Returns the content of a comment made on a change, file, or commit in a repository.   Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getComment(params: GetCommentInput): Request[GetCommentOutput, AWSError] = js.native
  def getComment(
    params: GetCommentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommentOutput, Unit]
  ): Request[GetCommentOutput, AWSError] = js.native
  
  /**
    * Returns information about reactions to a specified comment ID. Reactions from users who have been deleted will not be included in the count.
    */
  def getCommentReactions(): Request[GetCommentReactionsOutput, AWSError] = js.native
  def getCommentReactions(callback: js.Function2[/* err */ AWSError, /* data */ GetCommentReactionsOutput, Unit]): Request[GetCommentReactionsOutput, AWSError] = js.native
  /**
    * Returns information about reactions to a specified comment ID. Reactions from users who have been deleted will not be included in the count.
    */
  def getCommentReactions(params: GetCommentReactionsInput): Request[GetCommentReactionsOutput, AWSError] = js.native
  def getCommentReactions(
    params: GetCommentReactionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommentReactionsOutput, Unit]
  ): Request[GetCommentReactionsOutput, AWSError] = js.native
  
  /**
    * Returns information about comments made on the comparison between two commits.  Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getCommentsForComparedCommit(): Request[GetCommentsForComparedCommitOutput, AWSError] = js.native
  def getCommentsForComparedCommit(callback: js.Function2[/* err */ AWSError, /* data */ GetCommentsForComparedCommitOutput, Unit]): Request[GetCommentsForComparedCommitOutput, AWSError] = js.native
  /**
    * Returns information about comments made on the comparison between two commits.  Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getCommentsForComparedCommit(params: GetCommentsForComparedCommitInput): Request[GetCommentsForComparedCommitOutput, AWSError] = js.native
  def getCommentsForComparedCommit(
    params: GetCommentsForComparedCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommentsForComparedCommitOutput, Unit]
  ): Request[GetCommentsForComparedCommitOutput, AWSError] = js.native
  
  /**
    * Returns comments made on a pull request.  Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getCommentsForPullRequest(): Request[GetCommentsForPullRequestOutput, AWSError] = js.native
  def getCommentsForPullRequest(callback: js.Function2[/* err */ AWSError, /* data */ GetCommentsForPullRequestOutput, Unit]): Request[GetCommentsForPullRequestOutput, AWSError] = js.native
  /**
    * Returns comments made on a pull request.  Reaction counts might include numbers from user identities who were deleted after the reaction was made. For a count of reactions from active identities, use GetCommentReactions. 
    */
  def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): Request[GetCommentsForPullRequestOutput, AWSError] = js.native
  def getCommentsForPullRequest(
    params: GetCommentsForPullRequestInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommentsForPullRequestOutput, Unit]
  ): Request[GetCommentsForPullRequestOutput, AWSError] = js.native
  
  /**
    * Returns information about a commit, including commit message and committer information.
    */
  def getCommit(): Request[GetCommitOutput, AWSError] = js.native
  def getCommit(callback: js.Function2[/* err */ AWSError, /* data */ GetCommitOutput, Unit]): Request[GetCommitOutput, AWSError] = js.native
  /**
    * Returns information about a commit, including commit message and committer information.
    */
  def getCommit(params: GetCommitInput): Request[GetCommitOutput, AWSError] = js.native
  def getCommit(
    params: GetCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCommitOutput, Unit]
  ): Request[GetCommitOutput, AWSError] = js.native
  
  /**
    * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID, or other fully qualified reference). Results can be limited to a specified path.
    */
  def getDifferences(): Request[GetDifferencesOutput, AWSError] = js.native
  def getDifferences(callback: js.Function2[/* err */ AWSError, /* data */ GetDifferencesOutput, Unit]): Request[GetDifferencesOutput, AWSError] = js.native
  /**
    * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID, or other fully qualified reference). Results can be limited to a specified path.
    */
  def getDifferences(params: GetDifferencesInput): Request[GetDifferencesOutput, AWSError] = js.native
  def getDifferences(
    params: GetDifferencesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDifferencesOutput, Unit]
  ): Request[GetDifferencesOutput, AWSError] = js.native
  
  /**
    * Returns the base-64 encoded contents of a specified file and its metadata.
    */
  def getFile(): Request[GetFileOutput, AWSError] = js.native
  def getFile(callback: js.Function2[/* err */ AWSError, /* data */ GetFileOutput, Unit]): Request[GetFileOutput, AWSError] = js.native
  /**
    * Returns the base-64 encoded contents of a specified file and its metadata.
    */
  def getFile(params: GetFileInput): Request[GetFileOutput, AWSError] = js.native
  def getFile(params: GetFileInput, callback: js.Function2[/* err */ AWSError, /* data */ GetFileOutput, Unit]): Request[GetFileOutput, AWSError] = js.native
  
  /**
    * Returns the contents of a specified folder in a repository.
    */
  def getFolder(): Request[GetFolderOutput, AWSError] = js.native
  def getFolder(callback: js.Function2[/* err */ AWSError, /* data */ GetFolderOutput, Unit]): Request[GetFolderOutput, AWSError] = js.native
  /**
    * Returns the contents of a specified folder in a repository.
    */
  def getFolder(params: GetFolderInput): Request[GetFolderOutput, AWSError] = js.native
  def getFolder(
    params: GetFolderInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFolderOutput, Unit]
  ): Request[GetFolderOutput, AWSError] = js.native
  
  /**
    * Returns information about a specified merge commit.
    */
  def getMergeCommit(): Request[GetMergeCommitOutput, AWSError] = js.native
  def getMergeCommit(callback: js.Function2[/* err */ AWSError, /* data */ GetMergeCommitOutput, Unit]): Request[GetMergeCommitOutput, AWSError] = js.native
  /**
    * Returns information about a specified merge commit.
    */
  def getMergeCommit(params: GetMergeCommitInput): Request[GetMergeCommitOutput, AWSError] = js.native
  def getMergeCommit(
    params: GetMergeCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMergeCommitOutput, Unit]
  ): Request[GetMergeCommitOutput, AWSError] = js.native
  
  /**
    * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
    */
  def getMergeConflicts(): Request[GetMergeConflictsOutput, AWSError] = js.native
  def getMergeConflicts(callback: js.Function2[/* err */ AWSError, /* data */ GetMergeConflictsOutput, Unit]): Request[GetMergeConflictsOutput, AWSError] = js.native
  /**
    * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
    */
  def getMergeConflicts(params: GetMergeConflictsInput): Request[GetMergeConflictsOutput, AWSError] = js.native
  def getMergeConflicts(
    params: GetMergeConflictsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMergeConflictsOutput, Unit]
  ): Request[GetMergeConflictsOutput, AWSError] = js.native
  
  /**
    * Returns information about the merge options available for merging two specified branches. For details about why a merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
    */
  def getMergeOptions(): Request[GetMergeOptionsOutput, AWSError] = js.native
  def getMergeOptions(callback: js.Function2[/* err */ AWSError, /* data */ GetMergeOptionsOutput, Unit]): Request[GetMergeOptionsOutput, AWSError] = js.native
  /**
    * Returns information about the merge options available for merging two specified branches. For details about why a merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
    */
  def getMergeOptions(params: GetMergeOptionsInput): Request[GetMergeOptionsOutput, AWSError] = js.native
  def getMergeOptions(
    params: GetMergeOptionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMergeOptionsOutput, Unit]
  ): Request[GetMergeOptionsOutput, AWSError] = js.native
  
  /**
    * Gets information about a pull request in a specified repository.
    */
  def getPullRequest(): Request[GetPullRequestOutput, AWSError] = js.native
  def getPullRequest(callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestOutput, Unit]): Request[GetPullRequestOutput, AWSError] = js.native
  /**
    * Gets information about a pull request in a specified repository.
    */
  def getPullRequest(params: GetPullRequestInput): Request[GetPullRequestOutput, AWSError] = js.native
  def getPullRequest(
    params: GetPullRequestInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestOutput, Unit]
  ): Request[GetPullRequestOutput, AWSError] = js.native
  
  /**
    * Gets information about the approval states for a specified pull request. Approval states only apply to pull requests that have one or more approval rules applied to them.
    */
  def getPullRequestApprovalStates(): Request[GetPullRequestApprovalStatesOutput, AWSError] = js.native
  def getPullRequestApprovalStates(callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestApprovalStatesOutput, Unit]): Request[GetPullRequestApprovalStatesOutput, AWSError] = js.native
  /**
    * Gets information about the approval states for a specified pull request. Approval states only apply to pull requests that have one or more approval rules applied to them.
    */
  def getPullRequestApprovalStates(params: GetPullRequestApprovalStatesInput): Request[GetPullRequestApprovalStatesOutput, AWSError] = js.native
  def getPullRequestApprovalStates(
    params: GetPullRequestApprovalStatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestApprovalStatesOutput, Unit]
  ): Request[GetPullRequestApprovalStatesOutput, AWSError] = js.native
  
  /**
    * Returns information about whether approval rules have been set aside (overridden) for a pull request, and if so, the Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the pull request.
    */
  def getPullRequestOverrideState(): Request[GetPullRequestOverrideStateOutput, AWSError] = js.native
  def getPullRequestOverrideState(callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestOverrideStateOutput, Unit]): Request[GetPullRequestOverrideStateOutput, AWSError] = js.native
  /**
    * Returns information about whether approval rules have been set aside (overridden) for a pull request, and if so, the Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the pull request.
    */
  def getPullRequestOverrideState(params: GetPullRequestOverrideStateInput): Request[GetPullRequestOverrideStateOutput, AWSError] = js.native
  def getPullRequestOverrideState(
    params: GetPullRequestOverrideStateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPullRequestOverrideStateOutput, Unit]
  ): Request[GetPullRequestOverrideStateOutput, AWSError] = js.native
  
  /**
    * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def getRepository(): Request[GetRepositoryOutput, AWSError] = js.native
  def getRepository(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryOutput, Unit]): Request[GetRepositoryOutput, AWSError] = js.native
  /**
    * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput, AWSError] = js.native
  def getRepository(
    params: GetRepositoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryOutput, Unit]
  ): Request[GetRepositoryOutput, AWSError] = js.native
  
  /**
    * Gets information about triggers configured for a repository.
    */
  def getRepositoryTriggers(): Request[GetRepositoryTriggersOutput, AWSError] = js.native
  def getRepositoryTriggers(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryTriggersOutput, Unit]): Request[GetRepositoryTriggersOutput, AWSError] = js.native
  /**
    * Gets information about triggers configured for a repository.
    */
  def getRepositoryTriggers(params: GetRepositoryTriggersInput): Request[GetRepositoryTriggersOutput, AWSError] = js.native
  def getRepositoryTriggers(
    params: GetRepositoryTriggersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryTriggersOutput, Unit]
  ): Request[GetRepositoryTriggersOutput, AWSError] = js.native
  
  /**
    * Lists all approval rule templates in the specified AWS Region in your AWS account. If an AWS Region is not specified, the AWS Region where you are signed in is used.
    */
  def listApprovalRuleTemplates(): Request[ListApprovalRuleTemplatesOutput, AWSError] = js.native
  def listApprovalRuleTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListApprovalRuleTemplatesOutput, Unit]): Request[ListApprovalRuleTemplatesOutput, AWSError] = js.native
  /**
    * Lists all approval rule templates in the specified AWS Region in your AWS account. If an AWS Region is not specified, the AWS Region where you are signed in is used.
    */
  def listApprovalRuleTemplates(params: ListApprovalRuleTemplatesInput): Request[ListApprovalRuleTemplatesOutput, AWSError] = js.native
  def listApprovalRuleTemplates(
    params: ListApprovalRuleTemplatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApprovalRuleTemplatesOutput, Unit]
  ): Request[ListApprovalRuleTemplatesOutput, AWSError] = js.native
  
  /**
    * Lists all approval rule templates that are associated with a specified repository.
    */
  def listAssociatedApprovalRuleTemplatesForRepository(): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError] = js.native
  def listAssociatedApprovalRuleTemplatesForRepository(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListAssociatedApprovalRuleTemplatesForRepositoryOutput, 
      Unit
    ]
  ): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError] = js.native
  /**
    * Lists all approval rule templates that are associated with a specified repository.
    */
  def listAssociatedApprovalRuleTemplatesForRepository(params: ListAssociatedApprovalRuleTemplatesForRepositoryInput): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError] = js.native
  def listAssociatedApprovalRuleTemplatesForRepository(
    params: ListAssociatedApprovalRuleTemplatesForRepositoryInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListAssociatedApprovalRuleTemplatesForRepositoryOutput, 
      Unit
    ]
  ): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more branches in a repository.
    */
  def listBranches(): Request[ListBranchesOutput, AWSError] = js.native
  def listBranches(callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesOutput, Unit]): Request[ListBranchesOutput, AWSError] = js.native
  /**
    * Gets information about one or more branches in a repository.
    */
  def listBranches(params: ListBranchesInput): Request[ListBranchesOutput, AWSError] = js.native
  def listBranches(
    params: ListBranchesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesOutput, Unit]
  ): Request[ListBranchesOutput, AWSError] = js.native
  
  /**
    * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
    */
  def listPullRequests(): Request[ListPullRequestsOutput, AWSError] = js.native
  def listPullRequests(callback: js.Function2[/* err */ AWSError, /* data */ ListPullRequestsOutput, Unit]): Request[ListPullRequestsOutput, AWSError] = js.native
  /**
    * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
    */
  def listPullRequests(params: ListPullRequestsInput): Request[ListPullRequestsOutput, AWSError] = js.native
  def listPullRequests(
    params: ListPullRequestsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPullRequestsOutput, Unit]
  ): Request[ListPullRequestsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more repositories.
    */
  def listRepositories(): Request[ListRepositoriesOutput, AWSError] = js.native
  def listRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesOutput, Unit]): Request[ListRepositoriesOutput, AWSError] = js.native
  /**
    * Gets information about one or more repositories.
    */
  def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput, AWSError] = js.native
  def listRepositories(
    params: ListRepositoriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesOutput, Unit]
  ): Request[ListRepositoriesOutput, AWSError] = js.native
  
  /**
    * Lists all repositories associated with the specified approval rule template.
    */
  def listRepositoriesForApprovalRuleTemplate(): Request[ListRepositoriesForApprovalRuleTemplateOutput, AWSError] = js.native
  def listRepositoriesForApprovalRuleTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesForApprovalRuleTemplateOutput, Unit]
  ): Request[ListRepositoriesForApprovalRuleTemplateOutput, AWSError] = js.native
  /**
    * Lists all repositories associated with the specified approval rule template.
    */
  def listRepositoriesForApprovalRuleTemplate(params: ListRepositoriesForApprovalRuleTemplateInput): Request[ListRepositoriesForApprovalRuleTemplateOutput, AWSError] = js.native
  def listRepositoriesForApprovalRuleTemplate(
    params: ListRepositoriesForApprovalRuleTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesForApprovalRuleTemplateOutput, Unit]
  ): Request[ListRepositoriesForApprovalRuleTemplateOutput, AWSError] = js.native
  
  /**
    * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Merges two branches using the fast-forward merge strategy.
    */
  def mergeBranchesByFastForward(): Request[MergeBranchesByFastForwardOutput, AWSError] = js.native
  def mergeBranchesByFastForward(callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesByFastForwardOutput, Unit]): Request[MergeBranchesByFastForwardOutput, AWSError] = js.native
  /**
    * Merges two branches using the fast-forward merge strategy.
    */
  def mergeBranchesByFastForward(params: MergeBranchesByFastForwardInput): Request[MergeBranchesByFastForwardOutput, AWSError] = js.native
  def mergeBranchesByFastForward(
    params: MergeBranchesByFastForwardInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesByFastForwardOutput, Unit]
  ): Request[MergeBranchesByFastForwardOutput, AWSError] = js.native
  
  /**
    * Merges two branches using the squash merge strategy.
    */
  def mergeBranchesBySquash(): Request[MergeBranchesBySquashOutput, AWSError] = js.native
  def mergeBranchesBySquash(callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesBySquashOutput, Unit]): Request[MergeBranchesBySquashOutput, AWSError] = js.native
  /**
    * Merges two branches using the squash merge strategy.
    */
  def mergeBranchesBySquash(params: MergeBranchesBySquashInput): Request[MergeBranchesBySquashOutput, AWSError] = js.native
  def mergeBranchesBySquash(
    params: MergeBranchesBySquashInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesBySquashOutput, Unit]
  ): Request[MergeBranchesBySquashOutput, AWSError] = js.native
  
  /**
    * Merges two specified branches using the three-way merge strategy.
    */
  def mergeBranchesByThreeWay(): Request[MergeBranchesByThreeWayOutput, AWSError] = js.native
  def mergeBranchesByThreeWay(callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesByThreeWayOutput, Unit]): Request[MergeBranchesByThreeWayOutput, AWSError] = js.native
  /**
    * Merges two specified branches using the three-way merge strategy.
    */
  def mergeBranchesByThreeWay(params: MergeBranchesByThreeWayInput): Request[MergeBranchesByThreeWayOutput, AWSError] = js.native
  def mergeBranchesByThreeWay(
    params: MergeBranchesByThreeWayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergeBranchesByThreeWayOutput, Unit]
  ): Request[MergeBranchesByThreeWayOutput, AWSError] = js.native
  
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestByFastForward(): Request[MergePullRequestByFastForwardOutput, AWSError] = js.native
  def mergePullRequestByFastForward(callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestByFastForwardOutput, Unit]): Request[MergePullRequestByFastForwardOutput, AWSError] = js.native
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestByFastForward(params: MergePullRequestByFastForwardInput): Request[MergePullRequestByFastForwardOutput, AWSError] = js.native
  def mergePullRequestByFastForward(
    params: MergePullRequestByFastForwardInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestByFastForwardOutput, Unit]
  ): Request[MergePullRequestByFastForwardOutput, AWSError] = js.native
  
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestBySquash(): Request[MergePullRequestBySquashOutput, AWSError] = js.native
  def mergePullRequestBySquash(callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestBySquashOutput, Unit]): Request[MergePullRequestBySquashOutput, AWSError] = js.native
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestBySquash(params: MergePullRequestBySquashInput): Request[MergePullRequestBySquashOutput, AWSError] = js.native
  def mergePullRequestBySquash(
    params: MergePullRequestBySquashInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestBySquashOutput, Unit]
  ): Request[MergePullRequestBySquashOutput, AWSError] = js.native
  
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestByThreeWay(): Request[MergePullRequestByThreeWayOutput, AWSError] = js.native
  def mergePullRequestByThreeWay(callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestByThreeWayOutput, Unit]): Request[MergePullRequestByThreeWayOutput, AWSError] = js.native
  /**
    * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull request.
    */
  def mergePullRequestByThreeWay(params: MergePullRequestByThreeWayInput): Request[MergePullRequestByThreeWayOutput, AWSError] = js.native
  def mergePullRequestByThreeWay(
    params: MergePullRequestByThreeWayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergePullRequestByThreeWayOutput, Unit]
  ): Request[MergePullRequestByThreeWayOutput, AWSError] = js.native
  
  /**
    * Sets aside (overrides) all approval rule requirements for a specified pull request.
    */
  def overridePullRequestApprovalRules(): Request[js.Object, AWSError] = js.native
  def overridePullRequestApprovalRules(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets aside (overrides) all approval rule requirements for a specified pull request.
    */
  def overridePullRequestApprovalRules(params: OverridePullRequestApprovalRulesInput): Request[js.Object, AWSError] = js.native
  def overridePullRequestApprovalRules(
    params: OverridePullRequestApprovalRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Posts a comment on the comparison between two commits.
    */
  def postCommentForComparedCommit(): Request[PostCommentForComparedCommitOutput, AWSError] = js.native
  def postCommentForComparedCommit(callback: js.Function2[/* err */ AWSError, /* data */ PostCommentForComparedCommitOutput, Unit]): Request[PostCommentForComparedCommitOutput, AWSError] = js.native
  /**
    * Posts a comment on the comparison between two commits.
    */
  def postCommentForComparedCommit(params: PostCommentForComparedCommitInput): Request[PostCommentForComparedCommitOutput, AWSError] = js.native
  def postCommentForComparedCommit(
    params: PostCommentForComparedCommitInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PostCommentForComparedCommitOutput, Unit]
  ): Request[PostCommentForComparedCommitOutput, AWSError] = js.native
  
  /**
    * Posts a comment on a pull request.
    */
  def postCommentForPullRequest(): Request[PostCommentForPullRequestOutput, AWSError] = js.native
  def postCommentForPullRequest(callback: js.Function2[/* err */ AWSError, /* data */ PostCommentForPullRequestOutput, Unit]): Request[PostCommentForPullRequestOutput, AWSError] = js.native
  /**
    * Posts a comment on a pull request.
    */
  def postCommentForPullRequest(params: PostCommentForPullRequestInput): Request[PostCommentForPullRequestOutput, AWSError] = js.native
  def postCommentForPullRequest(
    params: PostCommentForPullRequestInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PostCommentForPullRequestOutput, Unit]
  ): Request[PostCommentForPullRequestOutput, AWSError] = js.native
  
  /**
    * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
    */
  def postCommentReply(): Request[PostCommentReplyOutput, AWSError] = js.native
  def postCommentReply(callback: js.Function2[/* err */ AWSError, /* data */ PostCommentReplyOutput, Unit]): Request[PostCommentReplyOutput, AWSError] = js.native
  /**
    * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
    */
  def postCommentReply(params: PostCommentReplyInput): Request[PostCommentReplyOutput, AWSError] = js.native
  def postCommentReply(
    params: PostCommentReplyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PostCommentReplyOutput, Unit]
  ): Request[PostCommentReplyOutput, AWSError] = js.native
  
  /**
    * Adds or updates a reaction to a specified comment for the user whose identity is used to make the request. You can only add or update a reaction for yourself. You cannot add, modify, or delete a reaction for another user.
    */
  def putCommentReaction(): Request[js.Object, AWSError] = js.native
  def putCommentReaction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates a reaction to a specified comment for the user whose identity is used to make the request. You can only add or update a reaction for yourself. You cannot add, modify, or delete a reaction for another user.
    */
  def putCommentReaction(params: PutCommentReactionInput): Request[js.Object, AWSError] = js.native
  def putCommentReaction(
    params: PutCommentReactionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
    */
  def putFile(): Request[PutFileOutput, AWSError] = js.native
  def putFile(callback: js.Function2[/* err */ AWSError, /* data */ PutFileOutput, Unit]): Request[PutFileOutput, AWSError] = js.native
  /**
    * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
    */
  def putFile(params: PutFileInput): Request[PutFileOutput, AWSError] = js.native
  def putFile(params: PutFileInput, callback: js.Function2[/* err */ AWSError, /* data */ PutFileOutput, Unit]): Request[PutFileOutput, AWSError] = js.native
  
  /**
    * Replaces all triggers for a repository. Used to create or delete triggers.
    */
  def putRepositoryTriggers(): Request[PutRepositoryTriggersOutput, AWSError] = js.native
  def putRepositoryTriggers(callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryTriggersOutput, Unit]): Request[PutRepositoryTriggersOutput, AWSError] = js.native
  /**
    * Replaces all triggers for a repository. Used to create or delete triggers.
    */
  def putRepositoryTriggers(params: PutRepositoryTriggersInput): Request[PutRepositoryTriggersOutput, AWSError] = js.native
  def putRepositoryTriggers(
    params: PutRepositoryTriggersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryTriggersOutput, Unit]
  ): Request[PutRepositoryTriggersOutput, AWSError] = js.native
  
  /**
    * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def tagResource(params: TagResourceInput): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test sends data from the last commit. If no data is available, sample data is generated.
    */
  def testRepositoryTriggers(): Request[TestRepositoryTriggersOutput, AWSError] = js.native
  def testRepositoryTriggers(callback: js.Function2[/* err */ AWSError, /* data */ TestRepositoryTriggersOutput, Unit]): Request[TestRepositoryTriggersOutput, AWSError] = js.native
  /**
    * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test sends data from the last commit. If no data is available, sample data is generated.
    */
  def testRepositoryTriggers(params: TestRepositoryTriggersInput): Request[TestRepositoryTriggersOutput, AWSError] = js.native
  def testRepositoryTriggers(
    params: TestRepositoryTriggersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TestRepositoryTriggersOutput, Unit]
  ): Request[TestRepositoryTriggersOutput, AWSError] = js.native
  
  /**
    * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see CodeCommit Resources and Operations in the AWS CodeCommit User Guide.
    */
  def untagResource(params: UntagResourceInput): Request[js.Object, AWSError] = js.native
  def untagResource(params: UntagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the content of an approval rule template. You can change the number of required approvals, the membership of the approval rule, and whether an approval pool is defined.
    */
  def updateApprovalRuleTemplateContent(): Request[UpdateApprovalRuleTemplateContentOutput, AWSError] = js.native
  def updateApprovalRuleTemplateContent(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateContentOutput, Unit]
  ): Request[UpdateApprovalRuleTemplateContentOutput, AWSError] = js.native
  /**
    * Updates the content of an approval rule template. You can change the number of required approvals, the membership of the approval rule, and whether an approval pool is defined.
    */
  def updateApprovalRuleTemplateContent(params: UpdateApprovalRuleTemplateContentInput): Request[UpdateApprovalRuleTemplateContentOutput, AWSError] = js.native
  def updateApprovalRuleTemplateContent(
    params: UpdateApprovalRuleTemplateContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateContentOutput, Unit]
  ): Request[UpdateApprovalRuleTemplateContentOutput, AWSError] = js.native
  
  /**
    * Updates the description for a specified approval rule template.
    */
  def updateApprovalRuleTemplateDescription(): Request[UpdateApprovalRuleTemplateDescriptionOutput, AWSError] = js.native
  def updateApprovalRuleTemplateDescription(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateDescriptionOutput, Unit]
  ): Request[UpdateApprovalRuleTemplateDescriptionOutput, AWSError] = js.native
  /**
    * Updates the description for a specified approval rule template.
    */
  def updateApprovalRuleTemplateDescription(params: UpdateApprovalRuleTemplateDescriptionInput): Request[UpdateApprovalRuleTemplateDescriptionOutput, AWSError] = js.native
  def updateApprovalRuleTemplateDescription(
    params: UpdateApprovalRuleTemplateDescriptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateDescriptionOutput, Unit]
  ): Request[UpdateApprovalRuleTemplateDescriptionOutput, AWSError] = js.native
  
  /**
    * Updates the name of a specified approval rule template.
    */
  def updateApprovalRuleTemplateName(): Request[UpdateApprovalRuleTemplateNameOutput, AWSError] = js.native
  def updateApprovalRuleTemplateName(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateNameOutput, Unit]): Request[UpdateApprovalRuleTemplateNameOutput, AWSError] = js.native
  /**
    * Updates the name of a specified approval rule template.
    */
  def updateApprovalRuleTemplateName(params: UpdateApprovalRuleTemplateNameInput): Request[UpdateApprovalRuleTemplateNameOutput, AWSError] = js.native
  def updateApprovalRuleTemplateName(
    params: UpdateApprovalRuleTemplateNameInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApprovalRuleTemplateNameOutput, Unit]
  ): Request[UpdateApprovalRuleTemplateNameOutput, AWSError] = js.native
  
  /**
    * Replaces the contents of a comment.
    */
  def updateComment(): Request[UpdateCommentOutput, AWSError] = js.native
  def updateComment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCommentOutput, Unit]): Request[UpdateCommentOutput, AWSError] = js.native
  /**
    * Replaces the contents of a comment.
    */
  def updateComment(params: UpdateCommentInput): Request[UpdateCommentOutput, AWSError] = js.native
  def updateComment(
    params: UpdateCommentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCommentOutput, Unit]
  ): Request[UpdateCommentOutput, AWSError] = js.native
  
  /**
    * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
    */
  def updateDefaultBranch(): Request[js.Object, AWSError] = js.native
  def updateDefaultBranch(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
    */
  def updateDefaultBranch(params: UpdateDefaultBranchInput): Request[js.Object, AWSError] = js.native
  def updateDefaultBranch(
    params: UpdateDefaultBranchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the structure of an approval rule created specifically for a pull request. For example, you can change the number of required approvers and the approval pool for approvers. 
    */
  def updatePullRequestApprovalRuleContent(): Request[UpdatePullRequestApprovalRuleContentOutput, AWSError] = js.native
  def updatePullRequestApprovalRuleContent(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestApprovalRuleContentOutput, Unit]
  ): Request[UpdatePullRequestApprovalRuleContentOutput, AWSError] = js.native
  /**
    * Updates the structure of an approval rule created specifically for a pull request. For example, you can change the number of required approvers and the approval pool for approvers. 
    */
  def updatePullRequestApprovalRuleContent(params: UpdatePullRequestApprovalRuleContentInput): Request[UpdatePullRequestApprovalRuleContentOutput, AWSError] = js.native
  def updatePullRequestApprovalRuleContent(
    params: UpdatePullRequestApprovalRuleContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestApprovalRuleContentOutput, Unit]
  ): Request[UpdatePullRequestApprovalRuleContentOutput, AWSError] = js.native
  
  /**
    * Updates the state of a user's approval on a pull request. The user is derived from the signed-in account when the request is made.
    */
  def updatePullRequestApprovalState(): Request[js.Object, AWSError] = js.native
  def updatePullRequestApprovalState(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the state of a user's approval on a pull request. The user is derived from the signed-in account when the request is made.
    */
  def updatePullRequestApprovalState(params: UpdatePullRequestApprovalStateInput): Request[js.Object, AWSError] = js.native
  def updatePullRequestApprovalState(
    params: UpdatePullRequestApprovalStateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Replaces the contents of the description of a pull request.
    */
  def updatePullRequestDescription(): Request[UpdatePullRequestDescriptionOutput, AWSError] = js.native
  def updatePullRequestDescription(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestDescriptionOutput, Unit]): Request[UpdatePullRequestDescriptionOutput, AWSError] = js.native
  /**
    * Replaces the contents of the description of a pull request.
    */
  def updatePullRequestDescription(params: UpdatePullRequestDescriptionInput): Request[UpdatePullRequestDescriptionOutput, AWSError] = js.native
  def updatePullRequestDescription(
    params: UpdatePullRequestDescriptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestDescriptionOutput, Unit]
  ): Request[UpdatePullRequestDescriptionOutput, AWSError] = js.native
  
  /**
    * Updates the status of a pull request. 
    */
  def updatePullRequestStatus(): Request[UpdatePullRequestStatusOutput, AWSError] = js.native
  def updatePullRequestStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestStatusOutput, Unit]): Request[UpdatePullRequestStatusOutput, AWSError] = js.native
  /**
    * Updates the status of a pull request. 
    */
  def updatePullRequestStatus(params: UpdatePullRequestStatusInput): Request[UpdatePullRequestStatusOutput, AWSError] = js.native
  def updatePullRequestStatus(
    params: UpdatePullRequestStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestStatusOutput, Unit]
  ): Request[UpdatePullRequestStatusOutput, AWSError] = js.native
  
  /**
    * Replaces the title of a pull request.
    */
  def updatePullRequestTitle(): Request[UpdatePullRequestTitleOutput, AWSError] = js.native
  def updatePullRequestTitle(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestTitleOutput, Unit]): Request[UpdatePullRequestTitleOutput, AWSError] = js.native
  /**
    * Replaces the title of a pull request.
    */
  def updatePullRequestTitle(params: UpdatePullRequestTitleInput): Request[UpdatePullRequestTitleOutput, AWSError] = js.native
  def updatePullRequestTitle(
    params: UpdatePullRequestTitleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePullRequestTitleOutput, Unit]
  ): Request[UpdatePullRequestTitleOutput, AWSError] = js.native
  
  /**
    * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def updateRepositoryDescription(): Request[js.Object, AWSError] = js.native
  def updateRepositoryDescription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  def updateRepositoryDescription(params: UpdateRepositoryDescriptionInput): Request[js.Object, AWSError] = js.native
  def updateRepositoryDescription(
    params: UpdateRepositoryDescriptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Renames a repository. The repository name must be unique across the calling AWS account. Repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix .git is prohibited. For more information about the limits on repository names, see Limits in the AWS CodeCommit User Guide.
    */
  def updateRepositoryName(): Request[js.Object, AWSError] = js.native
  def updateRepositoryName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Renames a repository. The repository name must be unique across the calling AWS account. Repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix .git is prohibited. For more information about the limits on repository names, see Limits in the AWS CodeCommit User Guide.
    */
  def updateRepositoryName(params: UpdateRepositoryNameInput): Request[js.Object, AWSError] = js.native
  def updateRepositoryName(
    params: UpdateRepositoryNameInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
