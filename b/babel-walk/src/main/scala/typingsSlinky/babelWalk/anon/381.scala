package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.JSXIdentifier
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `381`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXIdentifier, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[JSXIdentifier, TState]] = js.native
}
object `381` {
  
  @scala.inline
  def apply[TState](): `381`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`381`[TState]]
  }
  
  @scala.inline
  implicit class `381MutableBuilder`[Self <: `381`[_], TState] (val x: Self with `381`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXIdentifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXIdentifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
