package typingsSlinky.knuddelsUserappsApi.mod

import typingsSlinky.knuddelsUserappsApi.mod.global.Json
import typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsEventArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.knuddelsUserappsApi.mod.global.Json
  - typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsEventArray
*/
trait KnuddelsEvent extends js.Object

object KnuddelsEvent {
  @scala.inline
  implicit def apply(value: Json): KnuddelsEvent = value.asInstanceOf[KnuddelsEvent]
  @scala.inline
  implicit def apply(value: KnuddelsEventArray): KnuddelsEvent = value.asInstanceOf[KnuddelsEvent]
  @scala.inline
  implicit def apply(value: String): KnuddelsEvent = value.asInstanceOf[KnuddelsEvent]
}

