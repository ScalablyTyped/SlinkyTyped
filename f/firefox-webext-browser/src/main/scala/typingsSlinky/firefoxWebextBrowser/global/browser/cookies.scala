package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.cookies.Cookie
import typingsSlinky.firefoxWebextBrowser.browser.cookies.CookieStore
import typingsSlinky.firefoxWebextBrowser.browser.cookies.GetAllDetails
import typingsSlinky.firefoxWebextBrowser.browser.cookies.GetDetails
import typingsSlinky.firefoxWebextBrowser.browser.cookies.OnChangedChangeInfo
import typingsSlinky.firefoxWebextBrowser.browser.cookies.RemoveDetails
import typingsSlinky.firefoxWebextBrowser.browser.cookies.RemoveReturnDetails
import typingsSlinky.firefoxWebextBrowser.browser.cookies.SetDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
  *
  * Permissions: `cookies`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.cookies")
@js.native
object cookies extends js.Object {
  
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL, the one with the longest path will be returned. For cookies with the same path length, the cookie with the earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def get(details: GetDetails): js.Promise[Cookie | Null] = js.native
  
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be sorted, with those with the longest path first. If multiple cookies have the same path length, those with the earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def getAll(details: GetAllDetails): js.Promise[js.Array[Cookie]] = js.native
  
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = js.native
  
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second notification with "cause" "explicit".
    */
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ OnChangedChangeInfo, Unit]] = js.native
  
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def remove(details: RemoveDetails): js.Promise[RemoveReturnDetails | Null] = js.native
  
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def set(details: SetDetails): js.Promise[Cookie] = js.native
}
