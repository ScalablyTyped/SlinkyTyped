package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.TSInferType
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `399`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSInferType, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSInferType, TState]] = js.native
}
object `399` {
  
  @scala.inline
  def apply[TState](): `399`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`399`[TState]]
  }
  
  @scala.inline
  implicit class `399MutableBuilder`[Self <: `399`[_], TState] (val x: Self with `399`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSInferType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSInferType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
