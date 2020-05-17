package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to perform cursor movements between pages. */
@js.native
trait XPageCursor extends XInterface {
  /** @returns the number of the page within the document of this cursor. */
  val Page: Double = js.native
  /** @returns the number of the page within the document of this cursor. */
  def getPage(): Double = js.native
  /**
    * moves the cursor to the end of the current page.
    * @see XPageCursor.jumpToEndOfPreviousPage
    */
  def jumpToEndOfPage(): Boolean = js.native
  /** moves the cursor to the first page. */
  def jumpToFirstPage(): Boolean = js.native
  /** moves the cursor to the last page. */
  def jumpToLastPage(): Boolean = js.native
  /**
    * moves the cursor to the next page.
    * @see XPageCursor.jumpToPreviousPage
    */
  def jumpToNextPage(): Boolean = js.native
  /** moves the cursor to the specified page. */
  def jumpToPage(nPage: Double): Boolean = js.native
  /**
    * moves the cursor to the previous page.
    * @see XPageCursor.jumpToNextPage
    */
  def jumpToPreviousPage(): Boolean = js.native
  /** moves the cursor to the start of the current page. */
  def jumpToStartOfPage(): Boolean = js.native
}

object XPageCursor {
  @scala.inline
  def apply(
    Page: Double,
    acquire: () => Unit,
    getPage: () => Double,
    jumpToEndOfPage: () => Boolean,
    jumpToFirstPage: () => Boolean,
    jumpToLastPage: () => Boolean,
    jumpToNextPage: () => Boolean,
    jumpToPage: Double => Boolean,
    jumpToPreviousPage: () => Boolean,
    jumpToStartOfPage: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPageCursor = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPage = js.Any.fromFunction0(getPage), jumpToEndOfPage = js.Any.fromFunction0(jumpToEndOfPage), jumpToFirstPage = js.Any.fromFunction0(jumpToFirstPage), jumpToLastPage = js.Any.fromFunction0(jumpToLastPage), jumpToNextPage = js.Any.fromFunction0(jumpToNextPage), jumpToPage = js.Any.fromFunction1(jumpToPage), jumpToPreviousPage = js.Any.fromFunction0(jumpToPreviousPage), jumpToStartOfPage = js.Any.fromFunction0(jumpToStartOfPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPageCursor]
  }
  @scala.inline
  implicit class XPageCursorOps[Self <: XPageCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToEndOfPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToEndOfPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToFirstPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToFirstPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToLastPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToLastPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToNextPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToNextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToPage(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJumpToPreviousPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToPreviousPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJumpToStartOfPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToStartOfPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

