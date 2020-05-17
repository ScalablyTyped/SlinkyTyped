package typingsSlinky.burns.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type Alias for event handlers
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.burns.mod.Handlers
  - typingsSlinky.std.Record[java.lang.String, typingsSlinky.burns.mod.Handlers]
*/
trait EventHandler extends js.Object

object EventHandler {
  @scala.inline
  implicit def apply(value: Handlers): EventHandler = value.asInstanceOf[EventHandler]
  @scala.inline
  implicit def apply(value: Record[String, Handlers]): EventHandler = value.asInstanceOf[EventHandler]
}

