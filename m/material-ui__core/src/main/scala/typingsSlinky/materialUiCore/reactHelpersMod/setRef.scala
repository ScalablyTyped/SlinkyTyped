package typingsSlinky.materialUiCore.reactHelpersMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/utils/reactHelpers", "setRef")
@js.native
object setRef extends js.Object {
  def apply[T](): Unit = js.native
  def apply[T](ref: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T]]): Unit = js.native
  def apply[T](ref: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | Null | ReactRef[T]], value: T): Unit = js.native
}

