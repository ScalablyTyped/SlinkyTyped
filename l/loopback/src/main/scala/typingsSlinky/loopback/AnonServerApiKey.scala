package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonServerApiKey extends js.Object {
  var serverApiKey: String = js.native
}

object AnonServerApiKey {
  @scala.inline
  def apply(serverApiKey: String): AnonServerApiKey = {
    val __obj = js.Dynamic.literal(serverApiKey = serverApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServerApiKey]
  }
  @scala.inline
  implicit class AnonServerApiKeyOps[Self <: AnonServerApiKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverApiKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

