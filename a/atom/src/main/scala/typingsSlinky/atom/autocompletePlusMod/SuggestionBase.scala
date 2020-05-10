package typingsSlinky.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionBase extends js.Object {
  /**
    *  Class name for the suggestion in the suggestion list. Allows you to style your
    *  suggestion via CSS, if desired.
    */
  var className: js.UndefOr[String] = js.native
  /**
    *  A doc-string summary or short description of the suggestion. When specified, it
    *  will be displayed at the bottom of the suggestions list.
    */
  var description: js.UndefOr[String] = js.native
  /**
    *  (experimental) Description with Markdown formatting.
    *  Takes precedence over plaintext description.
    */
  var descriptionMarkdown: js.UndefOr[String] = js.native
  /**
    *  A url to the documentation or more information about this suggestion.
    *  When specified, a More.. link will be displayed in the description area.
    */
  var descriptionMoreURL: js.UndefOr[String] = js.native
  /**
    *  A string that will show in the UI for this suggestion.
    *  When not set, snippet || text is displayed.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    *  If you want complete control over the icon shown against the suggestion.
    *  e.g. iconHTML: <i class="icon-move-right"></i>
    */
  var iconHTML: js.UndefOr[String] = js.native
  /** This is shown before the suggestion. Useful for return values. */
  var leftLabel: js.UndefOr[String] = js.native
  /** Use this instead of leftLabel if you want to use html for the left label. */
  var leftLabelHTML: js.UndefOr[String] = js.native
  /**
    *  The text immediately preceding the cursor, which will be replaced by the text.
    *  If not provided, the prefix passed into getSuggestions will be used.
    */
  var replacementPrefix: js.UndefOr[String] = js.native
  /**
    *  An indicator (e.g. function, variable) denoting the "kind" of suggestion this
    *  represents.
    */
  var rightLabel: js.UndefOr[String] = js.native
  /** Use this instead of rightLabel if you want to use html for the right label. */
  var rightLabelHTML: js.UndefOr[String] = js.native
  /**
    *  The suggestion type. It will be converted into an icon shown against the
    *  suggestion.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SuggestionBase {
  @scala.inline
  def apply(): SuggestionBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionBase]
  }
  @scala.inline
  implicit class SuggestionBaseOps[Self <: SuggestionBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionMarkdown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionMarkdown")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionMoreURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionMoreURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionMoreURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionMoreURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabelHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabelHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacementPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacementPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRightLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRightLabelHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabelHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightLabelHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabelHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

