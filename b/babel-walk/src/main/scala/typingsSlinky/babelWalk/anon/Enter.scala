package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.ClassExpression
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enter[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.native
}
object Enter {
  
  @scala.inline
  def apply[TState](): Enter[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter[TState]]
  }
  
  @scala.inline
  implicit class EnterMutableBuilder[Self <: Enter[_], TState] (val x: Self with Enter[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
