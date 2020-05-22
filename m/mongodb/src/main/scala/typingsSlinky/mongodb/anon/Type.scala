package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mongodbStrings.date
import typingsSlinky.mongodb.mongodbStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  @JSName("$type")
  var $type: date | timestamp
}

object Type {
  @scala.inline
  def apply($type: date | timestamp): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

