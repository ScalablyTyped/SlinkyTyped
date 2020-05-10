package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuationToken extends js.Object {
  var nextMarker: String = js.native
  var targetLocation: String = js.native
}

object ContinuationToken {
  @scala.inline
  def apply(nextMarker: String, targetLocation: String): ContinuationToken = {
    val __obj = js.Dynamic.literal(nextMarker = nextMarker.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuationToken]
  }
  @scala.inline
  implicit class ContinuationTokenOps[Self <: ContinuationToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLocation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

