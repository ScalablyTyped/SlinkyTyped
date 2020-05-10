package typingsSlinky.enigmaJs

import typingsSlinky.enigmaJs.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApi extends js.Object {
  var api: IGeneratedAPI = js.native
  var config: js.Any = js.native
}

object AnonApi {
  @scala.inline
  def apply(api: IGeneratedAPI, config: js.Any): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApi]
  }
  @scala.inline
  implicit class AnonApiOps[Self <: AnonApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: IGeneratedAPI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

