package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstancePlacementResult extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ModifyInstancePlacementResult {
  @scala.inline
  def apply(): ModifyInstancePlacementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstancePlacementResult]
  }
  @scala.inline
  implicit class ModifyInstancePlacementResultOps[Self <: ModifyInstancePlacementResult] (val x: Self) extends AnyVal {
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

