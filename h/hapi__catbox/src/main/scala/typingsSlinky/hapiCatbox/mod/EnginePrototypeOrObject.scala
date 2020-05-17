package typingsSlinky.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiCatbox.mod.EnginePrototype[js.Any]
  - typingsSlinky.hapiCatbox.mod.ClientApi[js.Any]
*/
trait EnginePrototypeOrObject extends js.Object

object EnginePrototypeOrObject {
  @scala.inline
  implicit def apply(value: ClientApi[js.Any]): EnginePrototypeOrObject = value.asInstanceOf[EnginePrototypeOrObject]
  @scala.inline
  implicit def apply(value: EnginePrototype[js.Any]): EnginePrototypeOrObject = value.asInstanceOf[EnginePrototypeOrObject]
}

