package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora.
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthVarargs(value: UserAuthConfig*): Self = this.set("Auth", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: UserAuthConfigList): Self = this.set("Auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineFamily(value: EngineFamily): Self = this.set("EngineFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSubnetIdsVarargs(value: String*): Self = this.set("VpcSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSubnetIds(value: StringList): Self = this.set("VpcSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLogging(value: Boolean): Self = this.set("DebugLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugLogging: Self = this.set("DebugLogging", js.undefined)
    
    @scala.inline
    def setIdleClientTimeout(value: IntegerOptional): Self = this.set("IdleClientTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleClientTimeout: Self = this.set("IdleClientTimeout", js.undefined)
    
    @scala.inline
    def setRequireTLS(value: Boolean): Self = this.set("RequireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireTLS: Self = this.set("RequireTLS", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: StringList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
}
