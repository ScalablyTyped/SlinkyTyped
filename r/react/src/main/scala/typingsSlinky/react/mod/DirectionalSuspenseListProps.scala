package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalSuspenseListProps
  extends typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards = js.native
  
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode] = js.native
}
object DirectionalSuspenseListProps {
  
  @scala.inline
  def apply(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: forwards | backwards
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
  
  @scala.inline
  implicit class DirectionalSuspenseListPropsMutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail(value: typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
  }
}
