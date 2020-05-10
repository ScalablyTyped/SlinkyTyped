package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalResultAttributeValue extends js.Object {
  /**
    * The text associated with the attribute and information about the highlight to apply to the text.
    */
  var TextWithHighlightsValue: js.UndefOr[TextWithHighlights] = js.native
}

object AdditionalResultAttributeValue {
  @scala.inline
  def apply(): AdditionalResultAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalResultAttributeValue]
  }
  @scala.inline
  implicit class AdditionalResultAttributeValueOps[Self <: AdditionalResultAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextWithHighlightsValue(value: TextWithHighlights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextWithHighlightsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWithHighlightsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextWithHighlightsValue")(js.undefined)
        ret
    }
  }
  
}

