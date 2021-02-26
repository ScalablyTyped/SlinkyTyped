package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.TypeAnnotation
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `309`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TypeAnnotation, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TypeAnnotation, TState]] = js.native
}
object `309` {
  
  @scala.inline
  def apply[TState](): `309`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`309`[TState]]
  }
  
  @scala.inline
  implicit class `309MutableBuilder`[Self <: `309`[_], TState] (val x: Self with `309`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
