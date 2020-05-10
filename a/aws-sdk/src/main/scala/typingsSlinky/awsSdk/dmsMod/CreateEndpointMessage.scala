package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible settings include the following:    ServiceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    BucketName - The name of the S3 bucket to use.    CompressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.DmsTransferSettings] = js.native
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For information about other available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.DynamoDbSettings] = js.native
  /**
    * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ElasticsearchSettings] = js.native
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: String = js.native
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: ReplicationEndpointTypeValue = js.native
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType value, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", and "sqlserver".
    */
  var EngineName: String = js.native
  /**
    * The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * Additional attributes associated with the connection. Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple attributes are separated by a semicolon (;) with no additional white space. For information on the attributes available for connecting your source or target endpoint, see Working with AWS DMS Endpoints in the AWS Database Migration Service User Guide. 
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.native
  /**
    * Settings in JSON format for the target Apache Kafka endpoint. For information about other available settings, see Using Object Mapping to Migrate Data to Apache Kafka in the AWS Database Migration User Guide. 
    */
  var KafkaSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.KafkaSettings] = js.native
  /**
    * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams. For information about other available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
    */
  var KinesisSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.KinesisSettings] = js.native
  /**
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * The password to be used to log in to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.native
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  var RedshiftSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.RedshiftSettings] = js.native
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.S3Settings] = js.native
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    *  The Amazon Resource Name (ARN) for the service access role that you want to use to create the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is none 
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  /**
    * One or more tags to be assigned to the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user name to be used to log in to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.native
}

object CreateEndpointMessage {
  @scala.inline
  def apply(EndpointIdentifier: String, EndpointType: ReplicationEndpointTypeValue, EngineName: String): CreateEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointIdentifier = EndpointIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any], EngineName = EngineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointMessage]
  }
  @scala.inline
  implicit class CreateEndpointMessageOps[Self <: CreateEndpointMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointType(value: ReplicationEndpointTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withPassword(value: SecretString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

