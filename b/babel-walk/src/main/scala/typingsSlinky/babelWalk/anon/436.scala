package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.BooleanLiteral
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `436`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[BooleanLiteral, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[BooleanLiteral, TState]] = js.native
}
object `436` {
  
  @scala.inline
  def apply[TState](): `436`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`436`[TState]]
  }
  
  @scala.inline
  implicit class `436MutableBuilder`[Self <: `436`[_], TState] (val x: Self with `436`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BooleanLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BooleanLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
