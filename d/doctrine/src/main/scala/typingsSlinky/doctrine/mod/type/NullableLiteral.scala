package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableLiteral extends Type_ {
  var `type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral
}

object NullableLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
}

