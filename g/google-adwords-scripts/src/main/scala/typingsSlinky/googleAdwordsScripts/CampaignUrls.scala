package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): Unit = js.native
}

object CampaignUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setTrackingTemplate: String => Unit
  ): CampaignUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[CampaignUrls]
  }
  @scala.inline
  implicit class CampaignUrlsOps[Self <: CampaignUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTrackingTemplate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTrackingTemplate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

