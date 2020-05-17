package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.catbox.mod.EnginePrototype[js.Any]
  - typingsSlinky.catbox.mod.ClientApi[js.Any]
*/
trait EnginePrototypeOrObject extends js.Object

object EnginePrototypeOrObject {
  @scala.inline
  implicit def apply(value: ClientApi[js.Any]): EnginePrototypeOrObject = value.asInstanceOf[EnginePrototypeOrObject]
  @scala.inline
  implicit def apply(value: EnginePrototype[js.Any]): EnginePrototypeOrObject = value.asInstanceOf[EnginePrototypeOrObject]
}

