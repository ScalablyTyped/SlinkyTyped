package typingsSlinky.minimistOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minimistOptions.minimistOptionsStrings.string
  - typingsSlinky.minimistOptions.minimistOptionsStrings.boolean
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def boolean: typingsSlinky.minimistOptions.minimistOptionsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def string: typingsSlinky.minimistOptions.minimistOptionsStrings.string = this.cast("string")
}

