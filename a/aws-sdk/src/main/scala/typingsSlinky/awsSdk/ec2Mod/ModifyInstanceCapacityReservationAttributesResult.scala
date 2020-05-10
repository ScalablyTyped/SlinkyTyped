package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCapacityReservationAttributesResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ModifyInstanceCapacityReservationAttributesResult {
  @scala.inline
  def apply(): ModifyInstanceCapacityReservationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesResult]
  }
  @scala.inline
  implicit class ModifyInstanceCapacityReservationAttributesResultOps[Self <: ModifyInstanceCapacityReservationAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

