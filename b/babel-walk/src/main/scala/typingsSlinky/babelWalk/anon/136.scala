package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.ObjectExpression
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `136`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ObjectExpression, TState]] = js.native
}
object `136` {
  
  @scala.inline
  def apply[TState](): `136`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`136`[TState]]
  }
  
  @scala.inline
  implicit class `136MutableBuilder`[Self <: `136`[_], TState] (val x: Self with `136`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
