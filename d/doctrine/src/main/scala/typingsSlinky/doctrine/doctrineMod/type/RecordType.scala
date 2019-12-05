package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordType extends Type {
  var fields: js.Array[Type]
  var `type`: typingsSlinky.doctrine.doctrineStrings.RecordType
}

object RecordType {
  @scala.inline
  def apply(fields: js.Array[Type], `type`: typingsSlinky.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordType]
  }
}

