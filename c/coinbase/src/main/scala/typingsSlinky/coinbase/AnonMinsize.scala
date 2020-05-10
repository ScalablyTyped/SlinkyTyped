package typingsSlinky.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMinsize extends js.Object {
  /**
    * Abbreviation e.g. "USD" or "BTC"
    */
  var id: String = js.native
  /**
    * Floating-point number in a string
    */
  var min_size: String = js.native
  /**
    * Full name e.g. "United Arab Emirates Dirham"
    */
  var name: String = js.native
}

object AnonMinsize {
  @scala.inline
  def apply(id: String, min_size: String, name: String): AnonMinsize = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], min_size = min_size.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinsize]
  }
  @scala.inline
  implicit class AnonMinsizeOps[Self <: AnonMinsize] (val x: Self) extends AnyVal {
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
    def withMin_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

