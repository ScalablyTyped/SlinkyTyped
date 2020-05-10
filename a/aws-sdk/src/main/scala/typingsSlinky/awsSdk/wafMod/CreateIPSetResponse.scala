package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * The IPSet returned in the CreateIPSet response.
    */
  var IPSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.IPSet] = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  @scala.inline
  implicit class CreateIPSetResponseOps[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIPSet(value: IPSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSet")(js.undefined)
        ret
    }
  }
  
}

