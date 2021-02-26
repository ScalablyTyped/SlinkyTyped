package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.Method
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `135`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Method, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Method, TState]] = js.native
}
object `135` {
  
  @scala.inline
  def apply[TState](): `135`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`135`[TState]]
  }
  
  @scala.inline
  implicit class `135MutableBuilder`[Self <: `135`[_], TState] (val x: Self with `135`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
