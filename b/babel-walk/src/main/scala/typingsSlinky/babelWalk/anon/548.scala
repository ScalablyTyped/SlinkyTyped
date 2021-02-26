package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ClassPrivateProperty
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `548`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ClassPrivateProperty, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ClassPrivateProperty, TState]] = js.native
}
object `548` {
  
  @scala.inline
  def apply[TState](): `548`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`548`[TState]]
  }
  
  @scala.inline
  implicit class `548MutableBuilder`[Self <: `548`[_], TState] (val x: Self with `548`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassPrivateProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassPrivateProperty], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
