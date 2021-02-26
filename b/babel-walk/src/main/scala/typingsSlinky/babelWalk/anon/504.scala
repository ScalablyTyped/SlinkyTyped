package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.ForStatement
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `504`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ForStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ForStatement, TState]] = js.native
}
object `504` {
  
  @scala.inline
  def apply[TState](): `504`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`504`[TState]]
  }
  
  @scala.inline
  implicit class `504MutableBuilder`[Self <: `504`[_], TState] (val x: Self with `504`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ForStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ForStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
