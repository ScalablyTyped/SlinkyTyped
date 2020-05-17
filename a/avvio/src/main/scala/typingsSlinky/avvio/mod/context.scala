package typingsSlinky.avvio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.avvio.mod.mixedInstance[I]
  - typingsSlinky.avvio.mod.Avvio[I]
*/
trait context[I] extends js.Object

object context {
  @scala.inline
  implicit def apply[I](value: Avvio[I]): context[I] = value.asInstanceOf[context[I]]
  @scala.inline
  implicit def apply[I](value: mixedInstance[I]): context[I] = value.asInstanceOf[context[I]]
}

