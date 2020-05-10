package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface destroyingData {}
@js.native
trait keyLoadingData extends js.Object {
  var frag: Fragment = js.native
}

object keyLoadingData {
  @scala.inline
  def apply(frag: Fragment): keyLoadingData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyLoadingData]
  }
  @scala.inline
  implicit class keyLoadingDataOps[Self <: keyLoadingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrag(value: Fragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

