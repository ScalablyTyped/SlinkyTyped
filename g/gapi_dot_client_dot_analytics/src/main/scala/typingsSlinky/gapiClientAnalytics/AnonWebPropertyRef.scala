package typingsSlinky.gapiClientAnalytics

import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.native
}

object AnonWebPropertyRef {
  @scala.inline
  def apply(): AnonWebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWebPropertyRef]
  }
  @scala.inline
  implicit class AnonWebPropertyRefOps[Self <: AnonWebPropertyRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebPropertyRef(value: WebPropertyRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(js.undefined)
        ret
    }
  }
  
}

