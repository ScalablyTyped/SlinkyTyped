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
  var iotsitewise: js.UndefOr[typingsSlinky.awsSdk.iotsitewiseMod.ClientConfiguration] = js.native
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
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    accessKeyId: String = null,
    accessanalyzer: ClientConfiguration = null,
    acm: typingsSlinky.awsSdk.acmMod.ClientConfiguration = null,
    acmpca: typingsSlinky.awsSdk.acmpcaMod.ClientConfiguration = null,
    alexaforbusiness: typingsSlinky.awsSdk.alexaforbusinessMod.ClientConfiguration = null,
    amplify: typingsSlinky.awsSdk.amplifyMod.ClientConfiguration = null,
    apiVersion: latest_ | String = null,
    apiVersions: ConfigurationServiceApiVersions = null,
    apigateway: typingsSlinky.awsSdk.apigatewayMod.ClientConfiguration = null,
    apigatewaymanagementapi: typingsSlinky.awsSdk.apigatewaymanagementapiMod.ClientConfiguration = null,
    apigatewayv2: typingsSlinky.awsSdk.apigatewayv2Mod.ClientConfiguration = null,
    appconfig: typingsSlinky.awsSdk.appconfigMod.ClientConfiguration = null,
    applicationautoscaling: typingsSlinky.awsSdk.applicationautoscalingMod.ClientConfiguration = null,
    applicationinsights: typingsSlinky.awsSdk.applicationinsightsMod.ClientConfiguration = null,
    appmesh: typingsSlinky.awsSdk.appmeshMod.ClientConfiguration = null,
    appstream: typingsSlinky.awsSdk.appstreamMod.ClientConfiguration = null,
    appsync: typingsSlinky.awsSdk.appsyncMod.ClientConfiguration = null,
    athena: typingsSlinky.awsSdk.athenaMod.ClientConfiguration = null,
    augmentedairuntime: typingsSlinky.awsSdk.augmentedairuntimeMod.ClientConfiguration = null,
    autoscaling: typingsSlinky.awsSdk.autoscalingMod.ClientConfiguration = null,
    autoscalingplans: typingsSlinky.awsSdk.autoscalingplansMod.ClientConfiguration = null,
    backup: typingsSlinky.awsSdk.backupMod.ClientConfiguration = null,
    batch: typingsSlinky.awsSdk.batchMod.ClientConfiguration = null,
    budgets: typingsSlinky.awsSdk.budgetsMod.ClientConfiguration = null,
    chime: typingsSlinky.awsSdk.chimeMod.ClientConfiguration = null,
    cloud9: typingsSlinky.awsSdk.cloud9Mod.ClientConfiguration = null,
    clouddirectory: typingsSlinky.awsSdk.clouddirectoryMod.ClientConfiguration = null,
    cloudformation: typingsSlinky.awsSdk.cloudformationMod.ClientConfiguration = null,
    cloudfront: typingsSlinky.awsSdk.cloudfrontMod.ClientConfiguration = null,
    cloudhsm: typingsSlinky.awsSdk.cloudhsmMod.ClientConfiguration = null,
    cloudhsmv2: typingsSlinky.awsSdk.cloudhsmv2Mod.ClientConfiguration = null,
    cloudsearch: typingsSlinky.awsSdk.cloudsearchMod.ClientConfiguration = null,
    cloudsearchdomain: typingsSlinky.awsSdk.cloudsearchdomainMod.ClientConfiguration = null,
    cloudtrail: typingsSlinky.awsSdk.cloudtrailMod.ClientConfiguration = null,
    cloudwatch: typingsSlinky.awsSdk.cloudwatchMod.ClientConfiguration = null,
    cloudwatchevents: typingsSlinky.awsSdk.cloudwatcheventsMod.ClientConfiguration = null,
    cloudwatchlogs: typingsSlinky.awsSdk.cloudwatchlogsMod.ClientConfiguration = null,
    codebuild: typingsSlinky.awsSdk.codebuildMod.ClientConfiguration = null,
    codecommit: typingsSlinky.awsSdk.codecommitMod.ClientConfiguration = null,
    codedeploy: typingsSlinky.awsSdk.codedeployMod.ClientConfiguration = null,
    codeguruprofiler: typingsSlinky.awsSdk.codeguruprofilerMod.ClientConfiguration = null,
    codegurureviewer: typingsSlinky.awsSdk.codegurureviewerMod.ClientConfiguration = null,
    codepipeline: typingsSlinky.awsSdk.codepipelineMod.ClientConfiguration = null,
    codestar: typingsSlinky.awsSdk.codestarMod.ClientConfiguration = null,
    codestarconnections: typingsSlinky.awsSdk.codestarconnectionsMod.ClientConfiguration = null,
    codestarnotifications: typingsSlinky.awsSdk.codestarnotificationsMod.ClientConfiguration = null,
    cognitoidentity: typingsSlinky.awsSdk.cognitoidentityMod.ClientConfiguration = null,
    cognitoidentityserviceprovider: typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration = null,
    cognitosync: typingsSlinky.awsSdk.cognitosyncMod.ClientConfiguration = null,
    comprehend: typingsSlinky.awsSdk.comprehendMod.ClientConfiguration = null,
    comprehendmedical: typingsSlinky.awsSdk.comprehendmedicalMod.ClientConfiguration = null,
    computeChecksums: js.UndefOr[Boolean] = js.undefined,
    computeoptimizer: typingsSlinky.awsSdk.computeoptimizerMod.ClientConfiguration = null,
    configservice: typingsSlinky.awsSdk.configserviceMod.ClientConfiguration = null,
    connect: typingsSlinky.awsSdk.connectMod.ClientConfiguration = null,
    connectparticipant: typingsSlinky.awsSdk.connectparticipantMod.ClientConfiguration = null,
    convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
    correctClockSkew: js.UndefOr[Boolean] = js.undefined,
    costexplorer: typingsSlinky.awsSdk.costexplorerMod.ClientConfiguration = null,
    credentialProvider: CredentialProviderChain = null,
    credentials: js.UndefOr[Null | Credentials | CredentialsOptions] = js.undefined,
    cur: typingsSlinky.awsSdk.curMod.ClientConfiguration = null,
    customUserAgent: String = null,
    dataexchange: typingsSlinky.awsSdk.dataexchangeMod.ClientConfiguration = null,
    datapipeline: typingsSlinky.awsSdk.datapipelineMod.ClientConfiguration = null,
    datasync: typingsSlinky.awsSdk.datasyncMod.ClientConfiguration = null,
    dax: typingsSlinky.awsSdk.daxMod.ClientConfiguration = null,
    detective: typingsSlinky.awsSdk.detectiveMod.ClientConfiguration = null,
    devicefarm: typingsSlinky.awsSdk.devicefarmMod.ClientConfiguration = null,
    directconnect: typingsSlinky.awsSdk.directconnectMod.ClientConfiguration = null,
    directoryservice: typingsSlinky.awsSdk.directoryserviceMod.ClientConfiguration = null,
    discovery: typingsSlinky.awsSdk.discoveryMod.ClientConfiguration = null,
    dlm: typingsSlinky.awsSdk.dlmMod.ClientConfiguration = null,
    dms: typingsSlinky.awsSdk.dmsMod.ClientConfiguration = null,
    docdb: typingsSlinky.awsSdk.docdbMod.ClientConfiguration = null,
    dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
    dynamodb: typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration = null,
    dynamodbstreams: typingsSlinky.awsSdk.dynamodbstreamsMod.ClientConfiguration = null,
    ebs: typingsSlinky.awsSdk.ebsMod.ClientConfiguration = null,
    ec2: typingsSlinky.awsSdk.ec2Mod.ClientConfiguration = null,
    ec2instanceconnect: typingsSlinky.awsSdk.ec2instanceconnectMod.ClientConfiguration = null,
    ecr: typingsSlinky.awsSdk.ecrMod.ClientConfiguration = null,
    ecs: typingsSlinky.awsSdk.ecsMod.ClientConfiguration = null,
    efs: typingsSlinky.awsSdk.efsMod.ClientConfiguration = null,
    eks: typingsSlinky.awsSdk.eksMod.ClientConfiguration = null,
    elasticache: typingsSlinky.awsSdk.elasticacheMod.ClientConfiguration = null,
    elasticbeanstalk: typingsSlinky.awsSdk.elasticbeanstalkMod.ClientConfiguration = null,
    elasticinference: typingsSlinky.awsSdk.elasticinferenceMod.ClientConfiguration = null,
    elastictranscoder: typingsSlinky.awsSdk.elastictranscoderMod.ClientConfiguration = null,
    elb: typingsSlinky.awsSdk.elbMod.ClientConfiguration = null,
    elbv2: typingsSlinky.awsSdk.elbv2Mod.ClientConfiguration = null,
    emr: typingsSlinky.awsSdk.emrMod.ClientConfiguration = null,
    endpointCacheSize: js.UndefOr[Double] = js.undefined,
    endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
    es: typingsSlinky.awsSdk.esMod.ClientConfiguration = null,
    eventbridge: typingsSlinky.awsSdk.eventbridgeMod.ClientConfiguration = null,
    firehose: typingsSlinky.awsSdk.firehoseMod.ClientConfiguration = null,
    fms: typingsSlinky.awsSdk.fmsMod.ClientConfiguration = null,
    forecastqueryservice: typingsSlinky.awsSdk.forecastqueryserviceMod.ClientConfiguration = null,
    forecastservice: typingsSlinky.awsSdk.forecastserviceMod.ClientConfiguration = null,
    frauddetector: typingsSlinky.awsSdk.frauddetectorMod.ClientConfiguration = null,
    fsx: typingsSlinky.awsSdk.fsxMod.ClientConfiguration = null,
    gamelift: typingsSlinky.awsSdk.gameliftMod.ClientConfiguration = null,
    glacier: typingsSlinky.awsSdk.glacierMod.ClientConfiguration = null,
    globalaccelerator: typingsSlinky.awsSdk.globalacceleratorMod.ClientConfiguration = null,
    glue: typingsSlinky.awsSdk.glueMod.ClientConfiguration = null,
    greengrass: typingsSlinky.awsSdk.greengrassMod.ClientConfiguration = null,
    groundstation: typingsSlinky.awsSdk.groundstationMod.ClientConfiguration = null,
    guardduty: typingsSlinky.awsSdk.guarddutyMod.ClientConfiguration = null,
    health: typingsSlinky.awsSdk.healthMod.ClientConfiguration = null,
    hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
    httpOptions: HTTPOptions = null,
    iam: typingsSlinky.awsSdk.iamMod.ClientConfiguration = null,
    imagebuilder: typingsSlinky.awsSdk.imagebuilderMod.ClientConfiguration = null,
    importexport: typingsSlinky.awsSdk.importexportMod.ClientConfiguration = null,
    inspector: typingsSlinky.awsSdk.inspectorMod.ClientConfiguration = null,
    iot: typingsSlinky.awsSdk.iotMod.ClientConfiguration = null,
    iot1clickdevicesservice: typingsSlinky.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration = null,
    iot1clickprojects: typingsSlinky.awsSdk.iot1clickprojectsMod.ClientConfiguration = null,
    iotanalytics: typingsSlinky.awsSdk.iotanalyticsMod.ClientConfiguration = null,
    iotdata: typingsSlinky.awsSdk.iotdataMod.ClientConfiguration = null,
    iotevents: typingsSlinky.awsSdk.ioteventsMod.ClientConfiguration = null,
    ioteventsdata: typingsSlinky.awsSdk.ioteventsdataMod.ClientConfiguration = null,
    iotjobsdataplane: typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientConfiguration = null,
    iotsecuretunneling: typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientConfiguration = null,
    iotsitewise: typingsSlinky.awsSdk.iotsitewiseMod.ClientConfiguration = null,
    iotthingsgraph: typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration = null,
    kafka: typingsSlinky.awsSdk.kafkaMod.ClientConfiguration = null,
    kendra: typingsSlinky.awsSdk.kendraMod.ClientConfiguration = null,
    kinesis: typingsSlinky.awsSdk.kinesisMod.ClientConfiguration = null,
    kinesisanalytics: typingsSlinky.awsSdk.kinesisanalyticsMod.ClientConfiguration = null,
    kinesisanalyticsv2: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration = null,
    kinesisvideo: typingsSlinky.awsSdk.kinesisvideoMod.ClientConfiguration = null,
    kinesisvideoarchivedmedia: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration = null,
    kinesisvideomedia: typingsSlinky.awsSdk.kinesisvideomediaMod.ClientConfiguration = null,
    kinesisvideosignalingchannels: typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration = null,
    kms: typingsSlinky.awsSdk.kmsMod.ClientConfiguration = null,
    lakeformation: typingsSlinky.awsSdk.lakeformationMod.ClientConfiguration = null,
    lambda: typingsSlinky.awsSdk.lambdaMod.ClientConfiguration = null,
    lexmodelbuildingservice: typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration = null,
    lexruntime: typingsSlinky.awsSdk.lexruntimeMod.ClientConfiguration = null,
    licensemanager: typingsSlinky.awsSdk.licensemanagerMod.ClientConfiguration = null,
    lightsail: typingsSlinky.awsSdk.lightsailMod.ClientConfiguration = null,
    logger: Logger = null,
    machinelearning: typingsSlinky.awsSdk.machinelearningMod.ClientConfiguration = null,
    macie: typingsSlinky.awsSdk.macieMod.ClientConfiguration = null,
    macie2: typingsSlinky.awsSdk.macie2Mod.ClientConfiguration = null,
    managedblockchain: typingsSlinky.awsSdk.managedblockchainMod.ClientConfiguration = null,
    marketplacecatalog: typingsSlinky.awsSdk.marketplacecatalogMod.ClientConfiguration = null,
    marketplacecommerceanalytics: typingsSlinky.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration = null,
    marketplaceentitlementservice: typingsSlinky.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration = null,
    marketplacemetering: typingsSlinky.awsSdk.marketplacemeteringMod.ClientConfiguration = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    mediaconnect: typingsSlinky.awsSdk.mediaconnectMod.ClientConfiguration = null,
    mediaconvert: typingsSlinky.awsSdk.mediaconvertMod.ClientConfiguration = null,
    medialive: typingsSlinky.awsSdk.medialiveMod.ClientConfiguration = null,
    mediapackage: typingsSlinky.awsSdk.mediapackageMod.ClientConfiguration = null,
    mediapackagevod: typingsSlinky.awsSdk.mediapackagevodMod.ClientConfiguration = null,
    mediastore: typingsSlinky.awsSdk.mediastoreMod.ClientConfiguration = null,
    mediastoredata: typingsSlinky.awsSdk.mediastoredataMod.ClientConfiguration = null,
    mediatailor: typingsSlinky.awsSdk.mediatailorMod.ClientConfiguration = null,
    migrationhub: typingsSlinky.awsSdk.migrationhubMod.ClientConfiguration = null,
    migrationhubconfig: typingsSlinky.awsSdk.migrationhubconfigMod.ClientConfiguration = null,
    mobile: typingsSlinky.awsSdk.mobileMod.ClientConfiguration = null,
    mobileanalytics: typingsSlinky.awsSdk.mobileanalyticsMod.ClientConfiguration = null,
    mq: typingsSlinky.awsSdk.mqMod.ClientConfiguration = null,
    mturk: typingsSlinky.awsSdk.mturkMod.ClientConfiguration = null,
    neptune: typingsSlinky.awsSdk.neptuneMod.ClientConfiguration = null,
    networkmanager: typingsSlinky.awsSdk.networkmanagerMod.ClientConfiguration = null,
    opsworks: typingsSlinky.awsSdk.opsworksMod.ClientConfiguration = null,
    opsworkscm: typingsSlinky.awsSdk.opsworkscmMod.ClientConfiguration = null,
    organizations: typingsSlinky.awsSdk.organizationsMod.ClientConfiguration = null,
    outposts: typingsSlinky.awsSdk.outpostsMod.ClientConfiguration = null,
    paramValidation: ParamValidation | Boolean = null,
    personalize: typingsSlinky.awsSdk.personalizeMod.ClientConfiguration = null,
    personalizeevents: typingsSlinky.awsSdk.personalizeeventsMod.ClientConfiguration = null,
    personalizeruntime: typingsSlinky.awsSdk.personalizeruntimeMod.ClientConfiguration = null,
    pi: typingsSlinky.awsSdk.piMod.ClientConfiguration = null,
    pinpoint: typingsSlinky.awsSdk.pinpointMod.ClientConfiguration = null,
    pinpointemail: typingsSlinky.awsSdk.pinpointemailMod.ClientConfiguration = null,
    pinpointsmsvoice: typingsSlinky.awsSdk.pinpointsmsvoiceMod.ClientConfiguration = null,
    polly: typingsSlinky.awsSdk.pollyMod.ClientConfiguration = null,
    pricing: typingsSlinky.awsSdk.pricingMod.ClientConfiguration = null,
    qldb: typingsSlinky.awsSdk.qldbMod.ClientConfiguration = null,
    qldbsession: typingsSlinky.awsSdk.qldbsessionMod.ClientConfiguration = null,
    quicksight: typingsSlinky.awsSdk.quicksightMod.ClientConfiguration = null,
    ram: typingsSlinky.awsSdk.ramMod.ClientConfiguration = null,
    rds: typingsSlinky.awsSdk.rdsMod.ClientConfiguration = null,
    rdsdataservice: typingsSlinky.awsSdk.rdsdataserviceMod.ClientConfiguration = null,
    redshift: typingsSlinky.awsSdk.redshiftMod.ClientConfiguration = null,
    region: String = null,
    rekognition: typingsSlinky.awsSdk.rekognitionMod.ClientConfiguration = null,
    resourcegroups: typingsSlinky.awsSdk.resourcegroupsMod.ClientConfiguration = null,
    resourcegroupstaggingapi: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration = null,
    retryDelayOptions: RetryDelayOptions = null,
    robomaker: typingsSlinky.awsSdk.robomakerMod.ClientConfiguration = null,
    route53: typingsSlinky.awsSdk.route53Mod.ClientConfiguration = null,
    route53domains: typingsSlinky.awsSdk.route53domainsMod.ClientConfiguration = null,
    route53resolver: typingsSlinky.awsSdk.route53resolverMod.ClientConfiguration = null,
    s3: typingsSlinky.awsSdk.s3Mod.ClientConfiguration = null,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    s3UsEast1RegionalEndpoint: regional_ | legacy_ = null,
    s3UseArnRegion: js.UndefOr[Boolean] = js.undefined,
    s3control: typingsSlinky.awsSdk.s3controlMod.ClientConfiguration = null,
    sagemaker: typingsSlinky.awsSdk.sagemakerMod.ClientConfiguration = null,
    sagemakerruntime: typingsSlinky.awsSdk.sagemakerruntimeMod.ClientConfiguration = null,
    savingsplans: typingsSlinky.awsSdk.savingsplansMod.ClientConfiguration = null,
    schemas: typingsSlinky.awsSdk.schemasMod.ClientConfiguration = null,
    secretAccessKey: String = null,
    secretsmanager: typingsSlinky.awsSdk.secretsmanagerMod.ClientConfiguration = null,
    securityhub: typingsSlinky.awsSdk.securityhubMod.ClientConfiguration = null,
    serverlessapplicationrepository: typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration = null,
    servicecatalog: typingsSlinky.awsSdk.servicecatalogMod.ClientConfiguration = null,
    servicediscovery: typingsSlinky.awsSdk.servicediscoveryMod.ClientConfiguration = null,
    servicequotas: typingsSlinky.awsSdk.servicequotasMod.ClientConfiguration = null,
    ses: typingsSlinky.awsSdk.sesMod.ClientConfiguration = null,
    sessionToken: String = null,
    sesv2: typingsSlinky.awsSdk.sesv2Mod.ClientConfiguration = null,
    shield: typingsSlinky.awsSdk.shieldMod.ClientConfiguration = null,
    signatureCache: js.UndefOr[Boolean] = js.undefined,
    signatureVersion: v2_ | v3 | v4 | String = null,
    signer: typingsSlinky.awsSdk.signerMod.ClientConfiguration = null,
    simpledb: typingsSlinky.awsSdk.simpledbMod.ClientConfiguration = null,
    sms: typingsSlinky.awsSdk.smsMod.ClientConfiguration = null,
    snowball: typingsSlinky.awsSdk.snowballMod.ClientConfiguration = null,
    sns: typingsSlinky.awsSdk.snsMod.ClientConfiguration = null,
    sqs: typingsSlinky.awsSdk.sqsMod.ClientConfiguration = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    ssm: typingsSlinky.awsSdk.ssmMod.ClientConfiguration = null,
    sso: typingsSlinky.awsSdk.ssoMod.ClientConfiguration = null,
    ssooidc: typingsSlinky.awsSdk.ssooidcMod.ClientConfiguration = null,
    stepfunctions: typingsSlinky.awsSdk.stepfunctionsMod.ClientConfiguration = null,
    storagegateway: typingsSlinky.awsSdk.storagegatewayMod.ClientConfiguration = null,
    sts: typingsSlinky.awsSdk.stsMod.ClientConfiguration = null,
    stsRegionalEndpoints: legacy_ | regional_ = null,
    support: typingsSlinky.awsSdk.supportMod.ClientConfiguration = null,
    swf: typingsSlinky.awsSdk.swfMod.ClientConfiguration = null,
    synthetics: typingsSlinky.awsSdk.syntheticsMod.ClientConfiguration = null,
    systemClockOffset: js.UndefOr[Double] = js.undefined,
    textract: typingsSlinky.awsSdk.textractMod.ClientConfiguration = null,
    transcribeservice: typingsSlinky.awsSdk.transcribeserviceMod.ClientConfiguration = null,
    transfer: typingsSlinky.awsSdk.transferMod.ClientConfiguration = null,
    translate: typingsSlinky.awsSdk.translateMod.ClientConfiguration = null,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    waf: typingsSlinky.awsSdk.wafMod.ClientConfiguration = null,
    wafregional: typingsSlinky.awsSdk.wafregionalMod.ClientConfiguration = null,
    wafv2: typingsSlinky.awsSdk.wafv2Mod.ClientConfiguration = null,
    workdocs: typingsSlinky.awsSdk.workdocsMod.ClientConfiguration = null,
    worklink: typingsSlinky.awsSdk.worklinkMod.ClientConfiguration = null,
    workmail: typingsSlinky.awsSdk.workmailMod.ClientConfiguration = null
  ): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (accessanalyzer != null) __obj.updateDynamic("accessanalyzer")(accessanalyzer.asInstanceOf[js.Any])
    if (acm != null) __obj.updateDynamic("acm")(acm.asInstanceOf[js.Any])
    if (acmpca != null) __obj.updateDynamic("acmpca")(acmpca.asInstanceOf[js.Any])
    if (alexaforbusiness != null) __obj.updateDynamic("alexaforbusiness")(alexaforbusiness.asInstanceOf[js.Any])
    if (amplify != null) __obj.updateDynamic("amplify")(amplify.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
    if (apigateway != null) __obj.updateDynamic("apigateway")(apigateway.asInstanceOf[js.Any])
    if (apigatewaymanagementapi != null) __obj.updateDynamic("apigatewaymanagementapi")(apigatewaymanagementapi.asInstanceOf[js.Any])
    if (apigatewayv2 != null) __obj.updateDynamic("apigatewayv2")(apigatewayv2.asInstanceOf[js.Any])
    if (appconfig != null) __obj.updateDynamic("appconfig")(appconfig.asInstanceOf[js.Any])
    if (applicationautoscaling != null) __obj.updateDynamic("applicationautoscaling")(applicationautoscaling.asInstanceOf[js.Any])
    if (applicationinsights != null) __obj.updateDynamic("applicationinsights")(applicationinsights.asInstanceOf[js.Any])
    if (appmesh != null) __obj.updateDynamic("appmesh")(appmesh.asInstanceOf[js.Any])
    if (appstream != null) __obj.updateDynamic("appstream")(appstream.asInstanceOf[js.Any])
    if (appsync != null) __obj.updateDynamic("appsync")(appsync.asInstanceOf[js.Any])
    if (athena != null) __obj.updateDynamic("athena")(athena.asInstanceOf[js.Any])
    if (augmentedairuntime != null) __obj.updateDynamic("augmentedairuntime")(augmentedairuntime.asInstanceOf[js.Any])
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (autoscalingplans != null) __obj.updateDynamic("autoscalingplans")(autoscalingplans.asInstanceOf[js.Any])
    if (backup != null) __obj.updateDynamic("backup")(backup.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (budgets != null) __obj.updateDynamic("budgets")(budgets.asInstanceOf[js.Any])
    if (chime != null) __obj.updateDynamic("chime")(chime.asInstanceOf[js.Any])
    if (cloud9 != null) __obj.updateDynamic("cloud9")(cloud9.asInstanceOf[js.Any])
    if (clouddirectory != null) __obj.updateDynamic("clouddirectory")(clouddirectory.asInstanceOf[js.Any])
    if (cloudformation != null) __obj.updateDynamic("cloudformation")(cloudformation.asInstanceOf[js.Any])
    if (cloudfront != null) __obj.updateDynamic("cloudfront")(cloudfront.asInstanceOf[js.Any])
    if (cloudhsm != null) __obj.updateDynamic("cloudhsm")(cloudhsm.asInstanceOf[js.Any])
    if (cloudhsmv2 != null) __obj.updateDynamic("cloudhsmv2")(cloudhsmv2.asInstanceOf[js.Any])
    if (cloudsearch != null) __obj.updateDynamic("cloudsearch")(cloudsearch.asInstanceOf[js.Any])
    if (cloudsearchdomain != null) __obj.updateDynamic("cloudsearchdomain")(cloudsearchdomain.asInstanceOf[js.Any])
    if (cloudtrail != null) __obj.updateDynamic("cloudtrail")(cloudtrail.asInstanceOf[js.Any])
    if (cloudwatch != null) __obj.updateDynamic("cloudwatch")(cloudwatch.asInstanceOf[js.Any])
    if (cloudwatchevents != null) __obj.updateDynamic("cloudwatchevents")(cloudwatchevents.asInstanceOf[js.Any])
    if (cloudwatchlogs != null) __obj.updateDynamic("cloudwatchlogs")(cloudwatchlogs.asInstanceOf[js.Any])
    if (codebuild != null) __obj.updateDynamic("codebuild")(codebuild.asInstanceOf[js.Any])
    if (codecommit != null) __obj.updateDynamic("codecommit")(codecommit.asInstanceOf[js.Any])
    if (codedeploy != null) __obj.updateDynamic("codedeploy")(codedeploy.asInstanceOf[js.Any])
    if (codeguruprofiler != null) __obj.updateDynamic("codeguruprofiler")(codeguruprofiler.asInstanceOf[js.Any])
    if (codegurureviewer != null) __obj.updateDynamic("codegurureviewer")(codegurureviewer.asInstanceOf[js.Any])
    if (codepipeline != null) __obj.updateDynamic("codepipeline")(codepipeline.asInstanceOf[js.Any])
    if (codestar != null) __obj.updateDynamic("codestar")(codestar.asInstanceOf[js.Any])
    if (codestarconnections != null) __obj.updateDynamic("codestarconnections")(codestarconnections.asInstanceOf[js.Any])
    if (codestarnotifications != null) __obj.updateDynamic("codestarnotifications")(codestarnotifications.asInstanceOf[js.Any])
    if (cognitoidentity != null) __obj.updateDynamic("cognitoidentity")(cognitoidentity.asInstanceOf[js.Any])
    if (cognitoidentityserviceprovider != null) __obj.updateDynamic("cognitoidentityserviceprovider")(cognitoidentityserviceprovider.asInstanceOf[js.Any])
    if (cognitosync != null) __obj.updateDynamic("cognitosync")(cognitosync.asInstanceOf[js.Any])
    if (comprehend != null) __obj.updateDynamic("comprehend")(comprehend.asInstanceOf[js.Any])
    if (comprehendmedical != null) __obj.updateDynamic("comprehendmedical")(comprehendmedical.asInstanceOf[js.Any])
    if (!js.isUndefined(computeChecksums)) __obj.updateDynamic("computeChecksums")(computeChecksums.get.asInstanceOf[js.Any])
    if (computeoptimizer != null) __obj.updateDynamic("computeoptimizer")(computeoptimizer.asInstanceOf[js.Any])
    if (configservice != null) __obj.updateDynamic("configservice")(configservice.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (connectparticipant != null) __obj.updateDynamic("connectparticipant")(connectparticipant.asInstanceOf[js.Any])
    if (!js.isUndefined(convertResponseTypes)) __obj.updateDynamic("convertResponseTypes")(convertResponseTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(correctClockSkew)) __obj.updateDynamic("correctClockSkew")(correctClockSkew.get.asInstanceOf[js.Any])
    if (costexplorer != null) __obj.updateDynamic("costexplorer")(costexplorer.asInstanceOf[js.Any])
    if (credentialProvider != null) __obj.updateDynamic("credentialProvider")(credentialProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (cur != null) __obj.updateDynamic("cur")(cur.asInstanceOf[js.Any])
    if (customUserAgent != null) __obj.updateDynamic("customUserAgent")(customUserAgent.asInstanceOf[js.Any])
    if (dataexchange != null) __obj.updateDynamic("dataexchange")(dataexchange.asInstanceOf[js.Any])
    if (datapipeline != null) __obj.updateDynamic("datapipeline")(datapipeline.asInstanceOf[js.Any])
    if (datasync != null) __obj.updateDynamic("datasync")(datasync.asInstanceOf[js.Any])
    if (dax != null) __obj.updateDynamic("dax")(dax.asInstanceOf[js.Any])
    if (detective != null) __obj.updateDynamic("detective")(detective.asInstanceOf[js.Any])
    if (devicefarm != null) __obj.updateDynamic("devicefarm")(devicefarm.asInstanceOf[js.Any])
    if (directconnect != null) __obj.updateDynamic("directconnect")(directconnect.asInstanceOf[js.Any])
    if (directoryservice != null) __obj.updateDynamic("directoryservice")(directoryservice.asInstanceOf[js.Any])
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    if (dlm != null) __obj.updateDynamic("dlm")(dlm.asInstanceOf[js.Any])
    if (dms != null) __obj.updateDynamic("dms")(dms.asInstanceOf[js.Any])
    if (docdb != null) __obj.updateDynamic("docdb")(docdb.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamoDbCrc32)) __obj.updateDynamic("dynamoDbCrc32")(dynamoDbCrc32.get.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (dynamodbstreams != null) __obj.updateDynamic("dynamodbstreams")(dynamodbstreams.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (ec2 != null) __obj.updateDynamic("ec2")(ec2.asInstanceOf[js.Any])
    if (ec2instanceconnect != null) __obj.updateDynamic("ec2instanceconnect")(ec2instanceconnect.asInstanceOf[js.Any])
    if (ecr != null) __obj.updateDynamic("ecr")(ecr.asInstanceOf[js.Any])
    if (ecs != null) __obj.updateDynamic("ecs")(ecs.asInstanceOf[js.Any])
    if (efs != null) __obj.updateDynamic("efs")(efs.asInstanceOf[js.Any])
    if (eks != null) __obj.updateDynamic("eks")(eks.asInstanceOf[js.Any])
    if (elasticache != null) __obj.updateDynamic("elasticache")(elasticache.asInstanceOf[js.Any])
    if (elasticbeanstalk != null) __obj.updateDynamic("elasticbeanstalk")(elasticbeanstalk.asInstanceOf[js.Any])
    if (elasticinference != null) __obj.updateDynamic("elasticinference")(elasticinference.asInstanceOf[js.Any])
    if (elastictranscoder != null) __obj.updateDynamic("elastictranscoder")(elastictranscoder.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    if (elbv2 != null) __obj.updateDynamic("elbv2")(elbv2.asInstanceOf[js.Any])
    if (emr != null) __obj.updateDynamic("emr")(emr.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointCacheSize)) __obj.updateDynamic("endpointCacheSize")(endpointCacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointDiscoveryEnabled)) __obj.updateDynamic("endpointDiscoveryEnabled")(endpointDiscoveryEnabled.get.asInstanceOf[js.Any])
    if (es != null) __obj.updateDynamic("es")(es.asInstanceOf[js.Any])
    if (eventbridge != null) __obj.updateDynamic("eventbridge")(eventbridge.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (fms != null) __obj.updateDynamic("fms")(fms.asInstanceOf[js.Any])
    if (forecastqueryservice != null) __obj.updateDynamic("forecastqueryservice")(forecastqueryservice.asInstanceOf[js.Any])
    if (forecastservice != null) __obj.updateDynamic("forecastservice")(forecastservice.asInstanceOf[js.Any])
    if (frauddetector != null) __obj.updateDynamic("frauddetector")(frauddetector.asInstanceOf[js.Any])
    if (fsx != null) __obj.updateDynamic("fsx")(fsx.asInstanceOf[js.Any])
    if (gamelift != null) __obj.updateDynamic("gamelift")(gamelift.asInstanceOf[js.Any])
    if (glacier != null) __obj.updateDynamic("glacier")(glacier.asInstanceOf[js.Any])
    if (globalaccelerator != null) __obj.updateDynamic("globalaccelerator")(globalaccelerator.asInstanceOf[js.Any])
    if (glue != null) __obj.updateDynamic("glue")(glue.asInstanceOf[js.Any])
    if (greengrass != null) __obj.updateDynamic("greengrass")(greengrass.asInstanceOf[js.Any])
    if (groundstation != null) __obj.updateDynamic("groundstation")(groundstation.asInstanceOf[js.Any])
    if (guardduty != null) __obj.updateDynamic("guardduty")(guardduty.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPrefixEnabled)) __obj.updateDynamic("hostPrefixEnabled")(hostPrefixEnabled.get.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    if (imagebuilder != null) __obj.updateDynamic("imagebuilder")(imagebuilder.asInstanceOf[js.Any])
    if (importexport != null) __obj.updateDynamic("importexport")(importexport.asInstanceOf[js.Any])
    if (inspector != null) __obj.updateDynamic("inspector")(inspector.asInstanceOf[js.Any])
    if (iot != null) __obj.updateDynamic("iot")(iot.asInstanceOf[js.Any])
    if (iot1clickdevicesservice != null) __obj.updateDynamic("iot1clickdevicesservice")(iot1clickdevicesservice.asInstanceOf[js.Any])
    if (iot1clickprojects != null) __obj.updateDynamic("iot1clickprojects")(iot1clickprojects.asInstanceOf[js.Any])
    if (iotanalytics != null) __obj.updateDynamic("iotanalytics")(iotanalytics.asInstanceOf[js.Any])
    if (iotdata != null) __obj.updateDynamic("iotdata")(iotdata.asInstanceOf[js.Any])
    if (iotevents != null) __obj.updateDynamic("iotevents")(iotevents.asInstanceOf[js.Any])
    if (ioteventsdata != null) __obj.updateDynamic("ioteventsdata")(ioteventsdata.asInstanceOf[js.Any])
    if (iotjobsdataplane != null) __obj.updateDynamic("iotjobsdataplane")(iotjobsdataplane.asInstanceOf[js.Any])
    if (iotsecuretunneling != null) __obj.updateDynamic("iotsecuretunneling")(iotsecuretunneling.asInstanceOf[js.Any])
    if (iotsitewise != null) __obj.updateDynamic("iotsitewise")(iotsitewise.asInstanceOf[js.Any])
    if (iotthingsgraph != null) __obj.updateDynamic("iotthingsgraph")(iotthingsgraph.asInstanceOf[js.Any])
    if (kafka != null) __obj.updateDynamic("kafka")(kafka.asInstanceOf[js.Any])
    if (kendra != null) __obj.updateDynamic("kendra")(kendra.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (kinesisanalytics != null) __obj.updateDynamic("kinesisanalytics")(kinesisanalytics.asInstanceOf[js.Any])
    if (kinesisanalyticsv2 != null) __obj.updateDynamic("kinesisanalyticsv2")(kinesisanalyticsv2.asInstanceOf[js.Any])
    if (kinesisvideo != null) __obj.updateDynamic("kinesisvideo")(kinesisvideo.asInstanceOf[js.Any])
    if (kinesisvideoarchivedmedia != null) __obj.updateDynamic("kinesisvideoarchivedmedia")(kinesisvideoarchivedmedia.asInstanceOf[js.Any])
    if (kinesisvideomedia != null) __obj.updateDynamic("kinesisvideomedia")(kinesisvideomedia.asInstanceOf[js.Any])
    if (kinesisvideosignalingchannels != null) __obj.updateDynamic("kinesisvideosignalingchannels")(kinesisvideosignalingchannels.asInstanceOf[js.Any])
    if (kms != null) __obj.updateDynamic("kms")(kms.asInstanceOf[js.Any])
    if (lakeformation != null) __obj.updateDynamic("lakeformation")(lakeformation.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (lexmodelbuildingservice != null) __obj.updateDynamic("lexmodelbuildingservice")(lexmodelbuildingservice.asInstanceOf[js.Any])
    if (lexruntime != null) __obj.updateDynamic("lexruntime")(lexruntime.asInstanceOf[js.Any])
    if (licensemanager != null) __obj.updateDynamic("licensemanager")(licensemanager.asInstanceOf[js.Any])
    if (lightsail != null) __obj.updateDynamic("lightsail")(lightsail.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (machinelearning != null) __obj.updateDynamic("machinelearning")(machinelearning.asInstanceOf[js.Any])
    if (macie != null) __obj.updateDynamic("macie")(macie.asInstanceOf[js.Any])
    if (macie2 != null) __obj.updateDynamic("macie2")(macie2.asInstanceOf[js.Any])
    if (managedblockchain != null) __obj.updateDynamic("managedblockchain")(managedblockchain.asInstanceOf[js.Any])
    if (marketplacecatalog != null) __obj.updateDynamic("marketplacecatalog")(marketplacecatalog.asInstanceOf[js.Any])
    if (marketplacecommerceanalytics != null) __obj.updateDynamic("marketplacecommerceanalytics")(marketplacecommerceanalytics.asInstanceOf[js.Any])
    if (marketplaceentitlementservice != null) __obj.updateDynamic("marketplaceentitlementservice")(marketplaceentitlementservice.asInstanceOf[js.Any])
    if (marketplacemetering != null) __obj.updateDynamic("marketplacemetering")(marketplacemetering.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (mediaconnect != null) __obj.updateDynamic("mediaconnect")(mediaconnect.asInstanceOf[js.Any])
    if (mediaconvert != null) __obj.updateDynamic("mediaconvert")(mediaconvert.asInstanceOf[js.Any])
    if (medialive != null) __obj.updateDynamic("medialive")(medialive.asInstanceOf[js.Any])
    if (mediapackage != null) __obj.updateDynamic("mediapackage")(mediapackage.asInstanceOf[js.Any])
    if (mediapackagevod != null) __obj.updateDynamic("mediapackagevod")(mediapackagevod.asInstanceOf[js.Any])
    if (mediastore != null) __obj.updateDynamic("mediastore")(mediastore.asInstanceOf[js.Any])
    if (mediastoredata != null) __obj.updateDynamic("mediastoredata")(mediastoredata.asInstanceOf[js.Any])
    if (mediatailor != null) __obj.updateDynamic("mediatailor")(mediatailor.asInstanceOf[js.Any])
    if (migrationhub != null) __obj.updateDynamic("migrationhub")(migrationhub.asInstanceOf[js.Any])
    if (migrationhubconfig != null) __obj.updateDynamic("migrationhubconfig")(migrationhubconfig.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (mobileanalytics != null) __obj.updateDynamic("mobileanalytics")(mobileanalytics.asInstanceOf[js.Any])
    if (mq != null) __obj.updateDynamic("mq")(mq.asInstanceOf[js.Any])
    if (mturk != null) __obj.updateDynamic("mturk")(mturk.asInstanceOf[js.Any])
    if (neptune != null) __obj.updateDynamic("neptune")(neptune.asInstanceOf[js.Any])
    if (networkmanager != null) __obj.updateDynamic("networkmanager")(networkmanager.asInstanceOf[js.Any])
    if (opsworks != null) __obj.updateDynamic("opsworks")(opsworks.asInstanceOf[js.Any])
    if (opsworkscm != null) __obj.updateDynamic("opsworkscm")(opsworkscm.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (outposts != null) __obj.updateDynamic("outposts")(outposts.asInstanceOf[js.Any])
    if (paramValidation != null) __obj.updateDynamic("paramValidation")(paramValidation.asInstanceOf[js.Any])
    if (personalize != null) __obj.updateDynamic("personalize")(personalize.asInstanceOf[js.Any])
    if (personalizeevents != null) __obj.updateDynamic("personalizeevents")(personalizeevents.asInstanceOf[js.Any])
    if (personalizeruntime != null) __obj.updateDynamic("personalizeruntime")(personalizeruntime.asInstanceOf[js.Any])
    if (pi != null) __obj.updateDynamic("pi")(pi.asInstanceOf[js.Any])
    if (pinpoint != null) __obj.updateDynamic("pinpoint")(pinpoint.asInstanceOf[js.Any])
    if (pinpointemail != null) __obj.updateDynamic("pinpointemail")(pinpointemail.asInstanceOf[js.Any])
    if (pinpointsmsvoice != null) __obj.updateDynamic("pinpointsmsvoice")(pinpointsmsvoice.asInstanceOf[js.Any])
    if (polly != null) __obj.updateDynamic("polly")(polly.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    if (qldb != null) __obj.updateDynamic("qldb")(qldb.asInstanceOf[js.Any])
    if (qldbsession != null) __obj.updateDynamic("qldbsession")(qldbsession.asInstanceOf[js.Any])
    if (quicksight != null) __obj.updateDynamic("quicksight")(quicksight.asInstanceOf[js.Any])
    if (ram != null) __obj.updateDynamic("ram")(ram.asInstanceOf[js.Any])
    if (rds != null) __obj.updateDynamic("rds")(rds.asInstanceOf[js.Any])
    if (rdsdataservice != null) __obj.updateDynamic("rdsdataservice")(rdsdataservice.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (rekognition != null) __obj.updateDynamic("rekognition")(rekognition.asInstanceOf[js.Any])
    if (resourcegroups != null) __obj.updateDynamic("resourcegroups")(resourcegroups.asInstanceOf[js.Any])
    if (resourcegroupstaggingapi != null) __obj.updateDynamic("resourcegroupstaggingapi")(resourcegroupstaggingapi.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions.asInstanceOf[js.Any])
    if (robomaker != null) __obj.updateDynamic("robomaker")(robomaker.asInstanceOf[js.Any])
    if (route53 != null) __obj.updateDynamic("route53")(route53.asInstanceOf[js.Any])
    if (route53domains != null) __obj.updateDynamic("route53domains")(route53domains.asInstanceOf[js.Any])
    if (route53resolver != null) __obj.updateDynamic("route53resolver")(route53resolver.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (!js.isUndefined(s3BucketEndpoint)) __obj.updateDynamic("s3BucketEndpoint")(s3BucketEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3DisableBodySigning)) __obj.updateDynamic("s3DisableBodySigning")(s3DisableBodySigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3ForcePathStyle)) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.get.asInstanceOf[js.Any])
    if (s3UsEast1RegionalEndpoint != null) __obj.updateDynamic("s3UsEast1RegionalEndpoint")(s3UsEast1RegionalEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(s3UseArnRegion)) __obj.updateDynamic("s3UseArnRegion")(s3UseArnRegion.get.asInstanceOf[js.Any])
    if (s3control != null) __obj.updateDynamic("s3control")(s3control.asInstanceOf[js.Any])
    if (sagemaker != null) __obj.updateDynamic("sagemaker")(sagemaker.asInstanceOf[js.Any])
    if (sagemakerruntime != null) __obj.updateDynamic("sagemakerruntime")(sagemakerruntime.asInstanceOf[js.Any])
    if (savingsplans != null) __obj.updateDynamic("savingsplans")(savingsplans.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (secretsmanager != null) __obj.updateDynamic("secretsmanager")(secretsmanager.asInstanceOf[js.Any])
    if (securityhub != null) __obj.updateDynamic("securityhub")(securityhub.asInstanceOf[js.Any])
    if (serverlessapplicationrepository != null) __obj.updateDynamic("serverlessapplicationrepository")(serverlessapplicationrepository.asInstanceOf[js.Any])
    if (servicecatalog != null) __obj.updateDynamic("servicecatalog")(servicecatalog.asInstanceOf[js.Any])
    if (servicediscovery != null) __obj.updateDynamic("servicediscovery")(servicediscovery.asInstanceOf[js.Any])
    if (servicequotas != null) __obj.updateDynamic("servicequotas")(servicequotas.asInstanceOf[js.Any])
    if (ses != null) __obj.updateDynamic("ses")(ses.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (sesv2 != null) __obj.updateDynamic("sesv2")(sesv2.asInstanceOf[js.Any])
    if (shield != null) __obj.updateDynamic("shield")(shield.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureCache)) __obj.updateDynamic("signatureCache")(signatureCache.get.asInstanceOf[js.Any])
    if (signatureVersion != null) __obj.updateDynamic("signatureVersion")(signatureVersion.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (simpledb != null) __obj.updateDynamic("simpledb")(simpledb.asInstanceOf[js.Any])
    if (sms != null) __obj.updateDynamic("sms")(sms.asInstanceOf[js.Any])
    if (snowball != null) __obj.updateDynamic("snowball")(snowball.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.get.asInstanceOf[js.Any])
    if (ssm != null) __obj.updateDynamic("ssm")(ssm.asInstanceOf[js.Any])
    if (sso != null) __obj.updateDynamic("sso")(sso.asInstanceOf[js.Any])
    if (ssooidc != null) __obj.updateDynamic("ssooidc")(ssooidc.asInstanceOf[js.Any])
    if (stepfunctions != null) __obj.updateDynamic("stepfunctions")(stepfunctions.asInstanceOf[js.Any])
    if (storagegateway != null) __obj.updateDynamic("storagegateway")(storagegateway.asInstanceOf[js.Any])
    if (sts != null) __obj.updateDynamic("sts")(sts.asInstanceOf[js.Any])
    if (stsRegionalEndpoints != null) __obj.updateDynamic("stsRegionalEndpoints")(stsRegionalEndpoints.asInstanceOf[js.Any])
    if (support != null) __obj.updateDynamic("support")(support.asInstanceOf[js.Any])
    if (swf != null) __obj.updateDynamic("swf")(swf.asInstanceOf[js.Any])
    if (synthetics != null) __obj.updateDynamic("synthetics")(synthetics.asInstanceOf[js.Any])
    if (!js.isUndefined(systemClockOffset)) __obj.updateDynamic("systemClockOffset")(systemClockOffset.get.asInstanceOf[js.Any])
    if (textract != null) __obj.updateDynamic("textract")(textract.asInstanceOf[js.Any])
    if (transcribeservice != null) __obj.updateDynamic("transcribeservice")(transcribeservice.asInstanceOf[js.Any])
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (waf != null) __obj.updateDynamic("waf")(waf.asInstanceOf[js.Any])
    if (wafregional != null) __obj.updateDynamic("wafregional")(wafregional.asInstanceOf[js.Any])
    if (wafv2 != null) __obj.updateDynamic("wafv2")(wafv2.asInstanceOf[js.Any])
    if (workdocs != null) __obj.updateDynamic("workdocs")(workdocs.asInstanceOf[js.Any])
    if (worklink != null) __obj.updateDynamic("worklink")(worklink.asInstanceOf[js.Any])
    if (workmail != null) __obj.updateDynamic("workmail")(workmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
}

