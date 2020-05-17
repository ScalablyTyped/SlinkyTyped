package typingsSlinky.reactLocalization.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.react.mod.global.JSX.Element
*/
trait Formatted extends js.Object

object Formatted {
  @scala.inline
  implicit def apply(value: Double): Formatted = value.asInstanceOf[Formatted]
  @scala.inline
  implicit def apply(value: ReactElement): Formatted = value.asInstanceOf[Formatted]
  @scala.inline
  implicit def apply(value: String): Formatted = value.asInstanceOf[Formatted]
}

