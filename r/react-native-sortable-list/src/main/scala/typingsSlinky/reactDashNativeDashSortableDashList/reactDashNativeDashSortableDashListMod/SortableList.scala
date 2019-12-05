package typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNativeDashSortableDashList.Anon_Animated
import typingsSlinky.reactDashNativeDashSortableDashList.Anon_AnimatedKey
import typingsSlinky.reactDashNativeDashSortableDashList.Anon_AnimatedX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableList[T, K]
  extends Component[SortableListProps[T, K], js.Object, js.Any] {
  /**
    * scrolls by a given y offset, either immediately or with a smooth animation
    */
  def scrollBy(hasDxDyAnimated: Anon_Animated): Unit = js.native
  /**
    * scrolls to a given y offset, either immediately or with a smooth animation
    */
  def scrollTo(hasXYAnimated: Anon_AnimatedX): Unit = js.native
  /**
    * scrolls to a given row key, either immediately or with a smooth animation
    */
  def scrollToRowKey(hasKeyAnimated: Anon_AnimatedKey[K]): Unit = js.native
}

