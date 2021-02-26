package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import typingsSlinky.jpm.anon.IsPrivate
import typingsSlinky.jpm.jpmStrings.activate
import typingsSlinky.jpm.jpmStrings.close
import typingsSlinky.jpm.jpmStrings.deactivate
import typingsSlinky.jpm.jpmStrings.open
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumerate and examine open browser windows, open new windows, and listen for window events
  */
object windowsMod {
  
  @JSImport("sdk/windows", "browserWindows")
  @js.native
  val browserWindows: BrowserWindows_ = js.native
  
  @js.native
  trait BrowserWindows_ extends Array[BrowserWindow] {
    
    var activeWindow: BrowserWindow = js.native
    
    @JSName("on")
    def on_activate(event: activate, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_close(event: close, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_deactivate(event: deactivate, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    @JSName("on")
    def on_open(event: open, handler: js.Function1[/* window */ BrowserWindow, _]): Unit = js.native
    
    /**
      * Open a new window
      * @param options.isPrivate determines whether the new window should be private or not
      */
    def open(options: String): BrowserWindow = js.native
    def open(options: IsPrivate): BrowserWindow = js.native
  }
}
