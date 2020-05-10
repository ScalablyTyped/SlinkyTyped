package typingsSlinky.diff2html.Diff2Html

import typingsSlinky.diff2html.diff2htmlStrings.`line-by-line`
import typingsSlinky.diff2html.diff2htmlStrings.`side-by-side`
import typingsSlinky.diff2html.diff2htmlStrings.diff
import typingsSlinky.diff2html.diff2htmlStrings.json
import typingsSlinky.diff2html.diff2htmlStrings.lines
import typingsSlinky.diff2html.diff2htmlStrings.none
import typingsSlinky.diff2html.diff2htmlStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var inputFormat: js.UndefOr[diff | json] = js.native
  var matchWordsThreshold: js.UndefOr[Double] = js.native
  var matching: js.UndefOr[lines | words | none] = js.native
  var matchingMaxComparisons: js.UndefOr[Double] = js.native
  var maxLineLengthHighlight: js.UndefOr[Double] = js.native
  var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.native
  var outputFormat: js.UndefOr[`line-by-line` | `side-by-side`] = js.native
  var rawTemplates: js.UndefOr[js.Object] = js.native
  var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.native
  var showFiles: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputFormat(value: diff | json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWordsThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWordsThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMatching(value: lines | words | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchingMaxComparisons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingMaxComparisons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineLengthHighlight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineLengthHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineSizeInBlockForComparison(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineSizeInBlockForComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: `line-by-line` | `side-by-side`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withRawTemplates(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNothingWhenEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderNothingWhenEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
  }
  
}

