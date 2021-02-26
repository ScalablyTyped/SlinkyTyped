package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to connect a document with an {@link ImportFilter}
  *
  * An {@link ImportFilter} must know the target of its filter operation. To set this on a filter is part of this interface. Same mechanism exist for
  * export too.
  * @see ExportFilter
  * @see ImportFilter
  * @see XExporter
  */
@js.native
trait XImporter extends XInterface {
  
  /**
    * sets the target document for the importer
    * @param Document the target document
    * @throws com::sun::star::lang::IllegalArgumentException if **Document** does not support any service which is supported by this importer
    */
  def setTargetDocument(Document: XComponent): Unit = js.native
}
object XImporter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTargetDocument: XComponent => Unit
  ): XImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTargetDocument = js.Any.fromFunction1(setTargetDocument))
    __obj.asInstanceOf[XImporter]
  }
  
  @scala.inline
  implicit class XImporterMutableBuilder[Self <: XImporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetTargetDocument(value: XComponent => Unit): Self = StObject.set(x, "setTargetDocument", js.Any.fromFunction1(value))
  }
}
