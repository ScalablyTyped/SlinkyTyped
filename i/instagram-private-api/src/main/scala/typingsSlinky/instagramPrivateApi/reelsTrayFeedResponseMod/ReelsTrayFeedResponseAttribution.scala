package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseAttribution extends js.Object {
  var name: String = js.native
}

object ReelsTrayFeedResponseAttribution {
  @scala.inline
  def apply(name: String): ReelsTrayFeedResponseAttribution = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseAttribution]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseAttributionOps[Self <: ReelsTrayFeedResponseAttribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

