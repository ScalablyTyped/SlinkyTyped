package typingsSlinky.koaGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.koaGraphql.mod.OptionsData
  - js.Promise[typingsSlinky.koaGraphql.mod.OptionsData]
*/
trait OptionsResult extends Options

object OptionsResult {
  @scala.inline
  implicit def apply(value: OptionsData): OptionsResult = value.asInstanceOf[OptionsResult]
  @scala.inline
  implicit def apply(value: js.Promise[OptionsData]): OptionsResult = value.asInstanceOf[OptionsResult]
}

