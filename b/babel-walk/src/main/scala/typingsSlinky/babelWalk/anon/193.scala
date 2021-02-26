package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.Class
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `193`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Class, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Class, TState]] = js.native
}
object `193` {
  
  @scala.inline
  def apply[TState](): `193`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`193`[TState]]
  }
  
  @scala.inline
  implicit class `193MutableBuilder`[Self <: `193`[_], TState] (val x: Self with `193`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Class], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Class], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
