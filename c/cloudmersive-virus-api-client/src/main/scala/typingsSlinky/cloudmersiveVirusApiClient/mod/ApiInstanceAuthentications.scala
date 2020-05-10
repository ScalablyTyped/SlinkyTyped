package typingsSlinky.cloudmersiveVirusApiClient.mod

import typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey
import typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.apiKey_
import typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiInstanceAuthentications extends js.Object {
  var apiKey: String = js.native
  var in: header = js.native
  var name: Apikey = js.native
  var `type`: apiKey_ = js.native
}

object ApiInstanceAuthentications {
  @scala.inline
  def apply(apiKey: String, in: header, name: Apikey, `type`: apiKey_): ApiInstanceAuthentications = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInstanceAuthentications]
  }
  @scala.inline
  implicit class ApiInstanceAuthenticationsOps[Self <: ApiInstanceAuthentications] (val x: Self) extends AnyVal {
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
    def withIn(value: header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Apikey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: apiKey_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

