package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchBrackets extends js.Object {
  /**
    * Only use the character after the start position, never the one before it.
    */
  var afterCursor: js.UndefOr[Boolean] = js.native
  /**
    * Don't highlight a bracket in a line longer than this. Defaults to 1000.
    */
  var maxHighlightLineLength: js.UndefOr[Double] = js.native
  /**
    * Ignore lines longer than this. Defaults to 10000.
    */
  var maxScanLineLength: js.UndefOr[Double] = js.native
  /**
    * Stop after scanning this amount of lines without a successful match. Defaults to 1000.
    */
  var maxScanLines: js.UndefOr[Double] = js.native
  /**
    * Causes only matches where both brackets are at the same side of the start position to be considered.
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object MatchBrackets {
  @scala.inline
  def apply(): MatchBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchBrackets]
  }
  @scala.inline
  implicit class MatchBracketsOps[Self <: MatchBrackets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHighlightLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightLineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHighlightLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightLineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScanLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScanLineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScanLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScanLineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScanLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScanLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScanLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScanLines")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

