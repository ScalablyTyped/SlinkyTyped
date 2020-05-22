package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllLiteral extends Type_ {
  var `type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral
}

object AllLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.AllLiteral): AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllLiteral]
  }
}

