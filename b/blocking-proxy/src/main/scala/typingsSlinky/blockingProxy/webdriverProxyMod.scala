package typingsSlinky.blockingProxy

import typingsSlinky.blockingProxy.webdriverCommandsMod.WebDriverCommand
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverProxyMod {
  
  @JSImport("blocking-proxy/built/lib/webdriver_proxy", "WebDriverProxy")
  @js.native
  class WebDriverProxy protected () extends StObject {
    def this(seleniumAddress: String) = this()
    
    def addBarrier(barrier: WebDriverBarrier): Unit = js.native
    
    var barriers: js.Array[WebDriverBarrier] = js.native
    
    def handleRequest(originalRequest: IncomingMessage, response: ServerResponse): js.Promise[Unit] = js.native
    
    var seleniumAddress: String = js.native
  }
  
  @js.native
  trait WebDriverBarrier extends StObject {
    
    def onCommand(command: WebDriverCommand): js.Promise[Unit] = js.native
  }
  object WebDriverBarrier {
    
    @scala.inline
    def apply(onCommand: WebDriverCommand => js.Promise[Unit]): WebDriverBarrier = {
      val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand))
      __obj.asInstanceOf[WebDriverBarrier]
    }
    
    @scala.inline
    implicit class WebDriverBarrierMutableBuilder[Self <: WebDriverBarrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCommand(value: WebDriverCommand => js.Promise[Unit]): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    }
  }
}
