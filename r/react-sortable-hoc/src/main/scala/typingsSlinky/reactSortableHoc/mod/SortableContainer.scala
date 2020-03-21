package typingsSlinky.reactSortableHoc.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", "SortableContainer")
@js.native
object SortableContainer extends js.Object {
  def apply[P](wrappedComponent: WrappedComponent[P]): ReactComponentClass[P with SortableContainerProps] = js.native
  def apply[P](wrappedComponent: WrappedComponent[P], config: Config): ReactComponentClass[P with SortableContainerProps] = js.native
}

