package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
   // 'soft'
  var cache_size: js.UndefOr[Double] = js.native
  var datacenter: js.UndefOr[String] = js.native
   // 'id'
  var durability: js.UndefOr[String] = js.native
  var primary_key: js.UndefOr[String] = js.native
}

object TableOptions {
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_size")(js.undefined)
        ret
    }
    @scala.inline
    def withDatacenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datacenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatacenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datacenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDurability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durability")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_key")(js.undefined)
        ret
    }
  }
  
}

