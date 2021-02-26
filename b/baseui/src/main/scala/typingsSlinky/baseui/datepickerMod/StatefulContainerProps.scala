package typingsSlinky.baseui.datepickerMod

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Date
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulContainerProps[T] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* args */ T, ReactElement]] = js.native
  
  var initialState: js.UndefOr[ContainerState] = js.native
  
  var onChange: js.UndefOr[typingsSlinky.baseui.datepickerMod.onChange] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
}
object StatefulContainerProps {
  
  @scala.inline
  def apply[T](): StatefulContainerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulContainerProps[T]]
  }
  
  @scala.inline
  implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps[_], T] (val x: Self with StatefulContainerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* args */ T => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setInitialState(value: ContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ Date => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
