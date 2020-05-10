package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragLoadedData extends js.Object {
  var frag: Fragment = js.native
  var payload: js.Any = js.native
}

object fragLoadedData {
  @scala.inline
  def apply(frag: Fragment, payload: js.Any): fragLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadedData]
  }
  @scala.inline
  implicit class fragLoadedDataOps[Self <: fragLoadedData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

