package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteral extends Type_ {
  var `type`: typingsSlinky.doctrine.doctrineStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

