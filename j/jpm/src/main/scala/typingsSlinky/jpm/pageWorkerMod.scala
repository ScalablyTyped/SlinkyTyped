package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.Port
import typingsSlinky.jpm.anon.Allow
import typingsSlinky.jpm.anon.Script
import typingsSlinky.jpm.jpmStrings.error
import typingsSlinky.jpm.jpmStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a permanent, invisible page and access its DOM
  */
object pageWorkerMod {
  
  @JSImport("sdk/page-worker", "Page")
  @js.native
  def Page(options: Allow): PageWorker = js.native
  
  @js.native
  trait PageWorker extends StObject {
    
    var allow: js.UndefOr[Script] = js.native
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentURL: js.UndefOr[String] = js.native
    
    def destroy(): Unit = js.native
    
    var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.native
    
    def on(event: error, handler: js.Function1[/* arg */ js.UndefOr[message | js.Error], _]): Unit = js.native
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* arg */ js.UndefOr[message | js.Error], _]): Unit = js.native
    
    var port: Port = js.native
    
    def postMessage(message: String): Unit = js.native
    
    def removeListener(event: String, listener: js.Function): Unit = js.native
  }
}
