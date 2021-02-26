package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestOnAuthRequiredEvent[TCallback] extends StObject {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  def addListener(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[OnAuthRequiredOptions]): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
