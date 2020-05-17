package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsKeystone.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.keystonejsKeystone.mod.AccessCallback
  - typingsSlinky.keystonejsKeystone.anon.Auth
*/
trait Access extends js.Object

object Access {
  @scala.inline
  implicit def apply(value: AccessCallback): Access = value.asInstanceOf[Access]
  @scala.inline
  implicit def apply(value: Auth): Access = value.asInstanceOf[Access]
  @scala.inline
  implicit def apply(value: Boolean): Access = value.asInstanceOf[Access]
}

