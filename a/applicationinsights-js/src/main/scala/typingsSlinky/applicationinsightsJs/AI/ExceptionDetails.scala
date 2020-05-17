package typingsSlinky.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionDetails extends js.Object {
  var hasFullStack: Boolean = js.native
  var id: Double = js.native
  var message: String = js.native
  var outerId: Double = js.native
  var parsedStack: js.Array[StackFrame] = js.native
  var stack: String = js.native
  var typeName: String = js.native
}

object ExceptionDetails {
  @scala.inline
  def apply(
    hasFullStack: Boolean,
    id: Double,
    message: String,
    outerId: Double,
    parsedStack: js.Array[StackFrame],
    stack: String,
    typeName: String
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(hasFullStack = hasFullStack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], outerId = outerId.asInstanceOf[js.Any], parsedStack = parsedStack.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  @scala.inline
  implicit class ExceptionDetailsOps[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFullStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFullStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsedStack(value: js.Array[StackFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

