package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveBehavior extends js.Object
/**
  *
  * Specifies the save behavior for Workbook.save API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends js.Object {
  
  /**
    * Prompts the saveas experience to the user if the workbook has not been saved,
    Ignored if the workbook was previously saved.
    *
    */
  @js.native
  sealed trait prompt extends SaveBehavior
  
  /**
    * Save the workbook without prompting the user. If file is not saved,
    it will save it with default name under default location.
    *
    */
  @js.native
  sealed trait save extends SaveBehavior
}
