package typingsSlinky.immer.mod

import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The inferred return type of `produce` */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immer.mod.FromNothing[(typingsSlinky.std.Exclude[Return, scala.Unit]) | Return]
  - Base
*/
trait Produced[Base, Return] extends js.Object

object Produced {
  @scala.inline
  implicit def apply[Base, Return](value: Base): Produced[Base, Return] = value.asInstanceOf[Produced[Base, Return]]
  @scala.inline
  implicit def apply[Base, Return](value: FromNothing[(Exclude[Return, Unit]) | Return]): Produced[Base, Return] = value.asInstanceOf[Produced[Base, Return]]
}

