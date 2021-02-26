package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.UnmarshalledSamplingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingRuleRecordMod {
  
  @js.native
  trait SamplingRuleRecord extends StObject {
    
    /**
      * <p>When the rule was created.</p>
      */
    var CreatedAt: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>When the rule was last modified.</p>
      */
    var ModifiedAt: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>The sampling rule.</p>
      */
    var SamplingRule: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule] = js.native
  }
  object SamplingRuleRecord {
    
    @scala.inline
    def apply(): SamplingRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingRuleRecord]
    }
    
    @scala.inline
    implicit class SamplingRuleRecordMutableBuilder[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: js.Date | String | Double): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtDate(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
      
      @scala.inline
      def setModifiedAt(value: js.Date | String | Double): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedAtDate(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
      
      @scala.inline
      def setSamplingRule(value: SamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSamplingRuleRecord extends SamplingRuleRecord {
    
    /**
      * <p>When the rule was created.</p>
      */
    @JSName("CreatedAt")
    var CreatedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>When the rule was last modified.</p>
      */
    @JSName("ModifiedAt")
    var ModifiedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>The sampling rule.</p>
      */
    @JSName("SamplingRule")
    var SamplingRule_UnmarshalledSamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRule] = js.native
  }
  object UnmarshalledSamplingRuleRecord {
    
    @scala.inline
    def apply(): UnmarshalledSamplingRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingRuleRecord]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingRuleRecordMutableBuilder[Self <: UnmarshalledSamplingRuleRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
      
      @scala.inline
      def setModifiedAt(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
      
      @scala.inline
      def setSamplingRule(value: UnmarshalledSamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
    }
  }
}
