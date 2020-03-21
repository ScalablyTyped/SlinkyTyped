package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordType extends Type_ {
  var fields: js.Array[Type_]
  var `type`: typingsSlinky.doctrine.doctrineStrings.RecordType
}

object RecordType {
  @scala.inline
  def apply(fields: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordType]
  }
}

