package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardRefRenderFunction[T, P] extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  def apply(props: PropsWithChildren[P]): slinky.core.facade.ReactElement | Null = js.native
  def apply(props: PropsWithChildren[P], ref: js.Function1[/* instance */ T | Null, Unit]): slinky.core.facade.ReactElement | Null = js.native
  def apply(props: PropsWithChildren[P], ref: MutableRefObject[T | Null]): slinky.core.facade.ReactElement | Null = js.native
}

