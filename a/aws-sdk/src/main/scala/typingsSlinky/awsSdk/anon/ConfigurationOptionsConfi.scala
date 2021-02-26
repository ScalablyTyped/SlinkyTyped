package typingsSlinky.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.accessanalyzerMod.ClientConfiguration
import typingsSlinky.awsSdk.awsSdkStrings.latest_
import typingsSlinky.awsSdk.awsSdkStrings.legacy_
import typingsSlinky.awsSdk.awsSdkStrings.regional_
import typingsSlinky.awsSdk.awsSdkStrings.v2_
import typingsSlinky.awsSdk.awsSdkStrings.v3
import typingsSlinky.awsSdk.awsSdkStrings.v4
import typingsSlinky.awsSdk.configBaseMod.HTTPOptions
import typingsSlinky.awsSdk.configBaseMod.Logger
import typingsSlinky.awsSdk.configBaseMod.ParamValidation
import typingsSlinky.awsSdk.configBaseMod.RetryDelayOptions
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typingsSlinky.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
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
  
  var appflow: js.UndefOr[typingsSlinky.awsSdk.appflowMod.ClientConfiguration] = js.native
  
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
  
  var braket: js.UndefOr[typingsSlinky.awsSdk.braketMod.ClientConfiguration] = js.native
  
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
  
  var databrew: js.UndefOr[typingsSlinky.awsSdk.databrewMod.ClientConfiguration] = js.native
  
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
  
  var identitystore: js.UndefOr[typingsSlinky.awsSdk.identitystoreMod.ClientConfiguration] = js.native
  
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
  
  var networkfirewall: js.UndefOr[typingsSlinky.awsSdk.networkfirewallMod.ClientConfiguration] = js.native
  
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
  
  var redshiftdata: js.UndefOr[typingsSlinky.awsSdk.redshiftdataMod.ClientConfiguration] = js.native
  
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
  
  var s3outposts: js.UndefOr[typingsSlinky.awsSdk.s3outpostsMod.ClientConfiguration] = js.native
  
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
  
  var servicecatalogappregistry: js.UndefOr[typingsSlinky.awsSdk.servicecatalogappregistryMod.ClientConfiguration] = js.native
  
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
  
  var ssoadmin: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.ClientConfiguration] = js.native
  
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
  
  var timestreamquery: js.UndefOr[typingsSlinky.awsSdk.timestreamqueryMod.ClientConfiguration] = js.native
  
  var timestreamwrite: js.UndefOr[typingsSlinky.awsSdk.timestreamwriteMod.ClientConfiguration] = js.native
  
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
  implicit class ConfigurationOptionsConfiMutableBuilder[Self <: ConfigurationOptionsConfi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    @scala.inline
    def setAccessanalyzer(value: ClientConfiguration): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
    
    @scala.inline
    def setAcm(value: typingsSlinky.awsSdk.acmMod.ClientConfiguration): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setAcmpca(value: typingsSlinky.awsSdk.acmpcaMod.ClientConfiguration): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
    
    @scala.inline
    def setAlexaforbusiness(value: typingsSlinky.awsSdk.alexaforbusinessMod.ClientConfiguration): Self = StObject.set(x, "alexaforbusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaforbusinessUndefined: Self = StObject.set(x, "alexaforbusiness", js.undefined)
    
    @scala.inline
    def setAmplify(value: typingsSlinky.awsSdk.amplifyMod.ClientConfiguration): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
    
    @scala.inline
    def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    @scala.inline
    def setApigateway(value: typingsSlinky.awsSdk.apigatewayMod.ClientConfiguration): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
    
    @scala.inline
    def setApigatewaymanagementapi(value: typingsSlinky.awsSdk.apigatewaymanagementapiMod.ClientConfiguration): Self = StObject.set(x, "apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewaymanagementapiUndefined: Self = StObject.set(x, "apigatewaymanagementapi", js.undefined)
    
    @scala.inline
    def setApigatewayv2(value: typingsSlinky.awsSdk.apigatewayv2Mod.ClientConfiguration): Self = StObject.set(x, "apigatewayv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewayv2Undefined: Self = StObject.set(x, "apigatewayv2", js.undefined)
    
    @scala.inline
    def setAppconfig(value: typingsSlinky.awsSdk.appconfigMod.ClientConfiguration): Self = StObject.set(x, "appconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppconfigUndefined: Self = StObject.set(x, "appconfig", js.undefined)
    
    @scala.inline
    def setAppflow(value: typingsSlinky.awsSdk.appflowMod.ClientConfiguration): Self = StObject.set(x, "appflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppflowUndefined: Self = StObject.set(x, "appflow", js.undefined)
    
    @scala.inline
    def setApplicationautoscaling(value: typingsSlinky.awsSdk.applicationautoscalingMod.ClientConfiguration): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
    
    @scala.inline
    def setApplicationinsights(value: typingsSlinky.awsSdk.applicationinsightsMod.ClientConfiguration): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
    
    @scala.inline
    def setAppmesh(value: typingsSlinky.awsSdk.appmeshMod.ClientConfiguration): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
    
    @scala.inline
    def setAppstream(value: typingsSlinky.awsSdk.appstreamMod.ClientConfiguration): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
    
    @scala.inline
    def setAppsync(value: typingsSlinky.awsSdk.appsyncMod.ClientConfiguration): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
    
    @scala.inline
    def setAthena(value: typingsSlinky.awsSdk.athenaMod.ClientConfiguration): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
    
    @scala.inline
    def setAugmentedairuntime(value: typingsSlinky.awsSdk.augmentedairuntimeMod.ClientConfiguration): Self = StObject.set(x, "augmentedairuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAugmentedairuntimeUndefined: Self = StObject.set(x, "augmentedairuntime", js.undefined)
    
    @scala.inline
    def setAutoscaling(value: typingsSlinky.awsSdk.autoscalingMod.ClientConfiguration): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    @scala.inline
    def setAutoscalingplans(value: typingsSlinky.awsSdk.autoscalingplansMod.ClientConfiguration): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
    
    @scala.inline
    def setBackup(value: typingsSlinky.awsSdk.backupMod.ClientConfiguration): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    @scala.inline
    def setBatch(value: typingsSlinky.awsSdk.batchMod.ClientConfiguration): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setBraket(value: typingsSlinky.awsSdk.braketMod.ClientConfiguration): Self = StObject.set(x, "braket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraketUndefined: Self = StObject.set(x, "braket", js.undefined)
    
    @scala.inline
    def setBudgets(value: typingsSlinky.awsSdk.budgetsMod.ClientConfiguration): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    @scala.inline
    def setChime(value: typingsSlinky.awsSdk.chimeMod.ClientConfiguration): Self = StObject.set(x, "chime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChimeUndefined: Self = StObject.set(x, "chime", js.undefined)
    
    @scala.inline
    def setCloud9(value: typingsSlinky.awsSdk.cloud9Mod.ClientConfiguration): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
    
    @scala.inline
    def setClouddirectory(value: typingsSlinky.awsSdk.clouddirectoryMod.ClientConfiguration): Self = StObject.set(x, "clouddirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClouddirectoryUndefined: Self = StObject.set(x, "clouddirectory", js.undefined)
    
    @scala.inline
    def setCloudformation(value: typingsSlinky.awsSdk.cloudformationMod.ClientConfiguration): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    @scala.inline
    def setCloudfront(value: typingsSlinky.awsSdk.cloudfrontMod.ClientConfiguration): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
    
    @scala.inline
    def setCloudhsm(value: typingsSlinky.awsSdk.cloudhsmMod.ClientConfiguration): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
    
    @scala.inline
    def setCloudhsmv2(value: typingsSlinky.awsSdk.cloudhsmv2Mod.ClientConfiguration): Self = StObject.set(x, "cloudhsmv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudhsmv2Undefined: Self = StObject.set(x, "cloudhsmv2", js.undefined)
    
    @scala.inline
    def setCloudsearch(value: typingsSlinky.awsSdk.cloudsearchMod.ClientConfiguration): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
    
    @scala.inline
    def setCloudsearchdomain(value: typingsSlinky.awsSdk.cloudsearchdomainMod.ClientConfiguration): Self = StObject.set(x, "cloudsearchdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudsearchdomainUndefined: Self = StObject.set(x, "cloudsearchdomain", js.undefined)
    
    @scala.inline
    def setCloudtrail(value: typingsSlinky.awsSdk.cloudtrailMod.ClientConfiguration): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
    
    @scala.inline
    def setCloudwatch(value: typingsSlinky.awsSdk.cloudwatchMod.ClientConfiguration): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
    
    @scala.inline
    def setCloudwatchevents(value: typingsSlinky.awsSdk.cloudwatcheventsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
    
    @scala.inline
    def setCloudwatchlogs(value: typingsSlinky.awsSdk.cloudwatchlogsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
    
    @scala.inline
    def setCodeartifact(value: typingsSlinky.awsSdk.codeartifactMod.ClientConfiguration): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
    
    @scala.inline
    def setCodebuild(value: typingsSlinky.awsSdk.codebuildMod.ClientConfiguration): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
    
    @scala.inline
    def setCodecommit(value: typingsSlinky.awsSdk.codecommitMod.ClientConfiguration): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
    
    @scala.inline
    def setCodedeploy(value: typingsSlinky.awsSdk.codedeployMod.ClientConfiguration): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
    
    @scala.inline
    def setCodeguruprofiler(value: typingsSlinky.awsSdk.codeguruprofilerMod.ClientConfiguration): Self = StObject.set(x, "codeguruprofiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeguruprofilerUndefined: Self = StObject.set(x, "codeguruprofiler", js.undefined)
    
    @scala.inline
    def setCodegurureviewer(value: typingsSlinky.awsSdk.codegurureviewerMod.ClientConfiguration): Self = StObject.set(x, "codegurureviewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegurureviewerUndefined: Self = StObject.set(x, "codegurureviewer", js.undefined)
    
    @scala.inline
    def setCodepipeline(value: typingsSlinky.awsSdk.codepipelineMod.ClientConfiguration): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
    
    @scala.inline
    def setCodestar(value: typingsSlinky.awsSdk.codestarMod.ClientConfiguration): Self = StObject.set(x, "codestar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarUndefined: Self = StObject.set(x, "codestar", js.undefined)
    
    @scala.inline
    def setCodestarconnections(value: typingsSlinky.awsSdk.codestarconnectionsMod.ClientConfiguration): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
    
    @scala.inline
    def setCodestarnotifications(value: typingsSlinky.awsSdk.codestarnotificationsMod.ClientConfiguration): Self = StObject.set(x, "codestarnotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarnotificationsUndefined: Self = StObject.set(x, "codestarnotifications", js.undefined)
    
    @scala.inline
    def setCognitoidentity(value: typingsSlinky.awsSdk.cognitoidentityMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
    
    @scala.inline
    def setCognitoidentityserviceprovider(value: typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoidentityserviceproviderUndefined: Self = StObject.set(x, "cognitoidentityserviceprovider", js.undefined)
    
    @scala.inline
    def setCognitosync(value: typingsSlinky.awsSdk.cognitosyncMod.ClientConfiguration): Self = StObject.set(x, "cognitosync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitosyncUndefined: Self = StObject.set(x, "cognitosync", js.undefined)
    
    @scala.inline
    def setComprehend(value: typingsSlinky.awsSdk.comprehendMod.ClientConfiguration): Self = StObject.set(x, "comprehend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendUndefined: Self = StObject.set(x, "comprehend", js.undefined)
    
    @scala.inline
    def setComprehendmedical(value: typingsSlinky.awsSdk.comprehendmedicalMod.ClientConfiguration): Self = StObject.set(x, "comprehendmedical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendmedicalUndefined: Self = StObject.set(x, "comprehendmedical", js.undefined)
    
    @scala.inline
    def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    @scala.inline
    def setComputeoptimizer(value: typingsSlinky.awsSdk.computeoptimizerMod.ClientConfiguration): Self = StObject.set(x, "computeoptimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeoptimizerUndefined: Self = StObject.set(x, "computeoptimizer", js.undefined)
    
    @scala.inline
    def setConfigservice(value: typingsSlinky.awsSdk.configserviceMod.ClientConfiguration): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
    
    @scala.inline
    def setConnect(value: typingsSlinky.awsSdk.connectMod.ClientConfiguration): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setConnectparticipant(value: typingsSlinky.awsSdk.connectparticipantMod.ClientConfiguration): Self = StObject.set(x, "connectparticipant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectparticipantUndefined: Self = StObject.set(x, "connectparticipant", js.undefined)
    
    @scala.inline
    def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    @scala.inline
    def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    @scala.inline
    def setCostexplorer(value: typingsSlinky.awsSdk.costexplorerMod.ClientConfiguration): Self = StObject.set(x, "costexplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostexplorerUndefined: Self = StObject.set(x, "costexplorer", js.undefined)
    
    @scala.inline
    def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCur(value: typingsSlinky.awsSdk.curMod.ClientConfiguration): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    @scala.inline
    def setDatabrew(value: typingsSlinky.awsSdk.databrewMod.ClientConfiguration): Self = StObject.set(x, "databrew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabrewUndefined: Self = StObject.set(x, "databrew", js.undefined)
    
    @scala.inline
    def setDataexchange(value: typingsSlinky.awsSdk.dataexchangeMod.ClientConfiguration): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
    
    @scala.inline
    def setDatapipeline(value: typingsSlinky.awsSdk.datapipelineMod.ClientConfiguration): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
    
    @scala.inline
    def setDatasync(value: typingsSlinky.awsSdk.datasyncMod.ClientConfiguration): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
    
    @scala.inline
    def setDax(value: typingsSlinky.awsSdk.daxMod.ClientConfiguration): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
    
    @scala.inline
    def setDetective(value: typingsSlinky.awsSdk.detectiveMod.ClientConfiguration): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
    
    @scala.inline
    def setDevicefarm(value: typingsSlinky.awsSdk.devicefarmMod.ClientConfiguration): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
    
    @scala.inline
    def setDirectconnect(value: typingsSlinky.awsSdk.directconnectMod.ClientConfiguration): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
    
    @scala.inline
    def setDirectoryservice(value: typingsSlinky.awsSdk.directoryserviceMod.ClientConfiguration): Self = StObject.set(x, "directoryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryserviceUndefined: Self = StObject.set(x, "directoryservice", js.undefined)
    
    @scala.inline
    def setDiscovery(value: typingsSlinky.awsSdk.discoveryMod.ClientConfiguration): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    @scala.inline
    def setDlm(value: typingsSlinky.awsSdk.dlmMod.ClientConfiguration): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
    
    @scala.inline
    def setDms(value: typingsSlinky.awsSdk.dmsMod.ClientConfiguration): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
    
    @scala.inline
    def setDocdb(value: typingsSlinky.awsSdk.docdbMod.ClientConfiguration): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
    
    @scala.inline
    def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    @scala.inline
    def setDynamodb(value: typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setDynamodbstreams(value: typingsSlinky.awsSdk.dynamodbstreamsMod.ClientConfiguration): Self = StObject.set(x, "dynamodbstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbstreamsUndefined: Self = StObject.set(x, "dynamodbstreams", js.undefined)
    
    @scala.inline
    def setEbs(value: typingsSlinky.awsSdk.ebsMod.ClientConfiguration): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    @scala.inline
    def setEc2(value: typingsSlinky.awsSdk.ec2Mod.ClientConfiguration): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    @scala.inline
    def setEc2instanceconnect(value: typingsSlinky.awsSdk.ec2instanceconnectMod.ClientConfiguration): Self = StObject.set(x, "ec2instanceconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2instanceconnectUndefined: Self = StObject.set(x, "ec2instanceconnect", js.undefined)
    
    @scala.inline
    def setEcr(value: typingsSlinky.awsSdk.ecrMod.ClientConfiguration): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
    
    @scala.inline
    def setEcs(value: typingsSlinky.awsSdk.ecsMod.ClientConfiguration): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
    
    @scala.inline
    def setEfs(value: typingsSlinky.awsSdk.efsMod.ClientConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    @scala.inline
    def setEks(value: typingsSlinky.awsSdk.eksMod.ClientConfiguration): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
    
    @scala.inline
    def setElasticache(value: typingsSlinky.awsSdk.elasticacheMod.ClientConfiguration): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
    
    @scala.inline
    def setElasticbeanstalk(value: typingsSlinky.awsSdk.elasticbeanstalkMod.ClientConfiguration): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
    
    @scala.inline
    def setElasticinference(value: typingsSlinky.awsSdk.elasticinferenceMod.ClientConfiguration): Self = StObject.set(x, "elasticinference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticinferenceUndefined: Self = StObject.set(x, "elasticinference", js.undefined)
    
    @scala.inline
    def setElastictranscoder(value: typingsSlinky.awsSdk.elastictranscoderMod.ClientConfiguration): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
    
    @scala.inline
    def setElb(value: typingsSlinky.awsSdk.elbMod.ClientConfiguration): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
    
    @scala.inline
    def setElbv2(value: typingsSlinky.awsSdk.elbv2Mod.ClientConfiguration): Self = StObject.set(x, "elbv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbv2Undefined: Self = StObject.set(x, "elbv2", js.undefined)
    
    @scala.inline
    def setEmr(value: typingsSlinky.awsSdk.emrMod.ClientConfiguration): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
    
    @scala.inline
    def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    @scala.inline
    def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    @scala.inline
    def setEs(value: typingsSlinky.awsSdk.esMod.ClientConfiguration): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    @scala.inline
    def setEventbridge(value: typingsSlinky.awsSdk.eventbridgeMod.ClientConfiguration): Self = StObject.set(x, "eventbridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventbridgeUndefined: Self = StObject.set(x, "eventbridge", js.undefined)
    
    @scala.inline
    def setFirehose(value: typingsSlinky.awsSdk.firehoseMod.ClientConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setFms(value: typingsSlinky.awsSdk.fmsMod.ClientConfiguration): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
    
    @scala.inline
    def setForecastqueryservice(value: typingsSlinky.awsSdk.forecastqueryserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastqueryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastqueryserviceUndefined: Self = StObject.set(x, "forecastqueryservice", js.undefined)
    
    @scala.inline
    def setForecastservice(value: typingsSlinky.awsSdk.forecastserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastserviceUndefined: Self = StObject.set(x, "forecastservice", js.undefined)
    
    @scala.inline
    def setFrauddetector(value: typingsSlinky.awsSdk.frauddetectorMod.ClientConfiguration): Self = StObject.set(x, "frauddetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrauddetectorUndefined: Self = StObject.set(x, "frauddetector", js.undefined)
    
    @scala.inline
    def setFsx(value: typingsSlinky.awsSdk.fsxMod.ClientConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
    
    @scala.inline
    def setGamelift(value: typingsSlinky.awsSdk.gameliftMod.ClientConfiguration): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
    
    @scala.inline
    def setGlacier(value: typingsSlinky.awsSdk.glacierMod.ClientConfiguration): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
    
    @scala.inline
    def setGlobalaccelerator(value: typingsSlinky.awsSdk.globalacceleratorMod.ClientConfiguration): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
    
    @scala.inline
    def setGlue(value: typingsSlinky.awsSdk.glueMod.ClientConfiguration): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
    
    @scala.inline
    def setGreengrass(value: typingsSlinky.awsSdk.greengrassMod.ClientConfiguration): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    @scala.inline
    def setGroundstation(value: typingsSlinky.awsSdk.groundstationMod.ClientConfiguration): Self = StObject.set(x, "groundstation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundstationUndefined: Self = StObject.set(x, "groundstation", js.undefined)
    
    @scala.inline
    def setGuardduty(value: typingsSlinky.awsSdk.guarddutyMod.ClientConfiguration): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
    
    @scala.inline
    def setHealth(value: typingsSlinky.awsSdk.healthMod.ClientConfiguration): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setHoneycode(value: typingsSlinky.awsSdk.honeycodeMod.ClientConfiguration): Self = StObject.set(x, "honeycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoneycodeUndefined: Self = StObject.set(x, "honeycode", js.undefined)
    
    @scala.inline
    def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    @scala.inline
    def setIam(value: typingsSlinky.awsSdk.iamMod.ClientConfiguration): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    @scala.inline
    def setIdentitystore(value: typingsSlinky.awsSdk.identitystoreMod.ClientConfiguration): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
    
    @scala.inline
    def setImagebuilder(value: typingsSlinky.awsSdk.imagebuilderMod.ClientConfiguration): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
    
    @scala.inline
    def setImportexport(value: typingsSlinky.awsSdk.importexportMod.ClientConfiguration): Self = StObject.set(x, "importexport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportexportUndefined: Self = StObject.set(x, "importexport", js.undefined)
    
    @scala.inline
    def setInspector(value: typingsSlinky.awsSdk.inspectorMod.ClientConfiguration): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    
    @scala.inline
    def setIot(value: typingsSlinky.awsSdk.iotMod.ClientConfiguration): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickdevicesservice(value: typingsSlinky.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration): Self = StObject.set(x, "iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickdevicesserviceUndefined: Self = StObject.set(x, "iot1clickdevicesservice", js.undefined)
    
    @scala.inline
    def setIot1clickprojects(value: typingsSlinky.awsSdk.iot1clickprojectsMod.ClientConfiguration): Self = StObject.set(x, "iot1clickprojects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickprojectsUndefined: Self = StObject.set(x, "iot1clickprojects", js.undefined)
    
    @scala.inline
    def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    @scala.inline
    def setIotanalytics(value: typingsSlinky.awsSdk.iotanalyticsMod.ClientConfiguration): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
    
    @scala.inline
    def setIotdata(value: typingsSlinky.awsSdk.iotdataMod.ClientConfiguration): Self = StObject.set(x, "iotdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotdataUndefined: Self = StObject.set(x, "iotdata", js.undefined)
    
    @scala.inline
    def setIotevents(value: typingsSlinky.awsSdk.ioteventsMod.ClientConfiguration): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
    
    @scala.inline
    def setIoteventsdata(value: typingsSlinky.awsSdk.ioteventsdataMod.ClientConfiguration): Self = StObject.set(x, "ioteventsdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoteventsdataUndefined: Self = StObject.set(x, "ioteventsdata", js.undefined)
    
    @scala.inline
    def setIotjobsdataplane(value: typingsSlinky.awsSdk.iotjobsdataplaneMod.ClientConfiguration): Self = StObject.set(x, "iotjobsdataplane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotjobsdataplaneUndefined: Self = StObject.set(x, "iotjobsdataplane", js.undefined)
    
    @scala.inline
    def setIotsecuretunneling(value: typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientConfiguration): Self = StObject.set(x, "iotsecuretunneling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotsecuretunnelingUndefined: Self = StObject.set(x, "iotsecuretunneling", js.undefined)
    
    @scala.inline
    def setIotsitewise(value: typingsSlinky.awsSdk.iotsitewiseMod.ClientConfiguration): Self = StObject.set(x, "iotsitewise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotsitewiseUndefined: Self = StObject.set(x, "iotsitewise", js.undefined)
    
    @scala.inline
    def setIotthingsgraph(value: typingsSlinky.awsSdk.iotthingsgraphMod.ClientConfiguration): Self = StObject.set(x, "iotthingsgraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotthingsgraphUndefined: Self = StObject.set(x, "iotthingsgraph", js.undefined)
    
    @scala.inline
    def setIvs(value: typingsSlinky.awsSdk.ivsMod.ClientConfiguration): Self = StObject.set(x, "ivs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvsUndefined: Self = StObject.set(x, "ivs", js.undefined)
    
    @scala.inline
    def setKafka(value: typingsSlinky.awsSdk.kafkaMod.ClientConfiguration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    @scala.inline
    def setKendra(value: typingsSlinky.awsSdk.kendraMod.ClientConfiguration): Self = StObject.set(x, "kendra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKendraUndefined: Self = StObject.set(x, "kendra", js.undefined)
    
    @scala.inline
    def setKinesis(value: typingsSlinky.awsSdk.kinesisMod.ClientConfiguration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setKinesisanalytics(value: typingsSlinky.awsSdk.kinesisanalyticsMod.ClientConfiguration): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
    
    @scala.inline
    def setKinesisanalyticsv2(value: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
    
    @scala.inline
    def setKinesisvideo(value: typingsSlinky.awsSdk.kinesisvideoMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
    
    @scala.inline
    def setKinesisvideoarchivedmedia(value: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideoarchivedmediaUndefined: Self = StObject.set(x, "kinesisvideoarchivedmedia", js.undefined)
    
    @scala.inline
    def setKinesisvideomedia(value: typingsSlinky.awsSdk.kinesisvideomediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideomedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideomediaUndefined: Self = StObject.set(x, "kinesisvideomedia", js.undefined)
    
    @scala.inline
    def setKinesisvideosignalingchannels(value: typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideosignalingchannelsUndefined: Self = StObject.set(x, "kinesisvideosignalingchannels", js.undefined)
    
    @scala.inline
    def setKms(value: typingsSlinky.awsSdk.kmsMod.ClientConfiguration): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
    
    @scala.inline
    def setLakeformation(value: typingsSlinky.awsSdk.lakeformationMod.ClientConfiguration): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
    
    @scala.inline
    def setLambda(value: typingsSlinky.awsSdk.lambdaMod.ClientConfiguration): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setLexmodelbuildingservice(value: typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration): Self = StObject.set(x, "lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexmodelbuildingserviceUndefined: Self = StObject.set(x, "lexmodelbuildingservice", js.undefined)
    
    @scala.inline
    def setLexruntime(value: typingsSlinky.awsSdk.lexruntimeMod.ClientConfiguration): Self = StObject.set(x, "lexruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexruntimeUndefined: Self = StObject.set(x, "lexruntime", js.undefined)
    
    @scala.inline
    def setLicensemanager(value: typingsSlinky.awsSdk.licensemanagerMod.ClientConfiguration): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
    
    @scala.inline
    def setLightsail(value: typingsSlinky.awsSdk.lightsailMod.ClientConfiguration): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMachinelearning(value: typingsSlinky.awsSdk.machinelearningMod.ClientConfiguration): Self = StObject.set(x, "machinelearning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachinelearningUndefined: Self = StObject.set(x, "machinelearning", js.undefined)
    
    @scala.inline
    def setMacie(value: typingsSlinky.awsSdk.macieMod.ClientConfiguration): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacie2(value: typingsSlinky.awsSdk.macie2Mod.ClientConfiguration): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
    
    @scala.inline
    def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
    
    @scala.inline
    def setManagedblockchain(value: typingsSlinky.awsSdk.managedblockchainMod.ClientConfiguration): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
    
    @scala.inline
    def setMarketplacecatalog(value: typingsSlinky.awsSdk.marketplacecatalogMod.ClientConfiguration): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
    
    @scala.inline
    def setMarketplacecommerceanalytics(value: typingsSlinky.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration): Self = StObject.set(x, "marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacecommerceanalyticsUndefined: Self = StObject.set(x, "marketplacecommerceanalytics", js.undefined)
    
    @scala.inline
    def setMarketplaceentitlementservice(value: typingsSlinky.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration): Self = StObject.set(x, "marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplaceentitlementserviceUndefined: Self = StObject.set(x, "marketplaceentitlementservice", js.undefined)
    
    @scala.inline
    def setMarketplacemetering(value: typingsSlinky.awsSdk.marketplacemeteringMod.ClientConfiguration): Self = StObject.set(x, "marketplacemetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacemeteringUndefined: Self = StObject.set(x, "marketplacemetering", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setMediaconnect(value: typingsSlinky.awsSdk.mediaconnectMod.ClientConfiguration): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
    
    @scala.inline
    def setMediaconvert(value: typingsSlinky.awsSdk.mediaconvertMod.ClientConfiguration): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
    
    @scala.inline
    def setMedialive(value: typingsSlinky.awsSdk.medialiveMod.ClientConfiguration): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
    
    @scala.inline
    def setMediapackage(value: typingsSlinky.awsSdk.mediapackageMod.ClientConfiguration): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
    
    @scala.inline
    def setMediapackagevod(value: typingsSlinky.awsSdk.mediapackagevodMod.ClientConfiguration): Self = StObject.set(x, "mediapackagevod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediapackagevodUndefined: Self = StObject.set(x, "mediapackagevod", js.undefined)
    
    @scala.inline
    def setMediastore(value: typingsSlinky.awsSdk.mediastoreMod.ClientConfiguration): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
    
    @scala.inline
    def setMediastoredata(value: typingsSlinky.awsSdk.mediastoredataMod.ClientConfiguration): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
    
    @scala.inline
    def setMediatailor(value: typingsSlinky.awsSdk.mediatailorMod.ClientConfiguration): Self = StObject.set(x, "mediatailor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediatailorUndefined: Self = StObject.set(x, "mediatailor", js.undefined)
    
    @scala.inline
    def setMigrationhub(value: typingsSlinky.awsSdk.migrationhubMod.ClientConfiguration): Self = StObject.set(x, "migrationhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationhubUndefined: Self = StObject.set(x, "migrationhub", js.undefined)
    
    @scala.inline
    def setMigrationhubconfig(value: typingsSlinky.awsSdk.migrationhubconfigMod.ClientConfiguration): Self = StObject.set(x, "migrationhubconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationhubconfigUndefined: Self = StObject.set(x, "migrationhubconfig", js.undefined)
    
    @scala.inline
    def setMobile(value: typingsSlinky.awsSdk.mobileMod.ClientConfiguration): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setMobileanalytics(value: typingsSlinky.awsSdk.mobileanalyticsMod.ClientConfiguration): Self = StObject.set(x, "mobileanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileanalyticsUndefined: Self = StObject.set(x, "mobileanalytics", js.undefined)
    
    @scala.inline
    def setMq(value: typingsSlinky.awsSdk.mqMod.ClientConfiguration): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    
    @scala.inline
    def setMturk(value: typingsSlinky.awsSdk.mturkMod.ClientConfiguration): Self = StObject.set(x, "mturk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMturkUndefined: Self = StObject.set(x, "mturk", js.undefined)
    
    @scala.inline
    def setNeptune(value: typingsSlinky.awsSdk.neptuneMod.ClientConfiguration): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
    
    @scala.inline
    def setNetworkfirewall(value: typingsSlinky.awsSdk.networkfirewallMod.ClientConfiguration): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
    
    @scala.inline
    def setNetworkmanager(value: typingsSlinky.awsSdk.networkmanagerMod.ClientConfiguration): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
    
    @scala.inline
    def setOpsworks(value: typingsSlinky.awsSdk.opsworksMod.ClientConfiguration): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
    
    @scala.inline
    def setOpsworkscm(value: typingsSlinky.awsSdk.opsworkscmMod.ClientConfiguration): Self = StObject.set(x, "opsworkscm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsworkscmUndefined: Self = StObject.set(x, "opsworkscm", js.undefined)
    
    @scala.inline
    def setOrganizations(value: typingsSlinky.awsSdk.organizationsMod.ClientConfiguration): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOutposts(value: typingsSlinky.awsSdk.outpostsMod.ClientConfiguration): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
    
    @scala.inline
    def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    @scala.inline
    def setPersonalize(value: typingsSlinky.awsSdk.personalizeMod.ClientConfiguration): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
    
    @scala.inline
    def setPersonalizeevents(value: typingsSlinky.awsSdk.personalizeeventsMod.ClientConfiguration): Self = StObject.set(x, "personalizeevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeeventsUndefined: Self = StObject.set(x, "personalizeevents", js.undefined)
    
    @scala.inline
    def setPersonalizeruntime(value: typingsSlinky.awsSdk.personalizeruntimeMod.ClientConfiguration): Self = StObject.set(x, "personalizeruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeruntimeUndefined: Self = StObject.set(x, "personalizeruntime", js.undefined)
    
    @scala.inline
    def setPi(value: typingsSlinky.awsSdk.piMod.ClientConfiguration): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
    
    @scala.inline
    def setPinpoint(value: typingsSlinky.awsSdk.pinpointMod.ClientConfiguration): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
    
    @scala.inline
    def setPinpointemail(value: typingsSlinky.awsSdk.pinpointemailMod.ClientConfiguration): Self = StObject.set(x, "pinpointemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointemailUndefined: Self = StObject.set(x, "pinpointemail", js.undefined)
    
    @scala.inline
    def setPinpointsmsvoice(value: typingsSlinky.awsSdk.pinpointsmsvoiceMod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointsmsvoiceUndefined: Self = StObject.set(x, "pinpointsmsvoice", js.undefined)
    
    @scala.inline
    def setPolly(value: typingsSlinky.awsSdk.pollyMod.ClientConfiguration): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollyUndefined: Self = StObject.set(x, "polly", js.undefined)
    
    @scala.inline
    def setPricing(value: typingsSlinky.awsSdk.pricingMod.ClientConfiguration): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    @scala.inline
    def setQldb(value: typingsSlinky.awsSdk.qldbMod.ClientConfiguration): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
    
    @scala.inline
    def setQldbsession(value: typingsSlinky.awsSdk.qldbsessionMod.ClientConfiguration): Self = StObject.set(x, "qldbsession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQldbsessionUndefined: Self = StObject.set(x, "qldbsession", js.undefined)
    
    @scala.inline
    def setQuicksight(value: typingsSlinky.awsSdk.quicksightMod.ClientConfiguration): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
    
    @scala.inline
    def setRam(value: typingsSlinky.awsSdk.ramMod.ClientConfiguration): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
    
    @scala.inline
    def setRds(value: typingsSlinky.awsSdk.rdsMod.ClientConfiguration): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    @scala.inline
    def setRdsdataservice(value: typingsSlinky.awsSdk.rdsdataserviceMod.ClientConfiguration): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
    
    @scala.inline
    def setRedshift(value: typingsSlinky.awsSdk.redshiftMod.ClientConfiguration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    @scala.inline
    def setRedshiftdata(value: typingsSlinky.awsSdk.redshiftdataMod.ClientConfiguration): Self = StObject.set(x, "redshiftdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftdataUndefined: Self = StObject.set(x, "redshiftdata", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRekognition(value: typingsSlinky.awsSdk.rekognitionMod.ClientConfiguration): Self = StObject.set(x, "rekognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRekognitionUndefined: Self = StObject.set(x, "rekognition", js.undefined)
    
    @scala.inline
    def setResourcegroups(value: typingsSlinky.awsSdk.resourcegroupsMod.ClientConfiguration): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
    
    @scala.inline
    def setResourcegroupstaggingapi(value: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
    
    @scala.inline
    def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    @scala.inline
    def setRobomaker(value: typingsSlinky.awsSdk.robomakerMod.ClientConfiguration): Self = StObject.set(x, "robomaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobomakerUndefined: Self = StObject.set(x, "robomaker", js.undefined)
    
    @scala.inline
    def setRoute53(value: typingsSlinky.awsSdk.route53Mod.ClientConfiguration): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
    
    @scala.inline
    def setRoute53domains(value: typingsSlinky.awsSdk.route53domainsMod.ClientConfiguration): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
    
    @scala.inline
    def setRoute53resolver(value: typingsSlinky.awsSdk.route53resolverMod.ClientConfiguration): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
    
    @scala.inline
    def setS3(value: typingsSlinky.awsSdk.s3Mod.ClientConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    @scala.inline
    def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    @scala.inline
    def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    @scala.inline
    def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    @scala.inline
    def setS3control(value: typingsSlinky.awsSdk.s3controlMod.ClientConfiguration): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
    
    @scala.inline
    def setS3outposts(value: typingsSlinky.awsSdk.s3outpostsMod.ClientConfiguration): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
    
    @scala.inline
    def setSagemaker(value: typingsSlinky.awsSdk.sagemakerMod.ClientConfiguration): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
    
    @scala.inline
    def setSagemakerruntime(value: typingsSlinky.awsSdk.sagemakerruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSagemakerruntimeUndefined: Self = StObject.set(x, "sagemakerruntime", js.undefined)
    
    @scala.inline
    def setSavingsplans(value: typingsSlinky.awsSdk.savingsplansMod.ClientConfiguration): Self = StObject.set(x, "savingsplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsplansUndefined: Self = StObject.set(x, "savingsplans", js.undefined)
    
    @scala.inline
    def setSchemas(value: typingsSlinky.awsSdk.schemasMod.ClientConfiguration): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    @scala.inline
    def setSecretsmanager(value: typingsSlinky.awsSdk.secretsmanagerMod.ClientConfiguration): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
    
    @scala.inline
    def setSecurityhub(value: typingsSlinky.awsSdk.securityhubMod.ClientConfiguration): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
    
    @scala.inline
    def setServerlessapplicationrepository(value: typingsSlinky.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration): Self = StObject.set(x, "serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerlessapplicationrepositoryUndefined: Self = StObject.set(x, "serverlessapplicationrepository", js.undefined)
    
    @scala.inline
    def setServicecatalog(value: typingsSlinky.awsSdk.servicecatalogMod.ClientConfiguration): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
    
    @scala.inline
    def setServicecatalogappregistry(value: typingsSlinky.awsSdk.servicecatalogappregistryMod.ClientConfiguration): Self = StObject.set(x, "servicecatalogappregistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicecatalogappregistryUndefined: Self = StObject.set(x, "servicecatalogappregistry", js.undefined)
    
    @scala.inline
    def setServicediscovery(value: typingsSlinky.awsSdk.servicediscoveryMod.ClientConfiguration): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
    
    @scala.inline
    def setServicequotas(value: typingsSlinky.awsSdk.servicequotasMod.ClientConfiguration): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
    
    @scala.inline
    def setSes(value: typingsSlinky.awsSdk.sesMod.ClientConfiguration): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    @scala.inline
    def setSesv2(value: typingsSlinky.awsSdk.sesv2Mod.ClientConfiguration): Self = StObject.set(x, "sesv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSesv2Undefined: Self = StObject.set(x, "sesv2", js.undefined)
    
    @scala.inline
    def setShield(value: typingsSlinky.awsSdk.shieldMod.ClientConfiguration): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
    
    @scala.inline
    def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    @scala.inline
    def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    @scala.inline
    def setSigner(value: typingsSlinky.awsSdk.signerMod.ClientConfiguration): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    @scala.inline
    def setSimpledb(value: typingsSlinky.awsSdk.simpledbMod.ClientConfiguration): Self = StObject.set(x, "simpledb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpledbUndefined: Self = StObject.set(x, "simpledb", js.undefined)
    
    @scala.inline
    def setSms(value: typingsSlinky.awsSdk.smsMod.ClientConfiguration): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
    
    @scala.inline
    def setSnowball(value: typingsSlinky.awsSdk.snowballMod.ClientConfiguration): Self = StObject.set(x, "snowball", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballUndefined: Self = StObject.set(x, "snowball", js.undefined)
    
    @scala.inline
    def setSns(value: typingsSlinky.awsSdk.snsMod.ClientConfiguration): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: typingsSlinky.awsSdk.sqsMod.ClientConfiguration): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    @scala.inline
    def setSsm(value: typingsSlinky.awsSdk.ssmMod.ClientConfiguration): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    
    @scala.inline
    def setSso(value: typingsSlinky.awsSdk.ssoMod.ClientConfiguration): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    @scala.inline
    def setSsoadmin(value: typingsSlinky.awsSdk.ssoadminMod.ClientConfiguration): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
    
    @scala.inline
    def setSsooidc(value: typingsSlinky.awsSdk.ssooidcMod.ClientConfiguration): Self = StObject.set(x, "ssooidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsooidcUndefined: Self = StObject.set(x, "ssooidc", js.undefined)
    
    @scala.inline
    def setStepfunctions(value: typingsSlinky.awsSdk.stepfunctionsMod.ClientConfiguration): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
    
    @scala.inline
    def setStoragegateway(value: typingsSlinky.awsSdk.storagegatewayMod.ClientConfiguration): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
    
    @scala.inline
    def setSts(value: typingsSlinky.awsSdk.stsMod.ClientConfiguration): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    @scala.inline
    def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    
    @scala.inline
    def setSupport(value: typingsSlinky.awsSdk.supportMod.ClientConfiguration): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    @scala.inline
    def setSwf(value: typingsSlinky.awsSdk.swfMod.ClientConfiguration): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    @scala.inline
    def setSynthetics(value: typingsSlinky.awsSdk.syntheticsMod.ClientConfiguration): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    @scala.inline
    def setTextract(value: typingsSlinky.awsSdk.textractMod.ClientConfiguration): Self = StObject.set(x, "textract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextractUndefined: Self = StObject.set(x, "textract", js.undefined)
    
    @scala.inline
    def setTimestreamquery(value: typingsSlinky.awsSdk.timestreamqueryMod.ClientConfiguration): Self = StObject.set(x, "timestreamquery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestreamqueryUndefined: Self = StObject.set(x, "timestreamquery", js.undefined)
    
    @scala.inline
    def setTimestreamwrite(value: typingsSlinky.awsSdk.timestreamwriteMod.ClientConfiguration): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
    
    @scala.inline
    def setTranscribeservice(value: typingsSlinky.awsSdk.transcribeserviceMod.ClientConfiguration): Self = StObject.set(x, "transcribeservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscribeserviceUndefined: Self = StObject.set(x, "transcribeservice", js.undefined)
    
    @scala.inline
    def setTransfer(value: typingsSlinky.awsSdk.transferMod.ClientConfiguration): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setTranslate(value: typingsSlinky.awsSdk.translateMod.ClientConfiguration): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def setWaf(value: typingsSlinky.awsSdk.wafMod.ClientConfiguration): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
    
    @scala.inline
    def setWafregional(value: typingsSlinky.awsSdk.wafregionalMod.ClientConfiguration): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
    
    @scala.inline
    def setWafv2(value: typingsSlinky.awsSdk.wafv2Mod.ClientConfiguration): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
    
    @scala.inline
    def setWorkdocs(value: typingsSlinky.awsSdk.workdocsMod.ClientConfiguration): Self = StObject.set(x, "workdocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkdocsUndefined: Self = StObject.set(x, "workdocs", js.undefined)
    
    @scala.inline
    def setWorklink(value: typingsSlinky.awsSdk.worklinkMod.ClientConfiguration): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
    
    @scala.inline
    def setWorkmail(value: typingsSlinky.awsSdk.workmailMod.ClientConfiguration): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
    
    @scala.inline
    def setWorkmailmessageflow(value: typingsSlinky.awsSdk.workmailmessageflowMod.ClientConfiguration): Self = StObject.set(x, "workmailmessageflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkmailmessageflowUndefined: Self = StObject.set(x, "workmailmessageflow", js.undefined)
    
    @scala.inline
    def setWorkspaces(value: typingsSlinky.awsSdk.workspacesMod.ClientConfiguration): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    @scala.inline
    def setXray(value: typingsSlinky.awsSdk.xrayMod.ClientConfiguration): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
  }
}
