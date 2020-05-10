package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T First parameter type
  * @template K Second parameter type
  */
@js.native
trait EditCookieParams[T, K] extends js.Object {
  /**
    * Filter for cookies that will be modified.
    * All empty entries are ignored.
    */
  var filter: T = js.native
  /**
    * Attributes that shall be overridden in cookies that machted the filter
    * Attributes that are set to an empty string are removed.
    */
  var modification: K = js.native
}

object EditCookieParams {
  @scala.inline
  def apply[T, K](filter: T, modification: K): EditCookieParams[T, K] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCookieParams[T, K]]
  }
  @scala.inline
  implicit class EditCookieParamsOps[Self[t, k] <: EditCookieParams[t, k], T, K] (val x: Self[T, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, K]) with Other]
    @scala.inline
    def withFilter(value: T): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModification(value: K): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

