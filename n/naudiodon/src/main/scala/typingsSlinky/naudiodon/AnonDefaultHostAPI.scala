package typingsSlinky.naudiodon

import typingsSlinky.naudiodon.mod.HostAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultHostAPI extends js.Object {
  var HostAPIs: js.Array[HostAPI] = js.native
  var defaultHostAPI: Double = js.native
}

object AnonDefaultHostAPI {
  @scala.inline
  def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): AnonDefaultHostAPI = {
    val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultHostAPI]
  }
  @scala.inline
  implicit class AnonDefaultHostAPIOps[Self <: AnonDefaultHostAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostAPIs(value: js.Array[HostAPI]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostAPIs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHostAPI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHostAPI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

