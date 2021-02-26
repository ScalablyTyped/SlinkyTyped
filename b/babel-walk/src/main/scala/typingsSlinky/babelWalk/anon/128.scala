package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSPropertySignature
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSPropertySignature, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSPropertySignature, TState]] = js.native
}
object `128` {
  
  @scala.inline
  def apply[TState](): `128`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`128`[TState]]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`[_], TState] (val x: Self with `128`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSPropertySignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSPropertySignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
