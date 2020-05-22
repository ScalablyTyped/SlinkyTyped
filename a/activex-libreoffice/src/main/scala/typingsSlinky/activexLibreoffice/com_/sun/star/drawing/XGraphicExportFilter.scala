package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XExporter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XMimeTypeInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XGraphicExportFilter
  extends XFilter
     with XExporter
     with XMimeTypeInfo

object XGraphicExportFilter {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: SafeArray[String],
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getSupportedMimeTypeNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit,
    supportsMimeType: String => Boolean
  ): XGraphicExportFilter = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getSupportedMimeTypeNames = js.Any.fromFunction0(getSupportedMimeTypeNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
    __obj.asInstanceOf[XGraphicExportFilter]
  }
}

