package typingsSlinky.googleCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderOptions extends js.Object {
  var descending: Boolean = js.native
}

object OrderOptions {
  @scala.inline
  def apply(descending: Boolean): OrderOptions = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderOptions]
  }
  @scala.inline
  implicit class OrderOptionsOps[Self <: OrderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

