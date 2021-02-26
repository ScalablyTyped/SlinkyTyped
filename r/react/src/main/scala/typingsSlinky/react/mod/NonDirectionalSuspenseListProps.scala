package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonDirectionalSuspenseListProps
  extends typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.native
  
  /**
    * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
    */
  var tail: js.UndefOr[scala.Nothing] = js.native
}
object NonDirectionalSuspenseListProps {
  
  @scala.inline
  def apply(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  
  @scala.inline
  implicit class NonDirectionalSuspenseListPropsMutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevealOrder(
      value: Exclude[
          typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
          forwards | backwards
        ]
    ): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
  }
}
