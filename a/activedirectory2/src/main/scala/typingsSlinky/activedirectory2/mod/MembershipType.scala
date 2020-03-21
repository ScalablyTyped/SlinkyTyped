package typingsSlinky.activedirectory2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activedirectory2.activedirectory2Strings.all
  - typingsSlinky.activedirectory2.activedirectory2Strings.user
  - typingsSlinky.activedirectory2.activedirectory2Strings.group
*/
trait MembershipType extends js.Object

object MembershipType {
  @scala.inline
  def all: typingsSlinky.activedirectory2.activedirectory2Strings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def group: typingsSlinky.activedirectory2.activedirectory2Strings.group = this.cast("group")
  @scala.inline
  def user: typingsSlinky.activedirectory2.activedirectory2Strings.user = this.cast("user")
}

