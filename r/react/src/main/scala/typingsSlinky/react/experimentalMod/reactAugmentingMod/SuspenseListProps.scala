package typingsSlinky.react.experimentalMod.reactAugmentingMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typingsSlinky.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement]): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}
