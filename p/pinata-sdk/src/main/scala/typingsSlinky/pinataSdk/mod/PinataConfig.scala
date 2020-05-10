package typingsSlinky.pinataSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinataConfig extends js.Object {
  var apiKey: String = js.native
  var apiURL: String = js.native
  var privateApiKey: String = js.native
}

object PinataConfig {
  @scala.inline
  def apply(apiKey: String, apiURL: String, privateApiKey: String): PinataConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiURL = apiURL.asInstanceOf[js.Any], privateApiKey = privateApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinataConfig]
  }
  @scala.inline
  implicit class PinataConfigOps[Self <: PinataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateApiKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

