package typingsSlinky.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageObject extends js.Object {
  var grantedBytes: Double = js.native
  var usedBytes: Double = js.native
}

object UsageObject {
  @scala.inline
  def apply(grantedBytes: Double, usedBytes: Double): UsageObject = {
    val __obj = js.Dynamic.literal(grantedBytes = grantedBytes.asInstanceOf[js.Any], usedBytes = usedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageObject]
  }
  @scala.inline
  implicit class UsageObjectOps[Self <: UsageObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

