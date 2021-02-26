package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubnetIPAddressLimitReachedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_SubnetIPAddressLimitReachedExceptionDetails> * / any */ @js.native
  trait SubnetIPAddressLimitReachedException extends InvokeExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException = js.native
  }
  object SubnetIPAddressLimitReachedException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException
    ): SubnetIPAddressLimitReachedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubnetIPAddressLimitReachedException]
    }
    
    @scala.inline
    implicit class SubnetIPAddressLimitReachedExceptionMutableBuilder[Self <: SubnetIPAddressLimitReachedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubnetIPAddressLimitReachedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object SubnetIPAddressLimitReachedExceptionDetails {
    
    @scala.inline
    def apply(): SubnetIPAddressLimitReachedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubnetIPAddressLimitReachedExceptionDetails]
    }
    
    @scala.inline
    implicit class SubnetIPAddressLimitReachedExceptionDetailsMutableBuilder[Self <: SubnetIPAddressLimitReachedExceptionDetails] (val x: Self) extends AnyVal {
      
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
