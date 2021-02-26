package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
    - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def CreateIdentityPoolOutput(
      $metadata: ResponseMetadata,
      AllowUnauthenticatedIdentities: Boolean,
      IdentityPoolId: String,
      IdentityPoolName: String
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput]
    }
    
    @scala.inline
    def DeleteIdentitiesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput]
    }
    
    @scala.inline
    def DeleteIdentityPoolOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput]
    }
    
    @scala.inline
    def DescribeIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput]
    }
    
    @scala.inline
    def DescribeIdentityPoolOutput(
      $metadata: ResponseMetadata,
      AllowUnauthenticatedIdentities: Boolean,
      IdentityPoolId: String,
      IdentityPoolName: String
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput]
    }
    
    @scala.inline
    def GetCredentialsForIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput]
    }
    
    @scala.inline
    def GetIdOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput]
    }
    
    @scala.inline
    def GetIdentityPoolRolesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput]
    }
    
    @scala.inline
    def GetOpenIdTokenForDeveloperIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput]
    }
    
    @scala.inline
    def GetOpenIdTokenOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput]
    }
    
    @scala.inline
    def ListIdentitiesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput]
    }
    
    @scala.inline
    def ListIdentityPoolsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput]
    }
    
    @scala.inline
    def LookupDeveloperIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput]
    }
    
    @scala.inline
    def MergeDeveloperIdentitiesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput]
    }
    
    @scala.inline
    def SetIdentityPoolRolesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput]
    }
    
    @scala.inline
    def UnlinkDeveloperIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput]
    }
    
    @scala.inline
    def UnlinkIdentityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput]
    }
    
    @scala.inline
    def UpdateIdentityPoolOutput(
      $metadata: ResponseMetadata,
      AllowUnauthenticatedIdentities: Boolean,
      IdentityPoolId: String,
      IdentityPoolName: String
    ): typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput]
    }
  }
}
