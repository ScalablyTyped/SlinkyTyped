package typingsSlinky.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppApiKey extends js.Object {
  var appApiKey: String = js.native
  var appId: String = js.native
}

object AnonAppApiKey {
  @scala.inline
  def apply(appApiKey: String, appId: String): AnonAppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppApiKey]
  }
  @scala.inline
  implicit class AnonAppApiKeyOps[Self <: AnonAppApiKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

