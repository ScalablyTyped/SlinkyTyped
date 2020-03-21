package typingsSlinky.grasp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grasp.graspStrings.squery
  - typingsSlinky.grasp.graspStrings.equery
*/
trait QueryEngineType extends js.Object

object QueryEngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def equery: typingsSlinky.grasp.graspStrings.equery = this.cast("equery")
  @scala.inline
  def squery: typingsSlinky.grasp.graspStrings.squery = this.cast("squery")
}

