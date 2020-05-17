package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables an object to search in its content. */
@js.native
trait XTextSearch extends XInterface {
  /**
    * search backward in the searchStr, starts at startPos and ends by endpos. The endpos must be lower then the startpos, because the function searches
    * backward! The result is returned in the {@link SearchResult} .
    */
  def searchBackward(searchStr: String, startPos: Double, endPos: Double): SearchResult = js.native
  /** search forward in the searchStr, starts at startPos and ends by endpos. The result is returned in the {@link SearchResult} . */
  def searchForward(searchStr: String, startPos: Double, endPos: Double): SearchResult = js.native
  /** set the options for the forward or backward search. */
  def setOptions(options: SearchOptions): Unit = js.native
}

object XTextSearch {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Unit
  ): XTextSearch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[XTextSearch]
  }
  @scala.inline
  implicit class XTextSearchOps[Self <: XTextSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchBackward(value: (String, Double, Double) => SearchResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBackward")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSearchForward(value: (String, Double, Double) => SearchResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForward")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: SearchOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

