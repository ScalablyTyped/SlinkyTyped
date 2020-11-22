package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object menuMod {
  
  type ArrayItemsT = js.Array[typingsSlinky.baseui.menuMod.ItemT]
  
  type GetRequiredItemProps = js.Function2[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    typingsSlinky.baseui.menuMod.RenderItemProps
  ]
  
  type ItemT = js.Any
  
  type ItemsT = typingsSlinky.baseui.menuMod.ArrayItemsT | typingsSlinky.baseui.menuMod.GroupedItemsT
  
  type OnItemSelect = js.Function1[/* args */ typingsSlinky.baseui.anon.Item, js.Any]
  
  type StateReducer = js.Function3[
    /* changeType */ typingsSlinky.baseui.baseuiStrings.moveDown | typingsSlinky.baseui.baseuiStrings.moveUp | typingsSlinky.baseui.baseuiStrings.reset | typingsSlinky.baseui.baseuiStrings.enter_ | typingsSlinky.baseui.baseuiStrings.click | typingsSlinky.baseui.baseuiStrings.character | typingsSlinky.baseui.baseuiStrings.focus | typingsSlinky.baseui.baseuiStrings.mouseEnter, 
    /* changes */ typingsSlinky.baseui.menuMod.StatefulContainerState, 
    /* currentState */ typingsSlinky.baseui.menuMod.StatefulContainerState, 
    typingsSlinky.baseui.menuMod.StatefulContainerState
  ]
  
  type StatefulMenuProps = typingsSlinky.baseui.menuMod.StatefulContainerProps with typingsSlinky.baseui.menuMod.MenuProps
  
  type StatelessMenuProps = typingsSlinky.baseui.menuMod.SharedStatelessProps with typingsSlinky.baseui.menuMod.MenuProps
}
