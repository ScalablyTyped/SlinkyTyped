package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.InterpreterDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpreterDirective_
  extends BaseNode
     with Node {
  @JSName("type")
  var type_InterpreterDirective_ : InterpreterDirective = js.native
  var value: String = js.native
}

object InterpreterDirective_ {
  @scala.inline
  def apply(`type`: InterpreterDirective, value: String): InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpreterDirective_]
  }
  @scala.inline
  implicit class InterpreterDirective_Ops[Self <: InterpreterDirective_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: InterpreterDirective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

