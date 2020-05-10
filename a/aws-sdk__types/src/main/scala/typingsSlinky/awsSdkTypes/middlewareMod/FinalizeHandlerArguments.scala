package typingsSlinky.awsSdkTypes.middlewareMod

import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeHandlerArguments[Input /* <: js.Object */, Stream] extends HandlerArguments[Input] {
  /**
    * The user input serialized as an HTTP request.
    */
  var request: HttpRequest[Stream] = js.native
}

object FinalizeHandlerArguments {
  @scala.inline
  def apply[Input, Stream](input: Input, request: HttpRequest[Stream]): FinalizeHandlerArguments[Input, Stream] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerArguments[Input, Stream]]
  }
  @scala.inline
  implicit class FinalizeHandlerArgumentsOps[Self[input, stream] <: FinalizeHandlerArguments[input, stream], Input, Stream] (val x: Self[Input, Stream]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Input, Stream] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Input, Stream]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Input, Stream]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Input, Stream]) with Other]
    @scala.inline
    def withRequest(value: HttpRequest[Stream]): Self[Input, Stream] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

