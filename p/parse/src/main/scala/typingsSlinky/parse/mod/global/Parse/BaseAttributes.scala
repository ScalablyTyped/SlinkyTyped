package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAttributes extends js.Object {
  var createdAt: js.Date
  var objectId: String
  var updatedAt: js.Date
}

object BaseAttributes {
  @scala.inline
  def apply(createdAt: js.Date, objectId: String, updatedAt: js.Date): BaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributes]
  }
}

