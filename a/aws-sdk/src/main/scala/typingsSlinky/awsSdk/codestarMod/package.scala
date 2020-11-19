package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codestarMod {
  
  type BucketKey = java.lang.String
  
  type BucketName = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codestarMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CreatedTimestamp = js.Date
  
  type DeleteStack = scala.Boolean
  
  type Email = java.lang.String
  
  type GitHubPersonalToken = java.lang.String
  
  type LastModifiedTimestamp = js.Date
  
  type MaxResults = scala.Double
  
  type PaginationToken = java.lang.String
  
  type ProjectArn = java.lang.String
  
  type ProjectDescription = java.lang.String
  
  type ProjectId = java.lang.String
  
  type ProjectName = java.lang.String
  
  type ProjectTemplateId = java.lang.String
  
  type ProjectsList = js.Array[typingsSlinky.awsSdk.codestarMod.ProjectSummary]
  
  type Reason = java.lang.String
  
  type RemoteAccessAllowed = scala.Boolean
  
  type RepositoryDescription = java.lang.String
  
  type RepositoryEnableIssues = scala.Boolean
  
  type RepositoryIsPrivate = scala.Boolean
  
  type RepositoryName = java.lang.String
  
  type RepositoryOwner = java.lang.String
  
  type RepositoryType = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourcesResult = js.Array[typingsSlinky.awsSdk.codestarMod.Resource]
  
  type Role = java.lang.String
  
  type RoleArn = java.lang.String
  
  type SourceCode = js.Array[typingsSlinky.awsSdk.codestarMod.Code]
  
  type SshPublicKey = java.lang.String
  
  type StackId = java.lang.String
  
  type State = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.codestarMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codestarMod.TagValue]
  
  type TeamMemberResult = js.Array[typingsSlinky.awsSdk.codestarMod.TeamMember]
  
  type TemplateParameterKey = java.lang.String
  
  type TemplateParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codestarMod.TemplateParameterValue]
  
  type TemplateParameterValue = java.lang.String
  
  type UserArn = java.lang.String
  
  type UserProfileDisplayName = java.lang.String
  
  type UserProfilesList = js.Array[typingsSlinky.awsSdk.codestarMod.UserProfileSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-04-19`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codestarMod._apiVersion | java.lang.String
}
