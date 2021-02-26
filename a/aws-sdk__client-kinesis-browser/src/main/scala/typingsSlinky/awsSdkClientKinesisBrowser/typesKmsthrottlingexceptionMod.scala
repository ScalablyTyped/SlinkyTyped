package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsthrottlingexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSThrottlingExceptionDetails> * / any */ @js.native
  trait KMSThrottlingException
    extends GetRecordsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with StartStreamEncryptionExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException = js.native
  }
  object KMSThrottlingException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException
    ): KMSThrottlingException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMSThrottlingException]
    }
    
    @scala.inline
    implicit class KMSThrottlingExceptionMutableBuilder[Self <: KMSThrottlingException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSThrottlingException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KMSThrottlingExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object KMSThrottlingExceptionDetails {
    
    @scala.inline
    def apply(): KMSThrottlingExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSThrottlingExceptionDetails]
    }
    
    @scala.inline
    implicit class KMSThrottlingExceptionDetailsMutableBuilder[Self <: KMSThrottlingExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
