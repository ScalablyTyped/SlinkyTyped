package typingsSlinky.humps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.humps.mod.HumpsOptions
  - typingsSlinky.humps.mod.HumpsProcessor
*/
trait OptionOrProcessor extends js.Object

object OptionOrProcessor {
  @scala.inline
  implicit def apply(value: HumpsOptions): OptionOrProcessor = value.asInstanceOf[OptionOrProcessor]
  @scala.inline
  implicit def apply(value: HumpsProcessor): OptionOrProcessor = value.asInstanceOf[OptionOrProcessor]
}

