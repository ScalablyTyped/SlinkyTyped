package typingsSlinky.baseui.layoutDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BEHAVIOR extends js.Object

@JSImport("baseui/layout-grid", "BEHAVIOR")
@js.native
object BEHAVIOR extends js.Object {
  @js.native
  sealed trait fixed extends BEHAVIOR
  
  @js.native
  sealed trait fluid extends BEHAVIOR
  
  /* "fixed" */ val fixed: typingsSlinky.baseui.layoutDashGridMod.BEHAVIOR.fixed with String = js.native
  /* "fluid" */ val fluid: typingsSlinky.baseui.layoutDashGridMod.BEHAVIOR.fluid with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BEHAVIOR with String] = js.native
}

