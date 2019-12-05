package typingsSlinky.atJupyterlabApputils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libVdomMod {
  import slinky.core.facade.ReactElement
  import typingsSlinky.atJupyterlabApputils.libVdomMod.VDomRenderer.IModel

  type ReactRenderElement = js.Array[ReactElement] | ReactElement
  type VDomRenderer[T /* <: IModel | Null */] = VDomRenderer_[T]
}
