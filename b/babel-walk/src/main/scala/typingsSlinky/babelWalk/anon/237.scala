package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.Private
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `237`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Private, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Private, TState]] = js.native
}
object `237` {
  
  @scala.inline
  def apply[TState](): `237`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`237`[TState]]
  }
  
  @scala.inline
  implicit class `237MutableBuilder`[Self <: `237`[_], TState] (val x: Self with `237`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Private], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Private], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
