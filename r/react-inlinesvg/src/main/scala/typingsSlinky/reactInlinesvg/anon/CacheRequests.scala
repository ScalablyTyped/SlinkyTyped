package typingsSlinky.reactInlinesvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheRequests extends js.Object {
  var cacheRequests: Boolean = js.native
  var uniquifyIDs: Boolean = js.native
}

object CacheRequests {
  @scala.inline
  def apply(cacheRequests: Boolean, uniquifyIDs: Boolean): CacheRequests = {
    val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], uniquifyIDs = uniquifyIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheRequests]
  }
  @scala.inline
  implicit class CacheRequestsOps[Self <: CacheRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniquifyIDs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniquifyIDs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

