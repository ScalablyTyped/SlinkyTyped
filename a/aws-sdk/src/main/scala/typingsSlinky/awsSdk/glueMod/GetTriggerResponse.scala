package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggerResponse extends js.Object {
  /**
    * The requested trigger definition.
    */
  var Trigger: js.UndefOr[typingsSlinky.awsSdk.glueMod.Trigger] = js.native
}

object GetTriggerResponse {
  @scala.inline
  def apply(): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerResponse]
  }
  @scala.inline
  implicit class GetTriggerResponseOps[Self <: GetTriggerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrigger(value: Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(js.undefined)
        ret
    }
  }
  
}

