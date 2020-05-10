package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDbSettings extends js.Object {
  /**
    *  The authentication mechanism you use to access the MongoDB source endpoint. Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1  DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This setting isn't used when authType=No.
    */
  var AuthMechanism: js.UndefOr[AuthMechanismValue] = js.native
  /**
    *  The MongoDB database name. This setting isn't used when authType=NO.  The default is admin.
    */
  var AuthSource: js.UndefOr[String] = js.native
  /**
    *  The authentication type you use to access the MongoDB source endpoint. Valid values: NO, PASSWORD  When NO is selected, user name and password parameters are not used and can be empty. 
    */
  var AuthType: js.UndefOr[AuthTypeValue] = js.native
  /**
    *  The database name on the MongoDB source endpoint. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    *  Indicates the number of documents to preview to determine the document organization. Use this setting when NestingLevel is set to ONE.  Must be a positive value greater than 0. Default value is 1000.
    */
  var DocsToInvestigate: js.UndefOr[String] = js.native
  /**
    *  Specifies the document ID. Use this setting when NestingLevel is set to NONE.  Default value is false. 
    */
  var ExtractDocId: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    *  Specifies either document or table mode.  Valid values: NONE, ONE Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
    */
  var NestingLevel: js.UndefOr[NestingLevelValue] = js.native
  /**
    *  The password for the user account you use to access the MongoDB source endpoint. 
    */
  var Password: js.UndefOr[SecretString] = js.native
  /**
    *  The port value for the MongoDB source endpoint. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The name of the server on the MongoDB source endpoint. 
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    * The user name you use to access the MongoDB source endpoint. 
    */
  var Username: js.UndefOr[String] = js.native
}

object MongoDbSettings {
  @scala.inline
  def apply(): MongoDbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDbSettings]
  }
  @scala.inline
  implicit class MongoDbSettingsOps[Self <: MongoDbSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMechanism(value: AuthMechanismValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthMechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMechanism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthMechanism")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthSource")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthType(value: AuthTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthType")(js.undefined)
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
    def withDocsToInvestigate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocsToInvestigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocsToInvestigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocsToInvestigate")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractDocId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtractDocId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractDocId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtractDocId")(js.undefined)
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
    def withNestingLevel(value: NestingLevelValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NestingLevel")(js.undefined)
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

