package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateItem extends js.Object {
  var data: js.UndefOr[CreateItemData] = js.native
  var included: js.Array[CreateItemIncluded] = js.native
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}

object CreateItem {
  @scala.inline
  def apply(included: js.Array[CreateItemIncluded]): CreateItem = {
    val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItem]
  }
  @scala.inline
  implicit class CreateItemOps[Self <: CreateItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncluded(value: js.Array[CreateItemIncluded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: CreateItemData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonapi(value: JsonApiVersionJsonapi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonapi")(js.undefined)
        ret
    }
  }
  
}

