package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateByteMatchSetResponse extends js.Object {
  /**
    * A ByteMatchSet that contains no ByteMatchTuple objects.
    */
  var ByteMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.ByteMatchSet] = js.native
  /**
    * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
}

object CreateByteMatchSetResponse {
  @scala.inline
  def apply(): CreateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateByteMatchSetResponse]
  }
  @scala.inline
  implicit class CreateByteMatchSetResponseOps[Self <: CreateByteMatchSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteMatchSet(value: ByteMatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteMatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchSet")(js.undefined)
        ret
    }
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
  }
  
}

