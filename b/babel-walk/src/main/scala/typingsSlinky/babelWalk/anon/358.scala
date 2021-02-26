package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.AssignmentPattern
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `358`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[AssignmentPattern, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[AssignmentPattern, TState]] = js.native
}
object `358` {
  
  @scala.inline
  def apply[TState](): `358`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`358`[TState]]
  }
  
  @scala.inline
  implicit class `358MutableBuilder`[Self <: `358`[_], TState] (val x: Self with `358`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[AssignmentPattern], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[AssignmentPattern], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
