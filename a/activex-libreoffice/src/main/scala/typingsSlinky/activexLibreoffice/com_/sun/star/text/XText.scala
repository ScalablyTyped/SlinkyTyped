package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a {@link XSimpleText} by the capability of inserting XTextContents. */
@js.native
trait XText extends XSimpleText {
  
  /**
    * inserts a content, such as a text table, text frame or text field.
    *
    * Which contents are accepted is implementation-specific. Some implementations may only accept contents which were created by the factory that supplied
    * the same text or the document which contains the text.
    * @param xRange specifies the position of insertion.
    * @param xContent the text content to be inserted.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **xConten
    */
  def insertTextContent(xRange: XTextRange, xContent: XTextContent, bAbsorb: Boolean): Unit = js.native
  
  /**
    * removes the specified content from the text object.
    * @param xContent the content that is to be removed.
    */
  def removeTextContent(xContent: XTextContent): Unit = js.native
}
object XText {
  
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
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): XText = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XText]
  }
  
  @scala.inline
  implicit class XTextOps[Self <: XText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertTextContent(value: (XTextRange, XTextContent, Boolean) => Unit): Self = this.set("insertTextContent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveTextContent(value: XTextContent => Unit): Self = this.set("removeTextContent", js.Any.fromFunction1(value))
  }
}
