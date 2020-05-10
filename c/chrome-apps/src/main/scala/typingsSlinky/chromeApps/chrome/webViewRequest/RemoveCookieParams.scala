package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T Filter type
  */
@js.native
trait RemoveCookieParams[T] extends js.Object {
  /**
    * Filter for cookies that will be removed.
    * All empty entries are ignored.
    */
  var filter: T = js.native
}

object RemoveCookieParams {
  @scala.inline
  def apply[T](filter: T): RemoveCookieParams[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCookieParams[T]]
  }
  @scala.inline
  implicit class RemoveCookieParamsOps[Self[t] <: RemoveCookieParams[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

