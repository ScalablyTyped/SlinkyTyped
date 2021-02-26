package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ThrowStatement
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `447`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ThrowStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ThrowStatement, TState]] = js.native
}
object `447` {
  
  @scala.inline
  def apply[TState](): `447`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`447`[TState]]
  }
  
  @scala.inline
  implicit class `447MutableBuilder`[Self <: `447`[_], TState] (val x: Self with `447`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ThrowStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ThrowStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
