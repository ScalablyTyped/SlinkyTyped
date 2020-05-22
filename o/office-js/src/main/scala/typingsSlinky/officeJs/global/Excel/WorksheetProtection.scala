package typingsSlinky.officeJs.global.Excel

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.WorksheetProtection")
@js.native
class WorksheetProtection ()
  extends typingsSlinky.officeJs.Excel.WorksheetProtection {
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

