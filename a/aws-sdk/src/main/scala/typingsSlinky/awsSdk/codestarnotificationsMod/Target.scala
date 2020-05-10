package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.TargetAddress] = js.native
  /**
    * The target type. Can be an Amazon SNS topic.
    */
  var TargetType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.TargetType] = js.native
}

object Target {
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetAddress(value: TargetAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(js.undefined)
        ret
    }
  }
  
}

