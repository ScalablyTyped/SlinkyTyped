package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.CatchClause
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `200`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[CatchClause, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[CatchClause, TState]] = js.native
}
object `200` {
  
  @scala.inline
  def apply[TState](): `200`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`200`[TState]]
  }
  
  @scala.inline
  implicit class `200MutableBuilder`[Self <: `200`[_], TState] (val x: Self with `200`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[CatchClause], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[CatchClause], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
