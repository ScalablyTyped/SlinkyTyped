package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.Literal
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `459`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Literal, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[Literal, TState]] = js.native
}
object `459` {
  
  @scala.inline
  def apply[TState](): `459`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`459`[TState]]
  }
  
  @scala.inline
  implicit class `459MutableBuilder`[Self <: `459`[_], TState] (val x: Self with `459`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Literal], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Literal], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
