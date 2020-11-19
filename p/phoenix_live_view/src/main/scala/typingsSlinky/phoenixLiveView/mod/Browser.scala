package typingsSlinky.phoenixLiveView.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix_live_view", "Browser")
@js.native
object Browser extends js.Object {
  
  def canPushState(): Boolean = js.native
  
  def dropLocal(namespace: String, subkey: String): js.Any = js.native
  
  def fetchPage(href: String, callback: js.Function2[/* status */ Double, /* resp */ js.UndefOr[String], _]): js.Any = js.native
  
  def getCookie(name: String): String = js.native
  
  def getHashTargetEl(hash: js.Any): HTMLElement | Null = js.native
  
  def getLocal(namespace: String, subkey: String): js.Any = js.native
  
  def localKey(namespace: String, subkey: String): String = js.native
  
  def pushState(kind: js.Any, meta: js.Any, to: String): Unit = js.native
  
  def redirect(toURL: String, flash: js.Any): Unit = js.native
  
  def setCookie(name: String, value: String): Unit = js.native
  
  def updateLocal(namespace: String, subkey: String, initial: js.Any, func: js.Function1[/* current */ js.Any, _]): js.Any = js.native
}
