package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides auditing functions of a document. */
@js.native
trait XDocumentAuditing extends XInterface {
  
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): Unit = js.native
}
object XDocumentAuditing {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    refreshArrows: () => Unit,
    release: () => Unit
  ): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = js.Any.fromFunction0(refreshArrows), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentAuditing]
  }
  
  @scala.inline
  implicit class XDocumentAuditingMutableBuilder[Self <: XDocumentAuditing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshArrows(value: () => Unit): Self = StObject.set(x, "refreshArrows", js.Any.fromFunction0(value))
  }
}
