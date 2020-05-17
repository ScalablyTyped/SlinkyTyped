package typingsSlinky.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerApiKey extends js.Object {
  var serverApiKey: String = js.native
}

object ServerApiKey {
  @scala.inline
  def apply(serverApiKey: String): ServerApiKey = {
    val __obj = js.Dynamic.literal(serverApiKey = serverApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerApiKey]
  }
  @scala.inline
  implicit class ServerApiKeyOps[Self <: ServerApiKey] (val x: Self) extends AnyVal {
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

