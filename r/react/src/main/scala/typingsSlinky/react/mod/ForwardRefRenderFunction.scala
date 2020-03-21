package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardRefRenderFunction[T, P] extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  def apply(props: PropsWithChildren[P], ref: Ref[T]): slinky.core.facade.ReactElement | Null = js.native
}

