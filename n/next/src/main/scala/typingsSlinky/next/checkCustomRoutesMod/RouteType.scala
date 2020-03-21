package typingsSlinky.next.checkCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.nextStrings.rewrite
  - typingsSlinky.next.nextStrings.redirect
  - typingsSlinky.next.nextStrings.header
*/
trait RouteType extends js.Object

object RouteType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typingsSlinky.next.nextStrings.header = this.cast("header")
  @scala.inline
  def redirect: typingsSlinky.next.nextStrings.redirect = this.cast("redirect")
  @scala.inline
  def rewrite: typingsSlinky.next.nextStrings.rewrite = this.cast("rewrite")
}

