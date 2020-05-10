package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRef extends js.Object {
  var data: js.UndefOr[CreateRefData] = js.native
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}

object CreateRef {
  @scala.inline
  def apply(): CreateRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRef]
  }
  @scala.inline
  implicit class CreateRefOps[Self <: CreateRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateRefData): Self = {
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

