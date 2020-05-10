package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManyOptions extends CommonOptions {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object UpdateManyOptions {
  @scala.inline
  def apply(): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManyOptions]
  }
  @scala.inline
  implicit class UpdateManyOptionsOps[Self <: UpdateManyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFilters(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

