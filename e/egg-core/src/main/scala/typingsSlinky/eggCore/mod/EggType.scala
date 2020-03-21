package typingsSlinky.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eggCore.eggCoreStrings.application
  - typingsSlinky.eggCore.eggCoreStrings.agent
*/
trait EggType extends js.Object

object EggType {
  @scala.inline
  def agent: typingsSlinky.eggCore.eggCoreStrings.agent = this.cast("agent")
  @scala.inline
  def application: typingsSlinky.eggCore.eggCoreStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

