package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ObjectProperty
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `452`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ObjectProperty, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ObjectProperty, TState]] = js.native
}
object `452` {
  
  @scala.inline
  def apply[TState](): `452`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`452`[TState]]
  }
  
  @scala.inline
  implicit class `452MutableBuilder`[Self <: `452`[_], TState] (val x: Self with `452`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
