package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.DataRetrievalRule
import typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.UnmarshalledDataRetrievalRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDataRetrievalPolicyMod {
  
  @js.native
  trait DataRetrievalPolicy extends StObject {
    
    /**
      * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
      */
    var Rules: js.UndefOr[js.Array[DataRetrievalRule] | js.Iterable[DataRetrievalRule]] = js.native
  }
  object DataRetrievalPolicy {
    
    @scala.inline
    def apply(): DataRetrievalPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRetrievalPolicy]
    }
    
    @scala.inline
    implicit class DataRetrievalPolicyMutableBuilder[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[DataRetrievalRule] | js.Iterable[DataRetrievalRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesIterable(value: js.Iterable[DataRetrievalRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: DataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledDataRetrievalPolicy extends DataRetrievalPolicy {
    
    /**
      * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[UnmarshalledDataRetrievalRule]] = js.native
  }
  object UnmarshalledDataRetrievalPolicy {
    
    @scala.inline
    def apply(): UnmarshalledDataRetrievalPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDataRetrievalPolicy]
    }
    
    @scala.inline
    implicit class UnmarshalledDataRetrievalPolicyMutableBuilder[Self <: UnmarshalledDataRetrievalPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledDataRetrievalRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledDataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
