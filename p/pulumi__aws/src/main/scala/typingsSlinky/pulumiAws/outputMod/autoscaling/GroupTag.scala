package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupTag extends js.Object {
  /**
    * Key
    */
  var key: String = js.native
  /**
    * Enables propagation of the tag to
    * Amazon EC2 instances launched via this ASG
    */
  var propagateAtLaunch: Boolean = js.native
  /**
    * Value
    */
  var value: String = js.native
}

object GroupTag {
  @scala.inline
  def apply(key: String, propagateAtLaunch: Boolean, value: String): GroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTag]
  }
  @scala.inline
  implicit class GroupTagOps[Self <: GroupTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagateAtLaunch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateAtLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

