package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the database at the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible settings include the following:    ServiceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    BucketName - The name of the S3 bucket to use.    CompressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.DmsTransferSettings] = js.native
  /**
    * The settings for the target DynamoDB database. For more information, see the DynamoDBSettings structure.
    */
  var DynamoDbSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.DynamoDbSettings] = js.native
  /**
    * The settings for the Elasticsearch source endpoint. For more information, see the ElasticsearchSettings structure.
    */
  var ElasticsearchSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ElasticsearchSettings] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.native
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", and "sqlserver".
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    *  Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent call to CreateEndpoint to create the endpoint with a cross-account. 
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * Additional connection attributes used to connect to the endpoint.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.native
  /**
    * The settings for the Apache Kafka target endpoint. For more information, see the KafkaSettings structure.
    */
  var KafkaSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.KafkaSettings] = js.native
  /**
    * The settings for the Amazon Kinesis target endpoint. For more information, see the KinesisSettings structure.
    */
  var KinesisSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.KinesisSettings] = js.native
  /**
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The settings for the MongoDB source endpoint. For more information, see the MongoDbSettings structure.
    */
  var MongoDbSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * The port value used to access the endpoint.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Settings for the Amazon Redshift endpoint.
    */
  var RedshiftSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.RedshiftSettings] = js.native
  /**
    * The settings for the S3 target endpoint. For more information, see the S3Settings structure.
    */
  var S3Settings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.S3Settings] = js.native
  /**
    * The name of the server at the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The user name used to connect to the endpoint.
    */
  var Username: js.UndefOr[String] = js.native
}

object Endpoint {
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDmsTransferSettings(value: DmsTransferSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DmsTransferSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDmsTransferSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DmsTransferSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDbSettings(value: DynamoDbSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDbSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDbSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamoDbSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchSettings(value: ElasticsearchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointType(value: ReplicationEndpointTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalTableDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalTableDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalTableDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalTableDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraConnectionAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraConnectionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraConnectionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraConnectionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaSettings(value: KafkaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisSettings(value: KinesisSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMongoDbSettings(value: MongoDbSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MongoDbSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMongoDbSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MongoDbSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftSettings(value: RedshiftSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Settings(value: S3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSslMode(value: DmsSslModeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

