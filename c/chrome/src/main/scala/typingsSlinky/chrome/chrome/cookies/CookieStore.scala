package typingsSlinky.chrome.chrome.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieStore extends js.Object {
  /** The unique identifier for the cookie store. */
  var id: String = js.native
  /** Identifiers of all the browser tabs that share this cookie store. */
  var tabIds: js.Array[Double] = js.native
}

object CookieStore {
  @scala.inline
  def apply(id: String, tabIds: js.Array[Double]): CookieStore = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
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
    def withTabIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

