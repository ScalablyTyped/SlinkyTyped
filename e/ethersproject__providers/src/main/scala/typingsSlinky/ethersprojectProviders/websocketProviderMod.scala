package typingsSlinky.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocketProviderMod {
  
  @JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider")
  @js.native
  class WebSocketProvider protected () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: String, network: Networkish) = this()
    
    val _detectNetwork: js.Promise[Network] = js.native
    
    val _requests: StringDictionary[InflightRequest] = js.native
    
    val _subIds: StringDictionary[js.Promise[String]] = js.native
    
    val _subs: StringDictionary[Subscription] = js.native
    
    def _subscribe(tag: String, param: js.Array[_], processFunc: js.Function1[/* result */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    val _websocket: js.Any = js.native
    
    var _wsReady: Boolean = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def send(method: String): js.Promise[_] = js.native
  }
  /* static members */
  object WebSocketProvider {
    
    @JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
  }
  
  @js.native
  trait InflightRequest extends StObject {
    
    def callback(error: js.Error, result: js.Any): Unit = js.native
    
    var payload: String = js.native
  }
  object InflightRequest {
    
    @scala.inline
    def apply(callback: (js.Error, js.Any) => Unit, payload: String): InflightRequest = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[InflightRequest]
    }
    
    @scala.inline
    implicit class InflightRequestMutableBuilder[Self <: InflightRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (js.Error, js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def processFunc(payload: js.Any): Unit = js.native
    
    var tag: String = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(processFunc: js.Any => Unit, tag: String): Subscription = {
      val __obj = js.Dynamic.literal(processFunc = js.Any.fromFunction1(processFunc), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessFunc(value: js.Any => Unit): Self = StObject.set(x, "processFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
