package typingsSlinky.awsSdkTypes.middlewareMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.build
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_BuildHandlerOptions: build = js.native
}

object BuildHandlerOptions {
  @scala.inline
  def apply(step: build): BuildHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHandlerOptions]
  }
  @scala.inline
  implicit class BuildHandlerOptionsOps[Self <: BuildHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

