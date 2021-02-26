package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.cookies.Cookie
import typingsSlinky.chrome.chrome.cookies.CookieChangedEvent
import typingsSlinky.chrome.chrome.cookies.CookieStore
import typingsSlinky.chrome.chrome.cookies.Details
import typingsSlinky.chrome.chrome.cookies.GetAllDetails
import typingsSlinky.chrome.chrome.cookies.SetDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcookies extends StObject {
  
  def get(details: Details, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
  
  def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], Unit]): Unit = js.native
  
  def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], Unit]): Unit = js.native
  
  var onChanged: CookieChangedEvent = js.native
  
  def remove(details: Details): Unit = js.native
  def remove(details: Details, callback: js.Function1[/* details */ Details, Unit]): Unit = js.native
  
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
}
