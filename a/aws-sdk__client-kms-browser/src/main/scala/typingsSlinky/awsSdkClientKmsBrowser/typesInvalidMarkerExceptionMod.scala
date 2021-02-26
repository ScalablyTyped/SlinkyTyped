package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidMarkerExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidMarkerExceptionDetails> * / any */ @js.native
  trait InvalidMarkerException
    extends ListAliasesExceptionsUnion
       with ListGrantsExceptionsUnion
       with ListKeysExceptionsUnion
       with ListResourceTagsExceptionsUnion
       with ListRetirableGrantsExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException = js.native
  }
  object InvalidMarkerException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException): InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidMarkerException]
    }
    
    @scala.inline
    implicit class InvalidMarkerExceptionMutableBuilder[Self <: InvalidMarkerException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidMarkerExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidMarkerExceptionDetails {
    
    @scala.inline
    def apply(): InvalidMarkerExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidMarkerExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidMarkerExceptionDetailsMutableBuilder[Self <: InvalidMarkerExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
