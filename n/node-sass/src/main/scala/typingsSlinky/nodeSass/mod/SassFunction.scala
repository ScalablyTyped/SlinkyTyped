package typingsSlinky.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.mod.SyncSassFunction
  - typingsSlinky.nodeSass.mod.AsyncSassFunction
*/
trait SassFunction extends js.Object

object SassFunction {
  @scala.inline
  implicit def apply(value: AsyncSassFunction): SassFunction = value.asInstanceOf[SassFunction]
  @scala.inline
  implicit def apply(value: SyncSassFunction): SassFunction = value.asInstanceOf[SassFunction]
}

