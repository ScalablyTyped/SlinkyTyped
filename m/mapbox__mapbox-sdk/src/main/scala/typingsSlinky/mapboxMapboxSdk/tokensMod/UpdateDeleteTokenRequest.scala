package typingsSlinky.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeleteTokenRequest extends CreateTokenRequest {
  var tokenId: String = js.native
}

object UpdateDeleteTokenRequest {
  @scala.inline
  def apply(tokenId: String): UpdateDeleteTokenRequest = {
    val __obj = js.Dynamic.literal(tokenId = tokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeleteTokenRequest]
  }
  @scala.inline
  implicit class UpdateDeleteTokenRequestOps[Self <: UpdateDeleteTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

