package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.DeclareModule
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `326`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[DeclareModule, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[DeclareModule, TState]] = js.native
}
object `326` {
  
  @scala.inline
  def apply[TState](): `326`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`326`[TState]]
  }
  
  @scala.inline
  implicit class `326MutableBuilder`[Self <: `326`[_], TState] (val x: Self with `326`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareModule], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareModule], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
