package typingsSlinky.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hellojs.hellojsStrings.popup
  - typings.hellojs.hellojsStrings.page
  - typings.hellojs.hellojsStrings.none
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

