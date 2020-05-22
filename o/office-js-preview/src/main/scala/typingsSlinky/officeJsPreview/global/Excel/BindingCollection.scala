package typingsSlinky.officeJsPreview.global.Excel

import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the collection of all the binding objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingCollection")
@js.native
class BindingCollection ()
  extends typingsSlinky.officeJsPreview.Excel.BindingCollection {
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

