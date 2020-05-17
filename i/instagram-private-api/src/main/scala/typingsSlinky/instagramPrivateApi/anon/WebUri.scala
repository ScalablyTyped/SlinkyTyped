package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebUri extends js.Object {
  var webUri: String = js.native
}

object WebUri {
  @scala.inline
  def apply(webUri: String): WebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUri]
  }
  @scala.inline
  implicit class WebUriOps[Self <: WebUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

