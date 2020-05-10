package typingsSlinky.pendoIoBrowser.pendo

import typingsSlinky.pendoIoBrowser.AnonAutoHeight
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.button
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.element
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.programatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuideStep extends js.Object {
  var advanceMethod: button | programatic | element = js.native
  var attributes: AnonAutoHeight = js.native
  var contentType: String = js.native
  var contentUrl: js.UndefOr[String] = js.native
  var contentUrlCss: js.UndefOr[String] = js.native
  var contentUrlJs: js.UndefOr[String] = js.native
  var elementPathRule: String = js.native
  var guideId: String = js.native
  var id: String = js.native
  var lastUpdatedAt: Double = js.native
  var rank: Double = js.native
  var resetAt: Double = js.native
  var thumbnailUrls: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object GuideStep {
  @scala.inline
  def apply(
    advanceMethod: button | programatic | element,
    attributes: AnonAutoHeight,
    contentType: String,
    elementPathRule: String,
    guideId: String,
    id: String,
    lastUpdatedAt: Double,
    rank: Double,
    resetAt: Double,
    `type`: String
  ): GuideStep = {
    val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], elementPathRule = elementPathRule.asInstanceOf[js.Any], guideId = guideId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideStep]
  }
  @scala.inline
  implicit class GuideStepOps[Self <: GuideStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceMethod(value: button | programatic | element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AnonAutoHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementPathRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPathRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuideId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrlCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrlCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrlCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrlCss")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrlJs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrlJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrlJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrlJs")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrls")(js.undefined)
        ret
    }
  }
  
}

