package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.Block
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `527`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Block, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[Block, TState]] = js.native
}
object `527` {
  
  @scala.inline
  def apply[TState](): `527`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`527`[TState]]
  }
  
  @scala.inline
  implicit class `527MutableBuilder`[Self <: `527`[_], TState] (val x: Self with `527`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
