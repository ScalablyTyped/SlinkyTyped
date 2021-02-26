package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.getShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ProvisionedThroughputExceededExceptionDetails> * / any */ @js.native
  trait ProvisionedThroughputExceededException
    extends GetRecordsExceptionsUnion
       with GetShardIteratorExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException = js.native
  }
  object ProvisionedThroughputExceededException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
    ): ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedThroughputExceededException]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputExceededExceptionMutableBuilder[Self <: ProvisionedThroughputExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProvisionedThroughputExceededExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ProvisionedThroughputExceededExceptionDetails {
    
    @scala.inline
    def apply(): ProvisionedThroughputExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputExceededExceptionDetailsMutableBuilder[Self <: ProvisionedThroughputExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
