package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsAccessEntityObject extends RouteOptionsAccessObject {
  var entity: AccessEntity = js.native
}

object RouteOptionsAccessEntityObject {
  @scala.inline
  def apply(entity: AccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
  @scala.inline
  implicit class RouteOptionsAccessEntityObjectOps[Self <: RouteOptionsAccessEntityObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: AccessEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

