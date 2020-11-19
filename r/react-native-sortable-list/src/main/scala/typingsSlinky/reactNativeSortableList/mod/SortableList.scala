package typingsSlinky.reactNativeSortableList.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeSortableList.anon.Animated
import typingsSlinky.reactNativeSortableList.anon.Key
import typingsSlinky.reactNativeSortableList.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableList[T, K]
  extends Component[SortableListProps[T, K], js.Object, js.Any] {
  
  /**
    * scrolls by a given y offset, either immediately or with a smooth animation
    */
  def scrollBy(hasDxDyAnimated: Animated): Unit = js.native
  
  /**
    * scrolls to a given y offset, either immediately or with a smooth animation
    */
  def scrollTo(hasXYAnimated: X): Unit = js.native
  
  /**
    * scrolls to a given row key, either immediately or with a smooth animation
    */
  def scrollToRowKey(hasKeyAnimated: Key[K]): Unit = js.native
}
