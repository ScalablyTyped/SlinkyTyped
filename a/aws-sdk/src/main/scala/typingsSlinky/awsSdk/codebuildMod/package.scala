package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codebuildMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_ID
    - java.lang.String
  */
  type ArtifactNamespace = typingsSlinky.awsSdk.codebuildMod._ArtifactNamespace | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ZIP
    - java.lang.String
  */
  type ArtifactPackaging = typingsSlinky.awsSdk.codebuildMod._ArtifactPackaging | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CODEPIPELINE
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.NO_ARTIFACTS
    - java.lang.String
  */
  type ArtifactsType = typingsSlinky.awsSdk.codebuildMod._ArtifactsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OAUTH
    - typingsSlinky.awsSdk.awsSdkStrings.BASIC_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
    - java.lang.String
  */
  type AuthType = typingsSlinky.awsSdk.codebuildMod._AuthType | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[typingsSlinky.awsSdk.codebuildMod.BuildArtifacts]
  type BuildIds = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.DOWNLOAD_SOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.INSTALL
    - typingsSlinky.awsSdk.awsSdkStrings.PRE_BUILD
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD
    - typingsSlinky.awsSdk.awsSdkStrings.POST_BUILD
    - typingsSlinky.awsSdk.awsSdkStrings.UPLOAD_ARTIFACTS
    - typingsSlinky.awsSdk.awsSdkStrings.FINALIZING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type BuildPhaseType = typingsSlinky.awsSdk.codebuildMod._BuildPhaseType | java.lang.String
  type BuildPhases = js.Array[typingsSlinky.awsSdk.codebuildMod.BuildPhase]
  type BuildReportArns = js.Array[typingsSlinky.awsSdk.codebuildMod.String]
  type Builds = js.Array[typingsSlinky.awsSdk.codebuildMod.Build]
  type BuildsNotDeleted = js.Array[typingsSlinky.awsSdk.codebuildMod.BuildNotDeleted]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL_DOCKER_LAYER_CACHE
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL_SOURCE_CACHE
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL_CUSTOM_CACHE
    - java.lang.String
  */
  type CacheMode = typingsSlinky.awsSdk.codebuildMod._CacheMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NO_CACHE
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL
    - java.lang.String
  */
  type CacheType = typingsSlinky.awsSdk.codebuildMod._CacheType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codebuildMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_2XLARGE
    - java.lang.String
  */
  type ComputeType = typingsSlinky.awsSdk.codebuildMod._ComputeType | java.lang.String
  type CredentialProviderType = typingsSlinky.awsSdk.awsSdkStrings.SECRETS_MANAGER | java.lang.String
  type EnvironmentImages = js.Array[typingsSlinky.awsSdk.codebuildMod.EnvironmentImage]
  type EnvironmentLanguages = js.Array[typingsSlinky.awsSdk.codebuildMod.EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[typingsSlinky.awsSdk.codebuildMod.EnvironmentPlatform]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS_CONTAINER
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX_CONTAINER
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX_GPU_CONTAINER
    - typingsSlinky.awsSdk.awsSdkStrings.ARM_CONTAINER
    - java.lang.String
  */
  type EnvironmentType = typingsSlinky.awsSdk.codebuildMod._EnvironmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT
    - typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_STORE
    - typingsSlinky.awsSdk.awsSdkStrings.SECRETS_MANAGER
    - java.lang.String
  */
  type EnvironmentVariableType = typingsSlinky.awsSdk.codebuildMod._EnvironmentVariableType | java.lang.String
  type EnvironmentVariables = js.Array[typingsSlinky.awsSdk.codebuildMod.EnvironmentVariable]
  type ExportedEnvironmentVariables = js.Array[typingsSlinky.awsSdk.codebuildMod.ExportedEnvironmentVariable]
  type FileSystemType = typingsSlinky.awsSdk.awsSdkStrings.EFS | java.lang.String
  type FilterGroup = js.Array[typingsSlinky.awsSdk.codebuildMod.WebhookFilter]
  type FilterGroups = js.Array[typingsSlinky.awsSdk.codebuildMod.FilterGroup]
  type GitCloneDepth = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CODEBUILD
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_ROLE
    - java.lang.String
  */
  type ImagePullCredentialsType = typingsSlinky.awsSdk.codebuildMod._ImagePullCredentialsType | java.lang.String
  type ImageVersions = js.Array[typingsSlinky.awsSdk.codebuildMod.String]
  type KeyInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JAVA
    - typingsSlinky.awsSdk.awsSdkStrings.PYTHON
    - typingsSlinky.awsSdk.awsSdkStrings.NODE_JS
    - typingsSlinky.awsSdk.awsSdkStrings.RUBY
    - typingsSlinky.awsSdk.awsSdkStrings.GOLANG
    - typingsSlinky.awsSdk.awsSdkStrings.DOCKER
    - typingsSlinky.awsSdk.awsSdkStrings.ANDROID
    - typingsSlinky.awsSdk.awsSdkStrings.DOTNET
    - typingsSlinky.awsSdk.awsSdkStrings.BASE
    - typingsSlinky.awsSdk.awsSdkStrings.PHP
    - java.lang.String
  */
  type LanguageType = typingsSlinky.awsSdk.codebuildMod._LanguageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogsConfigStatusType = typingsSlinky.awsSdk.codebuildMod._LogsConfigStatusType | java.lang.String
  type NonEmptyString = java.lang.String
  type PageSize = scala.Double
  type PhaseContexts = js.Array[typingsSlinky.awsSdk.codebuildMod.PhaseContext]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEBIAN
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.UBUNTU
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS_SERVER
    - java.lang.String
  */
  type PlatformType = typingsSlinky.awsSdk.codebuildMod._PlatformType | java.lang.String
  type ProjectArns = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  type ProjectArtifactsList = js.Array[typingsSlinky.awsSdk.codebuildMod.ProjectArtifacts]
  type ProjectCacheModes = js.Array[typingsSlinky.awsSdk.codebuildMod.CacheMode]
  type ProjectDescription = java.lang.String
  type ProjectFileSystemLocations = js.Array[typingsSlinky.awsSdk.codebuildMod.ProjectFileSystemLocation]
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[typingsSlinky.awsSdk.codebuildMod.ProjectSourceVersion]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ProjectSortByType = typingsSlinky.awsSdk.codebuildMod._ProjectSortByType | java.lang.String
  type ProjectSources = js.Array[typingsSlinky.awsSdk.codebuildMod.ProjectSource]
  type Projects = js.Array[typingsSlinky.awsSdk.codebuildMod.Project]
  type ReportArns = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.NO_EXPORT
    - java.lang.String
  */
  type ReportExportConfigType = typingsSlinky.awsSdk.codebuildMod._ReportExportConfigType | java.lang.String
  type ReportGroupArns = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  type ReportGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ReportGroupSortByType = typingsSlinky.awsSdk.codebuildMod._ReportGroupSortByType | java.lang.String
  type ReportGroups = js.Array[typingsSlinky.awsSdk.codebuildMod.ReportGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ZIP
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReportPackagingType = typingsSlinky.awsSdk.codebuildMod._ReportPackagingType | java.lang.String
  type ReportStatusCounts = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codebuildMod.WrapperInt]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GENERATING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.INCOMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ReportStatusType = typingsSlinky.awsSdk.codebuildMod._ReportStatusType | java.lang.String
  type ReportType = typingsSlinky.awsSdk.awsSdkStrings.TEST | java.lang.String
  type Reports = js.Array[typingsSlinky.awsSdk.codebuildMod.Report]
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB
    - typingsSlinky.awsSdk.awsSdkStrings.BITBUCKET
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
    - java.lang.String
  */
  type ServerType = typingsSlinky.awsSdk.codebuildMod._ServerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARN
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFIED_TIME
    - java.lang.String
  */
  type SharedResourceSortByType = typingsSlinky.awsSdk.codebuildMod._SharedResourceSortByType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrderType = typingsSlinky.awsSdk.codebuildMod._SortOrderType | java.lang.String
  type SourceAuthType = typingsSlinky.awsSdk.awsSdkStrings.OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[typingsSlinky.awsSdk.codebuildMod.SourceCredentialsInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CODECOMMIT
    - typingsSlinky.awsSdk.awsSdkStrings.CODEPIPELINE
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.BITBUCKET
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
    - typingsSlinky.awsSdk.awsSdkStrings.NO_SOURCE
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.codebuildMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FAULT
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StatusType = typingsSlinky.awsSdk.codebuildMod._StatusType | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[typingsSlinky.awsSdk.codebuildMod.NonEmptyString]
  type TagList = js.Array[typingsSlinky.awsSdk.codebuildMod.Tag]
  type TestCases = js.Array[typingsSlinky.awsSdk.codebuildMod.TestCase]
  type TimeOut = scala.Double
  type Timestamp = js.Date
  type ValueInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.BASE_REF
    - typingsSlinky.awsSdk.awsSdkStrings.HEAD_REF
    - typingsSlinky.awsSdk.awsSdkStrings.ACTOR_ACCOUNT_ID
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_PATH
    - java.lang.String
  */
  type WebhookFilterType = typingsSlinky.awsSdk.codebuildMod._WebhookFilterType | java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = scala.Double
  type WrapperLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-10-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codebuildMod._apiVersion | java.lang.String
}
