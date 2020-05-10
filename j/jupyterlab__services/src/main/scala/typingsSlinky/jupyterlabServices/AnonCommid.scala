package typingsSlinky.jupyterlabServices

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommid extends js.Object {
  var comm_id: String = js.native
  var data: JSONObject = js.native
}

object AnonCommid {
  @scala.inline
  def apply(comm_id: String, data: JSONObject): AnonCommid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommid]
  }
  @scala.inline
  implicit class AnonCommidOps[Self <: AnonCommid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComm_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comm_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

