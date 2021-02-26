package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.BlockStatement
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `312`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[BlockStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[BlockStatement, TState]] = js.native
}
object `312` {
  
  @scala.inline
  def apply[TState](): `312`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`312`[TState]]
  }
  
  @scala.inline
  implicit class `312MutableBuilder`[Self <: `312`[_], TState] (val x: Self with `312`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BlockStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BlockStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
