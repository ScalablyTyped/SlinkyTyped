package typingsSlinky.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hellojs.hellojsStrings.popup
  - typingsSlinky.hellojs.hellojsStrings.page
  - typingsSlinky.hellojs.hellojsStrings.none
*/
trait HelloJSDisplayType extends js.Object

object HelloJSDisplayType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.hellojs.hellojsStrings.none = this.cast("none")
  @scala.inline
  def page: typingsSlinky.hellojs.hellojsStrings.page = this.cast("page")
  @scala.inline
  def popup: typingsSlinky.hellojs.hellojsStrings.popup = this.cast("popup")
}

