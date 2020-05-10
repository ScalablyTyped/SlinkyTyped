package typingsSlinky.firebaseRemoteConfig.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleMetadata extends js.Object {
  var backoffCount: Double = js.native
  var throttleEndTimeMillis: Double = js.native
}

object ThrottleMetadata {
  @scala.inline
  def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
    val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleMetadata]
  }
  @scala.inline
  implicit class ThrottleMetadataOps[Self <: ThrottleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoffCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottleEndTimeMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleEndTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

