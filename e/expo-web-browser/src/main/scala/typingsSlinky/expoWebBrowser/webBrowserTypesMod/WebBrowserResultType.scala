package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.locked
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly CANCEL :'cancel',  readonly DISMISS :'dismiss',  readonly OPENED :'opened',  readonly LOCKED :'locked'}[keyof { readonly CANCEL :'cancel',  readonly DISMISS :'dismiss',  readonly OPENED :'opened',  readonly LOCKED :'locked'}] */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoWebBrowser.expoWebBrowserStrings.cancel
  - typingsSlinky.expoWebBrowser.expoWebBrowserStrings.dismiss
  - typingsSlinky.expoWebBrowser.expoWebBrowserStrings.opened
  - typingsSlinky.expoWebBrowser.expoWebBrowserStrings.locked
*/
trait WebBrowserResultType extends js.Object
@JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType")
@js.native
object WebBrowserResultType extends js.Object {
  
  /**
    * iOS only
    */
  val CANCEL: cancel = js.native
  
  /**
    * iOS only
    */
  val DISMISS: dismiss = js.native
  
  val LOCKED: locked = js.native
  
  /**
    * Android only
    */
  val OPENED: opened = js.native
}
