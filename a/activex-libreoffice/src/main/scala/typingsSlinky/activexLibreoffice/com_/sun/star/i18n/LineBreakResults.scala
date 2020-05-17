package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.XHyphenatedWord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results of method {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakResults extends js.Object {
  var breakIndex: Double = js.native
  var breakType: Double = js.native
  var rHyphenatedWord: XHyphenatedWord = js.native
}

object LineBreakResults {
  @scala.inline
  def apply(breakIndex: Double, breakType: Double, rHyphenatedWord: XHyphenatedWord): LineBreakResults = {
    val __obj = js.Dynamic.literal(breakIndex = breakIndex.asInstanceOf[js.Any], breakType = breakType.asInstanceOf[js.Any], rHyphenatedWord = rHyphenatedWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakResults]
  }
  @scala.inline
  implicit class LineBreakResultsOps[Self <: LineBreakResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRHyphenatedWord(value: XHyphenatedWord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rHyphenatedWord")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

