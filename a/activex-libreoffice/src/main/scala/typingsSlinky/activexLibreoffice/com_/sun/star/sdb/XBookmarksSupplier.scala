package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all bookmarks associated with a data source. */
@js.native
trait XBookmarksSupplier extends XInterface {
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  val Bookmarks: XNameAccess = js.native
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  def getBookmarks(): XNameAccess = js.native
}
object XBookmarksSupplier {
  
  @scala.inline
  def apply(
    Bookmarks: XNameAccess,
    acquire: () => Unit,
    getBookmarks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBookmarksSupplier = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBookmarks = js.Any.fromFunction0(getBookmarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBookmarksSupplier]
  }
  
  @scala.inline
  implicit class XBookmarksSupplierMutableBuilder[Self <: XBookmarksSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks(value: XNameAccess): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBookmarks(value: () => XNameAccess): Self = StObject.set(x, "getBookmarks", js.Any.fromFunction0(value))
  }
}
