package typingsSlinky.expiredStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeekInterface extends js.Object {
  /**
    * Has the [key] expired or not
    */
  var isExpired: Boolean = js.native
  /**
    * Time remaining until expiration
    */
  var timeLeft: Double | Null = js.native
  /**
    * The value of a [key]
    */
  var value: String | Null = js.native
}

object PeekInterface {
  @scala.inline
  def apply(isExpired: Boolean): PeekInterface = {
    val __obj = js.Dynamic.literal(isExpired = isExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekInterface]
  }
  @scala.inline
  implicit class PeekInterfaceOps[Self <: PeekInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeft")(null)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

