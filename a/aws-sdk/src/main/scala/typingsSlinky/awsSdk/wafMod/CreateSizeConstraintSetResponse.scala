package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSizeConstraintSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.SizeConstraintSet] = js.native
}

object CreateSizeConstraintSetResponse {
  @scala.inline
  def apply(): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
  @scala.inline
  implicit class CreateSizeConstraintSetResponseOps[Self <: CreateSizeConstraintSetResponse] (val x: Self) extends AnyVal {
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
    def withSizeConstraintSet(value: SizeConstraintSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeConstraintSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSet")(js.undefined)
        ret
    }
  }
  
}

