package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBProxyRequest extends js.Object {
  /**
    * The authorization mechanism that the proxy uses.
    */
  var Auth: UserAuthConfigList = js.native
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var DBProxyName: String = js.native
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.native
  /**
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always MYSQL. The engine family applies to both RDS MySQL and Aurora MySQL.
    */
  var EngineFamily: typingsSlinky.awsSdk.rdsMod.EngineFamily = js.native
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  var IdleClientTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
    */
  var RoleArn: String = js.native
  /**
    * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * One or more VPC security group IDs to associate with the new proxy.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * One or more VPC subnet IDs to associate with the new proxy.
    */
  var VpcSubnetIds: StringList = js.native
}

object CreateDBProxyRequest {
  @scala.inline
  def apply(
    Auth: UserAuthConfigList,
    DBProxyName: String,
    EngineFamily: EngineFamily,
    RoleArn: String,
    VpcSubnetIds: StringList
  ): CreateDBProxyRequest = {
    val __obj = js.Dynamic.literal(Auth = Auth.asInstanceOf[js.Any], DBProxyName = DBProxyName.asInstanceOf[js.Any], EngineFamily = EngineFamily.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], VpcSubnetIds = VpcSubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBProxyRequest]
  }
  @scala.inline
  implicit class CreateDBProxyRequestOps[Self <: CreateDBProxyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: UserAuthConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineFamily(value: EngineFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcSubnetIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleClientTimeout(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdleClientTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleClientTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdleClientTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireTLS")(js.undefined)
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
    def withVpcSecurityGroupIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

