package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONBaseAttributes extends js.Object {
  var createdAt: String = js.native
  var objectId: String = js.native
  var updatedAt: String = js.native
}

object JSONBaseAttributes {
  @scala.inline
  def apply(createdAt: String, objectId: String, updatedAt: String): JSONBaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONBaseAttributes]
  }
  @scala.inline
  implicit class JSONBaseAttributesOps[Self <: JSONBaseAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: String): Self = {
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
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

