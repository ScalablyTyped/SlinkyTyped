package typingsSlinky.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormStyle extends js.Object

@JSImport("@angular/common", "FormStyle")
@js.native
object FormStyle extends js.Object {
  @js.native
  sealed trait Format extends FormStyle
  
  @js.native
  sealed trait Standalone extends FormStyle
  
  /* 0 */ val Format: typingsSlinky.atAngularCommon.atAngularCommonMod.FormStyle.Format with Double = js.native
  /* 1 */ val Standalone: typingsSlinky.atAngularCommon.atAngularCommonMod.FormStyle.Standalone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormStyle with Double] = js.native
}

