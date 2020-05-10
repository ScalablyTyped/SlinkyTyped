package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTarget extends js.Object {
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.native
  /**
    * The target type.
    */
  var targetType: LogTargetType = js.native
}

object LogTarget {
  @scala.inline
  def apply(targetType: LogTargetType): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTarget]
  }
  @scala.inline
  implicit class LogTargetOps[Self <: LogTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetType(value: LogTargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: LogTargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(js.undefined)
        ret
    }
  }
  
}

