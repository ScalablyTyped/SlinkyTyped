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
import scala.scalajs.js.annotation._

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
  /**
    *  whether to marshal request parameters to the prefix of hostname.
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
  var iotthingsgraph: js.UndefOr[typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.native
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
    * when region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  /**
    * whether to override the request region with the region inferred
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
    * whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
  var support: js.UndefOr[typingsSlinky.awsSdk.supportMod.ClientConfiguration] = js.native
  var swf: js.UndefOr[typingsSlinky.awsSdk.swfMod.ClientConfiguration] = js.native
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
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessanalyzer(value: ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessanalyzer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessanalyzer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessanalyzer")(js.undefined)
        ret
    }
    @scala.inline
    def withAcm(value: typingsSlinky.awsSdk.acmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(js.undefined)
        ret
    }
    @scala.inline
    def withAcmpca(value: typingsSlinky.awsSdk.acmpcaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acmpca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcmpca: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acmpca")(js.undefined)
        ret
    }
    @scala.inline
    def withAlexaforbusiness(value: typingsSlinky.awsSdk.alexaforbusinessMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alexaforbusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlexaforbusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alexaforbusiness")(js.undefined)
        ret
    }
    @scala.inline
    def withAmplify(value: typingsSlinky.awsSdk.amplifyMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmplify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplify")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersion(value: latest_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersions(value: ConfigurationServiceApiVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withApigateway(value: typingsSlinky.awsSdk.apigatewayMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApigateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigateway")(js.undefined)
        ret
    }
    @scala.inline
    def withApigatewaymanagementapi(value: typingsSlinky.awsSdk.apigatewaymanagementapiMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigatewaymanagementapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApigatewaymanagementapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigatewaymanagementapi")(js.undefined)
        ret
    }
    @scala.inline
    def withApigatewayv2(value: typingsSlinky.awsSdk.apigatewayv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigatewayv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApigatewayv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apigatewayv2")(js.undefined)
        ret
    }
    @scala.inline
    def withAppconfig(value: typingsSlinky.awsSdk.appconfigMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationautoscaling(value: typingsSlinky.awsSdk.applicationautoscalingMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationautoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationautoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationautoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationinsights(value: typingsSlinky.awsSdk.applicationinsightsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationinsights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationinsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationinsights")(js.undefined)
        ret
    }
    @scala.inline
    def withAppmesh(value: typingsSlinky.awsSdk.appmeshMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appmesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppmesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appmesh")(js.undefined)
        ret
    }
    @scala.inline
    def withAppstream(value: typingsSlinky.awsSdk.appstreamMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appstream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppstream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appstream")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsync(value: typingsSlinky.awsSdk.appsyncMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsync")(js.undefined)
        ret
    }
    @scala.inline
    def withAthena(value: typingsSlinky.awsSdk.athenaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("athena")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAthena: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("athena")(js.undefined)
        ret
    }
    @scala.inline
    def withAugmentedairuntime(value: typingsSlinky.awsSdk.augmentedairuntimeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentedairuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAugmentedairuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentedairuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscaling(value: typingsSlinky.awsSdk.autoscalingMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscalingplans(value: typingsSlinky.awsSdk.autoscalingplansMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingplans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingplans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingplans")(js.undefined)
        ret
    }
    @scala.inline
    def withBackup(value: typingsSlinky.awsSdk.backupMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backup")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch(value: typingsSlinky.awsSdk.batchMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgets(value: typingsSlinky.awsSdk.budgetsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgets")(js.undefined)
        ret
    }
    @scala.inline
    def withChime(value: typingsSlinky.awsSdk.chimeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chime")(js.undefined)
        ret
    }
    @scala.inline
    def withCloud9(value: typingsSlinky.awsSdk.cloud9Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloud9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud9")(js.undefined)
        ret
    }
    @scala.inline
    def withClouddirectory(value: typingsSlinky.awsSdk.clouddirectoryMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clouddirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClouddirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clouddirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudformation(value: typingsSlinky.awsSdk.cloudformationMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudformation")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudfront(value: typingsSlinky.awsSdk.cloudfrontMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudfront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudfront")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudhsm(value: typingsSlinky.awsSdk.cloudhsmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudhsm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudhsm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudhsm")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudhsmv2(value: typingsSlinky.awsSdk.cloudhsmv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudhsmv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudhsmv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudhsmv2")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudsearch(value: typingsSlinky.awsSdk.cloudsearchMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudsearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudsearch")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudsearchdomain(value: typingsSlinky.awsSdk.cloudsearchdomainMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudsearchdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudsearchdomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudsearchdomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudtrail(value: typingsSlinky.awsSdk.cloudtrailMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudtrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudtrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudtrail")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatch(value: typingsSlinky.awsSdk.cloudwatchMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatch")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchevents(value: typingsSlinky.awsSdk.cloudwatcheventsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchevents")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchlogs(value: typingsSlinky.awsSdk.cloudwatchlogsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchlogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchlogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchlogs")(js.undefined)
        ret
    }
    @scala.inline
    def withCodebuild(value: typingsSlinky.awsSdk.codebuildMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codebuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodebuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codebuild")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecommit(value: typingsSlinky.awsSdk.codecommitMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecommit")(js.undefined)
        ret
    }
    @scala.inline
    def withCodedeploy(value: typingsSlinky.awsSdk.codedeployMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codedeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodedeploy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codedeploy")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeguruprofiler(value: typingsSlinky.awsSdk.codeguruprofilerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeguruprofiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeguruprofiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeguruprofiler")(js.undefined)
        ret
    }
    @scala.inline
    def withCodegurureviewer(value: typingsSlinky.awsSdk.codegurureviewerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codegurureviewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodegurureviewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codegurureviewer")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepipeline(value: typingsSlinky.awsSdk.codepipelineMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withCodestar(value: typingsSlinky.awsSdk.codestarMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodestar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestar")(js.undefined)
        ret
    }
    @scala.inline
    def withCodestarconnections(value: typingsSlinky.awsSdk.codestarconnectionsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestarconnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodestarconnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestarconnections")(js.undefined)
        ret
    }
    @scala.inline
    def withCodestarnotifications(value: typingsSlinky.awsSdk.codestarnotificationsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestarnotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodestarnotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codestarnotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoidentity(value: typingsSlinky.awsSdk.cognitoidentityMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoidentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoidentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoidentity")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoidentityserviceprovider(value: typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoidentityserviceprovider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoidentityserviceprovider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoidentityserviceprovider")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitosync(value: typingsSlinky.awsSdk.cognitosyncMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitosync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitosync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitosync")(js.undefined)
        ret
    }
    @scala.inline
    def withComprehend(value: typingsSlinky.awsSdk.comprehendMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComprehend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehend")(js.undefined)
        ret
    }
    @scala.inline
    def withComprehendmedical(value: typingsSlinky.awsSdk.comprehendmedicalMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehendmedical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComprehendmedical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehendmedical")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeChecksums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeChecksums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeChecksums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeChecksums")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeoptimizer(value: typingsSlinky.awsSdk.computeoptimizerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeoptimizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeoptimizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeoptimizer")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigservice(value: typingsSlinky.awsSdk.configserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configservice")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: typingsSlinky.awsSdk.connectMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectparticipant(value: typingsSlinky.awsSdk.connectparticipantMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectparticipant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectparticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectparticipant")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertResponseTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertResponseTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertResponseTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertResponseTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectClockSkew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctClockSkew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectClockSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctClockSkew")(js.undefined)
        ret
    }
    @scala.inline
    def withCostexplorer(value: typingsSlinky.awsSdk.costexplorerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costexplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostexplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costexplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialProvider(value: CredentialProviderChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials | CredentialsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(null)
        ret
    }
    @scala.inline
    def withCur(value: typingsSlinky.awsSdk.curMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cur")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUserAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withDataexchange(value: typingsSlinky.awsSdk.dataexchangeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataexchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataexchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataexchange")(js.undefined)
        ret
    }
    @scala.inline
    def withDatapipeline(value: typingsSlinky.awsSdk.datapipelineMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datapipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatapipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datapipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasync(value: typingsSlinky.awsSdk.datasyncMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasync")(js.undefined)
        ret
    }
    @scala.inline
    def withDax(value: typingsSlinky.awsSdk.daxMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dax")(js.undefined)
        ret
    }
    @scala.inline
    def withDetective(value: typingsSlinky.awsSdk.detectiveMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detective")(js.undefined)
        ret
    }
    @scala.inline
    def withDevicefarm(value: typingsSlinky.awsSdk.devicefarmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicefarm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicefarm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicefarm")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectconnect(value: typingsSlinky.awsSdk.directconnectMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryservice(value: typingsSlinky.awsSdk.directoryserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryservice")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscovery(value: typingsSlinky.awsSdk.discoveryMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(js.undefined)
        ret
    }
    @scala.inline
    def withDlm(value: typingsSlinky.awsSdk.dlmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDlm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlm")(js.undefined)
        ret
    }
    @scala.inline
    def withDms(value: typingsSlinky.awsSdk.dmsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dms")(js.undefined)
        ret
    }
    @scala.inline
    def withDocdb(value: typingsSlinky.awsSdk.docdbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docdb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocdb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docdb")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDbCrc32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDbCrc32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDbCrc32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDbCrc32")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamodb(value: typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamodbstreams(value: typingsSlinky.awsSdk.dynamodbstreamsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbstreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodbstreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbstreams")(js.undefined)
        ret
    }
    @scala.inline
    def withEbs(value: typingsSlinky.awsSdk.ebsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2(value: typingsSlinky.awsSdk.ec2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2instanceconnect(value: typingsSlinky.awsSdk.ec2instanceconnectMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2instanceconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2instanceconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2instanceconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withEcr(value: typingsSlinky.awsSdk.ecrMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecr")(js.undefined)
        ret
    }
    @scala.inline
    def withEcs(value: typingsSlinky.awsSdk.ecsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecs")(js.undefined)
        ret
    }
    @scala.inline
    def withEfs(value: typingsSlinky.awsSdk.efsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efs")(js.undefined)
        ret
    }
    @scala.inline
    def withEks(value: typingsSlinky.awsSdk.eksMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eks")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticache(value: typingsSlinky.awsSdk.elasticacheMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticache")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticbeanstalk(value: typingsSlinky.awsSdk.elasticbeanstalkMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticbeanstalk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticbeanstalk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticbeanstalk")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticinference(value: typingsSlinky.awsSdk.elasticinferenceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticinference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticinference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticinference")(js.undefined)
        ret
    }
    @scala.inline
    def withElastictranscoder(value: typingsSlinky.awsSdk.elastictranscoderMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elastictranscoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElastictranscoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elastictranscoder")(js.undefined)
        ret
    }
    @scala.inline
    def withElb(value: typingsSlinky.awsSdk.elbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elb")(js.undefined)
        ret
    }
    @scala.inline
    def withElbv2(value: typingsSlinky.awsSdk.elbv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElbv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbv2")(js.undefined)
        ret
    }
    @scala.inline
    def withEmr(value: typingsSlinky.awsSdk.emrMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emr")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointCacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointDiscoveryEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDiscoveryEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointDiscoveryEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDiscoveryEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEs(value: typingsSlinky.awsSdk.esMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(js.undefined)
        ret
    }
    @scala.inline
    def withEventbridge(value: typingsSlinky.awsSdk.eventbridgeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventbridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventbridge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventbridge")(js.undefined)
        ret
    }
    @scala.inline
    def withFirehose(value: typingsSlinky.awsSdk.firehoseMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirehose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(js.undefined)
        ret
    }
    @scala.inline
    def withFms(value: typingsSlinky.awsSdk.fmsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fms")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastqueryservice(value: typingsSlinky.awsSdk.forecastqueryserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastqueryservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastqueryservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastqueryservice")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastservice(value: typingsSlinky.awsSdk.forecastserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastservice")(js.undefined)
        ret
    }
    @scala.inline
    def withFrauddetector(value: typingsSlinky.awsSdk.frauddetectorMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frauddetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrauddetector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frauddetector")(js.undefined)
        ret
    }
    @scala.inline
    def withFsx(value: typingsSlinky.awsSdk.fsxMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsx")(js.undefined)
        ret
    }
    @scala.inline
    def withGamelift(value: typingsSlinky.awsSdk.gameliftMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamelift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamelift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamelift")(js.undefined)
        ret
    }
    @scala.inline
    def withGlacier(value: typingsSlinky.awsSdk.glacierMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glacier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlacier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glacier")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalaccelerator(value: typingsSlinky.awsSdk.globalacceleratorMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalaccelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalaccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalaccelerator")(js.undefined)
        ret
    }
    @scala.inline
    def withGlue(value: typingsSlinky.awsSdk.glueMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glue")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrass(value: typingsSlinky.awsSdk.greengrassMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrass")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundstation(value: typingsSlinky.awsSdk.groundstationMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundstation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundstation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundstation")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardduty(value: typingsSlinky.awsSdk.guarddutyMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardduty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardduty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardduty")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: typingsSlinky.awsSdk.healthMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPrefixEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefixEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPrefixEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefixEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOptions(value: HTTPOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIam(value: typingsSlinky.awsSdk.iamMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iam")(js.undefined)
        ret
    }
    @scala.inline
    def withImagebuilder(value: typingsSlinky.awsSdk.imagebuilderMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagebuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagebuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagebuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withImportexport(value: typingsSlinky.awsSdk.importexportMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importexport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportexport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importexport")(js.undefined)
        ret
    }
    @scala.inline
    def withInspector(value: typingsSlinky.awsSdk.inspectorMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspector")(js.undefined)
        ret
    }
    @scala.inline
    def withIot(value: typingsSlinky.awsSdk.iotMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot")(js.undefined)
        ret
    }
    @scala.inline
    def withIot1clickdevicesservice(value: typingsSlinky.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot1clickdevicesservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIot1clickdevicesservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot1clickdevicesservice")(js.undefined)
        ret
    }
    @scala.inline
    def withIot1clickprojects(value: typingsSlinky.awsSdk.iot1clickprojectsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot1clickprojects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIot1clickprojects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iot1clickprojects")(js.undefined)
        ret
    }
    @scala.inline
    def withIotanalytics(value: typingsSlinky.awsSdk.iotanalyticsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotanalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotanalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotanalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withIotdata(value: typingsSlinky.awsSdk.iotdataMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotdata")(js.undefined)
        ret
    }
    @scala.inline
    def withIotevents(value: typingsSlinky.awsSdk.ioteventsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotevents")(js.undefined)
        ret
    }
    @scala.inline
    def withIoteventsdata(value: typingsSlinky.awsSdk.ioteventsdataMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioteventsdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIoteventsdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioteventsdata")(js.undefined)
        ret
    }
    @scala.inline
    def withIotjobsdataplane(value: typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotjobsdataplane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotjobsdataplane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotjobsdataplane")(js.undefined)
        ret
    }
    @scala.inline
    def withIotsecuretunneling(value: typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotsecuretunneling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotsecuretunneling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotsecuretunneling")(js.undefined)
        ret
    }
    @scala.inline
    def withIotthingsgraph(value: typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotthingsgraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotthingsgraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotthingsgraph")(js.undefined)
        ret
    }
    @scala.inline
    def withKafka(value: typingsSlinky.awsSdk.kafkaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafka")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafka: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafka")(js.undefined)
        ret
    }
    @scala.inline
    def withKendra(value: typingsSlinky.awsSdk.kendraMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kendra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKendra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kendra")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesis(value: typingsSlinky.awsSdk.kinesisMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisanalytics(value: typingsSlinky.awsSdk.kinesisanalyticsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisanalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisanalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisanalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisanalyticsv2(value: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisanalyticsv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisanalyticsv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisanalyticsv2")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisvideo(value: typingsSlinky.awsSdk.kinesisvideoMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisvideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideo")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisvideoarchivedmedia(value: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideoarchivedmedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisvideoarchivedmedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideoarchivedmedia")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisvideomedia(value: typingsSlinky.awsSdk.kinesisvideomediaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideomedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisvideomedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideomedia")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisvideosignalingchannels(value: typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideosignalingchannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisvideosignalingchannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisvideosignalingchannels")(js.undefined)
        ret
    }
    @scala.inline
    def withKms(value: typingsSlinky.awsSdk.kmsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kms")(js.undefined)
        ret
    }
    @scala.inline
    def withLakeformation(value: typingsSlinky.awsSdk.lakeformationMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lakeformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLakeformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lakeformation")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: typingsSlinky.awsSdk.lambdaMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withLexmodelbuildingservice(value: typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexmodelbuildingservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexmodelbuildingservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexmodelbuildingservice")(js.undefined)
        ret
    }
    @scala.inline
    def withLexruntime(value: typingsSlinky.awsSdk.lexruntimeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexruntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexruntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexruntime")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensemanager(value: typingsSlinky.awsSdk.licensemanagerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensemanager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensemanager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensemanager")(js.undefined)
        ret
    }
    @scala.inline
    def withLightsail(value: typingsSlinky.awsSdk.lightsailMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightsail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightsail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightsail")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMachinelearning(value: typingsSlinky.awsSdk.machinelearningMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machinelearning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachinelearning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machinelearning")(js.undefined)
        ret
    }
    @scala.inline
    def withMacie(value: typingsSlinky.awsSdk.macieMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macie")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedblockchain(value: typingsSlinky.awsSdk.managedblockchainMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedblockchain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedblockchain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedblockchain")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplacecatalog(value: typingsSlinky.awsSdk.marketplacecatalogMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacecatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplacecatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacecatalog")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplacecommerceanalytics(value: typingsSlinky.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacecommerceanalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplacecommerceanalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacecommerceanalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplaceentitlementservice(value: typingsSlinky.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplaceentitlementservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplaceentitlementservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplaceentitlementservice")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplacemetering(value: typingsSlinky.awsSdk.marketplacemeteringMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacemetering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplacemetering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplacemetering")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaconnect(value: typingsSlinky.awsSdk.mediaconnectMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaconvert(value: typingsSlinky.awsSdk.mediaconvertMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaconvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaconvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaconvert")(js.undefined)
        ret
    }
    @scala.inline
    def withMedialive(value: typingsSlinky.awsSdk.medialiveMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedialive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialive")(js.undefined)
        ret
    }
    @scala.inline
    def withMediapackage(value: typingsSlinky.awsSdk.mediapackageMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediapackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediapackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediapackage")(js.undefined)
        ret
    }
    @scala.inline
    def withMediapackagevod(value: typingsSlinky.awsSdk.mediapackagevodMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediapackagevod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediapackagevod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediapackagevod")(js.undefined)
        ret
    }
    @scala.inline
    def withMediastore(value: typingsSlinky.awsSdk.mediastoreMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediastore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediastore")(js.undefined)
        ret
    }
    @scala.inline
    def withMediastoredata(value: typingsSlinky.awsSdk.mediastoredataMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediastoredata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediastoredata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediastoredata")(js.undefined)
        ret
    }
    @scala.inline
    def withMediatailor(value: typingsSlinky.awsSdk.mediatailorMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediatailor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediatailor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediatailor")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationhub(value: typingsSlinky.awsSdk.migrationhubMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationhub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationhub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationhub")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationhubconfig(value: typingsSlinky.awsSdk.migrationhubconfigMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationhubconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationhubconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationhubconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: typingsSlinky.awsSdk.mobileMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileanalytics(value: typingsSlinky.awsSdk.mobileanalyticsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileanalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileanalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileanalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withMq(value: typingsSlinky.awsSdk.mqMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mq")(js.undefined)
        ret
    }
    @scala.inline
    def withMturk(value: typingsSlinky.awsSdk.mturkMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mturk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMturk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mturk")(js.undefined)
        ret
    }
    @scala.inline
    def withNeptune(value: typingsSlinky.awsSdk.neptuneMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neptune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeptune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neptune")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkmanager(value: typingsSlinky.awsSdk.networkmanagerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkmanager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkmanager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkmanager")(js.undefined)
        ret
    }
    @scala.inline
    def withOpsworks(value: typingsSlinky.awsSdk.opsworksMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opsworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opsworks")(js.undefined)
        ret
    }
    @scala.inline
    def withOpsworkscm(value: typingsSlinky.awsSdk.opsworkscmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opsworkscm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsworkscm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opsworkscm")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizations(value: typingsSlinky.awsSdk.organizationsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(js.undefined)
        ret
    }
    @scala.inline
    def withOutposts(value: typingsSlinky.awsSdk.outpostsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outposts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutposts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outposts")(js.undefined)
        ret
    }
    @scala.inline
    def withParamValidation(value: ParamValidation | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalize(value: typingsSlinky.awsSdk.personalizeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalize")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalizeevents(value: typingsSlinky.awsSdk.personalizeeventsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizeevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizeevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizeevents")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalizeruntime(value: typingsSlinky.awsSdk.personalizeruntimeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizeruntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizeruntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizeruntime")(js.undefined)
        ret
    }
    @scala.inline
    def withPi(value: typingsSlinky.awsSdk.piMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pi")(js.undefined)
        ret
    }
    @scala.inline
    def withPinpoint(value: typingsSlinky.awsSdk.pinpointMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPinpointemail(value: typingsSlinky.awsSdk.pinpointemailMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpointemail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinpointemail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpointemail")(js.undefined)
        ret
    }
    @scala.inline
    def withPinpointsmsvoice(value: typingsSlinky.awsSdk.pinpointsmsvoiceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpointsmsvoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinpointsmsvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinpointsmsvoice")(js.undefined)
        ret
    }
    @scala.inline
    def withPolly(value: typingsSlinky.awsSdk.pollyMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polly")(js.undefined)
        ret
    }
    @scala.inline
    def withPricing(value: typingsSlinky.awsSdk.pricingMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(js.undefined)
        ret
    }
    @scala.inline
    def withQldb(value: typingsSlinky.awsSdk.qldbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qldb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQldb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qldb")(js.undefined)
        ret
    }
    @scala.inline
    def withQldbsession(value: typingsSlinky.awsSdk.qldbsessionMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qldbsession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQldbsession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qldbsession")(js.undefined)
        ret
    }
    @scala.inline
    def withQuicksight(value: typingsSlinky.awsSdk.quicksightMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicksight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuicksight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicksight")(js.undefined)
        ret
    }
    @scala.inline
    def withRam(value: typingsSlinky.awsSdk.ramMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ram")(js.undefined)
        ret
    }
    @scala.inline
    def withRds(value: typingsSlinky.awsSdk.rdsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rds")(js.undefined)
        ret
    }
    @scala.inline
    def withRdsdataservice(value: typingsSlinky.awsSdk.rdsdataserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsdataservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsdataservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsdataservice")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshift(value: typingsSlinky.awsSdk.redshiftMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshift")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRekognition(value: typingsSlinky.awsSdk.rekognitionMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rekognition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRekognition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rekognition")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcegroups(value: typingsSlinky.awsSdk.resourcegroupsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcegroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcegroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcegroups")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcegroupstaggingapi(value: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcegroupstaggingapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcegroupstaggingapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcegroupstaggingapi")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOptions(value: RetryDelayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRobomaker(value: typingsSlinky.awsSdk.robomakerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robomaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobomaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robomaker")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute53(value: typingsSlinky.awsSdk.route53Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute53: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute53domains(value: typingsSlinky.awsSdk.route53domainsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute53domains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53domains")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute53resolver(value: typingsSlinky.awsSdk.route53resolverMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute53resolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route53resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: typingsSlinky.awsSdk.s3Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DisableBodySigning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DisableBodySigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DisableBodySigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DisableBodySigning")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ForcePathStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ForcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UsEast1RegionalEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UsEast1RegionalEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UsEast1RegionalEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withS3UseArnRegion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UseArnRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UseArnRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3UseArnRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withS3control(value: typingsSlinky.awsSdk.s3controlMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3control")(js.undefined)
        ret
    }
    @scala.inline
    def withSagemaker(value: typingsSlinky.awsSdk.sagemakerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagemaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSagemaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagemaker")(js.undefined)
        ret
    }
    @scala.inline
    def withSagemakerruntime(value: typingsSlinky.awsSdk.sagemakerruntimeMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagemakerruntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSagemakerruntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagemakerruntime")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsplans(value: typingsSlinky.awsSdk.savingsplansMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsplans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsplans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsplans")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: typingsSlinky.awsSdk.schemasMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretsmanager(value: typingsSlinky.awsSdk.secretsmanagerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretsmanager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretsmanager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretsmanager")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityhub(value: typingsSlinky.awsSdk.securityhubMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityhub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityhub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityhub")(js.undefined)
        ret
    }
    @scala.inline
    def withServerlessapplicationrepository(value: typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverlessapplicationrepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerlessapplicationrepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverlessapplicationrepository")(js.undefined)
        ret
    }
    @scala.inline
    def withServicecatalog(value: typingsSlinky.awsSdk.servicecatalogMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicecatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicecatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicecatalog")(js.undefined)
        ret
    }
    @scala.inline
    def withServicediscovery(value: typingsSlinky.awsSdk.servicediscoveryMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicediscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicediscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicediscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withServicequotas(value: typingsSlinky.awsSdk.servicequotasMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicequotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicequotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicequotas")(js.undefined)
        ret
    }
    @scala.inline
    def withSes(value: typingsSlinky.awsSdk.sesMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ses")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSesv2(value: typingsSlinky.awsSdk.sesv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSesv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sesv2")(js.undefined)
        ret
    }
    @scala.inline
    def withShield(value: typingsSlinky.awsSdk.shieldMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shield")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShield: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shield")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureVersion(value: v2_ | v3 | v4 | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSigner(value: typingsSlinky.awsSdk.signerMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpledb(value: typingsSlinky.awsSdk.simpledbMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpledb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpledb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpledb")(js.undefined)
        ret
    }
    @scala.inline
    def withSms(value: typingsSlinky.awsSdk.smsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sms")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowball(value: typingsSlinky.awsSdk.snowballMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snowball")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowball: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snowball")(js.undefined)
        ret
    }
    @scala.inline
    def withSns(value: typingsSlinky.awsSdk.snsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(js.undefined)
        ret
    }
    @scala.inline
    def withSqs(value: typingsSlinky.awsSdk.sqsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(js.undefined)
        ret
    }
    @scala.inline
    def withSslEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSsm(value: typingsSlinky.awsSdk.ssmMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssm")(js.undefined)
        ret
    }
    @scala.inline
    def withSso(value: typingsSlinky.awsSdk.ssoMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(js.undefined)
        ret
    }
    @scala.inline
    def withSsooidc(value: typingsSlinky.awsSdk.ssooidcMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssooidc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsooidc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssooidc")(js.undefined)
        ret
    }
    @scala.inline
    def withStepfunctions(value: typingsSlinky.awsSdk.stepfunctionsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepfunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepfunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepfunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withStoragegateway(value: typingsSlinky.awsSdk.storagegatewayMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagegateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragegateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagegateway")(js.undefined)
        ret
    }
    @scala.inline
    def withSts(value: typingsSlinky.awsSdk.stsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sts")(js.undefined)
        ret
    }
    @scala.inline
    def withStsRegionalEndpoints(value: legacy_ | regional_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsRegionalEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStsRegionalEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsRegionalEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport(value: typingsSlinky.awsSdk.supportMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(js.undefined)
        ret
    }
    @scala.inline
    def withSwf(value: typingsSlinky.awsSdk.swfMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swf")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemClockOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemClockOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemClockOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemClockOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTextract(value: typingsSlinky.awsSdk.textractMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textract")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscribeservice(value: typingsSlinky.awsSdk.transcribeserviceMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcribeservice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscribeservice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcribeservice")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer(value: typingsSlinky.awsSdk.transferMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: typingsSlinky.awsSdk.translateMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAccelerateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAccelerateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAccelerateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withWaf(value: typingsSlinky.awsSdk.wafMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waf")(js.undefined)
        ret
    }
    @scala.inline
    def withWafregional(value: typingsSlinky.awsSdk.wafregionalMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafregional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWafregional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafregional")(js.undefined)
        ret
    }
    @scala.inline
    def withWafv2(value: typingsSlinky.awsSdk.wafv2Mod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWafv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafv2")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkdocs(value: typingsSlinky.awsSdk.workdocsMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkdocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdocs")(js.undefined)
        ret
    }
    @scala.inline
    def withWorklink(value: typingsSlinky.awsSdk.worklinkMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worklink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorklink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worklink")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkmail(value: typingsSlinky.awsSdk.workmailMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmail")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkmailmessageflow(value: typingsSlinky.awsSdk.workmailmessageflowMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmailmessageflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkmailmessageflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmailmessageflow")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaces(value: typingsSlinky.awsSdk.workspacesMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(js.undefined)
        ret
    }
    @scala.inline
    def withXray(value: typingsSlinky.awsSdk.xrayMod.ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xray")(js.undefined)
        ret
    }
  }
  
}

