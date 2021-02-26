package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.DeclareVariable
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `495`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[DeclareVariable, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[DeclareVariable, TState]] = js.native
}
object `495` {
  
  @scala.inline
  def apply[TState](): `495`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`495`[TState]]
  }
  
  @scala.inline
  implicit class `495MutableBuilder`[Self <: `495`[_], TState] (val x: Self with `495`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareVariable], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareVariable], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
