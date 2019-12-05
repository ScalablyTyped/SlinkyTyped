package typingsSlinky.reactDashPopperDashTooltip

import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashPopperDashTooltip.distUtilsMod.Fn
import typingsSlinky.reactDashPopperDashTooltip.distUtilsMod.FnOrBool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-popper-tooltip/dist/utils", JSImport.Namespace)
@js.native
object distUtilsMod extends js.Object {
  val TooltipContext: Context[js.Object] = js.native
  def callAll(fns: FnOrBool*): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def canUseDOM(): Boolean = js.native
  def noop(): Unit = js.native
  type Fn = js.Function1[/* repeated */ js.Any, Unit]
  type FnOrBool = js.UndefOr[Fn]
}

