package typingsSlinky.babelCodeFrame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelCodeFrameOptions extends js.Object {
  /**
    * Forcibly syntax highlight the code as JavaScript (for non-terminals);
    * overrides highlightCode.
    * default: false
    */
  var forceColor: js.UndefOr[Boolean] = js.native
  /** Syntax highlight the code as JavaScript for terminals. default: false */
  var highlightCode: js.UndefOr[Boolean] = js.native
  /**  The number of lines to show above the error. default: 2 */
  var linesAbove: js.UndefOr[Double] = js.native
  /**  The number of lines to show below the error. default: 3 */
  var linesBelow: js.UndefOr[Double] = js.native
  /**
    * Pass in a string to be displayed inline (if possible) next to the
    * highlighted location in the code. If it can't be positioned inline,
    * it will be placed above the code frame.
    * default: nothing
    */
  var message: js.UndefOr[String] = js.native
}

object BabelCodeFrameOptions {
  @scala.inline
  def apply(): BabelCodeFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelCodeFrameOptions]
  }
  @scala.inline
  implicit class BabelCodeFrameOptionsOps[Self <: BabelCodeFrameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesAbove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinesAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesBelow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinesBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesBelow")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

