package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends Type {
  var name: String
  var `type`: typingsSlinky.doctrine.doctrineStrings.NameExpression
}

object NameExpression {
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.doctrine.doctrineStrings.NameExpression): NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameExpression]
  }
}

