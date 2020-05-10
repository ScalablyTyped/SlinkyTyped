package typingsSlinky.awsSdkTypes.commandMod

import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType] extends js.Object {
  val input: InputType = js.native
  def resolveMiddleware(
    stack: MiddlewareStack[ClientInput, ClientOutput, StreamType],
    configuration: ResolvedConfiguration
  ): Handler[InputType, OutputType] = js.native
}

object Command {
  @scala.inline
  def apply[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType](
    input: InputType,
    resolveMiddleware: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => Handler[InputType, OutputType]
  ): Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], resolveMiddleware = js.Any.fromFunction2(resolveMiddleware))
    __obj.asInstanceOf[Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]]
  }
  @scala.inline
  implicit class CommandOps[Self[clientinput, inputtype, clientoutput, outputtype, resolvedconfiguration, streamtype] <: Command[clientinput, inputtype, clientoutput, outputtype, resolvedconfiguration, streamtype], ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] (val x: Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]) with Other]
    @scala.inline
    def withInput(value: InputType): Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveMiddleware(
      value: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => Handler[InputType, OutputType]
    ): Self[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveMiddleware")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

