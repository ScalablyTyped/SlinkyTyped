package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a cursor by lines within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.text.XTextViewCursor
  */
@js.native
trait XLineCursor extends XInterface {
  
  /**
    * moves the cursor to the end of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoEndOfLine(bExpand: Boolean): Unit = js.native
  
  /**
    * moves the cursor to the start of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoStartOfLine(bExpand: Boolean): Unit = js.native
  
  /** determines if the cursor is positioned at the end of a line. */
  def isAtEndOfLine(): Boolean = js.native
  
  /** determines if the cursor is positioned at the start of a line. */
  def isAtStartOfLine(): Boolean = js.native
}
object XLineCursor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    gotoEndOfLine: Boolean => Unit,
    gotoStartOfLine: Boolean => Unit,
    isAtEndOfLine: () => Boolean,
    isAtStartOfLine: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLineCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), gotoEndOfLine = js.Any.fromFunction1(gotoEndOfLine), gotoStartOfLine = js.Any.fromFunction1(gotoStartOfLine), isAtEndOfLine = js.Any.fromFunction0(isAtEndOfLine), isAtStartOfLine = js.Any.fromFunction0(isAtStartOfLine), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLineCursor]
  }
  
  @scala.inline
  implicit class XLineCursorOps[Self <: XLineCursor] (val x: Self) extends AnyVal {
    
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
    def setGotoEndOfLine(value: Boolean => Unit): Self = this.set("gotoEndOfLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGotoStartOfLine(value: Boolean => Unit): Self = this.set("gotoStartOfLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAtEndOfLine(value: () => Boolean): Self = this.set("isAtEndOfLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAtStartOfLine(value: () => Boolean): Self = this.set("isAtStartOfLine", js.Any.fromFunction0(value))
  }
}
