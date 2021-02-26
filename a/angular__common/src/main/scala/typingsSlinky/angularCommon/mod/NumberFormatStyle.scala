package typingsSlinky.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberFormatStyle extends StObject
@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormatStyle with Double] = js.native
  
  @js.native
  sealed trait Currency extends NumberFormatStyle
  /* 2 */ val Currency: typingsSlinky.angularCommon.mod.NumberFormatStyle.Currency with Double = js.native
  
  @js.native
  sealed trait Decimal extends NumberFormatStyle
  /* 0 */ val Decimal: typingsSlinky.angularCommon.mod.NumberFormatStyle.Decimal with Double = js.native
  
  @js.native
  sealed trait Percent extends NumberFormatStyle
  /* 1 */ val Percent: typingsSlinky.angularCommon.mod.NumberFormatStyle.Percent with Double = js.native
  
  @js.native
  sealed trait Scientific extends NumberFormatStyle
  /* 3 */ val Scientific: typingsSlinky.angularCommon.mod.NumberFormatStyle.Scientific with Double = js.native
}
