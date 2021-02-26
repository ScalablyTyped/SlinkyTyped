package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContinuousBackupsUnavailableExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ContinuousBackupsUnavailableExceptionDetails> * / any */ @js.native
  trait ContinuousBackupsUnavailableException
    extends CreateBackupExceptionsUnion
       with UpdateContinuousBackupsExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException = js.native
  }
  object ContinuousBackupsUnavailableException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException
    ): ContinuousBackupsUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsUnavailableException]
    }
    
    @scala.inline
    implicit class ContinuousBackupsUnavailableExceptionMutableBuilder[Self <: ContinuousBackupsUnavailableException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContinuousBackupsUnavailableExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object ContinuousBackupsUnavailableExceptionDetails {
    
    @scala.inline
    def apply(): ContinuousBackupsUnavailableExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContinuousBackupsUnavailableExceptionDetails]
    }
    
    @scala.inline
    implicit class ContinuousBackupsUnavailableExceptionDetailsMutableBuilder[Self <: ContinuousBackupsUnavailableExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
