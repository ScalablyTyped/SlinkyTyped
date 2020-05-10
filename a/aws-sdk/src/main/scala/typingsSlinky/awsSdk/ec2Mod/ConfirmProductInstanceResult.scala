package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmProductInstanceResult extends js.Object {
  /**
    * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The return value of the request. Returns true if the specified product code is owned by the requester and associated with the specified instance.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ConfirmProductInstanceResult {
  @scala.inline
  def apply(): ConfirmProductInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmProductInstanceResult]
  }
  @scala.inline
  implicit class ConfirmProductInstanceResultOps[Self <: ConfirmProductInstanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Return")(js.undefined)
        ret
    }
  }
  
}

