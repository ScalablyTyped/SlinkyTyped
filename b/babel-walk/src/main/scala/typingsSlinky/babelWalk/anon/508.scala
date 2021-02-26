package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ClassProperty
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `508`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ClassProperty, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ClassProperty, TState]] = js.native
}
object `508` {
  
  @scala.inline
  def apply[TState](): `508`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`508`[TState]]
  }
  
  @scala.inline
  implicit class `508MutableBuilder`[Self <: `508`[_], TState] (val x: Self with `508`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
