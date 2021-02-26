package typingsSlinky.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.analyticsNode.anon.Category
import typingsSlinky.analyticsNode.anon.Context
import typingsSlinky.analyticsNode.anon.Enable
import typingsSlinky.analyticsNode.anon.Event
import typingsSlinky.analyticsNode.anon.GroupId
import typingsSlinky.analyticsNode.anon.PreviousId
import typingsSlinky.analyticsNode.mod.AnalyticsNode.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("analytics-node", JSImport.Namespace)
  @js.native
  class ^ protected () extends Analytics {
    def this(writeKey: String) = this()
    def this(writeKey: String, opts: Enable) = this()
  }
  
  object AnalyticsNode {
    
    @js.native
    trait Analytics extends StObject {
      
      /* alias is how you associate one identity with another. */
      def alias(message: Identity with PreviousId): Analytics = js.native
      def alias(message: Identity with PreviousId, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* Flush batched calls to make sure nothing is left in the queue */
      def flush(): Analytics = js.native
      def flush(callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
      
      /* Group calls can be used to associate individual users with shared
        accounts or companies. */
      def group(message: Identity with GroupId): Analytics = js.native
      def group(message: Identity with GroupId, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The identify method lets you tie a user to their actions and record
        traits about them. */
      def identify(message: Identity with typingsSlinky.analyticsNode.anon.Integrations): Analytics = js.native
      def identify(
        message: Identity with typingsSlinky.analyticsNode.anon.Integrations,
        callback: js.Function1[/* err */ js.Error, Unit]
      ): Analytics = js.native
      
      /* The page method lets you record page views on your website, along with
        optional extra information about the page being viewed. */
      def page(message: Identity with Category): Analytics = js.native
      def page(message: Identity with Category, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The track method lets you record the actions your users perform. */
      def track(message: Identity with Event): Analytics = js.native
      def track(message: Identity with Event, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
    }
    
    @js.native
    trait Data extends StObject {
      
      var batch: js.Array[Message] = js.native
      
      var sentAt: js.Date = js.native
      
      var timestamp: js.Date = js.native
    }
    object Data {
      
      @scala.inline
      def apply(batch: js.Array[Message], sentAt: js.Date, timestamp: js.Date): Data = {
        val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Data]
      }
      
      @scala.inline
      implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBatch(value: js.Array[Message]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBatchVarargs(value: Message*): Self = StObject.set(x, "batch", js.Array(value :_*))
        
        @scala.inline
        def setSentAt(value: js.Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.analyticsNode.anon.UserId
      - typingsSlinky.analyticsNode.anon.AnonymousId
    */
    trait Identity extends StObject
    object Identity {
      
      @scala.inline
      def AnonymousId(anonymousId: String | Double): typingsSlinky.analyticsNode.anon.AnonymousId = {
        val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.analyticsNode.anon.AnonymousId]
      }
      
      @scala.inline
      def UserId(userId: String | Double): typingsSlinky.analyticsNode.anon.UserId = {
        val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.analyticsNode.anon.UserId]
      }
    }
    
    type IntegrationValue = Boolean | StringDictionary[js.Any]
    
    type Integrations = StringDictionary[IntegrationValue]
    
    type Message = Identity with Context
  }
}
