package typingsSlinky.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Excel.ShapeZOrder with String] = js.native
  
  /* "BringForward" */ val bringForward: typingsSlinky.officeJsPreview.Excel.ShapeZOrder.bringForward with String = js.native
  
  /* "BringToFront" */ val bringToFront: typingsSlinky.officeJsPreview.Excel.ShapeZOrder.bringToFront with String = js.native
  
  /* "SendBackward" */ val sendBackward: typingsSlinky.officeJsPreview.Excel.ShapeZOrder.sendBackward with String = js.native
  
  /* "SendToBack" */ val sendToBack: typingsSlinky.officeJsPreview.Excel.ShapeZOrder.sendToBack with String = js.native
}
