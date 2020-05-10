package typingsSlinky.pulumiAws.endpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dms.EndpointMongodbSettings
import typingsSlinky.pulumiAws.inputMod.dms.EndpointS3Settings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the endpoint database.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * The database endpoint identifier.
    */
  val endpointId: Input[String] = js.native
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: Input[String] = js.native
  /**
    * The type of engine for the endpoint. Can be one of `aurora | azuredb | db2 | docdb | dynamodb | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: Input[String] = js.native
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Settings for the source MongoDB endpoint. Available settings are `authType` (default: `password`), `authMechanism` (default: `default`), `nestingLevel` (default: `none`), `extractDocId` (default: `false`), `docsToInvestigate` (default: `1000`) and `authSource` (default: `admin`). For more details, see [Using MongoDB as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html).
    */
  val mongodbSettings: js.UndefOr[Input[EndpointMongodbSettings]] = js.native
  /**
    * The password to be used to login to the endpoint database.
    */
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * The port used by the endpoint database.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * Settings for the target S3 endpoint. Available settings are `serviceAccessRoleArn`, `externalTableDefinition`, `csvRowDelimiter` (default: `\\n`), `csvDelimiter` (default: `,`), `bucketFolder`, `bucketName` and `compressionType` (default: `NONE`). For more details, see [Using Amazon S3 as a Target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html).
    */
  val s3Settings: js.UndefOr[Input[EndpointS3Settings]] = js.native
  /**
    * The host name of the server.
    */
  val serverName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
    */
  val serviceAccessRole: js.UndefOr[Input[String]] = js.native
  /**
    * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
    */
  val sslMode: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: js.UndefOr[Input[String]] = js.native
}

object EndpointArgs {
  @scala.inline
  def apply(endpointId: Input[String], endpointType: Input[String], engineName: Input[String]): EndpointArgs = {
    val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
  @scala.inline
  implicit class EndpointArgsOps[Self <: EndpointArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraConnectionAttributes(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraConnectionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraConnectionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraConnectionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMongodbSettings(value: Input[EndpointMongodbSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongodbSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMongodbSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongodbSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Settings(value: Input[EndpointS3Settings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccessRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccessRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSslMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

