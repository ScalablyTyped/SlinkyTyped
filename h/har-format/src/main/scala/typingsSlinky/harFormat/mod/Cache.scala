package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  /**
    * State of a cache entry after the request.
    *
    * Leave out this field if the information is not available.
    */
  var afterRequest: js.UndefOr[CacheDetails | Null] = js.native
  /**
    * State of a cache entry before the request.
    *
    * Leave out this field if the information is not available.
    */
  var beforeRequest: js.UndefOr[CacheDetails | Null] = js.native
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
}

object Cache {
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRequest(value: CacheDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRequestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(null)
        ret
    }
    @scala.inline
    def withBeforeRequest(value: CacheDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRequestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(null)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
  }
  
}

