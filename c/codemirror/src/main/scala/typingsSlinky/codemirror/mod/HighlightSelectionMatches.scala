package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightSelectionMatches extends js.Object {
  /**
    * If annotateScrollbar is enabled, the occurences will be highlighted on the scrollbar via the matchesonscrollbar addon.
    */
  var annotateScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Used to specify how much time to wait, in milliseconds, before highlighting the matches. 
    */
  var delay: `100` = js.native
  /**
    * Minimum amount of selected characters that triggers a highlight (default 2).
    */
  var minChars: js.UndefOr[Double] = js.native
  /**
    * Can be set to true or to a regexp matching the characters that make up a word.
    */
  var showToken: js.UndefOr[Boolean | js.RegExp] = js.native
  /**
    * The style to be used to highlight the matches (default "matchhighlight", which will correspond to CSS class cm-matchhighlight).
    */
  var style: js.UndefOr[String] = js.native
  /**
    * Controls whether whitespace is trimmed from the selection.
    */
  var trim: js.UndefOr[Boolean] = js.native
  /**
    * If wordsOnly is enabled, the matches will be highlighted only if the selected text is a word.
    */
  var wordsOnly: js.UndefOr[Boolean] = js.native
}

object HighlightSelectionMatches {
  @scala.inline
  def apply(delay: `100`): HighlightSelectionMatches = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSelectionMatches]
  }
  @scala.inline
  implicit class HighlightSelectionMatchesOps[Self <: HighlightSelectionMatches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotateScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotateScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotateScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotateScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTokenRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowToken(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withWordsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsOnly")(js.undefined)
        ret
    }
  }
  
}

