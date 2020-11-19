package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectorType extends js.Object
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends js.Object {
  
  @js.native
  sealed trait curve extends ConnectorType
  
  @js.native
  sealed trait elbow extends ConnectorType
  
  @js.native
  sealed trait straight extends ConnectorType
}
