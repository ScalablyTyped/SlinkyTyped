package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to perform cursor movements through sentences. */
@js.native
trait XSentenceCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: Boolean): Boolean = js.native
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: Boolean): Boolean = js.native
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): Boolean = js.native
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): Boolean = js.native
}

object XSentenceCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfSentence: Boolean => Boolean,
    gotoNextSentence: Boolean => Boolean,
    gotoPreviousSentence: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfSentence: Boolean => Boolean,
    isCollapsed: () => Boolean,
    isEndOfSentence: () => Boolean,
    isStartOfSentence: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XSentenceCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfSentence = js.Any.fromFunction0(isEndOfSentence), isStartOfSentence = js.Any.fromFunction0(isStartOfSentence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XSentenceCursor]
  }
  @scala.inline
  implicit class XSentenceCursorOps[Self <: XSentenceCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGotoEndOfSentence(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoEndOfSentence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoNextSentence(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoNextSentence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoPreviousSentence(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoPreviousSentence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoStartOfSentence(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoStartOfSentence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEndOfSentence(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndOfSentence")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStartOfSentence(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartOfSentence")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

