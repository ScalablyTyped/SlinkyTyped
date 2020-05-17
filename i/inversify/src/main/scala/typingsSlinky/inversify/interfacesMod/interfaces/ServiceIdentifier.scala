package typingsSlinky.inversify.interfacesMod.interfaces

import typingsSlinky.inversify.injectMod.ServiceIdentifierOrFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
  - typingsSlinky.inversify.interfacesMod.interfaces.Newable[T]
  - typingsSlinky.inversify.interfacesMod.interfaces.Abstract[T]
*/
trait ServiceIdentifier[T] extends ServiceIdentifierOrFunc

object ServiceIdentifier {
  @scala.inline
  implicit def apply[T](value: Abstract[T]): ServiceIdentifier[T] = value.asInstanceOf[ServiceIdentifier[T]]
  @scala.inline
  implicit def apply[T](value: Newable[T]): ServiceIdentifier[T] = value.asInstanceOf[ServiceIdentifier[T]]
  @scala.inline
  implicit def apply[T](value: String): ServiceIdentifier[T] = value.asInstanceOf[ServiceIdentifier[T]]
  @scala.inline
  implicit def apply[T](value: js.Symbol): ServiceIdentifier[T] = value.asInstanceOf[ServiceIdentifier[T]]
}

