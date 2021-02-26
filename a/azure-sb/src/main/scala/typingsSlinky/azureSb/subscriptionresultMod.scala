package typingsSlinky.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait SubscriptionProperties extends StObject {
          
          var AutoDeleteOnIdle: Boolean = js.native
          
          var DeadLetteringOnFilterEvaluationExceptions: String = js.native
          
          var DeadLetteringOnMessageExpiration: String = js.native
          
          var DefaultMessageTimeToLive: String = js.native
          
          var EnableBatchedOperations: Boolean = js.native
          
          var LockDuration: String = js.native
          
          var MaxDeliveryCount: Double = js.native
          
          var MessageCount: Double = js.native
          
          var RequiresSession: Boolean = js.native
        }
        object SubscriptionProperties {
          
          @scala.inline
          def apply(
            AutoDeleteOnIdle: Boolean,
            DeadLetteringOnFilterEvaluationExceptions: String,
            DeadLetteringOnMessageExpiration: String,
            DefaultMessageTimeToLive: String,
            EnableBatchedOperations: Boolean,
            LockDuration: String,
            MaxDeliveryCount: Double,
            MessageCount: Double,
            RequiresSession: Boolean
          ): SubscriptionProperties = {
            val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
            __obj.asInstanceOf[SubscriptionProperties]
          }
          
          @scala.inline
          implicit class SubscriptionPropertiesMutableBuilder[Self <: SubscriptionProperties] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setAutoDeleteOnIdle(value: Boolean): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDeadLetteringOnFilterEvaluationExceptions(value: String): Self = StObject.set(x, "DeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMaxDeliveryCount(value: Double): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMessageCount(value: Double): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
          }
        }
        
        @js.native
        trait SubscriptionResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
          
          def serialize(resource: SubscriptionProperties): String = js.native
        }
        object SubscriptionResult {
          
          @scala.inline
          def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: SubscriptionProperties => String): SubscriptionResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[SubscriptionResult]
          }
          
          @scala.inline
          implicit class SubscriptionResultMutableBuilder[Self <: SubscriptionResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSerialize(value: SubscriptionProperties => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
