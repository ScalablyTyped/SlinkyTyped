package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back a document name.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.DocumentSaveRequest} .
  * @since OOo 2.0
  */
@js.native
trait XInteractionDocumentSave extends XInteractionContinuation {
  
  /**
    * set the document name chosen by the interaction handler
    * @param Name the name of the document
    * @param Content the content where the document should store itself
    */
  def setName(Name: String, Content: XContent): Unit = js.native
}
object XInteractionDocumentSave {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setName: (String, XContent) => Unit
  ): XInteractionDocumentSave = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setName = js.Any.fromFunction2(setName))
    __obj.asInstanceOf[XInteractionDocumentSave]
  }
  
  @scala.inline
  implicit class XInteractionDocumentSaveMutableBuilder[Self <: XInteractionDocumentSave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetName(value: (String, XContent) => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction2(value))
  }
}
