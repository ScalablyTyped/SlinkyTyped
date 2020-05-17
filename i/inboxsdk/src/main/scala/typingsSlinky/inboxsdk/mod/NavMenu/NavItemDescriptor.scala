package typingsSlinky.inboxsdk.mod.NavMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.NavMenu.NavItemIconUrlDescriptor
  - typingsSlinky.inboxsdk.mod.NavMenu.NavItemIconHtmlDescriptor
*/
trait NavItemDescriptor extends js.Object

object NavItemDescriptor {
  @scala.inline
  implicit def apply(value: NavItemIconHtmlDescriptor): NavItemDescriptor = value.asInstanceOf[NavItemDescriptor]
  @scala.inline
  implicit def apply(value: NavItemIconUrlDescriptor): NavItemDescriptor = value.asInstanceOf[NavItemDescriptor]
}

