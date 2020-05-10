package typingsSlinky.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsParameters extends js.Object {
  def setCampaign(campaign: String): DynamicLink = js.native
  def setContent(content: String): DynamicLink = js.native
  def setMedium(medium: String): DynamicLink = js.native
  def setSource(source: String): DynamicLink = js.native
  def setTerm(term: String): DynamicLink = js.native
}

object AnalyticsParameters {
  @scala.inline
  def apply(
    setCampaign: String => DynamicLink,
    setContent: String => DynamicLink,
    setMedium: String => DynamicLink,
    setSource: String => DynamicLink,
    setTerm: String => DynamicLink
  ): AnalyticsParameters = {
    val __obj = js.Dynamic.literal(setCampaign = js.Any.fromFunction1(setCampaign), setContent = js.Any.fromFunction1(setContent), setMedium = js.Any.fromFunction1(setMedium), setSource = js.Any.fromFunction1(setSource), setTerm = js.Any.fromFunction1(setTerm))
    __obj.asInstanceOf[AnalyticsParameters]
  }
  @scala.inline
  implicit class AnalyticsParametersOps[Self <: AnalyticsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetCampaign(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCampaign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMedium(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSource(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTerm(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTerm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

