package typingsSlinky.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApi extends js.Object {
  var api: String = js.native
  var software: String = js.native
}

object AnonApi {
  @scala.inline
  def apply(api: String, software: String): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApi]
  }
  @scala.inline
  implicit class AnonApiOps[Self <: AnonApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("software")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

