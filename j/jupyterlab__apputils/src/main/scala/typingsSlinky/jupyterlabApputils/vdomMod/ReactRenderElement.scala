package typingsSlinky.jupyterlabApputils.vdomMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.react.mod.ReactElement]
  - typingsSlinky.react.mod.ReactElement
*/
trait ReactRenderElement extends js.Object

object ReactRenderElement {
  @scala.inline
  implicit def apply(value: js.Array[ReactElement]): ReactRenderElement = value.asInstanceOf[ReactRenderElement]
  @scala.inline
  implicit def apply(value: ReactElement): ReactRenderElement = value.asInstanceOf[ReactRenderElement]
}

