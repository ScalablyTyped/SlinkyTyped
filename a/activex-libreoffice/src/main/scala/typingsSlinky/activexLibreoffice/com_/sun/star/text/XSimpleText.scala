package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the main interface for a distinct text unit, i.e. the main text of a document, the text for headers and footers or for single cells of a table.
  * @see XText
  */
@js.native
trait XSimpleText extends XTextRange {
  /**
    * @returns a new instance of a {@link TextCursor} service which can be used to travel in the given text context.
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursor(): XTextCursor = js.native
  /**
    * @param aTextPosition specifies the start position for the new {@link TextCursor} .
    * @returns a new instance of a {@link TextCursor} which is located at the specified {@link TextRange} to travel in the given text context.  The initial posi
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursorByRange(aTextPosition: XTextRange): XTextCursor = js.native
  /**
    * inserts a control character (like a paragraph break or a hard space) into the text.
    * @see com.sun.star.text.ControlCharacter
    */
  def insertControlCharacter(xRange: XTextRange, nControlCharacter: Double, bAbsorb: Boolean): Unit = js.native
  /**
    * inserts a string of characters into the text.
    *
    * The string may contain the following white spaces:
    *
    * blanktabcr (which will insert a paragraph break)lf (which will insert a line break)
    * @param xRange specifies the position of insertion. For example, {@link XSimpleText.createTextCursor()} can be used to get an {@link XTextRange} for this
    * @param aString specifies the string to insert.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **aString
    */
  def insertString(xRange: XTextRange, aString: String, bAbsorb: Boolean): Unit = js.native
}

object XSimpleText {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XSimpleText = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XSimpleText]
  }
  @scala.inline
  implicit class XSimpleTextOps[Self <: XSimpleText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTextCursor(value: () => XTextCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextCursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateTextCursorByRange(value: XTextRange => XTextCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextCursorByRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertControlCharacter(value: (XTextRange, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertControlCharacter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInsertString(value: (XTextRange, String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertString")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

