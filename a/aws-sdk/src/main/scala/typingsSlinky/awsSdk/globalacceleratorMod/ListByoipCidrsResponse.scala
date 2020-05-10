package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListByoipCidrsResponse extends js.Object {
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ByoipCidrs] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListByoipCidrsResponse {
  @scala.inline
  def apply(): ListByoipCidrsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByoipCidrsResponse]
  }
  @scala.inline
  implicit class ListByoipCidrsResponseOps[Self <: ListByoipCidrsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByoipCidrs(value: ByoipCidrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByoipCidrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByoipCidrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByoipCidrs")(js.undefined)
        ret
    }
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
  }
  
}

