package typingsSlinky.mapboxMapboxSdk.mod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapiClient extends js.Object {
  var accessToken: String = js.native
  var origin: js.UndefOr[String] = js.native
  def createRequest(requestOptions: js.Any): MapiRequest = js.native
}

object MapiClient {
  @scala.inline
  def apply(accessToken: String, createRequest: js.Any => MapiRequest): MapiClient = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], createRequest = js.Any.fromFunction1(createRequest))
    __obj.asInstanceOf[MapiClient]
  }
  @scala.inline
  implicit class MapiClientOps[Self <: MapiClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRequest(value: js.Any => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
  }
  
}

