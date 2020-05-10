package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationConfig extends js.Object {
  /**
    * The destination configuration for failed invocations.
    */
  var OnFailure: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.OnFailure] = js.native
  /**
    * The destination configuration for successful invocations.
    */
  var OnSuccess: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.OnSuccess] = js.native
}

object DestinationConfig {
  @scala.inline
  def apply(): DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfig]
  }
  @scala.inline
  implicit class DestinationConfigOps[Self <: DestinationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFailure(value: OnFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSuccess")(js.undefined)
        ret
    }
  }
  
}

