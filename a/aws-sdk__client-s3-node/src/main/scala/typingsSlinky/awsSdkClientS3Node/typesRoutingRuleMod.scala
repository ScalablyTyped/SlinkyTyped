package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesConditionMod.Condition
import typingsSlinky.awsSdkClientS3Node.typesConditionMod.UnmarshalledCondition
import typingsSlinky.awsSdkClientS3Node.typesRedirectMod.Redirect
import typingsSlinky.awsSdkClientS3Node.typesRedirectMod.UnmarshalledRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRoutingRuleMod {
  
  @js.native
  trait RoutingRule extends StObject {
    
    /**
      * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
      */
    var Condition: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesConditionMod.Condition] = js.native
    
    /**
      * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
      */
    var Redirect: typingsSlinky.awsSdkClientS3Node.typesRedirectMod.Redirect = js.native
  }
  object RoutingRule {
    
    @scala.inline
    def apply(Redirect: Redirect): RoutingRule = {
      val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingRule]
    }
    
    @scala.inline
    implicit class RoutingRuleMutableBuilder[Self <: RoutingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      @scala.inline
      def setRedirect(value: Redirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledRoutingRule extends RoutingRule {
    
    /**
      * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
      */
    @JSName("Condition")
    var Condition_UnmarshalledRoutingRule: js.UndefOr[UnmarshalledCondition] = js.native
    
    /**
      * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
      */
    @JSName("Redirect")
    var Redirect_UnmarshalledRoutingRule: UnmarshalledRedirect = js.native
  }
  object UnmarshalledRoutingRule {
    
    @scala.inline
    def apply(Redirect: UnmarshalledRedirect): UnmarshalledRoutingRule = {
      val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRoutingRule]
    }
    
    @scala.inline
    implicit class UnmarshalledRoutingRuleMutableBuilder[Self <: UnmarshalledRoutingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: UnmarshalledCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      @scala.inline
      def setRedirect(value: UnmarshalledRedirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    }
  }
}
