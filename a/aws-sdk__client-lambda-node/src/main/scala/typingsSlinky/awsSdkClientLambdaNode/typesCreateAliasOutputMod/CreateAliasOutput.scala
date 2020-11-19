package typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasOutputMod

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAliasOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
    */
  var AliasArn: js.UndefOr[String] = js.native
  
  /**
    * <p>Alias description.</p>
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * <p>Function version to which the alias points.</p>
    */
  var FunctionVersion: js.UndefOr[String] = js.native
  
  /**
    * <p>Alias name.</p>
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * <p>Represents the latest updated revision of the function or alias.</p>
    */
  var RevisionId: js.UndefOr[String] = js.native
  
  /**
    * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
    */
  var RoutingConfig: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.native
}
object CreateAliasOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateAliasOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasOutput]
  }
  
  @scala.inline
  implicit class CreateAliasOutputOps[Self <: CreateAliasOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasArn(value: String): Self = this.set("AliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasArn: Self = this.set("AliasArn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("FunctionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionVersion: Self = this.set("FunctionVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    
    @scala.inline
    def setRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = this.set("RoutingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingConfig: Self = this.set("RoutingConfig", js.undefined)
  }
}
