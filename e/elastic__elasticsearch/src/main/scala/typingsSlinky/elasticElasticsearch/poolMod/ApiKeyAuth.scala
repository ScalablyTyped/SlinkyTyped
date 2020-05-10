package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.AnonApikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyAuth extends js.Object {
  var apiKey: String | AnonApikey = js.native
}

object ApiKeyAuth {
  @scala.inline
  def apply(apiKey: String | AnonApikey): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAuth]
  }
  @scala.inline
  implicit class ApiKeyAuthOps[Self <: ApiKeyAuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String | AnonApikey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

