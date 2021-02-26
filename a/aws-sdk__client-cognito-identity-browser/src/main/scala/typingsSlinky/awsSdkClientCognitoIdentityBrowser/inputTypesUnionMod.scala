package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CreateIdentityPoolInput(AllowUnauthenticatedIdentities: Boolean, IdentityPoolName: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput]
    }
    
    @scala.inline
    def DeleteIdentitiesInput(IdentityIdsToDelete: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput = {
      val __obj = js.Dynamic.literal(IdentityIdsToDelete = IdentityIdsToDelete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput]
    }
    
    @scala.inline
    def DeleteIdentityPoolInput(IdentityPoolId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput]
    }
    
    @scala.inline
    def DescribeIdentityInput(IdentityId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput]
    }
    
    @scala.inline
    def DescribeIdentityPoolInput(IdentityPoolId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput]
    }
    
    @scala.inline
    def GetCredentialsForIdentityInput(IdentityId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput]
    }
    
    @scala.inline
    def GetIdInput(IdentityPoolId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput]
    }
    
    @scala.inline
    def GetIdentityPoolRolesInput(IdentityPoolId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput]
    }
    
    @scala.inline
    def GetOpenIdTokenForDeveloperIdentityInput(
      IdentityPoolId: String,
      Logins: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput]
    }
    
    @scala.inline
    def GetOpenIdTokenInput(IdentityId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput]
    }
    
    @scala.inline
    def ListIdentitiesInput(IdentityPoolId: String, MaxResults: Double): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput]
    }
    
    @scala.inline
    def ListIdentityPoolsInput(MaxResults: Double): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput = {
      val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput]
    }
    
    @scala.inline
    def LookupDeveloperIdentityInput(IdentityPoolId: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput]
    }
    
    @scala.inline
    def MergeDeveloperIdentitiesInput(
      DestinationUserIdentifier: String,
      DeveloperProviderName: String,
      IdentityPoolId: String,
      SourceUserIdentifier: String
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput = {
      val __obj = js.Dynamic.literal(DestinationUserIdentifier = DestinationUserIdentifier.asInstanceOf[js.Any], DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SourceUserIdentifier = SourceUserIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput]
    }
    
    @scala.inline
    def SetIdentityPoolRolesInput(IdentityPoolId: String, Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput]
    }
    
    @scala.inline
    def UnlinkDeveloperIdentityInput(
      DeveloperProviderName: String,
      DeveloperUserIdentifier: String,
      IdentityId: String,
      IdentityPoolId: String
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], DeveloperUserIdentifier = DeveloperUserIdentifier.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput]
    }
    
    @scala.inline
    def UnlinkIdentityInput(
      IdentityId: String,
      Logins: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]),
      LoginsToRemove: js.Array[String] | js.Iterable[String]
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any], LoginsToRemove = LoginsToRemove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput]
    }
    
    @scala.inline
    def UpdateIdentityPoolInput(AllowUnauthenticatedIdentities: Boolean, IdentityPoolId: String, IdentityPoolName: String): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput]
    }
  }
}
