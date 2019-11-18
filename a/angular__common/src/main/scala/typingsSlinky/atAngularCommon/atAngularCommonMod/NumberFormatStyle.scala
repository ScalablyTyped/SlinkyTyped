package typingsSlinky.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberFormatStyle extends js.Object

@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends js.Object {
  @js.native
  sealed trait Currency extends NumberFormatStyle
  
  @js.native
  sealed trait Decimal extends NumberFormatStyle
  
  @js.native
  sealed trait Percent extends NumberFormatStyle
  
  @js.native
  sealed trait Scientific extends NumberFormatStyle
  
  /* 2 */ val Currency: typingsSlinky.atAngularCommon.atAngularCommonMod.NumberFormatStyle.Currency with Double = js.native
  /* 0 */ val Decimal: typingsSlinky.atAngularCommon.atAngularCommonMod.NumberFormatStyle.Decimal with Double = js.native
  /* 1 */ val Percent: typingsSlinky.atAngularCommon.atAngularCommonMod.NumberFormatStyle.Percent with Double = js.native
  /* 3 */ val Scientific: typingsSlinky.atAngularCommon.atAngularCommonMod.NumberFormatStyle.Scientific with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormatStyle with Double] = js.native
}

