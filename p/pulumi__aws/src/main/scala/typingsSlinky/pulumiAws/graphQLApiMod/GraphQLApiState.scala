package typingsSlinky.pulumiAws.graphQLApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider
import typingsSlinky.pulumiAws.inputMod.appsync.GraphQLApiLogConfig
import typingsSlinky.pulumiAws.inputMod.appsync.GraphQLApiOpenidConnectConfig
import typingsSlinky.pulumiAws.inputMod.appsync.GraphQLApiUserPoolConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLApiState extends js.Object {
  
  /**
    * One or more additional authentication providers for the GraphqlApi. Defined below.
    */
  val additionalAuthenticationProviders: js.UndefOr[Input[js.Array[Input[GraphQLApiAdditionalAuthenticationProvider]]]] = js.native
  
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: js.UndefOr[Input[GraphQLApiLogConfig]] = js.native
  
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: js.UndefOr[Input[GraphQLApiOpenidConnectConfig]] = js.native
  
  /**
    * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
    */
  val schema: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
    */
  val uris: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: js.UndefOr[Input[GraphQLApiUserPoolConfig]] = js.native
  
  /**
    * Whether tracing with X-ray is enabled. Defaults to false.
    */
  val xrayEnabled: js.UndefOr[Input[Boolean]] = js.native
}
object GraphQLApiState {
  
  @scala.inline
  def apply(): GraphQLApiState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLApiState]
  }
  
  @scala.inline
  implicit class GraphQLApiStateOps[Self <: GraphQLApiState] (val x: Self) extends AnyVal {
    
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
    def setAdditionalAuthenticationProvidersVarargs(value: Input[GraphQLApiAdditionalAuthenticationProvider]*): Self = this.set("additionalAuthenticationProviders", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalAuthenticationProviders(value: Input[js.Array[Input[GraphQLApiAdditionalAuthenticationProvider]]]): Self = this.set("additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticationProviders: Self = this.set("additionalAuthenticationProviders", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAuthenticationType(value: Input[String]): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    
    @scala.inline
    def setLogConfig(value: Input[GraphQLApiLogConfig]): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpenidConnectConfig(value: Input[GraphQLApiOpenidConnectConfig]): Self = this.set("openidConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenidConnectConfig: Self = this.set("openidConnectConfig", js.undefined)
    
    @scala.inline
    def setSchema(value: Input[String]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUris(value: Input[StringDictionary[Input[String]]]): Self = this.set("uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: Input[GraphQLApiUserPoolConfig]): Self = this.set("userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolConfig: Self = this.set("userPoolConfig", js.undefined)
    
    @scala.inline
    def setXrayEnabled(value: Input[Boolean]): Self = this.set("xrayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXrayEnabled: Self = this.set("xrayEnabled", js.undefined)
  }
}
