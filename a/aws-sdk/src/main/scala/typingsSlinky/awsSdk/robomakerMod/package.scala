package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object robomakerMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.X86_64
    - typingsSlinky.awsSdk.awsSdkStrings.ARM64
    - typingsSlinky.awsSdk.awsSdkStrings.ARMHF
    - java.lang.String
  */
  type Architecture = typingsSlinky.awsSdk.robomakerMod._Architecture | java.lang.String
  type Arn = java.lang.String
  type Arns = js.Array[typingsSlinky.awsSdk.robomakerMod.Arn]
  type BatchTimeoutInSeconds = scala.Double
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.robomakerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Command = java.lang.String
  type CreateSimulationJobRequests = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationJobRequest]
  type CreatedAt = js.Date
  type DataSourceConfigs = js.Array[typingsSlinky.awsSdk.robomakerMod.DataSourceConfig]
  type DataSourceNames = js.Array[typingsSlinky.awsSdk.robomakerMod.Name]
  type DataSources = js.Array[typingsSlinky.awsSdk.robomakerMod.DataSource]
  type DeploymentApplicationConfigs = js.Array[typingsSlinky.awsSdk.robomakerMod.DeploymentApplicationConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.EnvironmentSetupError
    - typingsSlinky.awsSdk.awsSdkStrings.EtagMismatch
    - typingsSlinky.awsSdk.awsSdkStrings.FailureThresholdBreached
    - typingsSlinky.awsSdk.awsSdkStrings.RobotDeploymentAborted
    - typingsSlinky.awsSdk.awsSdkStrings.RobotDeploymentNoResponse
    - typingsSlinky.awsSdk.awsSdkStrings.RobotAgentConnectionTimeout
    - typingsSlinky.awsSdk.awsSdkStrings.GreengrassDeploymentFailed
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidGreengrassGroup
    - typingsSlinky.awsSdk.awsSdkStrings.MissingRobotArchitecture
    - typingsSlinky.awsSdk.awsSdkStrings.MissingRobotApplicationArchitecture
    - typingsSlinky.awsSdk.awsSdkStrings.MissingRobotDeploymentResource
    - typingsSlinky.awsSdk.awsSdkStrings.GreengrassGroupVersionDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaDeleted
    - typingsSlinky.awsSdk.awsSdkStrings.ExtractingBundleFailure
    - typingsSlinky.awsSdk.awsSdkStrings.PreLaunchFileFailure
    - typingsSlinky.awsSdk.awsSdkStrings.PostLaunchFileFailure
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionError
    - typingsSlinky.awsSdk.awsSdkStrings.DownloadConditionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type DeploymentJobErrorCode = typingsSlinky.awsSdk.robomakerMod._DeploymentJobErrorCode | java.lang.String
  type DeploymentJobs = js.Array[typingsSlinky.awsSdk.robomakerMod.DeploymentJob]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Preparing_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type DeploymentStatus = typingsSlinky.awsSdk.robomakerMod._DeploymentStatus | java.lang.String
  type DeploymentTimeout = scala.Double
  type DeploymentVersion = java.lang.String
  type EnvironmentVariableKey = java.lang.String
  type EnvironmentVariableMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.robomakerMod.EnvironmentVariableValue]
  type EnvironmentVariableValue = java.lang.String
  type FailedAt = js.Date
  type FailedCreateSimulationJobRequests = js.Array[typingsSlinky.awsSdk.robomakerMod.FailedCreateSimulationJobRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Fail_
    - typingsSlinky.awsSdk.awsSdkStrings.Continue_
    - java.lang.String
  */
  type FailureBehavior = typingsSlinky.awsSdk.robomakerMod._FailureBehavior | java.lang.String
  type FilterValues = js.Array[typingsSlinky.awsSdk.robomakerMod.Name]
  type Filters = js.Array[typingsSlinky.awsSdk.robomakerMod.Filter]
  type Fleets = js.Array[typingsSlinky.awsSdk.robomakerMod.Fleet]
  type GenericInteger = scala.Double
  type GenericString = java.lang.String
  type IamRole = java.lang.String
  type Id = java.lang.String
  type Integer = scala.Double
  type JobDuration = scala.Double
  type LastStartedAt = js.Date
  type LastUpdatedAt = js.Date
  type MaxConcurrency = scala.Double
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NonEmptyString = java.lang.String
  type NonSystemPort = scala.Double
  type PaginationToken = java.lang.String
  type Path = java.lang.String
  type PercentDone = scala.Double
  type Percentage = scala.Double
  type Port = scala.Double
  type PortMappingList = js.Array[typingsSlinky.awsSdk.robomakerMod.PortMapping]
  type RenderingEngineType = typingsSlinky.awsSdk.awsSdkStrings.OGRE | java.lang.String
  type RenderingEngineVersionType = java.lang.String
  type RevisionId = java.lang.String
  type RobotApplicationConfigs = js.Array[typingsSlinky.awsSdk.robomakerMod.RobotApplicationConfig]
  type RobotApplicationNames = js.Array[typingsSlinky.awsSdk.robomakerMod.Name]
  type RobotApplicationSummaries = js.Array[typingsSlinky.awsSdk.robomakerMod.RobotApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Validating_
    - typingsSlinky.awsSdk.awsSdkStrings.DownloadingExtracting
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutingDownloadCondition
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutingPreLaunch
    - typingsSlinky.awsSdk.awsSdkStrings.Launching_
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutingPostLaunch
    - typingsSlinky.awsSdk.awsSdkStrings.Finished_
    - java.lang.String
  */
  type RobotDeploymentStep = typingsSlinky.awsSdk.robomakerMod._RobotDeploymentStep | java.lang.String
  type RobotDeploymentSummary = js.Array[typingsSlinky.awsSdk.robomakerMod.RobotDeployment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROS
    - typingsSlinky.awsSdk.awsSdkStrings.ROS2
    - java.lang.String
  */
  type RobotSoftwareSuiteType = typingsSlinky.awsSdk.robomakerMod._RobotSoftwareSuiteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Kinetic
    - typingsSlinky.awsSdk.awsSdkStrings.Melodic
    - typingsSlinky.awsSdk.awsSdkStrings.Dashing
    - java.lang.String
  */
  type RobotSoftwareSuiteVersionType = typingsSlinky.awsSdk.robomakerMod._RobotSoftwareSuiteVersionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Available_
    - typingsSlinky.awsSdk.awsSdkStrings.Registered_
    - typingsSlinky.awsSdk.awsSdkStrings.PendingNewDeployment
    - typingsSlinky.awsSdk.awsSdkStrings.Deploying_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InSync_
    - typingsSlinky.awsSdk.awsSdkStrings.NoResponse
    - java.lang.String
  */
  type RobotStatus = typingsSlinky.awsSdk.robomakerMod._RobotStatus | java.lang.String
  type Robots = js.Array[typingsSlinky.awsSdk.robomakerMod.Robot]
  type S3Bucket = java.lang.String
  type S3Etag = java.lang.String
  type S3Key = java.lang.String
  type S3KeyOutputs = js.Array[typingsSlinky.awsSdk.robomakerMod.S3KeyOutput]
  type S3Keys = js.Array[typingsSlinky.awsSdk.robomakerMod.S3Key]
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.robomakerMod.NonEmptyString]
  type SimulationApplicationConfigs = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[typingsSlinky.awsSdk.robomakerMod.Name]
  type SimulationApplicationSummaries = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationApplicationSummary]
  type SimulationJobBatchErrorCode = typingsSlinky.awsSdk.awsSdkStrings.InternalServiceError | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Canceled_
    - typingsSlinky.awsSdk.awsSdkStrings.Canceling_
    - typingsSlinky.awsSdk.awsSdkStrings.Completing_
    - typingsSlinky.awsSdk.awsSdkStrings.TimingOut
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - java.lang.String
  */
  type SimulationJobBatchStatus = typingsSlinky.awsSdk.robomakerMod._SimulationJobBatchStatus | java.lang.String
  type SimulationJobBatchSummaries = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationJobBatchSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InternalServiceError
    - typingsSlinky.awsSdk.awsSdkStrings.RobotApplicationCrash
    - typingsSlinky.awsSdk.awsSdkStrings.SimulationApplicationCrash
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsRobotApplication
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsSimulationApplication
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsS3Object
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsS3Output
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsCloudwatchLogs
    - typingsSlinky.awsSdk.awsSdkStrings.SubnetIpLimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ENILimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.BadPermissionsUserCredentials
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidBundleRobotApplication
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidBundleSimulationApplication
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidS3Resource
    - typingsSlinky.awsSdk.awsSdkStrings.LimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.MismatchedEtag
    - typingsSlinky.awsSdk.awsSdkStrings.RobotApplicationVersionMismatchedEtag
    - typingsSlinky.awsSdk.awsSdkStrings.SimulationApplicationVersionMismatchedEtag
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.RequestThrottled
    - typingsSlinky.awsSdk.awsSdkStrings.BatchTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.BatchCanceled
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidInput
    - typingsSlinky.awsSdk.awsSdkStrings.WrongRegionS3Bucket
    - typingsSlinky.awsSdk.awsSdkStrings.WrongRegionS3Output
    - typingsSlinky.awsSdk.awsSdkStrings.WrongRegionRobotApplication
    - typingsSlinky.awsSdk.awsSdkStrings.WrongRegionSimulationApplication
    - java.lang.String
  */
  type SimulationJobErrorCode = typingsSlinky.awsSdk.robomakerMod._SimulationJobErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Preparing_
    - typingsSlinky.awsSdk.awsSdkStrings.Running_
    - typingsSlinky.awsSdk.awsSdkStrings.Restarting
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.RunningFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Terminating_
    - typingsSlinky.awsSdk.awsSdkStrings.Terminated_
    - typingsSlinky.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type SimulationJobStatus = typingsSlinky.awsSdk.robomakerMod._SimulationJobStatus | java.lang.String
  type SimulationJobSummaries = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationJobSummary]
  type SimulationJobs = js.Array[typingsSlinky.awsSdk.robomakerMod.SimulationJob]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Gazebo
    - typingsSlinky.awsSdk.awsSdkStrings.RosbagPlay
    - java.lang.String
  */
  type SimulationSoftwareSuiteType = typingsSlinky.awsSdk.robomakerMod._SimulationSoftwareSuiteType | java.lang.String
  type SimulationSoftwareSuiteVersionType = java.lang.String
  type SimulationTimeMillis = scala.Double
  type SimulationUnit = scala.Double
  type SourceConfigs = js.Array[typingsSlinky.awsSdk.robomakerMod.SourceConfig]
  type Sources = js.Array[typingsSlinky.awsSdk.robomakerMod.Source]
  type Subnets = js.Array[typingsSlinky.awsSdk.robomakerMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.robomakerMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.robomakerMod.TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  type VersionQualifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-06-29`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.robomakerMod._apiVersion | java.lang.String
}
