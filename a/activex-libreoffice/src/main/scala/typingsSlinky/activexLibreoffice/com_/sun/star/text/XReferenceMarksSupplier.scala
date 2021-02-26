package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the reference marks within this context (i.e. document).
  *
  * A reference mark is used to refer to text positions in a text document.
  */
@js.native
trait XReferenceMarksSupplier extends XInterface {
  
  /** @returns the collection of reference marks. */
  val ReferenceMarks: XNameAccess = js.native
  
  /** @returns the collection of reference marks. */
  def getReferenceMarks(): XNameAccess = js.native
}
object XReferenceMarksSupplier {
  
  @scala.inline
  def apply(
    ReferenceMarks: XNameAccess,
    acquire: () => Unit,
    getReferenceMarks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReferenceMarksSupplier = {
    val __obj = js.Dynamic.literal(ReferenceMarks = ReferenceMarks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReferenceMarks = js.Any.fromFunction0(getReferenceMarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReferenceMarksSupplier]
  }
  
  @scala.inline
  implicit class XReferenceMarksSupplierMutableBuilder[Self <: XReferenceMarksSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReferenceMarks(value: () => XNameAccess): Self = StObject.set(x, "getReferenceMarks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReferenceMarks(value: XNameAccess): Self = StObject.set(x, "ReferenceMarks", value.asInstanceOf[js.Any])
  }
}
