package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.LabeledStatement
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `328`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[LabeledStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[LabeledStatement, TState]] = js.native
}
object `328` {
  
  @scala.inline
  def apply[TState](): `328`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`328`[TState]]
  }
  
  @scala.inline
  implicit class `328MutableBuilder`[Self <: `328`[_], TState] (val x: Self with `328`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[LabeledStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[LabeledStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
