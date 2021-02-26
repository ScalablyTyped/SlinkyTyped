package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.MemberExpression
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `66`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[MemberExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[MemberExpression, TState]] = js.native
}
object `66` {
  
  @scala.inline
  def apply[TState](): `66`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`66`[TState]]
  }
  
  @scala.inline
  implicit class `66MutableBuilder`[Self <: `66`[_], TState] (val x: Self with `66`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[MemberExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[MemberExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
