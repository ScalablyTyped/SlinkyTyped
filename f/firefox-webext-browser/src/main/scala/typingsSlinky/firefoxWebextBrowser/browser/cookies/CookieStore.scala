package typingsSlinky.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cookie store in the browser. An incognito mode window, for instance, uses a separate cookie store
  * from a non-incognito window.
  */
@js.native
trait CookieStore extends js.Object {
  /** The unique identifier for the cookie store. */
  var id: String = js.native
  /** Indicates if this is an incognito cookie store */
  var incognito: Boolean = js.native
  /** Identifiers of all the browser tabs that share this cookie store. */
  var tabIds: js.Array[Double] = js.native
}

object CookieStore {
  @scala.inline
  def apply(id: String, incognito: Boolean, tabIds: js.Array[Double]): CookieStore = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieStore]
  }
  @scala.inline
  implicit class CookieStoreOps[Self <: CookieStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

