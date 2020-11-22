package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<CognitoIdentityResolvableConfiguration, CognitoIdentityResolvedConfiguration> */ js.Any = js.native
  
  @js.native
  class CognitoIdentity ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityMod.CognitoIdentity
  
  @js.native
  class CognitoIdentityClient protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient {
    def this(configuration: CognitoIdentityConfiguration) = this()
  }
  
  @js.native
  class CreateIdentityPoolCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.createIdentityPoolCommandMod.CreateIdentityPoolCommand {
    def this(input: CreateIdentityPoolInput) = this()
  }
  
  @js.native
  class DeleteIdentitiesCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesCommandMod.DeleteIdentitiesCommand {
    def this(input: DeleteIdentitiesInput) = this()
  }
  
  @js.native
  class DeleteIdentityPoolCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommand {
    def this(input: DeleteIdentityPoolInput) = this()
  }
  
  @js.native
  class DescribeIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityCommandMod.DescribeIdentityCommand {
    def this(input: DescribeIdentityInput) = this()
  }
  
  @js.native
  class DescribeIdentityPoolCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolCommandMod.DescribeIdentityPoolCommand {
    def this(input: DescribeIdentityPoolInput) = this()
  }
  
  @js.native
  class GetCredentialsForIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommand {
    def this(input: GetCredentialsForIdentityInput) = this()
  }
  
  @js.native
  class GetIdCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdCommandMod.GetIdCommand {
    def this(input: GetIdInput) = this()
  }
  
  @js.native
  class GetIdentityPoolRolesCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommand {
    def this(input: GetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenCommandMod.GetOpenIdTokenCommand {
    def this(input: GetOpenIdTokenInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommand {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
  }
  
  @js.native
  class ListIdentitiesCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentitiesCommandMod.ListIdentitiesCommand {
    def this(input: ListIdentitiesInput) = this()
  }
  
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsCommandMod.ListIdentityPoolsCommand {
    def this(input: ListIdentityPoolsInput) = this()
  }
  
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommand {
    def this(input: LookupDeveloperIdentityInput) = this()
  }
  
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommand {
    def this(input: MergeDeveloperIdentitiesInput) = this()
  }
  
  @js.native
  class SetIdentityPoolRolesCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommand {
    def this(input: SetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class UnlinkDeveloperIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommand {
    def this(input: UnlinkDeveloperIdentityInput) = this()
  }
  
  @js.native
  class UnlinkIdentityCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkIdentityCommandMod.UnlinkIdentityCommand {
    def this(input: UnlinkIdentityInput) = this()
  }
  
  @js.native
  class UpdateIdentityPoolCommand protected ()
    extends typingsSlinky.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolCommandMod.UpdateIdentityPoolCommand {
    def this(input: UpdateIdentityPoolInput) = this()
  }
}
