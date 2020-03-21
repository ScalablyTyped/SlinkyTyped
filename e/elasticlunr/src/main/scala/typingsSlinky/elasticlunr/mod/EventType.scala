package typingsSlinky.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.elasticlunr.elasticlunrStrings.add
  - typingsSlinky.elasticlunr.elasticlunrStrings.update
  - typingsSlinky.elasticlunr.elasticlunrStrings.remove
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typingsSlinky.elasticlunr.elasticlunrStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typingsSlinky.elasticlunr.elasticlunrStrings.remove = this.cast("remove")
  @scala.inline
  def update: typingsSlinky.elasticlunr.elasticlunrStrings.update = this.cast("update")
}

