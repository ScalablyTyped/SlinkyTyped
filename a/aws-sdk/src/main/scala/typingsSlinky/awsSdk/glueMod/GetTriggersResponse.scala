package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggersResponse extends js.Object {
  /**
    * A continuation token, if not all the requested triggers have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of triggers for the specified job.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}

object GetTriggersResponse {
  @scala.inline
  def apply(): GetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersResponse]
  }
  @scala.inline
  implicit class GetTriggersResponseOps[Self <: GetTriggersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
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
  }
  
}

