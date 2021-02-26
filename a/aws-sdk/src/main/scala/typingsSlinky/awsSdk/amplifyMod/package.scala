package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object amplifyMod {
  
  type AccessToken = java.lang.String
  
  type ActiveJobId = java.lang.String
  
  type AppArn = java.lang.String
  
  type AppId = java.lang.String
  
  type Apps = js.Array[typingsSlinky.awsSdk.amplifyMod.App]
  
  type ArtifactFileName = java.lang.String
  
  type ArtifactId = java.lang.String
  
  type ArtifactUrl = java.lang.String
  
  type Artifacts = js.Array[typingsSlinky.awsSdk.amplifyMod.Artifact]
  
  type ArtifactsUrl = java.lang.String
  
  type AssociatedResource = java.lang.String
  
  type AssociatedResources = js.Array[typingsSlinky.awsSdk.amplifyMod.AssociatedResource]
  
  type AutoBranchCreationPattern = java.lang.String
  
  type AutoBranchCreationPatterns = js.Array[typingsSlinky.awsSdk.amplifyMod.AutoBranchCreationPattern]
  
  type AutoSubDomainCreationPattern = java.lang.String
  
  type AutoSubDomainCreationPatterns = js.Array[typingsSlinky.awsSdk.amplifyMod.AutoSubDomainCreationPattern]
  
  type AutoSubDomainIAMRole = java.lang.String
  
  type BackendEnvironmentArn = java.lang.String
  
  type BackendEnvironments = js.Array[typingsSlinky.awsSdk.amplifyMod.BackendEnvironment]
  
  type BasicAuthCredentials = java.lang.String
  
  type BranchArn = java.lang.String
  
  type BranchName = java.lang.String
  
  type Branches = js.Array[typingsSlinky.awsSdk.amplifyMod.Branch]
  
  type BuildSpec = java.lang.String
  
  type CertificateVerificationDNSRecord = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.amplifyMod.ClientApiVersions
  
  type CommitId = java.lang.String
  
  type CommitMessage = java.lang.String
  
  type CommitTime = js.Date
  
  type Condition = java.lang.String
  
  type Context = java.lang.String
  
  type CreateTime = js.Date
  
  type CustomDomain = java.lang.String
  
  type CustomDomains = js.Array[typingsSlinky.awsSdk.amplifyMod.CustomDomain]
  
  type CustomHeaders = java.lang.String
  
  type CustomRules = js.Array[typingsSlinky.awsSdk.amplifyMod.CustomRule]
  
  type DNSRecord = java.lang.String
  
  type DefaultDomain = java.lang.String
  
  type DeploymentArtifacts = java.lang.String
  
  type Description = java.lang.String
  
  type DisplayName = java.lang.String
  
  type DomainAssociationArn = java.lang.String
  
  type DomainAssociations = js.Array[typingsSlinky.awsSdk.amplifyMod.DomainAssociation]
  
  type DomainName = java.lang.String
  
  type DomainPrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainStatus = typingsSlinky.awsSdk.amplifyMod._DomainStatus | java.lang.String
  
  type EnableAutoBranchCreation = scala.Boolean
  
  type EnableAutoBuild = scala.Boolean
  
  type EnableAutoSubDomain = scala.Boolean
  
  type EnableBasicAuth = scala.Boolean
  
  type EnableBranchAutoBuild = scala.Boolean
  
  type EnableBranchAutoDeletion = scala.Boolean
  
  type EnableNotification = scala.Boolean
  
  type EnablePerformanceMode = scala.Boolean
  
  type EnablePullRequestPreview = scala.Boolean
  
  type EndTime = js.Date
  
  type EnvKey = java.lang.String
  
  type EnvValue = java.lang.String
  
  type EnvironmentName = java.lang.String
  
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.amplifyMod.EnvValue]
  
  type FileMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.amplifyMod.MD5Hash]
  
  type FileName = java.lang.String
  
  type FileUploadUrls = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.amplifyMod.UploadUrl]
  
  type Framework = java.lang.String
  
  type JobArn = java.lang.String
  
  type JobId = java.lang.String
  
  type JobReason = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.amplifyMod._JobStatus | java.lang.String
  
  type JobSummaries = js.Array[typingsSlinky.awsSdk.amplifyMod.JobSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RELEASE
    - typingsSlinky.awsSdk.awsSdkStrings.RETRY
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
    - typingsSlinky.awsSdk.awsSdkStrings.WEB_HOOK
    - java.lang.String
  */
  type JobType = typingsSlinky.awsSdk.amplifyMod._JobType | java.lang.String
  
  type LastDeployTime = js.Date
  
  type LogUrl = java.lang.String
  
  type MD5Hash = java.lang.String
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type OauthToken = java.lang.String
  
  type Platform = typingsSlinky.awsSdk.awsSdkStrings.WEB | java.lang.String
  
  type PullRequestEnvironmentName = java.lang.String
  
  type Repository = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type Screenshots = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.amplifyMod.ThumbnailUrl]
  
  type ServiceRoleArn = java.lang.String
  
  type Source = java.lang.String
  
  type SourceUrl = java.lang.String
  
  type StackName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCTION
    - typingsSlinky.awsSdk.awsSdkStrings.BETA
    - typingsSlinky.awsSdk.awsSdkStrings.DEVELOPMENT
    - typingsSlinky.awsSdk.awsSdkStrings.EXPERIMENTAL
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST
    - java.lang.String
  */
  type Stage = typingsSlinky.awsSdk.amplifyMod._Stage | java.lang.String
  
  type StartTime = js.Date
  
  type Status = java.lang.String
  
  type StatusReason = java.lang.String
  
  type StepName = java.lang.String
  
  type Steps = js.Array[typingsSlinky.awsSdk.amplifyMod.Step]
  
  type SubDomainSettings = js.Array[typingsSlinky.awsSdk.amplifyMod.SubDomainSetting]
  
  type SubDomains = js.Array[typingsSlinky.awsSdk.amplifyMod.SubDomain]
  
  type TTL = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.amplifyMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.amplifyMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Target = java.lang.String
  
  type TestArtifactsUrl = java.lang.String
  
  type TestConfigUrl = java.lang.String
  
  type ThumbnailName = java.lang.String
  
  type ThumbnailUrl = java.lang.String
  
  type TotalNumberOfJobs = java.lang.String
  
  type UpdateTime = js.Date
  
  type UploadUrl = java.lang.String
  
  type Verified = scala.Boolean
  
  type WebhookArn = java.lang.String
  
  type WebhookId = java.lang.String
  
  type WebhookUrl = java.lang.String
  
  type Webhooks = js.Array[typingsSlinky.awsSdk.amplifyMod.Webhook]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.amplifyMod._apiVersion | java.lang.String
}
