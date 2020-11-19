package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestOnSendHeadersEvent[TCallback] extends js.Object {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  def addListener(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[OnSendHeadersOptions]): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
