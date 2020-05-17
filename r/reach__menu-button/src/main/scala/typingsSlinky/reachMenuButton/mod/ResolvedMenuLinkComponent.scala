package typingsSlinky.reachMenuButton.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentType[T]
  - T
*/
trait ResolvedMenuLinkComponent[T] extends js.Object

object ResolvedMenuLinkComponent {
  @scala.inline
  implicit def apply[T](value: ReactComponentClass[T]): ResolvedMenuLinkComponent[T] = value.asInstanceOf[ResolvedMenuLinkComponent[T]]
  @scala.inline
  implicit def apply[T](value: T): ResolvedMenuLinkComponent[T] = value.asInstanceOf[ResolvedMenuLinkComponent[T]]
}

