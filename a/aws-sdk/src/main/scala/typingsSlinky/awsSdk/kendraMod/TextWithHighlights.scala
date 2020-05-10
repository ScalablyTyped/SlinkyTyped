package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWithHighlights extends js.Object {
  /**
    * The beginning and end of the text that should be highlighted.
    */
  var Highlights: js.UndefOr[HighlightList] = js.native
  /**
    * The text to display to the user.
    */
  var Text: js.UndefOr[String] = js.native
}

object TextWithHighlights {
  @scala.inline
  def apply(): TextWithHighlights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWithHighlights]
  }
  @scala.inline
  implicit class TextWithHighlightsOps[Self <: TextWithHighlights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlights(value: HighlightList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlights")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
  }
  
}

