package typingsSlinky.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.accessanalyzerMod.ClientConfiguration
import typingsSlinky.awsSdk.awsSdkStrings.latest_
import typingsSlinky.awsSdk.awsSdkStrings.legacy_
import typingsSlinky.awsSdk.awsSdkStrings.regional_
import typingsSlinky.awsSdk.awsSdkStrings.v2_
import typingsSlinky.awsSdk.awsSdkStrings.v3
import typingsSlinky.awsSdk.awsSdkStrings.v4
import typingsSlinky.awsSdk.configMod.HTTPOptions
import typingsSlinky.awsSdk.configMod.Logger
import typingsSlinky.awsSdk.configMod.ParamValidation
import typingsSlinky.awsSdk.configMod.RetryDelayOptions
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typingsSlinky.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
@js.native
trait ConfigurationOptionsConfi
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.native
  
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
  
  var acm: js.UndefOr[typingsSlinky.awsSdk.acmMod.ClientConfiguration] = js.native
  
  var acmpca: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.ClientConfiguration] = js.native
  
  var alexaforbusiness: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.native
  
  var amplify: js.UndefOr[typingsSlinky.awsSdk.amplifyMod.ClientConfiguration] = js.native
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.native
  
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.native
  
  var apigateway: js.UndefOr[typingsSlinky.awsSdk.apigatewayMod.ClientConfiguration] = js.native
  
  var apigatewaymanagementapi: js.UndefOr[typingsSlinky.awsSdk.apigatewaymanagementapiMod.ClientConfiguration] = js.native
  
  var apigatewayv2: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ClientConfiguration] = js.native
  
  var appconfig: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.ClientConfiguration] = js.native
  
  var applicationautoscaling: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.native
  
  var applicationinsights: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ClientConfiguration] = js.native
  
  var appmesh: js.UndefOr[typingsSlinky.awsSdk.appmeshMod.ClientConfiguration] = js.native
  
  var appstream: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ClientConfiguration] = js.native
  
  var appsync: js.UndefOr[typingsSlinky.awsSdk.appsyncMod.ClientConfiguration] = js.native
  
  var athena: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ClientConfiguration] = js.native
  
  var augmentedairuntime: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.native
  
  var autoscaling: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.ClientConfiguration] = js.native
  
  var autoscalingplans: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ClientConfiguration] = js.native
  
  var backup: js.UndefOr[typingsSlinky.awsSdk.backupMod.ClientConfiguration] = js.native
  
  var batch: js.UndefOr[typingsSlinky.awsSdk.batchMod.ClientConfiguration] = js.native
  
  var budgets: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.ClientConfiguration] = js.native
  
  var chime: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ClientConfiguration] = js.native
  
  var cloud9: js.UndefOr[typingsSlinky.awsSdk.cloud9Mod.ClientConfiguration] = js.native
  
  var clouddirectory: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ClientConfiguration] = js.native
  
  var cloudformation: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ClientConfiguration] = js.native
  
  var cloudfront: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.ClientConfiguration] = js.native
  
  var cloudhsm: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientConfiguration] = js.native
  
  var cloudhsmv2: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.ClientConfiguration] = js.native
  
  var cloudsearch: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.ClientConfiguration] = js.native
  
  var cloudsearchdomain: js.UndefOr[typingsSlinky.awsSdk.cloudsearchdomainMod.ClientConfiguration] = js.native
  
  var cloudtrail: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.ClientConfiguration] = js.native
  
  var cloudwatch: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ClientConfiguration] = js.native
  
  var cloudwatchevents: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ClientConfiguration] = js.native
  
  var cloudwatchlogs: js.UndefOr[typingsSlinky.awsSdk.cloudwatchlogsMod.ClientConfiguration] = js.native
  
  var codeartifact: js.UndefOr[typingsSlinky.awsSdk.codeartifactMod.ClientConfiguration] = js.native
  
  var codebuild: js.UndefOr[typingsSlinky.awsSdk.codebuildMod.ClientConfiguration] = js.native
  
  var codecommit: js.UndefOr[typingsSlinky.awsSdk.codecommitMod.ClientConfiguration] = js.native
  
  var codedeploy: js.UndefOr[typingsSlinky.awsSdk.codedeployMod.ClientConfiguration] = js.native
  
  var codeguruprofiler: js.UndefOr[typingsSlinky.awsSdk.codeguruprofilerMod.ClientConfiguration] = js.native
  
  var codegurureviewer: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ClientConfiguration] = js.native
  
  var codepipeline: js.UndefOr[typingsSlinky.awsSdk.codepipelineMod.ClientConfiguration] = js.native
  
  var codestar: js.UndefOr[typingsSlinky.awsSdk.codestarMod.ClientConfiguration] = js.native
  
  var codestarconnections: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ClientConfiguration] = js.native
  
  var codestarnotifications: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ClientConfiguration] = js.native
  
  var cognitoidentity: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.ClientConfiguration] = js.native
  
  var cognitoidentityserviceprovider: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration] = js.native
  
  var cognitosync: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.ClientConfiguration] = js.native
  
  var comprehend: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.ClientConfiguration] = js.native
  
  var comprehendmedical: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.ClientConfiguration] = js.native
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.native
  
  var computeoptimizer: js.UndefOr[typingsSlinky.awsSdk.computeoptimizerMod.ClientConfiguration] = js.native
  
  var configservice: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ClientConfiguration] = js.native
  
  var connect: js.UndefOr[typingsSlinky.awsSdk.connectMod.ClientConfiguration] = js.native
  
  var connectparticipant: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ClientConfiguration] = js.native
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.native
  
  var costexplorer: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ClientConfiguration] = js.native
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.native
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.native
  
  var cur: js.UndefOr[typingsSlinky.awsSdk.curMod.ClientConfiguration] = js.native
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.native
  
  var dataexchange: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.ClientConfiguration] = js.native
  
  var datapipeline: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.ClientConfiguration] = js.native
  
  var datasync: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.ClientConfiguration] = js.native
  
  var dax: js.UndefOr[typingsSlinky.awsSdk.daxMod.ClientConfiguration] = js.native
  
  var detective: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.ClientConfiguration] = js.native
  
  var devicefarm: js.UndefOr[typingsSlinky.awsSdk.devicefarmMod.ClientConfiguration] = js.native
  
  var directconnect: js.UndefOr[typingsSlinky.awsSdk.directconnectMod.ClientConfiguration] = js.native
  
  var directoryservice: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ClientConfiguration] = js.native
  
  var discovery: js.UndefOr[typingsSlinky.awsSdk.discoveryMod.ClientConfiguration] = js.native
  
  var dlm: js.UndefOr[typingsSlinky.awsSdk.dlmMod.ClientConfiguration] = js.native
  
  var dms: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ClientConfiguration] = js.native
  
  var docdb: js.UndefOr[typingsSlinky.awsSdk.docdbMod.ClientConfiguration] = js.native
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
  
  var dynamodb: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration] = js.native
  
  var dynamodbstreams: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.ClientConfiguration] = js.native
  
  var ebs: js.UndefOr[typingsSlinky.awsSdk.ebsMod.ClientConfiguration] = js.native
  
  var ec2: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ClientConfiguration] = js.native
  
  var ec2instanceconnect: js.UndefOr[typingsSlinky.awsSdk.ec2instanceconnectMod.ClientConfiguration] = js.native
  
  var ecr: js.UndefOr[typingsSlinky.awsSdk.ecrMod.ClientConfiguration] = js.native
  
  var ecs: js.UndefOr[typingsSlinky.awsSdk.ecsMod.ClientConfiguration] = js.native
  
  var efs: js.UndefOr[typingsSlinky.awsSdk.efsMod.ClientConfiguration] = js.native
  
  var eks: js.UndefOr[typingsSlinky.awsSdk.eksMod.ClientConfiguration] = js.native
  
  var elasticache: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ClientConfiguration] = js.native
  
  var elasticbeanstalk: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ClientConfiguration] = js.native
  
  var elasticinference: js.UndefOr[typingsSlinky.awsSdk.elasticinferenceMod.ClientConfiguration] = js.native
  
  var elastictranscoder: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.ClientConfiguration] = js.native
  
  var elb: js.UndefOr[typingsSlinky.awsSdk.elbMod.ClientConfiguration] = js.native
  
  var elbv2: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.ClientConfiguration] = js.native
  
  var emr: js.UndefOr[typingsSlinky.awsSdk.emrMod.ClientConfiguration] = js.native
  
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  
  var es: js.UndefOr[typingsSlinky.awsSdk.esMod.ClientConfiguration] = js.native
  
  var eventbridge: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.ClientConfiguration] = js.native
  
  var firehose: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ClientConfiguration] = js.native
  
  var fms: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ClientConfiguration] = js.native
  
  var forecastqueryservice: js.UndefOr[typingsSlinky.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.native
  
  var forecastservice: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ClientConfiguration] = js.native
  
  var frauddetector: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.ClientConfiguration] = js.native
  
  var fsx: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ClientConfiguration] = js.native
  
  var gamelift: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ClientConfiguration] = js.native
  
  var glacier: js.UndefOr[typingsSlinky.awsSdk.glacierMod.ClientConfiguration] = js.native
  
  var globalaccelerator: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ClientConfiguration] = js.native
  
  var glue: js.UndefOr[typingsSlinky.awsSdk.glueMod.ClientConfiguration] = js.native
  
  var greengrass: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.ClientConfiguration] = js.native
  
  var groundstation: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.ClientConfiguration] = js.native
  
  var guardduty: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ClientConfiguration] = js.native
  
  var health: js.UndefOr[typingsSlinky.awsSdk.healthMod.ClientConfiguration] = js.native
  
  var honeycode: js.UndefOr[typingsSlinky.awsSdk.honeycodeMod.ClientConfiguration] = js.native
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  
  var iam: js.UndefOr[typingsSlinky.awsSdk.iamMod.ClientConfiguration] = js.native
  
  var imagebuilder: js.UndefOr[typingsSlinky.awsSdk.imagebuilderMod.ClientConfiguration] = js.native
  
  var importexport: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ClientConfiguration] = js.native
  
  var inspector: js.UndefOr[typingsSlinky.awsSdk.inspectorMod.ClientConfiguration] = js.native
  
  var iot: js.UndefOr[typingsSlinky.awsSdk.iotMod.ClientConfiguration] = js.native
  
  var iot1clickdevicesservice: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.native
  
  var iot1clickprojects: js.UndefOr[typingsSlinky.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.native
  
  var iotanalytics: js.UndefOr[typingsSlinky.awsSdk.iotanalyticsMod.ClientConfiguration] = js.native
  
  var iotdata: js.UndefOr[typingsSlinky.awsSdk.iotdataMod.ClientConfiguration] = js.native
  
  var iotevents: js.UndefOr[typingsSlinky.awsSdk.ioteventsMod.ClientConfiguration] = js.native
  
  var ioteventsdata: js.UndefOr[typingsSlinky.awsSdk.ioteventsdataMod.ClientConfiguration] = js.native
  
  var iotjobsdataplane: js.UndefOr[typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.native
  
  var iotsecuretunneling: js.UndefOr[typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.native
  
  var iotsitewise: js.UndefOr[typingsSlinky.awsSdk.iotsitewiseMod.ClientConfiguration] = js.native
  
  var iotthingsgraph: js.UndefOr[typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.native
  
  var ivs: js.UndefOr[typingsSlinky.awsSdk.ivsMod.ClientConfiguration] = js.native
  
  var kafka: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClientConfiguration] = js.native
  
  var kendra: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ClientConfiguration] = js.native
  
  var kinesis: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ClientConfiguration] = js.native
  
  var kinesisanalytics: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ClientConfiguration] = js.native
  
  var kinesisanalyticsv2: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration] = js.native
  
  var kinesisvideo: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ClientConfiguration] = js.native
  
  var kinesisvideoarchivedmedia: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
  
  var kinesisvideomedia: js.UndefOr[typingsSlinky.awsSdk.kinesisvideomediaMod.ClientConfiguration] = js.native
  
  var kinesisvideosignalingchannels: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration] = js.native
  
  var kms: js.UndefOr[typingsSlinky.awsSdk.kmsMod.ClientConfiguration] = js.native
  
  var lakeformation: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ClientConfiguration] = js.native
  
  var lambda: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.ClientConfiguration] = js.native
  
  var lexmodelbuildingservice: js.UndefOr[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration] = js.native
  
  var lexruntime: js.UndefOr[typingsSlinky.awsSdk.lexruntimeMod.ClientConfiguration] = js.native
  
  var licensemanager: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ClientConfiguration] = js.native
  
  var lightsail: js.UndefOr[typingsSlinky.awsSdk.lightsailMod.ClientConfiguration] = js.native
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.native
  
  var machinelearning: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.ClientConfiguration] = js.native
  
  var macie: js.UndefOr[typingsSlinky.awsSdk.macieMod.ClientConfiguration] = js.native
  
  var macie2: js.UndefOr[typingsSlinky.awsSdk.macie2Mod.ClientConfiguration] = js.native
  
  var managedblockchain: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.ClientConfiguration] = js.native
  
  var marketplacecatalog: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ClientConfiguration] = js.native
  
  var marketplacecommerceanalytics: js.UndefOr[typingsSlinky.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration] = js.native
  
  var marketplaceentitlementservice: js.UndefOr[typingsSlinky.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration] = js.native
  
  var marketplacemetering: js.UndefOr[typingsSlinky.awsSdk.marketplacemeteringMod.ClientConfiguration] = js.native
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  var mediaconnect: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.ClientConfiguration] = js.native
  
  var mediaconvert: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ClientConfiguration] = js.native
  
  var medialive: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ClientConfiguration] = js.native
  
  var mediapackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.ClientConfiguration] = js.native
  
  var mediapackagevod: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.ClientConfiguration] = js.native
  
  var mediastore: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.ClientConfiguration] = js.native
  
  var mediastoredata: js.UndefOr[typingsSlinky.awsSdk.mediastoredataMod.ClientConfiguration] = js.native
  
  var mediatailor: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.ClientConfiguration] = js.native
  
  var migrationhub: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ClientConfiguration] = js.native
  
  var migrationhubconfig: js.UndefOr[typingsSlinky.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.native
  
  var mobile: js.UndefOr[typingsSlinky.awsSdk.mobileMod.ClientConfiguration] = js.native
  
  var mobileanalytics: js.UndefOr[typingsSlinky.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.native
  
  var mq: js.UndefOr[typingsSlinky.awsSdk.mqMod.ClientConfiguration] = js.native
  
  var mturk: js.UndefOr[typingsSlinky.awsSdk.mturkMod.ClientConfiguration] = js.native
  
  var neptune: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.ClientConfiguration] = js.native
  
  var networkmanager: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.ClientConfiguration] = js.native
  
  var opsworks: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ClientConfiguration] = js.native
  
  var opsworkscm: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ClientConfiguration] = js.native
  
  var organizations: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ClientConfiguration] = js.native
  
  var outposts: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.ClientConfiguration] = js.native
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
  
  var personalize: js.UndefOr[typingsSlinky.awsSdk.personalizeMod.ClientConfiguration] = js.native
  
  var personalizeevents: js.UndefOr[typingsSlinky.awsSdk.personalizeeventsMod.ClientConfiguration] = js.native
  
  var personalizeruntime: js.UndefOr[typingsSlinky.awsSdk.personalizeruntimeMod.ClientConfiguration] = js.native
  
  var pi: js.UndefOr[typingsSlinky.awsSdk.piMod.ClientConfiguration] = js.native
  
  var pinpoint: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.ClientConfiguration] = js.native
  
  var pinpointemail: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ClientConfiguration] = js.native
  
  var pinpointsmsvoice: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.ClientConfiguration] = js.native
  
  var polly: js.UndefOr[typingsSlinky.awsSdk.pollyMod.ClientConfiguration] = js.native
  
  var pricing: js.UndefOr[typingsSlinky.awsSdk.pricingMod.ClientConfiguration] = js.native
  
  var qldb: js.UndefOr[typingsSlinky.awsSdk.qldbMod.ClientConfiguration] = js.native
  
  var qldbsession: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.ClientConfiguration] = js.native
  
  var quicksight: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ClientConfiguration] = js.native
  
  var ram: js.UndefOr[typingsSlinky.awsSdk.ramMod.ClientConfiguration] = js.native
  
  var rds: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ClientConfiguration] = js.native
  
  var rdsdataservice: js.UndefOr[typingsSlinky.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.native
  
  var redshift: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClientConfiguration] = js.native
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.native
  
  var rekognition: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ClientConfiguration] = js.native
  
  var resourcegroups: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.ClientConfiguration] = js.native
  
  var resourcegroupstaggingapi: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.native
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  
  var robomaker: js.UndefOr[typingsSlinky.awsSdk.robomakerMod.ClientConfiguration] = js.native
  
  var route53: js.UndefOr[typingsSlinky.awsSdk.route53Mod.ClientConfiguration] = js.native
  
  var route53domains: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.ClientConfiguration] = js.native
  
  var route53resolver: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ClientConfiguration] = js.native
  
  var s3: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ClientConfiguration] = js.native
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.native
  
  var s3control: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.ClientConfiguration] = js.native
  
  var sagemaker: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ClientConfiguration] = js.native
  
  var sagemakerruntime: js.UndefOr[typingsSlinky.awsSdk.sagemakerruntimeMod.ClientConfiguration] = js.native
  
  var savingsplans: js.UndefOr[typingsSlinky.awsSdk.savingsplansMod.ClientConfiguration] = js.native
  
  var schemas: js.UndefOr[typingsSlinky.awsSdk.schemasMod.ClientConfiguration] = js.native
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.native
  
  var secretsmanager: js.UndefOr[typingsSlinky.awsSdk.secretsmanagerMod.ClientConfiguration] = js.native
  
  var securityhub: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.ClientConfiguration] = js.native
  
  var serverlessapplicationrepository: js.UndefOr[typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration] = js.native
  
  var servicecatalog: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ClientConfiguration] = js.native
  
  var servicediscovery: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.ClientConfiguration] = js.native
  
  var servicequotas: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ClientConfiguration] = js.native
  
  var ses: js.UndefOr[typingsSlinky.awsSdk.sesMod.ClientConfiguration] = js.native
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.native
  
  var sesv2: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ClientConfiguration] = js.native
  
  var shield: js.UndefOr[typingsSlinky.awsSdk.shieldMod.ClientConfiguration] = js.native
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.native
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.native
  
  var signer: js.UndefOr[typingsSlinky.awsSdk.signerMod.ClientConfiguration] = js.native
  
  var simpledb: js.UndefOr[typingsSlinky.awsSdk.simpledbMod.ClientConfiguration] = js.native
  
  var sms: js.UndefOr[typingsSlinky.awsSdk.smsMod.ClientConfiguration] = js.native
  
  var snowball: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClientConfiguration] = js.native
  
  var sns: js.UndefOr[typingsSlinky.awsSdk.snsMod.ClientConfiguration] = js.native
  
  var sqs: js.UndefOr[typingsSlinky.awsSdk.sqsMod.ClientConfiguration] = js.native
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
  
  var ssm: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ClientConfiguration] = js.native
  
  var sso: js.UndefOr[typingsSlinky.awsSdk.ssoMod.ClientConfiguration] = js.native
  
  var ssooidc: js.UndefOr[typingsSlinky.awsSdk.ssooidcMod.ClientConfiguration] = js.native
  
  var stepfunctions: js.UndefOr[typingsSlinky.awsSdk.stepfunctionsMod.ClientConfiguration] = js.native
  
  var storagegateway: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ClientConfiguration] = js.native
  
  var sts: js.UndefOr[typingsSlinky.awsSdk.stsMod.ClientConfiguration] = js.native
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
  
  var support: js.UndefOr[typingsSlinky.awsSdk.supportMod.ClientConfiguration] = js.native
  
  var swf: js.UndefOr[typingsSlinky.awsSdk.swfMod.ClientConfiguration] = js.native
  
  var synthetics: js.UndefOr[typingsSlinky.awsSdk.syntheticsMod.ClientConfiguration] = js.native
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.native
  
  var textract: js.UndefOr[typingsSlinky.awsSdk.textractMod.ClientConfiguration] = js.native
  
  var transcribeservice: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.ClientConfiguration] = js.native
  
  var transfer: js.UndefOr[typingsSlinky.awsSdk.transferMod.ClientConfiguration] = js.native
  
  var translate: js.UndefOr[typingsSlinky.awsSdk.translateMod.ClientConfiguration] = js.native
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  
  var waf: js.UndefOr[typingsSlinky.awsSdk.wafMod.ClientConfiguration] = js.native
  
  var wafregional: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ClientConfiguration] = js.native
  
  var wafv2: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.ClientConfiguration] = js.native
  
  var workdocs: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.ClientConfiguration] = js.native
  
  var worklink: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.ClientConfiguration] = js.native
  
  var workmail: js.UndefOr[typingsSlinky.awsSdk.workmailMod.ClientConfiguration] = js.native
  
  var workmailmessageflow: js.UndefOr[typingsSlinky.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.native
  
  var workspaces: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ClientConfiguration] = js.native
  
  var xray: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ClientConfiguration] = js.native
}
object ConfigurationOptionsConfi {
  
  @scala.inline
  def apply(): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsConfiOps[Self <: ConfigurationOptionsConfi] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    
    @scala.inline
    def setAccessanalyzer(value: ClientConfiguration): Self = this.set("accessanalyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessanalyzer: Self = this.set("accessanalyzer", js.undefined)
    
    @scala.inline
    def setAcm(value: typingsSlinky.awsSdk.acmMod.ClientConfiguration): Self = this.set("acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcm: Self = this.set("acm", js.undefined)
    
    @scala.inline
    def setAcmpca(value: typingsSlinky.awsSdk.acmpcaMod.ClientConfiguration): Self = this.set("acmpca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcmpca: Self = this.set("acmpca", js.undefined)
    
    @scala.inline
    def setAlexaforbusiness(value: typingsSlinky.awsSdk.alexaforbusinessMod.ClientConfiguration): Self = this.set("alexaforbusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlexaforbusiness: Self = this.set("alexaforbusiness", js.undefined)
    
    @scala.inline
    def setAmplify(value: typingsSlinky.awsSdk.amplifyMod.ClientConfiguration): Self = this.set("amplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplify: Self = this.set("amplify", js.undefined)
    
    @scala.inline
    def setApiVersion(value: latest_ | String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setApiVersions(value: ConfigurationServiceApiVersions): Self = this.set("apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersions: Self = this.set("apiVersions", js.undefined)
    
    @scala.inline
    def setApigateway(value: typingsSlinky.awsSdk.apigatewayMod.ClientConfiguration): Self = this.set("apigateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApigateway: Self = this.set("apigateway", js.undefined)
    
    @scala.inline
    def setApigatewaymanagementapi(value: typingsSlinky.awsSdk.apigatewaymanagementapiMod.ClientConfiguration): Self = this.set("apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApigatewaymanagementapi: Self = this.set("apigatewaymanagementapi", js.undefined)
    
    @scala.inline
    def setApigatewayv2(value: typingsSlinky.awsSdk.apigatewayv2Mod.ClientConfiguration): Self = this.set("apigatewayv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApigatewayv2: Self = this.set("apigatewayv2", js.undefined)
    
    @scala.inline
    def setAppconfig(value: typingsSlinky.awsSdk.appconfigMod.ClientConfiguration): Self = this.set("appconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppconfig: Self = this.set("appconfig", js.undefined)
    
    @scala.inline
    def setApplicationautoscaling(value: typingsSlinky.awsSdk.applicationautoscalingMod.ClientConfiguration): Self = this.set("applicationautoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationautoscaling: Self = this.set("applicationautoscaling", js.undefined)
    
    @scala.inline
    def setApplicationinsights(value: typingsSlinky.awsSdk.applicationinsightsMod.ClientConfiguration): Self = this.set("applicationinsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationinsights: Self = this.set("applicationinsights", js.undefined)
    
    @scala.inline
    def setAppmesh(value: typingsSlinky.awsSdk.appmeshMod.ClientConfiguration): Self = this.set("appmesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppmesh: Self = this.set("appmesh", js.undefined)
    
    @scala.inline
    def setAppstream(value: typingsSlinky.awsSdk.appstreamMod.ClientConfiguration): Self = this.set("appstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppstream: Self = this.set("appstream", js.undefined)
    
    @scala.inline
    def setAppsync(value: typingsSlinky.awsSdk.appsyncMod.ClientConfiguration): Self = this.set("appsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsync: Self = this.set("appsync", js.undefined)
    
    @scala.inline
    def setAthena(value: typingsSlinky.awsSdk.athenaMod.ClientConfiguration): Self = this.set("athena", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAthena: Self = this.set("athena", js.undefined)
    
    @scala.inline
    def setAugmentedairuntime(value: typingsSlinky.awsSdk.augmentedairuntimeMod.ClientConfiguration): Self = this.set("augmentedairuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAugmentedairuntime: Self = this.set("augmentedairuntime", js.undefined)
    
    @scala.inline
    def setAutoscaling(value: typingsSlinky.awsSdk.autoscalingMod.ClientConfiguration): Self = this.set("autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaling: Self = this.set("autoscaling", js.undefined)
    
    @scala.inline
    def setAutoscalingplans(value: typingsSlinky.awsSdk.autoscalingplansMod.ClientConfiguration): Self = this.set("autoscalingplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingplans: Self = this.set("autoscalingplans", js.undefined)
    
    @scala.inline
    def setBackup(value: typingsSlinky.awsSdk.backupMod.ClientConfiguration): Self = this.set("backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackup: Self = this.set("backup", js.undefined)
    
    @scala.inline
    def setBatch(value: typingsSlinky.awsSdk.batchMod.ClientConfiguration): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setBudgets(value: typingsSlinky.awsSdk.budgetsMod.ClientConfiguration): Self = this.set("budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgets: Self = this.set("budgets", js.undefined)
    
    @scala.inline
    def setChime(value: typingsSlinky.awsSdk.chimeMod.ClientConfiguration): Self = this.set("chime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChime: Self = this.set("chime", js.undefined)
    
    @scala.inline
    def setCloud9(value: typingsSlinky.awsSdk.cloud9Mod.ClientConfiguration): Self = this.set("cloud9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloud9: Self = this.set("cloud9", js.undefined)
    
    @scala.inline
    def setClouddirectory(value: typingsSlinky.awsSdk.clouddirectoryMod.ClientConfiguration): Self = this.set("clouddirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClouddirectory: Self = this.set("clouddirectory", js.undefined)
    
    @scala.inline
    def setCloudformation(value: typingsSlinky.awsSdk.cloudformationMod.ClientConfiguration): Self = this.set("cloudformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudformation: Self = this.set("cloudformation", js.undefined)
    
    @scala.inline
    def setCloudfront(value: typingsSlinky.awsSdk.cloudfrontMod.ClientConfiguration): Self = this.set("cloudfront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudfront: Self = this.set("cloudfront", js.undefined)
    
    @scala.inline
    def setCloudhsm(value: typingsSlinky.awsSdk.cloudhsmMod.ClientConfiguration): Self = this.set("cloudhsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudhsm: Self = this.set("cloudhsm", js.undefined)
    
    @scala.inline
    def setCloudhsmv2(value: typingsSlinky.awsSdk.cloudhsmv2Mod.ClientConfiguration): Self = this.set("cloudhsmv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudhsmv2: Self = this.set("cloudhsmv2", js.undefined)
    
    @scala.inline
    def setCloudsearch(value: typingsSlinky.awsSdk.cloudsearchMod.ClientConfiguration): Self = this.set("cloudsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudsearch: Self = this.set("cloudsearch", js.undefined)
    
    @scala.inline
    def setCloudsearchdomain(value: typingsSlinky.awsSdk.cloudsearchdomainMod.ClientConfiguration): Self = this.set("cloudsearchdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudsearchdomain: Self = this.set("cloudsearchdomain", js.undefined)
    
    @scala.inline
    def setCloudtrail(value: typingsSlinky.awsSdk.cloudtrailMod.ClientConfiguration): Self = this.set("cloudtrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudtrail: Self = this.set("cloudtrail", js.undefined)
    
    @scala.inline
    def setCloudwatch(value: typingsSlinky.awsSdk.cloudwatchMod.ClientConfiguration): Self = this.set("cloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatch: Self = this.set("cloudwatch", js.undefined)
    
    @scala.inline
    def setCloudwatchevents(value: typingsSlinky.awsSdk.cloudwatcheventsMod.ClientConfiguration): Self = this.set("cloudwatchevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchevents: Self = this.set("cloudwatchevents", js.undefined)
    
    @scala.inline
    def setCloudwatchlogs(value: typingsSlinky.awsSdk.cloudwatchlogsMod.ClientConfiguration): Self = this.set("cloudwatchlogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchlogs: Self = this.set("cloudwatchlogs", js.undefined)
    
    @scala.inline
    def setCodeartifact(value: typingsSlinky.awsSdk.codeartifactMod.ClientConfiguration): Self = this.set("codeartifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeartifact: Self = this.set("codeartifact", js.undefined)
    
    @scala.inline
    def setCodebuild(value: typingsSlinky.awsSdk.codebuildMod.ClientConfiguration): Self = this.set("codebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodebuild: Self = this.set("codebuild", js.undefined)
    
    @scala.inline
    def setCodecommit(value: typingsSlinky.awsSdk.codecommitMod.ClientConfiguration): Self = this.set("codecommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecommit: Self = this.set("codecommit", js.undefined)
    
    @scala.inline
    def setCodedeploy(value: typingsSlinky.awsSdk.codedeployMod.ClientConfiguration): Self = this.set("codedeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodedeploy: Self = this.set("codedeploy", js.undefined)
    
    @scala.inline
    def setCodeguruprofiler(value: typingsSlinky.awsSdk.codeguruprofilerMod.ClientConfiguration): Self = this.set("codeguruprofiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeguruprofiler: Self = this.set("codeguruprofiler", js.undefined)
    
    @scala.inline
    def setCodegurureviewer(value: typingsSlinky.awsSdk.codegurureviewerMod.ClientConfiguration): Self = this.set("codegurureviewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegurureviewer: Self = this.set("codegurureviewer", js.undefined)
    
    @scala.inline
    def setCodepipeline(value: typingsSlinky.awsSdk.codepipelineMod.ClientConfiguration): Self = this.set("codepipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodepipeline: Self = this.set("codepipeline", js.undefined)
    
    @scala.inline
    def setCodestar(value: typingsSlinky.awsSdk.codestarMod.ClientConfiguration): Self = this.set("codestar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodestar: Self = this.set("codestar", js.undefined)
    
    @scala.inline
    def setCodestarconnections(value: typingsSlinky.awsSdk.codestarconnectionsMod.ClientConfiguration): Self = this.set("codestarconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodestarconnections: Self = this.set("codestarconnections", js.undefined)
    
    @scala.inline
    def setCodestarnotifications(value: typingsSlinky.awsSdk.codestarnotificationsMod.ClientConfiguration): Self = this.set("codestarnotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodestarnotifications: Self = this.set("codestarnotifications", js.undefined)
    
    @scala.inline
    def setCognitoidentity(value: typingsSlinky.awsSdk.cognitoidentityMod.ClientConfiguration): Self = this.set("cognitoidentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoidentity: Self = this.set("cognitoidentity", js.undefined)
    
    @scala.inline
    def setCognitoidentityserviceprovider(value: typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration): Self = this.set("cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoidentityserviceprovider: Self = this.set("cognitoidentityserviceprovider", js.undefined)
    
    @scala.inline
    def setCognitosync(value: typingsSlinky.awsSdk.cognitosyncMod.ClientConfiguration): Self = this.set("cognitosync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitosync: Self = this.set("cognitosync", js.undefined)
    
    @scala.inline
    def setComprehend(value: typingsSlinky.awsSdk.comprehendMod.ClientConfiguration): Self = this.set("comprehend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComprehend: Self = this.set("comprehend", js.undefined)
    
    @scala.inline
    def setComprehendmedical(value: typingsSlinky.awsSdk.comprehendmedicalMod.ClientConfiguration): Self = this.set("comprehendmedical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComprehendmedical: Self = this.set("comprehendmedical", js.undefined)
    
    @scala.inline
    def setComputeChecksums(value: Boolean): Self = this.set("computeChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeChecksums: Self = this.set("computeChecksums", js.undefined)
    
    @scala.inline
    def setComputeoptimizer(value: typingsSlinky.awsSdk.computeoptimizerMod.ClientConfiguration): Self = this.set("computeoptimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeoptimizer: Self = this.set("computeoptimizer", js.undefined)
    
    @scala.inline
    def setConfigservice(value: typingsSlinky.awsSdk.configserviceMod.ClientConfiguration): Self = this.set("configservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigservice: Self = this.set("configservice", js.undefined)
    
    @scala.inline
    def setConnect(value: typingsSlinky.awsSdk.connectMod.ClientConfiguration): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setConnectparticipant(value: typingsSlinky.awsSdk.connectparticipantMod.ClientConfiguration): Self = this.set("connectparticipant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectparticipant: Self = this.set("connectparticipant", js.undefined)
    
    @scala.inline
    def setConvertResponseTypes(value: Boolean): Self = this.set("convertResponseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertResponseTypes: Self = this.set("convertResponseTypes", js.undefined)
    
    @scala.inline
    def setCorrectClockSkew(value: Boolean): Self = this.set("correctClockSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrectClockSkew: Self = this.set("correctClockSkew", js.undefined)
    
    @scala.inline
    def setCostexplorer(value: typingsSlinky.awsSdk.costexplorerMod.ClientConfiguration): Self = this.set("costexplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostexplorer: Self = this.set("costexplorer", js.undefined)
    
    @scala.inline
    def setCredentialProvider(value: CredentialProviderChain): Self = this.set("credentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialProvider: Self = this.set("credentialProvider", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials | CredentialsOptions): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setCredentialsNull: Self = this.set("credentials", null)
    
    @scala.inline
    def setCur(value: typingsSlinky.awsSdk.curMod.ClientConfiguration): Self = this.set("cur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCur: Self = this.set("cur", js.undefined)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = this.set("customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUserAgent: Self = this.set("customUserAgent", js.undefined)
    
    @scala.inline
    def setDataexchange(value: typingsSlinky.awsSdk.dataexchangeMod.ClientConfiguration): Self = this.set("dataexchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataexchange: Self = this.set("dataexchange", js.undefined)
    
    @scala.inline
    def setDatapipeline(value: typingsSlinky.awsSdk.datapipelineMod.ClientConfiguration): Self = this.set("datapipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatapipeline: Self = this.set("datapipeline", js.undefined)
    
    @scala.inline
    def setDatasync(value: typingsSlinky.awsSdk.datasyncMod.ClientConfiguration): Self = this.set("datasync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasync: Self = this.set("datasync", js.undefined)
    
    @scala.inline
    def setDax(value: typingsSlinky.awsSdk.daxMod.ClientConfiguration): Self = this.set("dax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDax: Self = this.set("dax", js.undefined)
    
    @scala.inline
    def setDetective(value: typingsSlinky.awsSdk.detectiveMod.ClientConfiguration): Self = this.set("detective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetective: Self = this.set("detective", js.undefined)
    
    @scala.inline
    def setDevicefarm(value: typingsSlinky.awsSdk.devicefarmMod.ClientConfiguration): Self = this.set("devicefarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicefarm: Self = this.set("devicefarm", js.undefined)
    
    @scala.inline
    def setDirectconnect(value: typingsSlinky.awsSdk.directconnectMod.ClientConfiguration): Self = this.set("directconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectconnect: Self = this.set("directconnect", js.undefined)
    
    @scala.inline
    def setDirectoryservice(value: typingsSlinky.awsSdk.directoryserviceMod.ClientConfiguration): Self = this.set("directoryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryservice: Self = this.set("directoryservice", js.undefined)
    
    @scala.inline
    def setDiscovery(value: typingsSlinky.awsSdk.discoveryMod.ClientConfiguration): Self = this.set("discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscovery: Self = this.set("discovery", js.undefined)
    
    @scala.inline
    def setDlm(value: typingsSlinky.awsSdk.dlmMod.ClientConfiguration): Self = this.set("dlm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlm: Self = this.set("dlm", js.undefined)
    
    @scala.inline
    def setDms(value: typingsSlinky.awsSdk.dmsMod.ClientConfiguration): Self = this.set("dms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDms: Self = this.set("dms", js.undefined)
    
    @scala.inline
    def setDocdb(value: typingsSlinky.awsSdk.docdbMod.ClientConfiguration): Self = this.set("docdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocdb: Self = this.set("docdb", js.undefined)
    
    @scala.inline
    def setDynamoDbCrc32(value: Boolean): Self = this.set("dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamoDbCrc32: Self = this.set("dynamoDbCrc32", js.undefined)
    
    @scala.inline
    def setDynamodb(value: typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    
    @scala.inline
    def setDynamodbstreams(value: typingsSlinky.awsSdk.dynamodbstreamsMod.ClientConfiguration): Self = this.set("dynamodbstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamodbstreams: Self = this.set("dynamodbstreams", js.undefined)
    
    @scala.inline
    def setEbs(value: typingsSlinky.awsSdk.ebsMod.ClientConfiguration): Self = this.set("ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbs: Self = this.set("ebs", js.undefined)
    
    @scala.inline
    def setEc2(value: typingsSlinky.awsSdk.ec2Mod.ClientConfiguration): Self = this.set("ec2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2: Self = this.set("ec2", js.undefined)
    
    @scala.inline
    def setEc2instanceconnect(value: typingsSlinky.awsSdk.ec2instanceconnectMod.ClientConfiguration): Self = this.set("ec2instanceconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2instanceconnect: Self = this.set("ec2instanceconnect", js.undefined)
    
    @scala.inline
    def setEcr(value: typingsSlinky.awsSdk.ecrMod.ClientConfiguration): Self = this.set("ecr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcr: Self = this.set("ecr", js.undefined)
    
    @scala.inline
    def setEcs(value: typingsSlinky.awsSdk.ecsMod.ClientConfiguration): Self = this.set("ecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcs: Self = this.set("ecs", js.undefined)
    
    @scala.inline
    def setEfs(value: typingsSlinky.awsSdk.efsMod.ClientConfiguration): Self = this.set("efs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEfs: Self = this.set("efs", js.undefined)
    
    @scala.inline
    def setEks(value: typingsSlinky.awsSdk.eksMod.ClientConfiguration): Self = this.set("eks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEks: Self = this.set("eks", js.undefined)
    
    @scala.inline
    def setElasticache(value: typingsSlinky.awsSdk.elasticacheMod.ClientConfiguration): Self = this.set("elasticache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticache: Self = this.set("elasticache", js.undefined)
    
    @scala.inline
    def setElasticbeanstalk(value: typingsSlinky.awsSdk.elasticbeanstalkMod.ClientConfiguration): Self = this.set("elasticbeanstalk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticbeanstalk: Self = this.set("elasticbeanstalk", js.undefined)
    
    @scala.inline
    def setElasticinference(value: typingsSlinky.awsSdk.elasticinferenceMod.ClientConfiguration): Self = this.set("elasticinference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticinference: Self = this.set("elasticinference", js.undefined)
    
    @scala.inline
    def setElastictranscoder(value: typingsSlinky.awsSdk.elastictranscoderMod.ClientConfiguration): Self = this.set("elastictranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElastictranscoder: Self = this.set("elastictranscoder", js.undefined)
    
    @scala.inline
    def setElb(value: typingsSlinky.awsSdk.elbMod.ClientConfiguration): Self = this.set("elb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElb: Self = this.set("elb", js.undefined)
    
    @scala.inline
    def setElbv2(value: typingsSlinky.awsSdk.elbv2Mod.ClientConfiguration): Self = this.set("elbv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElbv2: Self = this.set("elbv2", js.undefined)
    
    @scala.inline
    def setEmr(value: typingsSlinky.awsSdk.emrMod.ClientConfiguration): Self = this.set("emr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmr: Self = this.set("emr", js.undefined)
    
    @scala.inline
    def setEndpointCacheSize(value: Double): Self = this.set("endpointCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointCacheSize: Self = this.set("endpointCacheSize", js.undefined)
    
    @scala.inline
    def setEndpointDiscoveryEnabled(value: Boolean): Self = this.set("endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointDiscoveryEnabled: Self = this.set("endpointDiscoveryEnabled", js.undefined)
    
    @scala.inline
    def setEs(value: typingsSlinky.awsSdk.esMod.ClientConfiguration): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEs: Self = this.set("es", js.undefined)
    
    @scala.inline
    def setEventbridge(value: typingsSlinky.awsSdk.eventbridgeMod.ClientConfiguration): Self = this.set("eventbridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventbridge: Self = this.set("eventbridge", js.undefined)
    
    @scala.inline
    def setFirehose(value: typingsSlinky.awsSdk.firehoseMod.ClientConfiguration): Self = this.set("firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    
    @scala.inline
    def setFms(value: typingsSlinky.awsSdk.fmsMod.ClientConfiguration): Self = this.set("fms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFms: Self = this.set("fms", js.undefined)
    
    @scala.inline
    def setForecastqueryservice(value: typingsSlinky.awsSdk.forecastqueryserviceMod.ClientConfiguration): Self = this.set("forecastqueryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastqueryservice: Self = this.set("forecastqueryservice", js.undefined)
    
    @scala.inline
    def setForecastservice(value: typingsSlinky.awsSdk.forecastserviceMod.ClientConfiguration): Self = this.set("forecastservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastservice: Self = this.set("forecastservice", js.undefined)
    
    @scala.inline
    def setFrauddetector(value: typingsSlinky.awsSdk.frauddetectorMod.ClientConfiguration): Self = this.set("frauddetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrauddetector: Self = this.set("frauddetector", js.undefined)
    
    @scala.inline
    def setFsx(value: typingsSlinky.awsSdk.fsxMod.ClientConfiguration): Self = this.set("fsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsx: Self = this.set("fsx", js.undefined)
    
    @scala.inline
    def setGamelift(value: typingsSlinky.awsSdk.gameliftMod.ClientConfiguration): Self = this.set("gamelift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamelift: Self = this.set("gamelift", js.undefined)
    
    @scala.inline
    def setGlacier(value: typingsSlinky.awsSdk.glacierMod.ClientConfiguration): Self = this.set("glacier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlacier: Self = this.set("glacier", js.undefined)
    
    @scala.inline
    def setGlobalaccelerator(value: typingsSlinky.awsSdk.globalacceleratorMod.ClientConfiguration): Self = this.set("globalaccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalaccelerator: Self = this.set("globalaccelerator", js.undefined)
    
    @scala.inline
    def setGlue(value: typingsSlinky.awsSdk.glueMod.ClientConfiguration): Self = this.set("glue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlue: Self = this.set("glue", js.undefined)
    
    @scala.inline
    def setGreengrass(value: typingsSlinky.awsSdk.greengrassMod.ClientConfiguration): Self = this.set("greengrass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrass: Self = this.set("greengrass", js.undefined)
    
    @scala.inline
    def setGroundstation(value: typingsSlinky.awsSdk.groundstationMod.ClientConfiguration): Self = this.set("groundstation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroundstation: Self = this.set("groundstation", js.undefined)
    
    @scala.inline
    def setGuardduty(value: typingsSlinky.awsSdk.guarddutyMod.ClientConfiguration): Self = this.set("guardduty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardduty: Self = this.set("guardduty", js.undefined)
    
    @scala.inline
    def setHealth(value: typingsSlinky.awsSdk.healthMod.ClientConfiguration): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setHoneycode(value: typingsSlinky.awsSdk.honeycodeMod.ClientConfiguration): Self = this.set("honeycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoneycode: Self = this.set("honeycode", js.undefined)
    
    @scala.inline
    def setHostPrefixEnabled(value: Boolean): Self = this.set("hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPrefixEnabled: Self = this.set("hostPrefixEnabled", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setIam(value: typingsSlinky.awsSdk.iamMod.ClientConfiguration): Self = this.set("iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam: Self = this.set("iam", js.undefined)
    
    @scala.inline
    def setImagebuilder(value: typingsSlinky.awsSdk.imagebuilderMod.ClientConfiguration): Self = this.set("imagebuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagebuilder: Self = this.set("imagebuilder", js.undefined)
    
    @scala.inline
    def setImportexport(value: typingsSlinky.awsSdk.importexportMod.ClientConfiguration): Self = this.set("importexport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportexport: Self = this.set("importexport", js.undefined)
    
    @scala.inline
    def setInspector(value: typingsSlinky.awsSdk.inspectorMod.ClientConfiguration): Self = this.set("inspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspector: Self = this.set("inspector", js.undefined)
    
    @scala.inline
    def setIot(value: typingsSlinky.awsSdk.iotMod.ClientConfiguration): Self = this.set("iot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIot: Self = this.set("iot", js.undefined)
    
    @scala.inline
    def setIot1clickdevicesservice(value: typingsSlinky.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration): Self = this.set("iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIot1clickdevicesservice: Self = this.set("iot1clickdevicesservice", js.undefined)
    
    @scala.inline
    def setIot1clickprojects(value: typingsSlinky.awsSdk.iot1clickprojectsMod.ClientConfiguration): Self = this.set("iot1clickprojects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIot1clickprojects: Self = this.set("iot1clickprojects", js.undefined)
    
    @scala.inline
    def setIotanalytics(value: typingsSlinky.awsSdk.iotanalyticsMod.ClientConfiguration): Self = this.set("iotanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotanalytics: Self = this.set("iotanalytics", js.undefined)
    
    @scala.inline
    def setIotdata(value: typingsSlinky.awsSdk.iotdataMod.ClientConfiguration): Self = this.set("iotdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotdata: Self = this.set("iotdata", js.undefined)
    
    @scala.inline
    def setIotevents(value: typingsSlinky.awsSdk.ioteventsMod.ClientConfiguration): Self = this.set("iotevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotevents: Self = this.set("iotevents", js.undefined)
    
    @scala.inline
    def setIoteventsdata(value: typingsSlinky.awsSdk.ioteventsdataMod.ClientConfiguration): Self = this.set("ioteventsdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIoteventsdata: Self = this.set("ioteventsdata", js.undefined)
    
    @scala.inline
    def setIotjobsdataplane(value: typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientConfiguration): Self = this.set("iotjobsdataplane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotjobsdataplane: Self = this.set("iotjobsdataplane", js.undefined)
    
    @scala.inline
    def setIotsecuretunneling(value: typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientConfiguration): Self = this.set("iotsecuretunneling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotsecuretunneling: Self = this.set("iotsecuretunneling", js.undefined)
    
    @scala.inline
    def setIotsitewise(value: typingsSlinky.awsSdk.iotsitewiseMod.ClientConfiguration): Self = this.set("iotsitewise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotsitewise: Self = this.set("iotsitewise", js.undefined)
    
    @scala.inline
    def setIotthingsgraph(value: typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration): Self = this.set("iotthingsgraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotthingsgraph: Self = this.set("iotthingsgraph", js.undefined)
    
    @scala.inline
    def setIvs(value: typingsSlinky.awsSdk.ivsMod.ClientConfiguration): Self = this.set("ivs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIvs: Self = this.set("ivs", js.undefined)
    
    @scala.inline
    def setKafka(value: typingsSlinky.awsSdk.kafkaMod.ClientConfiguration): Self = this.set("kafka", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafka: Self = this.set("kafka", js.undefined)
    
    @scala.inline
    def setKendra(value: typingsSlinky.awsSdk.kendraMod.ClientConfiguration): Self = this.set("kendra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKendra: Self = this.set("kendra", js.undefined)
    
    @scala.inline
    def setKinesis(value: typingsSlinky.awsSdk.kinesisMod.ClientConfiguration): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    
    @scala.inline
    def setKinesisanalytics(value: typingsSlinky.awsSdk.kinesisanalyticsMod.ClientConfiguration): Self = this.set("kinesisanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisanalytics: Self = this.set("kinesisanalytics", js.undefined)
    
    @scala.inline
    def setKinesisanalyticsv2(value: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration): Self = this.set("kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisanalyticsv2: Self = this.set("kinesisanalyticsv2", js.undefined)
    
    @scala.inline
    def setKinesisvideo(value: typingsSlinky.awsSdk.kinesisvideoMod.ClientConfiguration): Self = this.set("kinesisvideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisvideo: Self = this.set("kinesisvideo", js.undefined)
    
    @scala.inline
    def setKinesisvideoarchivedmedia(value: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration): Self = this.set("kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisvideoarchivedmedia: Self = this.set("kinesisvideoarchivedmedia", js.undefined)
    
    @scala.inline
    def setKinesisvideomedia(value: typingsSlinky.awsSdk.kinesisvideomediaMod.ClientConfiguration): Self = this.set("kinesisvideomedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisvideomedia: Self = this.set("kinesisvideomedia", js.undefined)
    
    @scala.inline
    def setKinesisvideosignalingchannels(value: typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration): Self = this.set("kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisvideosignalingchannels: Self = this.set("kinesisvideosignalingchannels", js.undefined)
    
    @scala.inline
    def setKms(value: typingsSlinky.awsSdk.kmsMod.ClientConfiguration): Self = this.set("kms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKms: Self = this.set("kms", js.undefined)
    
    @scala.inline
    def setLakeformation(value: typingsSlinky.awsSdk.lakeformationMod.ClientConfiguration): Self = this.set("lakeformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLakeformation: Self = this.set("lakeformation", js.undefined)
    
    @scala.inline
    def setLambda(value: typingsSlinky.awsSdk.lambdaMod.ClientConfiguration): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    
    @scala.inline
    def setLexmodelbuildingservice(value: typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration): Self = this.set("lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexmodelbuildingservice: Self = this.set("lexmodelbuildingservice", js.undefined)
    
    @scala.inline
    def setLexruntime(value: typingsSlinky.awsSdk.lexruntimeMod.ClientConfiguration): Self = this.set("lexruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexruntime: Self = this.set("lexruntime", js.undefined)
    
    @scala.inline
    def setLicensemanager(value: typingsSlinky.awsSdk.licensemanagerMod.ClientConfiguration): Self = this.set("licensemanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicensemanager: Self = this.set("licensemanager", js.undefined)
    
    @scala.inline
    def setLightsail(value: typingsSlinky.awsSdk.lightsailMod.ClientConfiguration): Self = this.set("lightsail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightsail: Self = this.set("lightsail", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMachinelearning(value: typingsSlinky.awsSdk.machinelearningMod.ClientConfiguration): Self = this.set("machinelearning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachinelearning: Self = this.set("machinelearning", js.undefined)
    
    @scala.inline
    def setMacie(value: typingsSlinky.awsSdk.macieMod.ClientConfiguration): Self = this.set("macie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacie: Self = this.set("macie", js.undefined)
    
    @scala.inline
    def setMacie2(value: typingsSlinky.awsSdk.macie2Mod.ClientConfiguration): Self = this.set("macie2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacie2: Self = this.set("macie2", js.undefined)
    
    @scala.inline
    def setManagedblockchain(value: typingsSlinky.awsSdk.managedblockchainMod.ClientConfiguration): Self = this.set("managedblockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedblockchain: Self = this.set("managedblockchain", js.undefined)
    
    @scala.inline
    def setMarketplacecatalog(value: typingsSlinky.awsSdk.marketplacecatalogMod.ClientConfiguration): Self = this.set("marketplacecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketplacecatalog: Self = this.set("marketplacecatalog", js.undefined)
    
    @scala.inline
    def setMarketplacecommerceanalytics(value: typingsSlinky.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration): Self = this.set("marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketplacecommerceanalytics: Self = this.set("marketplacecommerceanalytics", js.undefined)
    
    @scala.inline
    def setMarketplaceentitlementservice(value: typingsSlinky.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration): Self = this.set("marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketplaceentitlementservice: Self = this.set("marketplaceentitlementservice", js.undefined)
    
    @scala.inline
    def setMarketplacemetering(value: typingsSlinky.awsSdk.marketplacemeteringMod.ClientConfiguration): Self = this.set("marketplacemetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketplacemetering: Self = this.set("marketplacemetering", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setMediaconnect(value: typingsSlinky.awsSdk.mediaconnectMod.ClientConfiguration): Self = this.set("mediaconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaconnect: Self = this.set("mediaconnect", js.undefined)
    
    @scala.inline
    def setMediaconvert(value: typingsSlinky.awsSdk.mediaconvertMod.ClientConfiguration): Self = this.set("mediaconvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaconvert: Self = this.set("mediaconvert", js.undefined)
    
    @scala.inline
    def setMedialive(value: typingsSlinky.awsSdk.medialiveMod.ClientConfiguration): Self = this.set("medialive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedialive: Self = this.set("medialive", js.undefined)
    
    @scala.inline
    def setMediapackage(value: typingsSlinky.awsSdk.mediapackageMod.ClientConfiguration): Self = this.set("mediapackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediapackage: Self = this.set("mediapackage", js.undefined)
    
    @scala.inline
    def setMediapackagevod(value: typingsSlinky.awsSdk.mediapackagevodMod.ClientConfiguration): Self = this.set("mediapackagevod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediapackagevod: Self = this.set("mediapackagevod", js.undefined)
    
    @scala.inline
    def setMediastore(value: typingsSlinky.awsSdk.mediastoreMod.ClientConfiguration): Self = this.set("mediastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediastore: Self = this.set("mediastore", js.undefined)
    
    @scala.inline
    def setMediastoredata(value: typingsSlinky.awsSdk.mediastoredataMod.ClientConfiguration): Self = this.set("mediastoredata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediastoredata: Self = this.set("mediastoredata", js.undefined)
    
    @scala.inline
    def setMediatailor(value: typingsSlinky.awsSdk.mediatailorMod.ClientConfiguration): Self = this.set("mediatailor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediatailor: Self = this.set("mediatailor", js.undefined)
    
    @scala.inline
    def setMigrationhub(value: typingsSlinky.awsSdk.migrationhubMod.ClientConfiguration): Self = this.set("migrationhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationhub: Self = this.set("migrationhub", js.undefined)
    
    @scala.inline
    def setMigrationhubconfig(value: typingsSlinky.awsSdk.migrationhubconfigMod.ClientConfiguration): Self = this.set("migrationhubconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationhubconfig: Self = this.set("migrationhubconfig", js.undefined)
    
    @scala.inline
    def setMobile(value: typingsSlinky.awsSdk.mobileMod.ClientConfiguration): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setMobileanalytics(value: typingsSlinky.awsSdk.mobileanalyticsMod.ClientConfiguration): Self = this.set("mobileanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileanalytics: Self = this.set("mobileanalytics", js.undefined)
    
    @scala.inline
    def setMq(value: typingsSlinky.awsSdk.mqMod.ClientConfiguration): Self = this.set("mq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMq: Self = this.set("mq", js.undefined)
    
    @scala.inline
    def setMturk(value: typingsSlinky.awsSdk.mturkMod.ClientConfiguration): Self = this.set("mturk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMturk: Self = this.set("mturk", js.undefined)
    
    @scala.inline
    def setNeptune(value: typingsSlinky.awsSdk.neptuneMod.ClientConfiguration): Self = this.set("neptune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeptune: Self = this.set("neptune", js.undefined)
    
    @scala.inline
    def setNetworkmanager(value: typingsSlinky.awsSdk.networkmanagerMod.ClientConfiguration): Self = this.set("networkmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkmanager: Self = this.set("networkmanager", js.undefined)
    
    @scala.inline
    def setOpsworks(value: typingsSlinky.awsSdk.opsworksMod.ClientConfiguration): Self = this.set("opsworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpsworks: Self = this.set("opsworks", js.undefined)
    
    @scala.inline
    def setOpsworkscm(value: typingsSlinky.awsSdk.opsworkscmMod.ClientConfiguration): Self = this.set("opsworkscm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpsworkscm: Self = this.set("opsworkscm", js.undefined)
    
    @scala.inline
    def setOrganizations(value: typingsSlinky.awsSdk.organizationsMod.ClientConfiguration): Self = this.set("organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    
    @scala.inline
    def setOutposts(value: typingsSlinky.awsSdk.outpostsMod.ClientConfiguration): Self = this.set("outposts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutposts: Self = this.set("outposts", js.undefined)
    
    @scala.inline
    def setParamValidation(value: ParamValidation | Boolean): Self = this.set("paramValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamValidation: Self = this.set("paramValidation", js.undefined)
    
    @scala.inline
    def setPersonalize(value: typingsSlinky.awsSdk.personalizeMod.ClientConfiguration): Self = this.set("personalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalize: Self = this.set("personalize", js.undefined)
    
    @scala.inline
    def setPersonalizeevents(value: typingsSlinky.awsSdk.personalizeeventsMod.ClientConfiguration): Self = this.set("personalizeevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizeevents: Self = this.set("personalizeevents", js.undefined)
    
    @scala.inline
    def setPersonalizeruntime(value: typingsSlinky.awsSdk.personalizeruntimeMod.ClientConfiguration): Self = this.set("personalizeruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizeruntime: Self = this.set("personalizeruntime", js.undefined)
    
    @scala.inline
    def setPi(value: typingsSlinky.awsSdk.piMod.ClientConfiguration): Self = this.set("pi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePi: Self = this.set("pi", js.undefined)
    
    @scala.inline
    def setPinpoint(value: typingsSlinky.awsSdk.pinpointMod.ClientConfiguration): Self = this.set("pinpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinpoint: Self = this.set("pinpoint", js.undefined)
    
    @scala.inline
    def setPinpointemail(value: typingsSlinky.awsSdk.pinpointemailMod.ClientConfiguration): Self = this.set("pinpointemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinpointemail: Self = this.set("pinpointemail", js.undefined)
    
    @scala.inline
    def setPinpointsmsvoice(value: typingsSlinky.awsSdk.pinpointsmsvoiceMod.ClientConfiguration): Self = this.set("pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinpointsmsvoice: Self = this.set("pinpointsmsvoice", js.undefined)
    
    @scala.inline
    def setPolly(value: typingsSlinky.awsSdk.pollyMod.ClientConfiguration): Self = this.set("polly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolly: Self = this.set("polly", js.undefined)
    
    @scala.inline
    def setPricing(value: typingsSlinky.awsSdk.pricingMod.ClientConfiguration): Self = this.set("pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
    
    @scala.inline
    def setQldb(value: typingsSlinky.awsSdk.qldbMod.ClientConfiguration): Self = this.set("qldb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQldb: Self = this.set("qldb", js.undefined)
    
    @scala.inline
    def setQldbsession(value: typingsSlinky.awsSdk.qldbsessionMod.ClientConfiguration): Self = this.set("qldbsession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQldbsession: Self = this.set("qldbsession", js.undefined)
    
    @scala.inline
    def setQuicksight(value: typingsSlinky.awsSdk.quicksightMod.ClientConfiguration): Self = this.set("quicksight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuicksight: Self = this.set("quicksight", js.undefined)
    
    @scala.inline
    def setRam(value: typingsSlinky.awsSdk.ramMod.ClientConfiguration): Self = this.set("ram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRam: Self = this.set("ram", js.undefined)
    
    @scala.inline
    def setRds(value: typingsSlinky.awsSdk.rdsMod.ClientConfiguration): Self = this.set("rds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRds: Self = this.set("rds", js.undefined)
    
    @scala.inline
    def setRdsdataservice(value: typingsSlinky.awsSdk.rdsdataserviceMod.ClientConfiguration): Self = this.set("rdsdataservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsdataservice: Self = this.set("rdsdataservice", js.undefined)
    
    @scala.inline
    def setRedshift(value: typingsSlinky.awsSdk.redshiftMod.ClientConfiguration): Self = this.set("redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("redshift", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRekognition(value: typingsSlinky.awsSdk.rekognitionMod.ClientConfiguration): Self = this.set("rekognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRekognition: Self = this.set("rekognition", js.undefined)
    
    @scala.inline
    def setResourcegroups(value: typingsSlinky.awsSdk.resourcegroupsMod.ClientConfiguration): Self = this.set("resourcegroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcegroups: Self = this.set("resourcegroups", js.undefined)
    
    @scala.inline
    def setResourcegroupstaggingapi(value: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration): Self = this.set("resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcegroupstaggingapi: Self = this.set("resourcegroupstaggingapi", js.undefined)
    
    @scala.inline
    def setRetryDelayOptions(value: RetryDelayOptions): Self = this.set("retryDelayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelayOptions: Self = this.set("retryDelayOptions", js.undefined)
    
    @scala.inline
    def setRobomaker(value: typingsSlinky.awsSdk.robomakerMod.ClientConfiguration): Self = this.set("robomaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRobomaker: Self = this.set("robomaker", js.undefined)
    
    @scala.inline
    def setRoute53(value: typingsSlinky.awsSdk.route53Mod.ClientConfiguration): Self = this.set("route53", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute53: Self = this.set("route53", js.undefined)
    
    @scala.inline
    def setRoute53domains(value: typingsSlinky.awsSdk.route53domainsMod.ClientConfiguration): Self = this.set("route53domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute53domains: Self = this.set("route53domains", js.undefined)
    
    @scala.inline
    def setRoute53resolver(value: typingsSlinky.awsSdk.route53resolverMod.ClientConfiguration): Self = this.set("route53resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute53resolver: Self = this.set("route53resolver", js.undefined)
    
    @scala.inline
    def setS3(value: typingsSlinky.awsSdk.s3Mod.ClientConfiguration): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    
    @scala.inline
    def setS3BucketEndpoint(value: Boolean): Self = this.set("s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketEndpoint: Self = this.set("s3BucketEndpoint", js.undefined)
    
    @scala.inline
    def setS3DisableBodySigning(value: Boolean): Self = this.set("s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DisableBodySigning: Self = this.set("s3DisableBodySigning", js.undefined)
    
    @scala.inline
    def setS3ForcePathStyle(value: Boolean): Self = this.set("s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ForcePathStyle: Self = this.set("s3ForcePathStyle", js.undefined)
    
    @scala.inline
    def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = this.set("s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3UsEast1RegionalEndpoint: Self = this.set("s3UsEast1RegionalEndpoint", js.undefined)
    
    @scala.inline
    def setS3UseArnRegion(value: Boolean): Self = this.set("s3UseArnRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3UseArnRegion: Self = this.set("s3UseArnRegion", js.undefined)
    
    @scala.inline
    def setS3control(value: typingsSlinky.awsSdk.s3controlMod.ClientConfiguration): Self = this.set("s3control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3control: Self = this.set("s3control", js.undefined)
    
    @scala.inline
    def setSagemaker(value: typingsSlinky.awsSdk.sagemakerMod.ClientConfiguration): Self = this.set("sagemaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSagemaker: Self = this.set("sagemaker", js.undefined)
    
    @scala.inline
    def setSagemakerruntime(value: typingsSlinky.awsSdk.sagemakerruntimeMod.ClientConfiguration): Self = this.set("sagemakerruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSagemakerruntime: Self = this.set("sagemakerruntime", js.undefined)
    
    @scala.inline
    def setSavingsplans(value: typingsSlinky.awsSdk.savingsplansMod.ClientConfiguration): Self = this.set("savingsplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsplans: Self = this.set("savingsplans", js.undefined)
    
    @scala.inline
    def setSchemas(value: typingsSlinky.awsSdk.schemasMod.ClientConfiguration): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    
    @scala.inline
    def setSecretsmanager(value: typingsSlinky.awsSdk.secretsmanagerMod.ClientConfiguration): Self = this.set("secretsmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretsmanager: Self = this.set("secretsmanager", js.undefined)
    
    @scala.inline
    def setSecurityhub(value: typingsSlinky.awsSdk.securityhubMod.ClientConfiguration): Self = this.set("securityhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityhub: Self = this.set("securityhub", js.undefined)
    
    @scala.inline
    def setServerlessapplicationrepository(value: typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration): Self = this.set("serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerlessapplicationrepository: Self = this.set("serverlessapplicationrepository", js.undefined)
    
    @scala.inline
    def setServicecatalog(value: typingsSlinky.awsSdk.servicecatalogMod.ClientConfiguration): Self = this.set("servicecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicecatalog: Self = this.set("servicecatalog", js.undefined)
    
    @scala.inline
    def setServicediscovery(value: typingsSlinky.awsSdk.servicediscoveryMod.ClientConfiguration): Self = this.set("servicediscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicediscovery: Self = this.set("servicediscovery", js.undefined)
    
    @scala.inline
    def setServicequotas(value: typingsSlinky.awsSdk.servicequotasMod.ClientConfiguration): Self = this.set("servicequotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicequotas: Self = this.set("servicequotas", js.undefined)
    
    @scala.inline
    def setSes(value: typingsSlinky.awsSdk.sesMod.ClientConfiguration): Self = this.set("ses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSes: Self = this.set("ses", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    
    @scala.inline
    def setSesv2(value: typingsSlinky.awsSdk.sesv2Mod.ClientConfiguration): Self = this.set("sesv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSesv2: Self = this.set("sesv2", js.undefined)
    
    @scala.inline
    def setShield(value: typingsSlinky.awsSdk.shieldMod.ClientConfiguration): Self = this.set("shield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShield: Self = this.set("shield", js.undefined)
    
    @scala.inline
    def setSignatureCache(value: Boolean): Self = this.set("signatureCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureCache: Self = this.set("signatureCache", js.undefined)
    
    @scala.inline
    def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = this.set("signatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureVersion: Self = this.set("signatureVersion", js.undefined)
    
    @scala.inline
    def setSigner(value: typingsSlinky.awsSdk.signerMod.ClientConfiguration): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setSimpledb(value: typingsSlinky.awsSdk.simpledbMod.ClientConfiguration): Self = this.set("simpledb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpledb: Self = this.set("simpledb", js.undefined)
    
    @scala.inline
    def setSms(value: typingsSlinky.awsSdk.smsMod.ClientConfiguration): Self = this.set("sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSms: Self = this.set("sms", js.undefined)
    
    @scala.inline
    def setSnowball(value: typingsSlinky.awsSdk.snowballMod.ClientConfiguration): Self = this.set("snowball", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowball: Self = this.set("snowball", js.undefined)
    
    @scala.inline
    def setSns(value: typingsSlinky.awsSdk.snsMod.ClientConfiguration): Self = this.set("sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    
    @scala.inline
    def setSqs(value: typingsSlinky.awsSdk.sqsMod.ClientConfiguration): Self = this.set("sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = this.set("sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslEnabled: Self = this.set("sslEnabled", js.undefined)
    
    @scala.inline
    def setSsm(value: typingsSlinky.awsSdk.ssmMod.ClientConfiguration): Self = this.set("ssm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsm: Self = this.set("ssm", js.undefined)
    
    @scala.inline
    def setSso(value: typingsSlinky.awsSdk.ssoMod.ClientConfiguration): Self = this.set("sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSso: Self = this.set("sso", js.undefined)
    
    @scala.inline
    def setSsooidc(value: typingsSlinky.awsSdk.ssooidcMod.ClientConfiguration): Self = this.set("ssooidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsooidc: Self = this.set("ssooidc", js.undefined)
    
    @scala.inline
    def setStepfunctions(value: typingsSlinky.awsSdk.stepfunctionsMod.ClientConfiguration): Self = this.set("stepfunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepfunctions: Self = this.set("stepfunctions", js.undefined)
    
    @scala.inline
    def setStoragegateway(value: typingsSlinky.awsSdk.storagegatewayMod.ClientConfiguration): Self = this.set("storagegateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoragegateway: Self = this.set("storagegateway", js.undefined)
    
    @scala.inline
    def setSts(value: typingsSlinky.awsSdk.stsMod.ClientConfiguration): Self = this.set("sts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSts: Self = this.set("sts", js.undefined)
    
    @scala.inline
    def setStsRegionalEndpoints(value: legacy_ | regional_): Self = this.set("stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStsRegionalEndpoints: Self = this.set("stsRegionalEndpoints", js.undefined)
    
    @scala.inline
    def setSupport(value: typingsSlinky.awsSdk.supportMod.ClientConfiguration): Self = this.set("support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupport: Self = this.set("support", js.undefined)
    
    @scala.inline
    def setSwf(value: typingsSlinky.awsSdk.swfMod.ClientConfiguration): Self = this.set("swf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwf: Self = this.set("swf", js.undefined)
    
    @scala.inline
    def setSynthetics(value: typingsSlinky.awsSdk.syntheticsMod.ClientConfiguration): Self = this.set("synthetics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynthetics: Self = this.set("synthetics", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = this.set("systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemClockOffset: Self = this.set("systemClockOffset", js.undefined)
    
    @scala.inline
    def setTextract(value: typingsSlinky.awsSdk.textractMod.ClientConfiguration): Self = this.set("textract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextract: Self = this.set("textract", js.undefined)
    
    @scala.inline
    def setTranscribeservice(value: typingsSlinky.awsSdk.transcribeserviceMod.ClientConfiguration): Self = this.set("transcribeservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscribeservice: Self = this.set("transcribeservice", js.undefined)
    
    @scala.inline
    def setTransfer(value: typingsSlinky.awsSdk.transferMod.ClientConfiguration): Self = this.set("transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfer: Self = this.set("transfer", js.undefined)
    
    @scala.inline
    def setTranslate(value: typingsSlinky.awsSdk.translateMod.ClientConfiguration): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = this.set("useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccelerateEndpoint: Self = this.set("useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def setWaf(value: typingsSlinky.awsSdk.wafMod.ClientConfiguration): Self = this.set("waf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaf: Self = this.set("waf", js.undefined)
    
    @scala.inline
    def setWafregional(value: typingsSlinky.awsSdk.wafregionalMod.ClientConfiguration): Self = this.set("wafregional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWafregional: Self = this.set("wafregional", js.undefined)
    
    @scala.inline
    def setWafv2(value: typingsSlinky.awsSdk.wafv2Mod.ClientConfiguration): Self = this.set("wafv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWafv2: Self = this.set("wafv2", js.undefined)
    
    @scala.inline
    def setWorkdocs(value: typingsSlinky.awsSdk.workdocsMod.ClientConfiguration): Self = this.set("workdocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkdocs: Self = this.set("workdocs", js.undefined)
    
    @scala.inline
    def setWorklink(value: typingsSlinky.awsSdk.worklinkMod.ClientConfiguration): Self = this.set("worklink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorklink: Self = this.set("worklink", js.undefined)
    
    @scala.inline
    def setWorkmail(value: typingsSlinky.awsSdk.workmailMod.ClientConfiguration): Self = this.set("workmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkmail: Self = this.set("workmail", js.undefined)
    
    @scala.inline
    def setWorkmailmessageflow(value: typingsSlinky.awsSdk.workmailmessageflowMod.ClientConfiguration): Self = this.set("workmailmessageflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkmailmessageflow: Self = this.set("workmailmessageflow", js.undefined)
    
    @scala.inline
    def setWorkspaces(value: typingsSlinky.awsSdk.workspacesMod.ClientConfiguration): Self = this.set("workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaces: Self = this.set("workspaces", js.undefined)
    
    @scala.inline
    def setXray(value: typingsSlinky.awsSdk.xrayMod.ClientConfiguration): Self = this.set("xray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXray: Self = this.set("xray", js.undefined)
  }
}
