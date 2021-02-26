package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRestoreTimeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRestoreTimeExceptionDetails> * / any */ @js.native
  trait InvalidRestoreTimeException extends RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException = js.native
  }
  object InvalidRestoreTimeException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException
    ): InvalidRestoreTimeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidRestoreTimeException]
    }
    
    @scala.inline
    implicit class InvalidRestoreTimeExceptionMutableBuilder[Self <: InvalidRestoreTimeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidRestoreTimeExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidRestoreTimeExceptionDetails {
    
    @scala.inline
    def apply(): InvalidRestoreTimeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRestoreTimeExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidRestoreTimeExceptionDetailsMutableBuilder[Self <: InvalidRestoreTimeExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
