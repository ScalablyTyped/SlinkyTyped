package typingsSlinky.antDesignReactNative.paginationMod

import typingsSlinky.antDesignReactNative.paginationPropsTypeMod.PaginationState
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationNativeProps, PaginationState, js.Any] {
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
  def onChange(p: Double): Unit = js.native
}

