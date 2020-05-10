package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStateChange extends js.Object {
  /**
    * The current state of the instance.
    */
  var CurrentState: js.UndefOr[InstanceState] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The previous state of the instance.
    */
  var PreviousState: js.UndefOr[InstanceState] = js.native
}

object InstanceStateChange {
  @scala.inline
  def apply(): InstanceStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStateChange]
  }
  @scala.inline
  implicit class InstanceStateChangeOps[Self <: InstanceStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentState(value: InstanceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentState")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousState(value: InstanceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousState")(js.undefined)
        ret
    }
  }
  
}

