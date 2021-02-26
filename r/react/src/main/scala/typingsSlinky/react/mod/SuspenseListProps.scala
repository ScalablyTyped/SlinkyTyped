package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: forwards | backwards
  ): typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
