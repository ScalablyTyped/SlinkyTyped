package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorage extends js.Object {
  var data: js.UndefOr[CreateStorageData] = js.native
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}

object CreateStorage {
  @scala.inline
  def apply(): CreateStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorage]
  }
  @scala.inline
  implicit class CreateStorageOps[Self <: CreateStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateStorageData): Self = {
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

