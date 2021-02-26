package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.document.OfficeDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XActionLockable
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XLinkTargetSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPagesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XProtectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a model component which consists of some settings and one or more spreadsheets. */
@js.native
trait SpreadsheetDocument
  extends OfficeDocument
     with SpreadsheetDocumentSettings
     with XMultiServiceFactory
     with XActionLockable
     with XLinkTargetSupplier
     with XProtectable
     with XSpreadsheetDocument
     with XCalculatable
     with XDocumentAuditing
     with XConsolidatable
     with XGoalSeek
     with XDrawPagesSupplier
     with XStyleFamiliesSupplier
     with XNumberFormatsSupplier {
  
  /** contains the collection of area links in the document. */
  var AreaLinks: XAreaLinks = js.native
  
  /** contains the collection of column label ranges in the document. */
  var ColumnLabelRanges: XLabelRanges = js.native
  
  /** contains the collection of DDE links in the document. */
  var DDELinks: XNameAccess = js.native
  
  /** contains the collection of database ranges in the document. */
  var DatabaseRanges: XDatabaseRanges = js.native
  
  /** contains the collection of named ranges in the document. */
  var NamedRanges: XNamedRanges = js.native
  
  /** contains the collection of row label ranges in the document. */
  var RowLabelRanges: XLabelRanges = js.native
  
  /** contains the collection of sheet links in the document. */
  var SheetLinks: XNameAccess = js.native
}
