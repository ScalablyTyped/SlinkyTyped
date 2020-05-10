package typingsSlinky.cwiseParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledArgument extends js.Object {
  var count: Double = js.native
  var lvalue: Boolean = js.native
  var name: String = js.native
  var rvalue: Boolean = js.native
}

object CompiledArgument {
  @scala.inline
  def apply(count: Double, lvalue: Boolean, name: String, rvalue: Boolean): CompiledArgument = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lvalue = lvalue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rvalue = rvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledArgument]
  }
  @scala.inline
  implicit class CompiledArgumentOps[Self <: CompiledArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLvalue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRvalue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rvalue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

