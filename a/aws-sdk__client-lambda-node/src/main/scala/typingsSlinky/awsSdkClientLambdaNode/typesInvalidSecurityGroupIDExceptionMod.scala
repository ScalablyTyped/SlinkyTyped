package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSecurityGroupIDExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSecurityGroupIDExceptionDetails> * / any */ @js.native
  trait InvalidSecurityGroupIDException extends InvokeExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException = js.native
  }
  object InvalidSecurityGroupIDException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException
    ): InvalidSecurityGroupIDException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidSecurityGroupIDException]
    }
    
    @scala.inline
    implicit class InvalidSecurityGroupIDExceptionMutableBuilder[Self <: InvalidSecurityGroupIDException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidSecurityGroupIDExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object InvalidSecurityGroupIDExceptionDetails {
    
    @scala.inline
    def apply(): InvalidSecurityGroupIDExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidSecurityGroupIDExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidSecurityGroupIDExceptionDetailsMutableBuilder[Self <: InvalidSecurityGroupIDExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
