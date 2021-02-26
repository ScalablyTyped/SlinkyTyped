package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.DebuggerStatement
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `158`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DebuggerStatement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DebuggerStatement, TState]] = js.native
}
object `158` {
  
  @scala.inline
  def apply[TState](): `158`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`158`[TState]]
  }
  
  @scala.inline
  implicit class `158MutableBuilder`[Self <: `158`[_], TState] (val x: Self with `158`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DebuggerStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DebuggerStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
