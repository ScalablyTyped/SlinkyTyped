package typingsSlinky.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadingOrder extends StObject
@JSImport("exceljs", "ReadingOrder")
@js.native
object ReadingOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadingOrder with Double] = js.native
  
  @js.native
  sealed trait LeftToRight extends ReadingOrder
  /* 1 */ val LeftToRight: typingsSlinky.exceljs.mod.ReadingOrder.LeftToRight with Double = js.native
  
  @js.native
  sealed trait RightToLeft extends ReadingOrder
  /* 2 */ val RightToLeft: typingsSlinky.exceljs.mod.ReadingOrder.RightToLeft with Double = js.native
}
