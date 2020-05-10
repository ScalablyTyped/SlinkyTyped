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

@js.native
trait Class
  extends Atom
     with Selector {
  var name: declaration | expression | function | pattern | statement = js.native
  @JSName("type")
  var type_Class: `class` = js.native
}

object Class {
  @scala.inline
  def apply(name: declaration | expression | function | pattern | statement, `type`: `class`): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: declaration | expression | function | pattern | statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `class`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

