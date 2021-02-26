package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.UpdateExpression
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `108`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.native
}
object `108` {
  
  @scala.inline
  def apply[TState](): `108`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`108`[TState]]
  }
  
  @scala.inline
  implicit class `108MutableBuilder`[Self <: `108`[_], TState] (val x: Self with `108`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
