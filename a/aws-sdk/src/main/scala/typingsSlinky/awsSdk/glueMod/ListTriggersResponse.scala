package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTriggersResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * The names of all triggers in the account, or the triggers with the specified tags.
    */
  var TriggerNames: js.UndefOr[TriggerNameList] = js.native
}

object ListTriggersResponse {
  @scala.inline
  def apply(): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersResponse]
  }
  @scala.inline
  implicit class ListTriggersResponseOps[Self <: ListTriggersResponse] (val x: Self) extends AnyVal {
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
    def withTriggerNames(value: TriggerNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerNames")(js.undefined)
        ret
    }
  }
  
}

