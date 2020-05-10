package typingsSlinky.autolinker.phoneMatchMod

import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneMatchConfig extends MatchConfig {
  var number: String = js.native
  var plusSign: Boolean = js.native
}

object PhoneMatchConfig {
  @scala.inline
  def apply(
    matchedText: String,
    number: String,
    offset: Double,
    plusSign: Boolean,
    tagBuilder: AnchorTagBuilder
  ): PhoneMatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMatchConfig]
  }
  @scala.inline
  implicit class PhoneMatchConfigOps[Self <: PhoneMatchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusSign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

