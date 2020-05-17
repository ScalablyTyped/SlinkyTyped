package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var comm_id: String = js.native
  var data: JSONObject = js.native
  var target_module: js.UndefOr[String] = js.native
  var target_name: String = js.native
}

object Data {
  @scala.inline
  def apply(comm_id: String, data: JSONObject, target_name: String): Data = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTarget_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_module(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_module: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_module")(js.undefined)
        ret
    }
  }
  
}

