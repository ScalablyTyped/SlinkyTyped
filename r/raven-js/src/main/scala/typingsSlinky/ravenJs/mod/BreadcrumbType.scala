package typingsSlinky.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ravenJs.ravenJsStrings.navigation
  - typingsSlinky.ravenJs.ravenJsStrings.http
*/
trait BreadcrumbType extends js.Object

object BreadcrumbType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsSlinky.ravenJs.ravenJsStrings.http = this.cast("http")
  @scala.inline
  def navigation: typingsSlinky.ravenJs.ravenJsStrings.navigation = this.cast("navigation")
}

