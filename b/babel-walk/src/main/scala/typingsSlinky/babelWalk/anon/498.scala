package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ExpressionWrapper
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `498`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ExpressionWrapper, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ExpressionWrapper, TState]] = js.native
}
object `498` {
  
  @scala.inline
  def apply[TState](): `498`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`498`[TState]]
  }
  
  @scala.inline
  implicit class `498MutableBuilder`[Self <: `498`[_], TState] (val x: Self with `498`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ExpressionWrapper], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ExpressionWrapper], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
