package typingsSlinky.protooClient

import typingsSlinky.protooClient.anon.ClientConfig
import typingsSlinky.protooClient.protooClientBooleans.`false`
import typingsSlinky.protooClient.protooClientBooleans.`true`
import typingsSlinky.protooClient.protooClientStrings.close
import typingsSlinky.protooClient.protooClientStrings.disconnected
import typingsSlinky.protooClient.protooClientStrings.failed
import typingsSlinky.protooClient.protooClientStrings.notification
import typingsSlinky.protooClient.protooClientStrings.open
import typingsSlinky.protooClient.protooClientStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protoo-client", "Peer")
  @js.native
  class Peer protected () extends StObject {
    def this(transport: WebSocketTransport) = this()
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    val connected: Boolean = js.native
    
    var data: js.Any = js.native
    
    def notify(method: String): js.Promise[_] = js.native
    def notify(method: String, data: js.Any): js.Promise[_] = js.native
    
    @JSName("on")
    def on_close(evt: close, handler: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_disconnected(evt: disconnected, handler: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_failed(evt: failed, handler: js.Function1[/* currentAttempt */ Double, _]): Unit = js.native
    @JSName("on")
    def on_notification(evt: notification, handler: js.Function1[/* notif */ ProtooNotification, _]): Unit = js.native
    @JSName("on")
    def on_open(evt: open, handler: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_request(
      evt: request,
      handler: js.Function3[
          /* request */ ProtooRequest, 
          /* accept */ js.Function1[/* data */ js.UndefOr[ProtooResponse], Unit], 
          /* reject */ js.Function2[
            /* error */ js.UndefOr[js.Error | Double], 
            /* errorReason */ js.UndefOr[String], 
            Unit
          ], 
          _
        ]
    ): Unit = js.native
    
    def request(method: String): js.Promise[_] = js.native
    def request(method: String, data: js.Any): js.Promise[_] = js.native
  }
  
  @JSImport("protoo-client", "WebSocketTransport")
  @js.native
  class WebSocketTransport protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: ClientConfig) = this()
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    def send(message: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ProtooNotification extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var method: String = js.native
    
    var notification: `true` = js.native
  }
  object ProtooNotification {
    
    @scala.inline
    def apply(method: String, notification: `true`): ProtooNotification = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtooNotification]
    }
    
    @scala.inline
    implicit class ProtooNotificationMutableBuilder[Self <: ProtooNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: `true`): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtooRequest extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var id: Double = js.native
    
    var method: String = js.native
    
    var request: `true` = js.native
  }
  object ProtooRequest {
    
    @scala.inline
    def apply(id: Double, method: String, request: `true`): ProtooRequest = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtooRequest]
    }
    
    @scala.inline
    implicit class ProtooRequestMutableBuilder[Self <: ProtooRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: `true`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.protooClient.anon.Data
    - typingsSlinky.protooClient.anon.ErrorCode
  */
  trait ProtooResponse extends StObject
  object ProtooResponse {
    
    @scala.inline
    def Data(data: js.Any, id: Double, ok: `true`, response: `true`): typingsSlinky.protooClient.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.protooClient.anon.Data]
    }
    
    @scala.inline
    def ErrorCode(errorCode: Double, errorReason: String, id: Double, ok: `false`, response: `true`): typingsSlinky.protooClient.anon.ErrorCode = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.protooClient.anon.ErrorCode]
    }
  }
}
