package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ClassMethod
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `503`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ClassMethod, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ClassMethod, TState]] = js.native
}
object `503` {
  
  @scala.inline
  def apply[TState](): `503`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`503`[TState]]
  }
  
  @scala.inline
  implicit class `503MutableBuilder`[Self <: `503`[_], TState] (val x: Self with `503`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassMethod], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassMethod], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
