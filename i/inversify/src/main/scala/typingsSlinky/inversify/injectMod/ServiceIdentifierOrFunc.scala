package typingsSlinky.inversify.injectMod

import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]
  - typingsSlinky.inversify.injectMod.LazyServiceIdentifer[js.Any]
*/
trait ServiceIdentifierOrFunc extends js.Object

object ServiceIdentifierOrFunc {
  @scala.inline
  implicit def apply(value: LazyServiceIdentifer[js.Any]): ServiceIdentifierOrFunc = value.asInstanceOf[ServiceIdentifierOrFunc]
  @scala.inline
  implicit def apply(value: ServiceIdentifier[js.Any]): ServiceIdentifierOrFunc = value.asInstanceOf[ServiceIdentifierOrFunc]
}

