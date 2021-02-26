package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.SwitchStatement
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `49`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SwitchStatement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[SwitchStatement, TState]] = js.native
}
object `49` {
  
  @scala.inline
  def apply[TState](): `49`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`[TState]]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`[_], TState] (val x: Self with `49`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[SwitchStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[SwitchStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
