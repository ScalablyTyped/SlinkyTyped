package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTriggersResponse extends js.Object {
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.native
}

object BatchGetTriggersResponse {
  @scala.inline
  def apply(): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
  @scala.inline
  implicit class BatchGetTriggersResponseOps[Self <: BatchGetTriggersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggers(value: TriggerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggersNotFound(value: TriggerNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggersNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggersNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggersNotFound")(js.undefined)
        ret
    }
  }
  
}

