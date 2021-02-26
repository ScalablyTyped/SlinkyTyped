package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an {@link XContent} to delete itself into the trash can.
  *
  * This is an additional interface the {@link XContent} representing the trash can (URL: "vnd.sun.staroffice.trashcan:///") should support.
  */
@js.native
trait XRecycler extends XInterface {
  
  /**
    * Notify the trash can that an {@link XContent} is deleting itself into it.
    * @param Properties The trash can uses this interface to access the properties of the content being deleted, to copy them for later display etc. The trash
    * @param Identifier When the deleted content is later restored or ultimately deleted, the trash can will use this identifier to query an {@link XContent}
    */
  def trashContent(Properties: XCommandProcessor, Identifier: XContentIdentifier): Unit = js.native
}
object XRecycler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    trashContent: (XCommandProcessor, XContentIdentifier) => Unit
  ): XRecycler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), trashContent = js.Any.fromFunction2(trashContent))
    __obj.asInstanceOf[XRecycler]
  }
  
  @scala.inline
  implicit class XRecyclerMutableBuilder[Self <: XRecycler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrashContent(value: (XCommandProcessor, XContentIdentifier) => Unit): Self = StObject.set(x, "trashContent", js.Any.fromFunction2(value))
  }
}
