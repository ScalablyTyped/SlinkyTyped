package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ImportSpecifier
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `411`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ImportSpecifier, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ImportSpecifier, TState]] = js.native
}
object `411` {
  
  @scala.inline
  def apply[TState](): `411`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`411`[TState]]
  }
  
  @scala.inline
  implicit class `411MutableBuilder`[Self <: `411`[_], TState] (val x: Self with `411`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ImportSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ImportSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
