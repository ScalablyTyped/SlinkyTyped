package typingsSlinky.pulumiAws.inputMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codestarnotifications {
  
  @js.native
  trait NotificationRuleTarget extends StObject {
    
    /**
      * The ARN of notification rule target. For example, a SNS Topic ARN.
      */
    var address: Input[String] = js.native
    
    /**
      * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
      */
    var status: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the notification target. Default value is `SNS`.
      */
    var `type`: js.UndefOr[Input[String]] = js.native
  }
  object NotificationRuleTarget {
    
    @scala.inline
    def apply(address: Input[String]): NotificationRuleTarget = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationRuleTarget]
    }
    
    @scala.inline
    implicit class NotificationRuleTargetMutableBuilder[Self <: NotificationRuleTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
