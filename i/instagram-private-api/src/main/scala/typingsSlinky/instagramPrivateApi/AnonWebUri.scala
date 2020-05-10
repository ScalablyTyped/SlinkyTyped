package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWebUri extends js.Object {
  var webUri: String = js.native
}

object AnonWebUri {
  @scala.inline
  def apply(webUri: String): AnonWebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebUri]
  }
  @scala.inline
  implicit class AnonWebUriOps[Self <: AnonWebUri] (val x: Self) extends AnyVal {
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

