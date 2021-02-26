package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.JSXElement
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `484`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXElement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[JSXElement, TState]] = js.native
}
object `484` {
  
  @scala.inline
  def apply[TState](): `484`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`484`[TState]]
  }
  
  @scala.inline
  implicit class `484MutableBuilder`[Self <: `484`[_], TState] (val x: Self with `484`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXElement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXElement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
