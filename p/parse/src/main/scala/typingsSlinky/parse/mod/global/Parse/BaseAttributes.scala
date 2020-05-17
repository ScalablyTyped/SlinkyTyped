package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAttributes extends js.Object {
  var createdAt: js.Date = js.native
  var objectId: String = js.native
  var updatedAt: js.Date = js.native
}

object BaseAttributes {
  @scala.inline
  def apply(createdAt: js.Date, objectId: String, updatedAt: js.Date): BaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributes]
  }
  @scala.inline
  implicit class BaseAttributesOps[Self <: BaseAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

