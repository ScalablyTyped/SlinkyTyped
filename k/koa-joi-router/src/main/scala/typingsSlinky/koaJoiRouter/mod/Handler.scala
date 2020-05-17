package typingsSlinky.koaJoiRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.koaJoiRouter.mod.FullHandler
  - typingsSlinky.koaJoiRouter.mod.NestedHandler
*/
trait Handler extends js.Object

object Handler {
  @scala.inline
  implicit def apply(value: FullHandler): Handler = value.asInstanceOf[Handler]
  @scala.inline
  implicit def apply(value: NestedHandler): Handler = value.asInstanceOf[Handler]
}

