package typingsSlinky.officeJsPreview.global.Excel

import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel PivotItem.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem ()
  extends typingsSlinky.officeJsPreview.Excel.PivotItem {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

