package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxy extends js.Object {
  /**
    * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance or Aurora DB cluster.
    */
  var Auth: js.UndefOr[UserAuthConfigInfoList] = js.native
  /**
    * The date and time when the proxy was first created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) for the proxy.
    */
  var DBProxyArn: js.UndefOr[String] = js.native
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.native
  /**
    * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * Currently, this value is always MYSQL. The engine family applies to both RDS MySQL and Aurora MySQL.
    */
  var EngineFamily: js.UndefOr[String] = js.native
  /**
    * The number of seconds a connection to the proxy can have no activity before the proxy drops the client connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for reuse by later connection requests. Default: 1800 (30 minutes) Constraints: 1 to 28,800
    */
  var IdleClientTimeout: js.UndefOr[Integer] = js.native
  /**
    * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * The current status of this proxy. A status of available means the proxy is ready to handle requests. Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[DBProxyStatus] = js.native
  /**
    * The date and time when the proxy was last updated.
    */
  var UpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * Provides a list of VPC security groups that the proxy belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The EC2 subnet IDs for the proxy.
    */
  var VpcSubnetIds: js.UndefOr[StringList] = js.native
}

object DBProxy {
  @scala.inline
  def apply(): DBProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxy]
  }
  @scala.inline
  implicit class DBProxyOps[Self <: DBProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: UserAuthConfigInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDBProxyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBProxyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBProxyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(js.undefined)
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
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleClientTimeout(value: Integer): Self = {
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
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DBProxyStatus): Self = {
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
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedDate")(js.undefined)
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
    @scala.inline
    def withVpcSubnetIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSubnetIds")(js.undefined)
        ret
    }
  }
  
}

