package typingsSlinky.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.PUSH
  - typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.POP
  - typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.REPLACE
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  def POP: typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  def REPLACE: typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.REPLACE = this.cast("REPLACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

