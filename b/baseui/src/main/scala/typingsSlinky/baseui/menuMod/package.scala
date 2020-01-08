package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object menuMod {
  import typingsSlinky.baseui.Anon_EventItem
  import typingsSlinky.baseui.Anon_GetRequiredItemProps
  import typingsSlinky.baseui.baseuiStrings.click
  import typingsSlinky.baseui.baseuiStrings.focus
  import typingsSlinky.baseui.baseuiStrings.mouseEnter
  import typingsSlinky.baseui.baseuiStrings.moveDown
  import typingsSlinky.baseui.baseuiStrings.moveUp
  import typingsSlinky.baseui.baseuiStrings.reset

  type ArrayItemsT = js.Array[ItemT]
  type GetRequiredItemProps = js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]
  type ItemT = js.Any
  type ItemsT = ArrayItemsT | GroupedItemsT
  type OnItemSelect = js.Function1[/* args */ Anon_EventItem, js.Any]
  type RenderProps = StatefulContainerState with Anon_GetRequiredItemProps
  type StateReducer = js.Function3[
    /* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, 
    /* changes */ StatefulContainerState, 
    /* currentState */ StatefulContainerState, 
    StatefulContainerState
  ]
  type StatefulMenuProps = StatefulContainerProps with MenuProps
  type StatelessMenuProps = SharedStatelessProps with MenuProps
}
