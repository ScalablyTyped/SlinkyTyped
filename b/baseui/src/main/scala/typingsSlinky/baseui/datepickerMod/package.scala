package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datepickerMod {
  
  type StateReducer = js.Function3[
    /* stateType */ typingsSlinky.baseui.baseuiStrings.mouseLeave | typingsSlinky.baseui.baseuiStrings.moveRight | typingsSlinky.baseui.baseuiStrings.moveDown | typingsSlinky.baseui.baseuiStrings.moveUp | typingsSlinky.baseui.baseuiStrings.mouseOver | typingsSlinky.baseui.baseuiStrings.change_ | typingsSlinky.baseui.baseuiStrings.moveLeft, 
    /* nextState */ typingsSlinky.baseui.datepickerMod.ContainerState, 
    /* currentState */ typingsSlinky.baseui.datepickerMod.ContainerState, 
    typingsSlinky.baseui.datepickerMod.ContainerState
  ]
  
  type StatefulDatepickerProps[T] = T with typingsSlinky.baseui.datepickerMod.StatefulContainerProps[T] with typingsSlinky.baseui.anon.Children[T]
  
  type onChange = js.Function1[/* args */ typingsSlinky.baseui.anon.Date, js.Any]
}
