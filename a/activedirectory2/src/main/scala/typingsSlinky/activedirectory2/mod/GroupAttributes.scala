package typingsSlinky.activedirectory2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activedirectory2.activedirectory2Strings.distinguishedName
  - typingsSlinky.activedirectory2.activedirectory2Strings.objectCategory
  - typingsSlinky.activedirectory2.activedirectory2Strings.cn
  - typingsSlinky.activedirectory2.activedirectory2Strings.description
*/
trait GroupAttributes extends js.Object

object GroupAttributes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cn: typingsSlinky.activedirectory2.activedirectory2Strings.cn = this.cast("cn")
  @scala.inline
  def description: typingsSlinky.activedirectory2.activedirectory2Strings.description = this.cast("description")
  @scala.inline
  def distinguishedName: typingsSlinky.activedirectory2.activedirectory2Strings.distinguishedName = this.cast("distinguishedName")
  @scala.inline
  def objectCategory: typingsSlinky.activedirectory2.activedirectory2Strings.objectCategory = this.cast("objectCategory")
}

