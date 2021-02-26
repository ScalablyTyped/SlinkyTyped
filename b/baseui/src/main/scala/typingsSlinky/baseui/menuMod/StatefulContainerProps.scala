package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.baseui.anon.Item
import typingsSlinky.baseui.baseuiStrings.character
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.enter_
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulContainerProps extends StObject {
  
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  
  var children: js.UndefOr[js.Function1[/* args */ RenderProps, ReactElement]] = js.native
  
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  
  var getRequiredItemProps: js.UndefOr[GetRequiredItemProps] = js.native
  
  var initialState: js.UndefOr[StatefulContainerState] = js.native
  
  var items: ItemsT = js.native
  
  var keyboardControlNode: js.UndefOr[Ref[_]] = js.native
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  var onItemSelect: js.UndefOr[OnItemSelect] = js.native
  
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  
  var rootRef: js.UndefOr[Ref[_]] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
  
  var typeAhead: js.UndefOr[Boolean] = js.native
}
object StatefulContainerProps {
  
  @scala.inline
  def apply(items: ItemsT): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  @scala.inline
  implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMenuToNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = StObject.set(x, "addMenuToNesting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMenuToNestingUndefined: Self = StObject.set(x, "addMenuToNesting", js.undefined)
    
    @scala.inline
    def setChildren(value: /* args */ RenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setGetChildMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    @scala.inline
    def setGetParentMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = StObject.set(x, "getParentMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParentMenuUndefined: Self = StObject.set(x, "getParentMenu", js.undefined)
    
    @scala.inline
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRequiredItemPropsUndefined: Self = StObject.set(x, "getRequiredItemProps", js.undefined)
    
    @scala.inline
    def setInitialState(value: StatefulContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setItems(value: ItemsT): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ItemT*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKeyboardControlNode(value: Ref[_]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControlNodeFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "keyboardControlNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyboardControlNodeNull: Self = StObject.set(x, "keyboardControlNode", null)
    
    @scala.inline
    def setKeyboardControlNodeRefObject(value: ReactRef[_]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControlNodeUndefined: Self = StObject.set(x, "keyboardControlNode", js.undefined)
    
    @scala.inline
    def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: /* args */ Item => js.Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    @scala.inline
    def setRemoveMenuFromNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = StObject.set(x, "removeMenuFromNesting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMenuFromNestingUndefined: Self = StObject.set(x, "removeMenuFromNesting", js.undefined)
    
    @scala.inline
    def setRootRef(value: Ref[_]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "rootRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootRefNull: Self = StObject.set(x, "rootRef", null)
    
    @scala.inline
    def setRootRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* changeType */ moveDown | moveUp | reset | enter_ | click | character | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    @scala.inline
    def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAheadUndefined: Self = StObject.set(x, "typeAhead", js.undefined)
  }
}
