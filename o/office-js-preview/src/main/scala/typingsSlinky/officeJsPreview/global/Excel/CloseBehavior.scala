package typingsSlinky.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the close behavior for Workbook.close API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Excel.CloseBehavior with String] = js.native
  
  /* "Save" */ val save: typingsSlinky.officeJsPreview.Excel.CloseBehavior.save with String = js.native
  
  /* "SkipSave" */ val skipSave: typingsSlinky.officeJsPreview.Excel.CloseBehavior.skipSave with String = js.native
}
