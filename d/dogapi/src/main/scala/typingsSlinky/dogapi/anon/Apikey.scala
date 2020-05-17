package typingsSlinky.dogapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apikey extends js.Object {
  var api_key: String = js.native
  var app_key: String = js.native
}

object Apikey {
  @scala.inline
  def apply(api_key: String, app_key: String): Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
  @scala.inline
  implicit class ApikeyOps[Self <: Apikey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

