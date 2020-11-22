package typingsSlinky.pulumiAws.proxyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.rds.ProxyAuth
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the proxy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
    */
  val auths: js.UndefOr[Input[js.Array[Input[ProxyAuth]]]] = js.native
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  val debugLogging: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
    */
  val engineFamily: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  val idleClientTimeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
    */
  val requireTls: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * One or more VPC security group IDs to associate with the new proxy.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * One or more VPC subnet IDs to associate with the new proxy.
    */
  val vpcSubnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ProxyState {
  
  @scala.inline
  def apply(): ProxyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyState]
  }
  
  @scala.inline
  implicit class ProxyStateOps[Self <: ProxyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAuthsVarargs(value: Input[ProxyAuth]*): Self = this.set("auths", js.Array(value :_*))
    
    @scala.inline
    def setAuths(value: Input[js.Array[Input[ProxyAuth]]]): Self = this.set("auths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuths: Self = this.set("auths", js.undefined)
    
    @scala.inline
    def setDebugLogging(value: Input[Boolean]): Self = this.set("debugLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugLogging: Self = this.set("debugLogging", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEngineFamily(value: Input[String]): Self = this.set("engineFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineFamily: Self = this.set("engineFamily", js.undefined)
    
    @scala.inline
    def setIdleClientTimeout(value: Input[Double]): Self = this.set("idleClientTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleClientTimeout: Self = this.set("idleClientTimeout", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequireTls(value: Input[Boolean]): Self = this.set("requireTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireTls: Self = this.set("requireTls", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSubnetIdsVarargs(value: Input[String]*): Self = this.set("vpcSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSubnetIds: Self = this.set("vpcSubnetIds", js.undefined)
  }
}
