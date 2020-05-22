package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends Type_ {
  var key: String
  var `type`: typingsSlinky.doctrine.doctrineStrings.FieldType
  var value: js.UndefOr[Type_] = js.undefined
}

object FieldType {
  @scala.inline
  def apply(key: String, `type`: typingsSlinky.doctrine.doctrineStrings.FieldType, value: Type_ = null): FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
}

