package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEndpointMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Attributes include the following:   serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role that has permission to access the Amazon S3 bucket.   BucketName - The name of the S3 bucket to use.   compressionType - An optional parameter to use GZIP to compress the target files. Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
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
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String = js.native
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", and "sqlserver".
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an argument.
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
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typingsSlinky.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * The password to be used to login to the endpoint database.
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
    *  The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.native
}

object ModifyEndpointMessage {
  @scala.inline
  def apply(EndpointArn: String): ModifyEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointMessage]
  }
  @scala.inline
  implicit class ModifyEndpointMessageOps[Self <: ModifyEndpointMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
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

