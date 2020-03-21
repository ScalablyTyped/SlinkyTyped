package typingsSlinky.reduxOptimisticUi.mod

import typingsSlinky.reduxOptimisticUi.AnonOptimistic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticAction extends js.Object {
  var meta: AnonOptimistic
}

object OptimisticAction {
  @scala.inline
  def apply(meta: AnonOptimistic): OptimisticAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptimisticAction]
  }
}

