package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConcurrentModificationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ConcurrentModificationExceptionDetails> * / any */ @js.native
  trait ConcurrentModificationException
    extends SetIdentityPoolRolesExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException = js.native
  }
  object ConcurrentModificationException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
    ): ConcurrentModificationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcurrentModificationException]
    }
    
    @scala.inline
    implicit class ConcurrentModificationExceptionMutableBuilder[Self <: ConcurrentModificationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConcurrentModificationExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by a ConcurrentModificationException.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ConcurrentModificationExceptionDetails {
    
    @scala.inline
    def apply(): ConcurrentModificationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcurrentModificationExceptionDetails]
    }
    
    @scala.inline
    implicit class ConcurrentModificationExceptionDetailsMutableBuilder[Self <: ConcurrentModificationExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
