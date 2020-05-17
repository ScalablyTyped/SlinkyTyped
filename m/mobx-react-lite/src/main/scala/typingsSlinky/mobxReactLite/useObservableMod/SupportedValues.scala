package typingsSlinky.mobxReactLite.useObservableMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.std.Map[js.Any, js.Any]
  - js.Array[js.Any]
*/
trait SupportedValues extends js.Object

object SupportedValues {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): SupportedValues = value.asInstanceOf[SupportedValues]
  @scala.inline
  implicit def apply(value: Map[js.Any, js.Any]): SupportedValues = value.asInstanceOf[SupportedValues]
  @scala.inline
  implicit def apply(value: js.Object): SupportedValues = value.asInstanceOf[SupportedValues]
}

