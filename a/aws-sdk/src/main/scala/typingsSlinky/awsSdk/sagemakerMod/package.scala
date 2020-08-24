package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sagemakerMod {
  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[typingsSlinky.awsSdk.sagemakerMod.CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = typingsSlinky.awsSdk.sagemakerMod._AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type AlgorithmStatus = typingsSlinky.awsSdk.sagemakerMod._AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[typingsSlinky.awsSdk.sagemakerMod.AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[typingsSlinky.awsSdk.sagemakerMod.AlgorithmValidationProfile]
  type AppArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.system__
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - java.lang.String
  */
  type AppInstanceType = typingsSlinky.awsSdk.sagemakerMod._AppInstanceType | java.lang.String
  type AppList = js.Array[typingsSlinky.awsSdk.sagemakerMod.AppDetails]
  type AppName = java.lang.String
  type AppSortKey = typingsSlinky.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type AppStatus = typingsSlinky.awsSdk.sagemakerMod._AppStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JupyterServer
    - typingsSlinky.awsSdk.awsSdkStrings.KernelGateway
    - typingsSlinky.awsSdk.awsSdkStrings.TensorBoard
    - java.lang.String
  */
  type AppType = typingsSlinky.awsSdk.sagemakerMod._AppType | java.lang.String
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Line_
    - java.lang.String
  */
  type AssemblyType = typingsSlinky.awsSdk.sagemakerMod._AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[typingsSlinky.awsSdk.sagemakerMod.AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSO
    - typingsSlinky.awsSdk.awsSdkStrings.IAM
    - java.lang.String
  */
  type AuthMode = typingsSlinky.awsSdk.sagemakerMod._AuthMode | java.lang.String
  type AutoMLCandidates = js.Array[typingsSlinky.awsSdk.sagemakerMod.AutoMLCandidate]
  type AutoMLContainerDefinitions = js.Array[typingsSlinky.awsSdk.sagemakerMod.AutoMLContainerDefinition]
  type AutoMLFailureReason = java.lang.String
  type AutoMLInputDataConfig = js.Array[typingsSlinky.awsSdk.sagemakerMod.AutoMLChannel]
  type AutoMLJobArn = java.lang.String
  type AutoMLJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Maximize
    - typingsSlinky.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type AutoMLJobObjectiveType = typingsSlinky.awsSdk.sagemakerMod._AutoMLJobObjectiveType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Starting_
    - typingsSlinky.awsSdk.awsSdkStrings.AnalyzingData
    - typingsSlinky.awsSdk.awsSdkStrings.FeatureEngineering
    - typingsSlinky.awsSdk.awsSdkStrings.ModelTuning
    - typingsSlinky.awsSdk.awsSdkStrings.MaxCandidatesReached
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.MaxAutoMLJobRuntimeReached
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.CandidateDefinitionsGenerated
    - java.lang.String
  */
  type AutoMLJobSecondaryStatus = typingsSlinky.awsSdk.sagemakerMod._AutoMLJobSecondaryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type AutoMLJobStatus = typingsSlinky.awsSdk.sagemakerMod._AutoMLJobStatus | java.lang.String
  type AutoMLJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobSummary]
  type AutoMLMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Accuracy
    - typingsSlinky.awsSdk.awsSdkStrings.MSE
    - typingsSlinky.awsSdk.awsSdkStrings.F1
    - typingsSlinky.awsSdk.awsSdkStrings.F1macro
    - java.lang.String
  */
  type AutoMLMetricEnum = typingsSlinky.awsSdk.sagemakerMod._AutoMLMetricEnum | java.lang.String
  type AutoMLNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ManifestFile
    - typingsSlinky.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type AutoMLS3DataType = typingsSlinky.awsSdk.sagemakerMod._AutoMLS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type AutoMLSortBy = typingsSlinky.awsSdk.sagemakerMod._AutoMLSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type AutoMLSortOrder = typingsSlinky.awsSdk.sagemakerMod._AutoMLSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSSlashRekognitionSlashDetectModerationLabelsSlashImageSlashV3
    - typingsSlinky.awsSdk.awsSdkStrings.AWSSlashTextractSlashAnalyzeDocumentSlashFormsSlashV1
    - java.lang.String
  */
  type AwsManagedHumanLoopRequestSource = typingsSlinky.awsSdk.sagemakerMod._AwsManagedHumanLoopRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MultiRecord
    - typingsSlinky.awsSdk.awsSdkStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = typingsSlinky.awsSdk.sagemakerMod._BatchStrategy | java.lang.String
  type BillableTimeInSeconds = scala.Double
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.And_
    - typingsSlinky.awsSdk.awsSdkStrings.Or_
    - java.lang.String
  */
  type BooleanOperator = typingsSlinky.awsSdk.sagemakerMod._BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CandidateDefinitionNotebookLocation = java.lang.String
  type CandidateName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type CandidateSortBy = typingsSlinky.awsSdk.sagemakerMod._CandidateSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type CandidateStatus = typingsSlinky.awsSdk.sagemakerMod._CandidateStatus | java.lang.String
  type CandidateStepArn = java.lang.String
  type CandidateStepName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTrainingJob
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTransformJob
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonProcessingJob
    - java.lang.String
  */
  type CandidateStepType = typingsSlinky.awsSdk.sagemakerMod._CandidateStepType | java.lang.String
  type CandidateSteps = js.Array[typingsSlinky.awsSdk.sagemakerMod.AutoMLCandidateStep]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Input_
    - typingsSlinky.awsSdk.awsSdkStrings.Output_
    - java.lang.String
  */
  type CaptureMode = typingsSlinky.awsSdk.sagemakerMod._CaptureMode | java.lang.String
  type CaptureOptionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.CaptureOption]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Started_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type CaptureStatus = typingsSlinky.awsSdk.sagemakerMod._CaptureStatus | java.lang.String
  type CategoricalParameterRanges = js.Array[typingsSlinky.awsSdk.sagemakerMod.CategoricalParameterRange]
  type Cents = scala.Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[typingsSlinky.awsSdk.sagemakerMod.ChannelSpecification]
  type Cidr = java.lang.String
  type Cidrs = js.Array[typingsSlinky.awsSdk.sagemakerMod.Cidr]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sagemakerMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientSecret = java.lang.String
  type CodeRepositoryArn = java.lang.String
  type CodeRepositoryContains = java.lang.String
  type CodeRepositoryNameContains = java.lang.String
  type CodeRepositoryNameOrUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type CodeRepositorySortBy = typingsSlinky.awsSdk.sagemakerMod._CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type CodeRepositorySortOrder = typingsSlinky.awsSdk.sagemakerMod._CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.CodeRepositorySummary]
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CollectionConfigurations = js.Array[typingsSlinky.awsSdk.sagemakerMod.CollectionConfiguration]
  type CollectionName = java.lang.String
  type CollectionParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ConfigValue]
  type CompilationJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type CompilationJobStatus = typingsSlinky.awsSdk.sagemakerMod._CompilationJobStatus | java.lang.String
  type CompilationJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.CompilationJobSummary]
  type CompilerOptions = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type CompressionType = typingsSlinky.awsSdk.sagemakerMod._CompressionType | java.lang.String
  type CompressionTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.CompressionType]
  type ConfigKey = java.lang.String
  type ConfigValue = java.lang.String
  type ContainerArgument = java.lang.String
  type ContainerArguments = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContainerArgument]
  type ContainerDefinitionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContainerDefinition]
  type ContainerEntrypoint = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContainerEntrypointString]
  type ContainerEntrypointString = java.lang.String
  type ContainerHostname = java.lang.String
  type ContainerImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SingleModel
    - typingsSlinky.awsSdk.awsSdkStrings.MultiModel
    - java.lang.String
  */
  type ContainerMode = typingsSlinky.awsSdk.sagemakerMod._ContainerMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsSlinky.awsSdk.sagemakerMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContentType]
  type ContinuousParameterRanges = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContinuousParameterRange]
  type CreationTime = js.Date
  type CsvContentType = java.lang.String
  type CsvContentTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.CsvContentType]
  type DataExplorationNotebookLocation = java.lang.String
  type DataInputConfig = java.lang.String
  type DebugRuleConfigurations = js.Array[typingsSlinky.awsSdk.sagemakerMod.DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses = js.Array[typingsSlinky.awsSdk.sagemakerMod.DebugRuleEvaluationStatus]
  type DeployedImages = js.Array[typingsSlinky.awsSdk.sagemakerMod.DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[typingsSlinky.awsSdk.sagemakerMod.DesiredWeightAndCapacity]
  type DestinationS3Uri = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedAlgorithmStatus = typingsSlinky.awsSdk.sagemakerMod._DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedModelPackageStatus = typingsSlinky.awsSdk.sagemakerMod._DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type DirectInternetAccess = typingsSlinky.awsSdk.sagemakerMod._DirectInternetAccess | java.lang.String
  type DirectoryPath = java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = scala.Double
  type DomainArn = java.lang.String
  type DomainId = java.lang.String
  type DomainList = js.Array[typingsSlinky.awsSdk.sagemakerMod.DomainDetails]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type DomainStatus = typingsSlinky.awsSdk.sagemakerMod._DomainStatus | java.lang.String
  type DoubleParameterValue = scala.Double
  type EfsUid = java.lang.String
  type EnableCapture = scala.Boolean
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = typingsSlinky.awsSdk.sagemakerMod._EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type EndpointSortKey = typingsSlinky.awsSdk.sagemakerMod._EndpointSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OutOfService
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Updating_
    - typingsSlinky.awsSdk.awsSdkStrings.SystemUpdating
    - typingsSlinky.awsSdk.awsSdkStrings.RollingBack
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type EndpointStatus = typingsSlinky.awsSdk.sagemakerMod._EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.EnvironmentValue]
  type EnvironmentValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.CompletedWithViolations
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ExecutionStatus = typingsSlinky.awsSdk.sagemakerMod._ExecutionStatus | java.lang.String
  type ExitMessage = java.lang.String
  type ExperimentArn = java.lang.String
  type ExperimentDescription = java.lang.String
  type ExperimentEntityName = java.lang.String
  type ExperimentSourceArn = java.lang.String
  type ExperimentSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.ExperimentSummary]
  type FailureReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.rw_
    - typingsSlinky.awsSdk.awsSdkStrings.ro_
    - java.lang.String
  */
  type FileSystemAccessMode = typingsSlinky.awsSdk.sagemakerMod._FileSystemAccessMode | java.lang.String
  type FileSystemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EFS
    - typingsSlinky.awsSdk.awsSdkStrings.FSxLustre
    - java.lang.String
  */
  type FileSystemType = typingsSlinky.awsSdk.sagemakerMod._FileSystemType | java.lang.String
  type FilterList = js.Array[typingsSlinky.awsSdk.sagemakerMod.Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[typingsSlinky.awsSdk.sagemakerMod.MetricData]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type FlowDefinitionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Initializing_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type FlowDefinitionStatus = typingsSlinky.awsSdk.sagemakerMod._FlowDefinitionStatus | java.lang.String
  type FlowDefinitionSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = scala.Double
  type FlowDefinitionTaskCount = scala.Double
  type FlowDefinitionTaskDescription = java.lang.String
  type FlowDefinitionTaskKeyword = java.lang.String
  type FlowDefinitionTaskKeywords = js.Array[typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds = scala.Double
  type FlowDefinitionTaskTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TENSORFLOW
    - typingsSlinky.awsSdk.awsSdkStrings.KERAS
    - typingsSlinky.awsSdk.awsSdkStrings.MXNET
    - typingsSlinky.awsSdk.awsSdkStrings.ONNX
    - typingsSlinky.awsSdk.awsSdkStrings.PYTORCH
    - typingsSlinky.awsSdk.awsSdkStrings.XGBOOST
    - typingsSlinky.awsSdk.awsSdkStrings.TFLITE
    - java.lang.String
  */
  type Framework = typingsSlinky.awsSdk.sagemakerMod._Framework | java.lang.String
  type GenerateCandidateDefinitionsOnly = scala.Boolean
  type GitConfigUrl = java.lang.String
  type Group = java.lang.String
  type Groups = js.Array[typingsSlinky.awsSdk.sagemakerMod.Group]
  type HookParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ConfigValue]
  type HumanLoopActivationConditions = java.lang.String
  type HumanTaskUiArn = java.lang.String
  type HumanTaskUiName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type HumanTaskUiStatus = typingsSlinky.awsSdk.sagemakerMod._HumanTaskUiStatus | java.lang.String
  type HumanTaskUiSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Auto_
    - typingsSlinky.awsSdk.awsSdkStrings.Linear_
    - typingsSlinky.awsSdk.awsSdkStrings.Logarithmic
    - typingsSlinky.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = typingsSlinky.awsSdk.sagemakerMod._HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[typingsSlinky.awsSdk.sagemakerMod.HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName = java.lang.String
  type HyperParameterTrainingJobDefinitions = js.Array[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTrainingJobDefinition]
  type HyperParameterTrainingJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Maximize
    - typingsSlinky.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type HyperParameterTuningJobObjectiveType = typingsSlinky.awsSdk.sagemakerMod._HyperParameterTuningJobObjectiveType | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobObjective]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = typingsSlinky.awsSdk.sagemakerMod._HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HyperParameterTuningJobStatus = typingsSlinky.awsSdk.sagemakerMod._HyperParameterTuningJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Bayesian
    - typingsSlinky.awsSdk.awsSdkStrings.Random
    - java.lang.String
  */
  type HyperParameterTuningJobStrategyType = typingsSlinky.awsSdk.sagemakerMod._HyperParameterTuningJobStrategyType | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IdenticalDataAndAlgorithm
    - typingsSlinky.awsSdk.awsSdkStrings.TransferLearning
    - java.lang.String
  */
  type HyperParameterTuningJobWarmStartType = typingsSlinky.awsSdk.sagemakerMod._HyperParameterTuningJobWarmStartType | java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ParameterValue]
  type ImageArn = java.lang.String
  type ImageDigest = java.lang.String
  type ImageUri = java.lang.String
  type InputDataConfig = js.Array[typingsSlinky.awsSdk.sagemakerMod.Channel]
  type InputModes = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrainingInputMode]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - java.lang.String
  */
  type InstanceType = typingsSlinky.awsSdk.sagemakerMod._InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[typingsSlinky.awsSdk.sagemakerMod.IntegerParameterRange]
  type InvocationsMaxRetries = scala.Double
  type InvocationsTimeoutInSeconds = scala.Double
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Input_
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type JoinSource = typingsSlinky.awsSdk.sagemakerMod._JoinSource | java.lang.String
  type JsonContentType = java.lang.String
  type JsonContentTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.JsonContentType]
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = scala.Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Initializing_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type LabelingJobStatus = typingsSlinky.awsSdk.sagemakerMod._LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type ListCompilationJobsSortBy = typingsSlinky.awsSdk.sagemakerMod._ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = typingsSlinky.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = scala.Double
  type ListTrialComponentKey256 = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrialComponentKey256]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkforcesSortByOptions = typingsSlinky.awsSdk.sagemakerMod._ListWorkforcesSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = typingsSlinky.awsSdk.sagemakerMod._ListWorkteamsSortByOptions | java.lang.String
  type MaxAutoMLJobRuntimeInSeconds = scala.Double
  type MaxCandidates = scala.Double
  type MaxConcurrentTaskCount = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxHumanLabeledObjectCount = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxPercentageOfInputDatasetLabeled = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MaxRuntimePerTrainingJobInSeconds = scala.Double
  type MaxWaitTimeInSeconds = scala.Double
  type MediaType = java.lang.String
  type MemberDefinitions = js.Array[typingsSlinky.awsSdk.sagemakerMod.MemberDefinition]
  type MetricDefinitionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ModelPackageContainerDefinition]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = typingsSlinky.awsSdk.sagemakerMod._ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ModelPackageStatus = typingsSlinky.awsSdk.sagemakerMod._ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[typingsSlinky.awsSdk.sagemakerMod.ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = typingsSlinky.awsSdk.sagemakerMod._ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ModelSummary]
  type MonitoringContainerArguments = js.Array[typingsSlinky.awsSdk.sagemakerMod.ContainerArgument]
  type MonitoringEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduledTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringExecutionSortKey = typingsSlinky.awsSdk.sagemakerMod._MonitoringExecutionSortKey | java.lang.String
  type MonitoringExecutionSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.MonitoringExecutionSummary]
  type MonitoringInputs = js.Array[typingsSlinky.awsSdk.sagemakerMod.MonitoringInput]
  type MonitoringMaxRuntimeInSeconds = scala.Double
  type MonitoringOutputs = js.Array[typingsSlinky.awsSdk.sagemakerMod.MonitoringOutput]
  type MonitoringS3Uri = java.lang.String
  type MonitoringScheduleArn = java.lang.String
  type MonitoringScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringScheduleSortKey = typingsSlinky.awsSdk.sagemakerMod._MonitoringScheduleSortKey | java.lang.String
  type MonitoringScheduleSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[typingsSlinky.awsSdk.sagemakerMod.NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type NotebookInstanceAcceleratorType = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceAcceleratorType | java.lang.String
  type NotebookInstanceAcceleratorTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = java.lang.String
  type NotebookInstanceLifecycleConfigArn = java.lang.String
  type NotebookInstanceLifecycleConfigContent = java.lang.String
  type NotebookInstanceLifecycleConfigList = js.Array[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = java.lang.String
  type NotebookInstanceLifecycleConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type NotebookInstanceSortKey = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceSortOrder = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Updating_
    - java.lang.String
  */
  type NotebookInstanceStatus = typingsSlinky.awsSdk.sagemakerMod._NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Allowed_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type NotebookOutputOption = typingsSlinky.awsSdk.sagemakerMod._NotebookOutputOption | java.lang.String
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ObjectiveStatus = typingsSlinky.awsSdk.sagemakerMod._ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = scala.Double
  type OidcEndpoint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equals_
    - typingsSlinky.awsSdk.awsSdkStrings.NotEquals
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.Contains_
    - typingsSlinky.awsSdk.awsSdkStrings.Exists
    - typingsSlinky.awsSdk.awsSdkStrings.NotExists
    - typingsSlinky.awsSdk.awsSdkStrings.In_
    - java.lang.String
  */
  type Operator = typingsSlinky.awsSdk.sagemakerMod._Operator | java.lang.String
  type OptionalDouble = scala.Double
  type OptionalInteger = scala.Double
  type OptionalVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type OrderKey = typingsSlinky.awsSdk.sagemakerMod._OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Integer_
    - typingsSlinky.awsSdk.awsSdkStrings.Continuous_
    - typingsSlinky.awsSdk.awsSdkStrings.Categorical
    - typingsSlinky.awsSdk.awsSdkStrings.FreeText
    - java.lang.String
  */
  type ParameterType = typingsSlinky.awsSdk.sagemakerMod._ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[typingsSlinky.awsSdk.sagemakerMod.ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[typingsSlinky.awsSdk.sagemakerMod.ParentHyperParameterTuningJob]
  type Parents = js.Array[typingsSlinky.awsSdk.sagemakerMod.Parent]
  type PresignedDomainUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BinaryClassification
    - typingsSlinky.awsSdk.awsSdkStrings.MulticlassClassification
    - typingsSlinky.awsSdk.awsSdkStrings.Regression_
    - java.lang.String
  */
  type ProblemType = typingsSlinky.awsSdk.sagemakerMod._ProblemType | java.lang.String
  type ProcessingEnvironmentKey = java.lang.String
  type ProcessingEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue = java.lang.String
  type ProcessingInputs = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProcessingInput]
  type ProcessingInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
    - java.lang.String
  */
  type ProcessingInstanceType = typingsSlinky.awsSdk.sagemakerMod._ProcessingInstanceType | java.lang.String
  type ProcessingJobArn = java.lang.String
  type ProcessingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ProcessingJobStatus = typingsSlinky.awsSdk.sagemakerMod._ProcessingJobStatus | java.lang.String
  type ProcessingJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProcessingJobSummary]
  type ProcessingLocalPath = java.lang.String
  type ProcessingMaxRuntimeInSeconds = scala.Double
  type ProcessingOutputs = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProcessingOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type ProcessingS3CompressionType = typingsSlinky.awsSdk.sagemakerMod._ProcessingS3CompressionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated
    - typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type ProcessingS3DataDistributionType = typingsSlinky.awsSdk.sagemakerMod._ProcessingS3DataDistributionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ManifestFile
    - typingsSlinky.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type ProcessingS3DataType = typingsSlinky.awsSdk.sagemakerMod._ProcessingS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pipe
    - typingsSlinky.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type ProcessingS3InputMode = typingsSlinky.awsSdk.sagemakerMod._ProcessingS3InputMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Continuous_
    - typingsSlinky.awsSdk.awsSdkStrings.EndOfJob
    - java.lang.String
  */
  type ProcessingS3UploadMode = typingsSlinky.awsSdk.sagemakerMod._ProcessingS3UploadMode | java.lang.String
  type ProcessingVolumeSizeInGB = scala.Double
  type ProductId = java.lang.String
  type ProductListings = js.Array[typingsSlinky.awsSdk.sagemakerMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = typingsSlinky.awsSdk.sagemakerMod._ProductionVariantAcceleratorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5dDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotr5dDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotinf1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotinf1Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotinf1Dot6xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotinf1Dot24xlarge
    - java.lang.String
  */
  type ProductionVariantInstanceType = typingsSlinky.awsSdk.sagemakerMod._ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProductionVariant]
  type ProductionVariantSummaryList = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = typingsSlinky.awsSdk.sagemakerMod._RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[typingsSlinky.awsSdk.sagemakerMod.RenderingError]
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePropertyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TrainingJob
    - typingsSlinky.awsSdk.awsSdkStrings.Experiment
    - typingsSlinky.awsSdk.awsSdkStrings.ExperimentTrial
    - typingsSlinky.awsSdk.awsSdkStrings.ExperimentTrialComponent
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.sagemakerMod._ResourceType | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.ResponseMIMEType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Retain_
    - typingsSlinky.awsSdk.awsSdkStrings.Delete_
    - java.lang.String
  */
  type RetentionType = typingsSlinky.awsSdk.sagemakerMod._RetentionType | java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type RootAccess = typingsSlinky.awsSdk.sagemakerMod._RootAccess | java.lang.String
  type RuleConfigurationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.NoIssuesFound
    - typingsSlinky.awsSdk.awsSdkStrings.IssuesFound
    - typingsSlinky.awsSdk.awsSdkStrings.Error_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type RuleEvaluationStatus = typingsSlinky.awsSdk.sagemakerMod._RuleEvaluationStatus | java.lang.String
  type RuleParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.ConfigValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated
    - typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type S3DataDistribution = typingsSlinky.awsSdk.sagemakerMod._S3DataDistribution | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ManifestFile
    - typingsSlinky.awsSdk.awsSdkStrings.S3Prefix
    - typingsSlinky.awsSdk.awsSdkStrings.AugmentedManifestFile
    - java.lang.String
  */
  type S3DataType = typingsSlinky.awsSdk.sagemakerMod._S3DataType | java.lang.String
  type S3Uri = java.lang.String
  type SamplingPercentage = scala.Double
  type ScheduleExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Scheduled_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ScheduleStatus = typingsSlinky.awsSdk.sagemakerMod._ScheduleStatus | java.lang.String
  type SearchExpressionList = js.Array[typingsSlinky.awsSdk.sagemakerMod.SearchExpression]
  type SearchResultsList = js.Array[typingsSlinky.awsSdk.sagemakerMod.SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SearchSortOrder = typingsSlinky.awsSdk.sagemakerMod._SearchSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Starting_
    - typingsSlinky.awsSdk.awsSdkStrings.LaunchingMLInstances
    - typingsSlinky.awsSdk.awsSdkStrings.PreparingTrainingStack
    - typingsSlinky.awsSdk.awsSdkStrings.Downloading_
    - typingsSlinky.awsSdk.awsSdkStrings.DownloadingTrainingImage
    - typingsSlinky.awsSdk.awsSdkStrings.Training_
    - typingsSlinky.awsSdk.awsSdkStrings.Uploading_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.MaxRuntimeExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Interrupted_
    - typingsSlinky.awsSdk.awsSdkStrings.MaxWaitTimeExceeded
    - java.lang.String
  */
  type SecondaryStatus = typingsSlinky.awsSdk.sagemakerMod._SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[typingsSlinky.awsSdk.sagemakerMod.SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.sagemakerMod.SecurityGroupId]
  type Seed = scala.Double
  type SessionExpirationDurationInSeconds = scala.Double
  type SingleSignOnUserIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type SortBy = typingsSlinky.awsSdk.sagemakerMod._SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortExperimentsBy = typingsSlinky.awsSdk.sagemakerMod._SortExperimentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ascending_
    - typingsSlinky.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.sagemakerMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialComponentsBy = typingsSlinky.awsSdk.sagemakerMod._SortTrialComponentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialsBy = typingsSlinky.awsSdk.sagemakerMod._SortTrialsBy | java.lang.String
  type SourceAlgorithmList = js.Array[typingsSlinky.awsSdk.sagemakerMod.SourceAlgorithm]
  type SourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Line_
    - typingsSlinky.awsSdk.awsSdkStrings.RecordIO
    - typingsSlinky.awsSdk.awsSdkStrings.TFRecord
    - java.lang.String
  */
  type SplitType = typingsSlinky.awsSdk.sagemakerMod._SplitType | java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String1024 = java.lang.String
  type String200 = java.lang.String
  type String256 = java.lang.String
  type StringParameterValue = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[typingsSlinky.awsSdk.sagemakerMod.SubnetId]
  type SubscribedWorkteams = js.Array[typingsSlinky.awsSdk.sagemakerMod.SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.sagemakerMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.sagemakerMod.Tag]
  type TagValue = java.lang.String
  type TargetAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.lambda__
    - typingsSlinky.awsSdk.awsSdkStrings.ml_m4
    - typingsSlinky.awsSdk.awsSdkStrings.ml_m5
    - typingsSlinky.awsSdk.awsSdkStrings.ml_c4
    - typingsSlinky.awsSdk.awsSdkStrings.ml_c5
    - typingsSlinky.awsSdk.awsSdkStrings.ml_p2
    - typingsSlinky.awsSdk.awsSdkStrings.ml_p3
    - typingsSlinky.awsSdk.awsSdkStrings.ml_g4dn
    - typingsSlinky.awsSdk.awsSdkStrings.ml_inf1
    - typingsSlinky.awsSdk.awsSdkStrings.jetson_tx1
    - typingsSlinky.awsSdk.awsSdkStrings.jetson_tx2
    - typingsSlinky.awsSdk.awsSdkStrings.jetson_nano
    - typingsSlinky.awsSdk.awsSdkStrings.jetson_xavier
    - typingsSlinky.awsSdk.awsSdkStrings.rasp3b
    - typingsSlinky.awsSdk.awsSdkStrings.imx8qm
    - typingsSlinky.awsSdk.awsSdkStrings.deeplens
    - typingsSlinky.awsSdk.awsSdkStrings.rk3399
    - typingsSlinky.awsSdk.awsSdkStrings.rk3288
    - typingsSlinky.awsSdk.awsSdkStrings.aisage
    - typingsSlinky.awsSdk.awsSdkStrings.sbe_c
    - typingsSlinky.awsSdk.awsSdkStrings.qcs605
    - typingsSlinky.awsSdk.awsSdkStrings.qcs603
    - typingsSlinky.awsSdk.awsSdkStrings.sitara_am57x
    - typingsSlinky.awsSdk.awsSdkStrings.amba_cv22
    - typingsSlinky.awsSdk.awsSdkStrings.x86_win32
    - typingsSlinky.awsSdk.awsSdkStrings.x86_win64
    - java.lang.String
  */
  type TargetDevice = typingsSlinky.awsSdk.sagemakerMod._TargetDevice | java.lang.String
  type TargetObjectiveMetricValue = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTEL_GRAPHICS
    - typingsSlinky.awsSdk.awsSdkStrings.MALI
    - typingsSlinky.awsSdk.awsSdkStrings.NVIDIA
    - java.lang.String
  */
  type TargetPlatformAccelerator = typingsSlinky.awsSdk.sagemakerMod._TargetPlatformAccelerator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.X86_64
    - typingsSlinky.awsSdk.awsSdkStrings.X86
    - typingsSlinky.awsSdk.awsSdkStrings.ARM64
    - typingsSlinky.awsSdk.awsSdkStrings.ARM_EABI
    - typingsSlinky.awsSdk.awsSdkStrings.ARM_EABIHF
    - java.lang.String
  */
  type TargetPlatformArch = typingsSlinky.awsSdk.sagemakerMod._TargetPlatformArch | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ANDROID
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX
    - java.lang.String
  */
  type TargetPlatformOs = typingsSlinky.awsSdk.sagemakerMod._TargetPlatformOs | java.lang.String
  type TaskAvailabilityLifetimeInSeconds = scala.Double
  type TaskCount = scala.Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[typingsSlinky.awsSdk.sagemakerMod.TaskKeyword]
  type TaskTimeLimitInSeconds = scala.Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateContentSha256 = java.lang.String
  type TemplateUrl = java.lang.String
  type TenthFractionsOfACent = scala.Double
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pipe
    - typingsSlinky.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type TrainingInputMode = typingsSlinky.awsSdk.sagemakerMod._TrainingInputMode | java.lang.String
  type TrainingInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5nDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5nDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5nDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5nDot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5nDot18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = typingsSlinky.awsSdk.sagemakerMod._TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Off_
    - typingsSlinky.awsSdk.awsSdkStrings.Auto_
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = typingsSlinky.awsSdk.sagemakerMod._TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = typingsSlinky.awsSdk.sagemakerMod._TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TrainingJobStatus = typingsSlinky.awsSdk.sagemakerMod._TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrainingJobSummary]
  type TrainingTimeInSeconds = scala.Double
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - java.lang.String
  */
  type TransformInstanceType = typingsSlinky.awsSdk.sagemakerMod._TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[typingsSlinky.awsSdk.sagemakerMod.TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TransformJobStatus = typingsSlinky.awsSdk.sagemakerMod._TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TransformJobSummary]
  type TrialArn = java.lang.String
  type TrialComponentArn = java.lang.String
  type TrialComponentArtifactValue = java.lang.String
  type TrialComponentArtifacts = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.TrialComponentArtifact]
  type TrialComponentKey256 = java.lang.String
  type TrialComponentKey64 = java.lang.String
  type TrialComponentMetricSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrialComponentMetricSummary]
  type TrialComponentParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sagemakerMod.TrialComponentParameterValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TrialComponentPrimaryStatus = typingsSlinky.awsSdk.sagemakerMod._TrialComponentPrimaryStatus | java.lang.String
  type TrialComponentSimpleSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrialComponentSimpleSummary]
  type TrialComponentSourceArn = java.lang.String
  type TrialComponentStatusMessage = java.lang.String
  type TrialComponentSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrialComponentSummary]
  type TrialSourceArn = java.lang.String
  type TrialSummaries = js.Array[typingsSlinky.awsSdk.sagemakerMod.TrialSummary]
  type Url = java.lang.String
  type UserProfileArn = java.lang.String
  type UserProfileList = js.Array[typingsSlinky.awsSdk.sagemakerMod.UserProfileDetails]
  type UserProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreationTime
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type UserProfileSortKey = typingsSlinky.awsSdk.sagemakerMod._UserProfileSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InService
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type UserProfileStatus = typingsSlinky.awsSdk.sagemakerMod._UserProfileStatus | java.lang.String
  type VariantName = java.lang.String
  type VariantPropertyList = js.Array[typingsSlinky.awsSdk.sagemakerMod.VariantProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DesiredInstanceCount
    - typingsSlinky.awsSdk.awsSdkStrings.DesiredWeight
    - typingsSlinky.awsSdk.awsSdkStrings.DataCaptureConfig
    - java.lang.String
  */
  type VariantPropertyType = typingsSlinky.awsSdk.sagemakerMod._VariantPropertyType | java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcId = java.lang.String
  type VpcSecurityGroupIds = js.Array[typingsSlinky.awsSdk.sagemakerMod.SecurityGroupId]
  type WorkforceArn = java.lang.String
  type WorkforceName = java.lang.String
  type Workforces = js.Array[typingsSlinky.awsSdk.sagemakerMod.Workforce]
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[typingsSlinky.awsSdk.sagemakerMod.Workteam]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sagemakerMod._apiVersion | java.lang.String
}
