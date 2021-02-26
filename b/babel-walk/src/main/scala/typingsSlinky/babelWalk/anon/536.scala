package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.TSObjectKeyword
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `536`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSObjectKeyword, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSObjectKeyword, TState]] = js.native
}
object `536` {
  
  @scala.inline
  def apply[TState](): `536`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`536`[TState]]
  }
  
  @scala.inline
  implicit class `536MutableBuilder`[Self <: `536`[_], TState] (val x: Self with `536`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSObjectKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSObjectKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
