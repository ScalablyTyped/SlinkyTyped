package typingsSlinky.figma.mod.global

import typingsSlinky.figma.anon.DestinationId
import typingsSlinky.figma.anon.Type
import typingsSlinky.figma.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.Type
  - typingsSlinky.figma.anon.Url
  - typingsSlinky.figma.anon.DestinationId
*/
trait Action extends js.Object

object Action {
  @scala.inline
  implicit def apply(value: DestinationId): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: Type): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: Url): Action = value.asInstanceOf[Action]
}

