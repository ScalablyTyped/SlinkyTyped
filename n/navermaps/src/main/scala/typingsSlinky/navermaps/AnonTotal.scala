package typingsSlinky.navermaps

import typingsSlinky.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotal extends js.Object {
  var items: js.Array[AddressItem] = js.native
  var total: Double = js.native
  var userquery: String = js.native
}

object AnonTotal {
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: String): AnonTotal = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotal]
  }
  @scala.inline
  implicit class AnonTotalOps[Self <: AnonTotal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[AddressItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserquery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userquery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

