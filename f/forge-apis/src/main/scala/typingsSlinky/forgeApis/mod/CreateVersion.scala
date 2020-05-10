package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVersion extends js.Object {
  var data: js.UndefOr[CreateVersionData] = js.native
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}

object CreateVersion {
  @scala.inline
  def apply(): CreateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersion]
  }
  @scala.inline
  implicit class CreateVersionOps[Self <: CreateVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateVersionData): Self = {
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

