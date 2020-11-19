package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codegurureviewerMod {
  
  type Arn = java.lang.String
  
  type AssociationId = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codegurureviewerMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CodeReviewSummaries = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.CodeReviewSummary]
  
  type CommitId = java.lang.String
  
  type ConnectionArn = java.lang.String
  
  type FilePath = java.lang.String
  
  type FindingsCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type JobState = typingsSlinky.awsSdk.codegurureviewerMod._JobState | java.lang.String
  
  type JobStates = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.JobState]
  
  type LineNumber = scala.Double
  
  type ListCodeReviewsMaxResults = scala.Double
  
  type MaxResults = scala.Double
  
  type MeteredLinesOfCodeCount = scala.Double
  
  type Name = java.lang.String
  
  type Names = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.Name]
  
  type NextToken = java.lang.String
  
  type Owner = java.lang.String
  
  type Owners = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.Owner]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CodeCommit_
    - typingsSlinky.awsSdk.awsSdkStrings.GitHub_
    - typingsSlinky.awsSdk.awsSdkStrings.Bitbucket_
    - typingsSlinky.awsSdk.awsSdkStrings.GitHubEnterpriseServer
    - java.lang.String
  */
  type ProviderType = typingsSlinky.awsSdk.codegurureviewerMod._ProviderType | java.lang.String
  
  type ProviderTypes = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.ProviderType]
  
  type PullRequestId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ThumbsUp
    - typingsSlinky.awsSdk.awsSdkStrings.ThumbsDown
    - java.lang.String
  */
  type Reaction = typingsSlinky.awsSdk.codegurureviewerMod._Reaction | java.lang.String
  
  type Reactions = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.Reaction]
  
  type RecommendationFeedbackSummaries = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.RecommendationFeedbackSummary]
  
  type RecommendationId = java.lang.String
  
  type RecommendationIds = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.RecommendationId]
  
  type RecommendationSummaries = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.RecommendationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Associated_
    - typingsSlinky.awsSdk.awsSdkStrings.Associating_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Disassociating_
    - java.lang.String
  */
  type RepositoryAssociationState = typingsSlinky.awsSdk.codegurureviewerMod._RepositoryAssociationState | java.lang.String
  
  type RepositoryAssociationStates = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.RepositoryAssociationState]
  
  type RepositoryAssociationSummaries = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.RepositoryAssociationSummary]
  
  type RepositoryNames = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.Name]
  
  type StateReason = java.lang.String
  
  type Text = java.lang.String
  
  type TimeStamp = js.Date
  
  type Type = typingsSlinky.awsSdk.awsSdkStrings.PullRequest | java.lang.String
  
  type UserId = java.lang.String
  
  type UserIds = js.Array[typingsSlinky.awsSdk.codegurureviewerMod.UserId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-09-19`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codegurureviewerMod._apiVersion | java.lang.String
}
