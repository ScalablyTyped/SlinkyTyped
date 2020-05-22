package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.`class`
import typingsSlinky.esquery.esqueryStrings.declaration
import typingsSlinky.esquery.esqueryStrings.expression
import typingsSlinky.esquery.esqueryStrings.function
import typingsSlinky.esquery.esqueryStrings.pattern
import typingsSlinky.esquery.esqueryStrings.statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class
  extends Atom
     with Selector {
  var name: declaration | expression | function | pattern | statement
  @JSName("type")
  var type_Class: `class`
}

object Class {
  @scala.inline
  def apply(name: declaration | expression | function | pattern | statement, `type`: `class`): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

