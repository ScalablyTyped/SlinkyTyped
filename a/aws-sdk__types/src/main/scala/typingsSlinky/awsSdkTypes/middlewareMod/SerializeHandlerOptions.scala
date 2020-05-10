package typingsSlinky.awsSdkTypes.middlewareMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_SerializeHandlerOptions: serialize = js.native
}

object SerializeHandlerOptions {
  @scala.inline
  def apply(step: serialize): SerializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerOptions]
  }
  @scala.inline
  implicit class SerializeHandlerOptionsOps[Self <: SerializeHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: serialize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

