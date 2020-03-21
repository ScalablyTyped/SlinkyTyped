package typingsSlinky.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dynogels.dynogelsStrings.create
  - typingsSlinky.dynogels.dynogelsStrings.update
  - typingsSlinky.dynogels.dynogelsStrings.destroy
*/
trait LifeCycleAction extends js.Object

object LifeCycleAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsSlinky.dynogels.dynogelsStrings.create = this.cast("create")
  @scala.inline
  def destroy: typingsSlinky.dynogels.dynogelsStrings.destroy = this.cast("destroy")
  @scala.inline
  def update: typingsSlinky.dynogels.dynogelsStrings.update = this.cast("update")
}

