package typingsSlinky.autolinker.mentionMatchMod

import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.autolinkerMod.MentionServices
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionMatchConfig extends MatchConfig {
  var mention: String = js.native
  var serviceName: MentionServices = js.native
}

object MentionMatchConfig {
  @scala.inline
  def apply(
    matchedText: String,
    mention: String,
    offset: Double,
    serviceName: MentionServices,
    tagBuilder: AnchorTagBuilder
  ): MentionMatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionMatchConfig]
  }
  @scala.inline
  implicit class MentionMatchConfigOps[Self <: MentionMatchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: MentionServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

