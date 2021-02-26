package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeveloperUserAlreadyRegisteredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DeveloperUserAlreadyRegisteredExceptionDetails> * / any */ @js.native
  trait DeveloperUserAlreadyRegisteredException extends GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException = js.native
  }
  object DeveloperUserAlreadyRegisteredException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
    ): DeveloperUserAlreadyRegisteredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
    }
    
    @scala.inline
    implicit class DeveloperUserAlreadyRegisteredExceptionMutableBuilder[Self <: DeveloperUserAlreadyRegisteredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeveloperUserAlreadyRegisteredExceptionDetails extends StObject {
    
    /**
      * <p>This developer user identifier is already registered with Cognito.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object DeveloperUserAlreadyRegisteredExceptionDetails {
    
    @scala.inline
    def apply(): DeveloperUserAlreadyRegisteredExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeveloperUserAlreadyRegisteredExceptionDetails]
    }
    
    @scala.inline
    implicit class DeveloperUserAlreadyRegisteredExceptionDetailsMutableBuilder[Self <: DeveloperUserAlreadyRegisteredExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
