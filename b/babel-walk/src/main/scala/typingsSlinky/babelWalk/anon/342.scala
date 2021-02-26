package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.SymbolTypeAnnotation
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `342`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[SymbolTypeAnnotation, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[SymbolTypeAnnotation, TState]] = js.native
}
object `342` {
  
  @scala.inline
  def apply[TState](): `342`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`342`[TState]]
  }
  
  @scala.inline
  implicit class `342MutableBuilder`[Self <: `342`[_], TState] (val x: Self with `342`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[SymbolTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[SymbolTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
