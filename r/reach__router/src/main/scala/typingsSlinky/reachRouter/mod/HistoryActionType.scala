package typingsSlinky.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reachRouter.reachRouterStrings.PUSH
  - typingsSlinky.reachRouter.reachRouterStrings.POP
*/
trait HistoryActionType extends js.Object

object HistoryActionType {
  @scala.inline
  def POP: typingsSlinky.reachRouter.reachRouterStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsSlinky.reachRouter.reachRouterStrings.PUSH = this.cast("PUSH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

