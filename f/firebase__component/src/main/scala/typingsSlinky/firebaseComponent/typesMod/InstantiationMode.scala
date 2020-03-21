package typingsSlinky.firebaseComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseComponent.firebaseComponentStrings.LAZY
  - typingsSlinky.firebaseComponent.firebaseComponentStrings.EAGER
*/
trait InstantiationMode extends js.Object

object InstantiationMode {
  @scala.inline
  def EAGER: typingsSlinky.firebaseComponent.firebaseComponentStrings.EAGER = this.cast("EAGER")
  @scala.inline
  def LAZY: typingsSlinky.firebaseComponent.firebaseComponentStrings.LAZY = this.cast("LAZY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

