package typingsSlinky.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerArguments[Input /* <: js.Object */] extends js.Object {
  /**
    * User input to a command. Reflects the userland representation of the
    * union of data types the command can effectively handle.
    */
  var input: Input = js.native
}

object HandlerArguments {
  @scala.inline
  def apply[Input](input: Input): HandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerArguments[Input]]
  }
  @scala.inline
  implicit class HandlerArgumentsOps[Self[input] <: HandlerArguments[input], Input] (val x: Self[Input]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Input] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Input]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Input] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Input] with Other]
    @scala.inline
    def withInput(value: Input): Self[Input] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

