package typingsSlinky.freedom.freedom

import org.scalajs.dom.raw.Blob
import typingsSlinky.freedom.freedomStrings.onclose
import typingsSlinky.freedom.freedomStrings.onerror
import typingsSlinky.freedom.freedomStrings.onmessage_
import typingsSlinky.freedom.freedomStrings.onopen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCDataChannel {
  
  @js.native
  trait Message extends StObject {
    
    var binary: js.UndefOr[Blob] = js.native
    
    var buffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    // Exactly one of the below must be specified.
    var text: js.UndefOr[String] = js.native
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Blob): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  // Constructed by |freedom['rtcdatachannel'](id)| where |id| is a string
  // representing the channel id created by an |rtcpeerconnection| object.
  @js.native
  trait RTCDataChannel extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def getBinaryType(): js.Promise[String] = js.native
    
    def getBufferedAmount(): js.Promise[Double] = js.native
    
    def getId(): js.Promise[Double] = js.native
    
    def getLabel(): js.Promise[String] = js.native
    
    def getMaxPacketLifeTime(): js.Promise[Double] = js.native
    
    def getMaxRetransmits(): js.Promise[Double] = js.native
    
    def getNegotiated(): js.Promise[Boolean] = js.native
    
    def getOrdered(): js.Promise[Boolean] = js.native
    
    def getProtocol(): js.Promise[String] = js.native
    
    def getReadyState(): js.Promise[String] = js.native
    
    def on(t: String, f: js.Function): Unit = js.native
    @JSName("on")
    def on_onclose(t: onclose, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onerror(t: onerror, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onmessage(t: onmessage_, f: js.Function1[/* m */ Message, Unit]): Unit = js.native
    @JSName("on")
    def on_onopen(t: onopen, f: js.Function0[Unit]): Unit = js.native
    
    def send(a: String): js.Promise[Unit] = js.native
    
    def sendBuffer(a: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
    @JSName("sendBuffer")
    var sendBuffer_Original: Method1[js.typedarray.ArrayBuffer, Unit] = js.native
    
    @JSName("send")
    var send_Original: Method1[String, Unit] = js.native
    
    def setBinaryType(`type`: String): js.Promise[Unit] = js.native
  }
}
