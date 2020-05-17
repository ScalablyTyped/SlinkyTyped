package typingsSlinky.navermaps.anon

import typingsSlinky.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var items: js.Array[AddressItem] = js.native
  var total: Double = js.native
  var userquery: js.Any = js.native
}

object Items {
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
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
    def withUserquery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userquery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

