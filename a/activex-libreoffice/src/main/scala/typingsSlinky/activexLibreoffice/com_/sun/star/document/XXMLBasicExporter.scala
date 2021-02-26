package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides unified interface for {@link XMLOasisBasicExporter} and {@link XMLBasicExporter} services.
  * @since LibreOffice 4.1
  */
@js.native
trait XXMLBasicExporter
  extends XExporter
     with XFilter
object XXMLBasicExporter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit
  ): XXMLBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
    __obj.asInstanceOf[XXMLBasicExporter]
  }
}
