package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies access to the cursor in the view.
  *
  * This cursor is the same instance that is available in the user interface.
  * @see TextDocumentView
  */
@js.native
trait XTextViewCursorSupplier extends XInterface {
  /** @returns the cursor of the document view. */
  val ViewCursor: XTextViewCursor = js.native
  /** @returns the cursor of the document view. */
  def getViewCursor(): XTextViewCursor = js.native
}

object XTextViewCursorSupplier {
  @scala.inline
  def apply(
    ViewCursor: XTextViewCursor,
    acquire: () => Unit,
    getViewCursor: () => XTextViewCursor,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextViewCursorSupplier = {
    val __obj = js.Dynamic.literal(ViewCursor = ViewCursor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewCursor = js.Any.fromFunction0(getViewCursor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextViewCursorSupplier]
  }
  @scala.inline
  implicit class XTextViewCursorSupplierOps[Self <: XTextViewCursorSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewCursor(value: XTextViewCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetViewCursor(value: () => XTextViewCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewCursor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

