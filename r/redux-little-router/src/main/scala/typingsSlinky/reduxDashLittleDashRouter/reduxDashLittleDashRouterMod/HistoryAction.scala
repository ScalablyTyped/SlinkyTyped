package typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.PUSH
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.POP
  - typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.REPLACE
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  def POP: typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  def REPLACE: typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.REPLACE = this.cast("REPLACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

