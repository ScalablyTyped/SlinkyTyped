package typingsSlinky.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpRateLimiterMod {
  
  object DDPRateLimiter {
    
    @JSImport("meteor/ddp-rate-limiter", "DDPRateLimiter.addRule")
    @js.native
    def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
    
    @JSImport("meteor/ddp-rate-limiter", "DDPRateLimiter.removeRule")
    @js.native
    def removeRule(ruleId: String): Boolean = js.native
    
    @js.native
    trait Matcher extends StObject {
      
      var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.native
      
      var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.native
      
      var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.native
      
      var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.native
      
      var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.native
    }
    object Matcher {
      
      @scala.inline
      def apply(): Matcher = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Matcher]
      }
      
      @scala.inline
      implicit class MatcherMutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientAddress(value: String | (js.Function1[/* clientAddress */ String, Boolean])): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientAddressFunction1(value: /* clientAddress */ String => Boolean): Self = StObject.set(x, "clientAddress", js.Any.fromFunction1(value))
        
        @scala.inline
        def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
        
        @scala.inline
        def setConnectionId(value: String | (js.Function1[/* connectionId */ String, Boolean])): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionIdFunction1(value: /* connectionId */ String => Boolean): Self = StObject.set(x, "connectionId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
        
        @scala.inline
        def setName(value: String | (js.Function1[/* name */ String, Boolean])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setType(value: String | (js.Function1[/* type */ String, Boolean])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeFunction1(value: /* type */ String => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUserId(value: String | (js.Function1[/* userId */ String, Boolean])): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdFunction1(value: /* userId */ String => Boolean): Self = StObject.set(x, "userId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
  }
}
