package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesExceptionsUnionMod.DeleteIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsExceptionsUnionMod.ListIdentityPoolsExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.lookupDeveloperIdentityExceptionsUnionMod.LookupDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.mergeDeveloperIdentitiesExceptionsUnionMod.MergeDeveloperIdentitiesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkDeveloperIdentityExceptionsUnionMod.UnlinkDeveloperIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTooManyRequestsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TooManyRequestsExceptionDetails> * / any */ @js.native
  trait TooManyRequestsException
    extends CreateIdentityPoolExceptionsUnion
       with DeleteIdentitiesExceptionsUnion
       with DeleteIdentityPoolExceptionsUnion
       with DescribeIdentityExceptionsUnion
       with DescribeIdentityPoolExceptionsUnion
       with GetCredentialsForIdentityExceptionsUnion
       with GetIdExceptionsUnion
       with GetIdentityPoolRolesExceptionsUnion
       with GetOpenIdTokenExceptionsUnion
       with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
       with ListIdentitiesExceptionsUnion
       with ListIdentityPoolsExceptionsUnion
       with LookupDeveloperIdentityExceptionsUnion
       with MergeDeveloperIdentitiesExceptionsUnion
       with SetIdentityPoolRolesExceptionsUnion
       with UnlinkDeveloperIdentityExceptionsUnion
       with UnlinkIdentityExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException = js.native
  }
  object TooManyRequestsException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
    ): TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooManyRequestsException]
    }
    
    @scala.inline
    implicit class TooManyRequestsExceptionMutableBuilder[Self <: TooManyRequestsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooManyRequestsExceptionDetails extends StObject {
    
    /**
      * <p>Message returned by a TooManyRequestsException</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object TooManyRequestsExceptionDetails {
    
    @scala.inline
    def apply(): TooManyRequestsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooManyRequestsExceptionDetails]
    }
    
    @scala.inline
    implicit class TooManyRequestsExceptionDetailsMutableBuilder[Self <: TooManyRequestsExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
