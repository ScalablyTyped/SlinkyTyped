package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnsupportedMediaTypeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_UnsupportedMediaTypeExceptionDetails> * / any */ @js.native
  trait UnsupportedMediaTypeException extends InvokeExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException = js.native
  }
  object UnsupportedMediaTypeException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
    ): UnsupportedMediaTypeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsupportedMediaTypeException]
    }
    
    @scala.inline
    implicit class UnsupportedMediaTypeExceptionMutableBuilder[Self <: UnsupportedMediaTypeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnsupportedMediaTypeExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object UnsupportedMediaTypeExceptionDetails {
    
    @scala.inline
    def apply(): UnsupportedMediaTypeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsupportedMediaTypeExceptionDetails]
    }
    
    @scala.inline
    implicit class UnsupportedMediaTypeExceptionDetailsMutableBuilder[Self <: UnsupportedMediaTypeExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
