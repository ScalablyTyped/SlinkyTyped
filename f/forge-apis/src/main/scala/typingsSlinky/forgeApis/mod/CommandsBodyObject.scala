package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandsBodyObject extends js.Object {
  var data: CommandsBodyObjectData = js.native
  var included: js.UndefOr[js.Object] = js.native
  var jsonapi: JsonApiVersionJsonapi = js.native
}

object CommandsBodyObject {
  @scala.inline
  def apply(data: CommandsBodyObjectData, jsonapi: JsonApiVersionJsonapi): CommandsBodyObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObject]
  }
  @scala.inline
  implicit class CommandsBodyObjectOps[Self <: CommandsBodyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CommandsBodyObjectData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonapi(value: JsonApiVersionJsonapi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncluded(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(js.undefined)
        ret
    }
  }
  
}

