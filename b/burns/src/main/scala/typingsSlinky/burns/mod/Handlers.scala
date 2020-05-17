package typingsSlinky.burns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This Type is an alias to the multiple
  * parameter types the `registerEvent` method accepts
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.burns.mod.HandlerFn
  - js.Array[typingsSlinky.burns.mod.HandlerFn]
*/
trait Handlers extends EventHandler

object Handlers {
  @scala.inline
  implicit def apply(value: js.Array[HandlerFn]): Handlers = value.asInstanceOf[Handlers]
  @scala.inline
  implicit def apply(value: HandlerFn): Handlers = value.asInstanceOf[Handlers]
  @scala.inline
  implicit def apply(value: String): Handlers = value.asInstanceOf[Handlers]
}

