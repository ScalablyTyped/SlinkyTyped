package typingsSlinky.reactCopyWrite.mod

import slinky.core.facade.ReactElement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: ReactElement | js.Array[ReactElement]
  var initialState: js.UndefOr[Partial[T]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply[T](children: ReactElement | js.Array[ReactElement], initialState: Partial[T] = null): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

