package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput
import typingsSlinky.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typingsSlinky.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
import typingsSlinky.awsSdkProtocolHttp.mod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.mod.HttpResponse
import typingsSlinky.awsSdkTypes.serdeMod.SerdeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/protocols/Aws_json1_1", JSImport.Namespace)
@js.native
object awsJson11Mod extends js.Object {
  
  @JSName("deserializeAws_json1_1CreateIdentityPoolCommand")
  def deserializeAwsJson11CreateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DeleteIdentitiesCommand")
  def deserializeAwsJson11DeleteIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DeleteIdentityPoolCommand")
  def deserializeAwsJson11DeleteIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DescribeIdentityCommand")
  def deserializeAwsJson11DescribeIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DescribeIdentityPoolCommand")
  def deserializeAwsJson11DescribeIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetCredentialsForIdentityCommand")
  def deserializeAwsJson11GetCredentialsForIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCredentialsForIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetIdCommand")
  def deserializeAwsJson11GetIdCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetIdentityPoolRolesCommand")
  def deserializeAwsJson11GetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdentityPoolRolesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetOpenIdTokenCommand")
  def deserializeAwsJson11GetOpenIdTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")
  def deserializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListIdentitiesCommand")
  def deserializeAwsJson11ListIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListIdentityPoolsCommand")
  def deserializeAwsJson11ListIdentityPoolsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentityPoolsCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListTagsForResourceCommand")
  def deserializeAwsJson11ListTagsForResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListTagsForResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1LookupDeveloperIdentityCommand")
  def deserializeAwsJson11LookupDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[LookupDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1MergeDeveloperIdentitiesCommand")
  def deserializeAwsJson11MergeDeveloperIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[MergeDeveloperIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1SetIdentityPoolRolesCommand")
  def deserializeAwsJson11SetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetIdentityPoolRolesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1TagResourceCommand")
  def deserializeAwsJson11TagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UnlinkDeveloperIdentityCommand")
  def deserializeAwsJson11UnlinkDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UnlinkIdentityCommand")
  def deserializeAwsJson11UnlinkIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UntagResourceCommand")
  def deserializeAwsJson11UntagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UpdateIdentityPoolCommand")
  def deserializeAwsJson11UpdateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[UpdateIdentityPoolCommandOutput] = js.native
  
  @JSName("serializeAws_json1_1CreateIdentityPoolCommand")
  def serializeAwsJson11CreateIdentityPoolCommand(input: CreateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DeleteIdentitiesCommand")
  def serializeAwsJson11DeleteIdentitiesCommand(input: DeleteIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DeleteIdentityPoolCommand")
  def serializeAwsJson11DeleteIdentityPoolCommand(input: DeleteIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DescribeIdentityCommand")
  def serializeAwsJson11DescribeIdentityCommand(input: DescribeIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DescribeIdentityPoolCommand")
  def serializeAwsJson11DescribeIdentityPoolCommand(input: DescribeIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetCredentialsForIdentityCommand")
  def serializeAwsJson11GetCredentialsForIdentityCommand(input: GetCredentialsForIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetIdCommand")
  def serializeAwsJson11GetIdCommand(input: GetIdCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetIdentityPoolRolesCommand")
  def serializeAwsJson11GetIdentityPoolRolesCommand(input: GetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetOpenIdTokenCommand")
  def serializeAwsJson11GetOpenIdTokenCommand(input: GetOpenIdTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")
  def serializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(input: GetOpenIdTokenForDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListIdentitiesCommand")
  def serializeAwsJson11ListIdentitiesCommand(input: ListIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListIdentityPoolsCommand")
  def serializeAwsJson11ListIdentityPoolsCommand(input: ListIdentityPoolsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListTagsForResourceCommand")
  def serializeAwsJson11ListTagsForResourceCommand(input: ListTagsForResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1LookupDeveloperIdentityCommand")
  def serializeAwsJson11LookupDeveloperIdentityCommand(input: LookupDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1MergeDeveloperIdentitiesCommand")
  def serializeAwsJson11MergeDeveloperIdentitiesCommand(input: MergeDeveloperIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1SetIdentityPoolRolesCommand")
  def serializeAwsJson11SetIdentityPoolRolesCommand(input: SetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1TagResourceCommand")
  def serializeAwsJson11TagResourceCommand(input: TagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UnlinkDeveloperIdentityCommand")
  def serializeAwsJson11UnlinkDeveloperIdentityCommand(input: UnlinkDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UnlinkIdentityCommand")
  def serializeAwsJson11UnlinkIdentityCommand(input: UnlinkIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UntagResourceCommand")
  def serializeAwsJson11UntagResourceCommand(input: UntagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UpdateIdentityPoolCommand")
  def serializeAwsJson11UpdateIdentityPoolCommand(input: UpdateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
}
