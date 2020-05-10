package typingsSlinky.pulumiAws.inputMod.lambda

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingDestinationConfig extends js.Object {
  /**
    * The destination configuration for failed invocations. Detailed below.
    */
  var onFailure: js.UndefOr[Input[EventSourceMappingDestinationConfigOnFailure]] = js.native
}

object EventSourceMappingDestinationConfig {
  @scala.inline
  def apply(): EventSourceMappingDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingDestinationConfig]
  }
  @scala.inline
  implicit class EventSourceMappingDestinationConfigOps[Self <: EventSourceMappingDestinationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFailure(value: Input[EventSourceMappingDestinationConfigOnFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
  }
  
}

