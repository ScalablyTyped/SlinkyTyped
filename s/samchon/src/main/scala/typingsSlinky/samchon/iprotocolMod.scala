package typingsSlinky.samchon

import typingsSlinky.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iprotocolMod {
  
  @js.native
  trait IProtocol extends StObject {
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    def replyData(invoke: Invoke): Unit = js.native
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    def sendData(invoke: Invoke): Unit = js.native
  }
  object IProtocol {
    
    @scala.inline
    def apply(replyData: Invoke => Unit, sendData: Invoke => Unit): IProtocol = {
      val __obj = js.Dynamic.literal(replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
      __obj.asInstanceOf[IProtocol]
    }
    
    @scala.inline
    implicit class IProtocolMutableBuilder[Self <: IProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplyData(value: Invoke => Unit): Self = StObject.set(x, "replyData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendData(value: Invoke => Unit): Self = StObject.set(x, "sendData", js.Any.fromFunction1(value))
    }
  }
}
