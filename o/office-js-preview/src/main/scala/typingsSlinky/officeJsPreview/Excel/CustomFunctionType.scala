package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomFunctionType extends js.Object

/**
  * [Api set: CustomFunctions 1.1]
  * @beta
  */
@JSGlobal("Excel.CustomFunctionType")
@js.native
object CustomFunctionType extends js.Object {
  @js.native
  sealed trait invalid extends CustomFunctionType
  
  @js.native
  sealed trait script extends CustomFunctionType
  
  @js.native
  sealed trait webService extends CustomFunctionType
  
}

