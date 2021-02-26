package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.Property
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `163`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Property, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Property, TState]] = js.native
}
object `163` {
  
  @scala.inline
  def apply[TState](): `163`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`163`[TState]]
  }
  
  @scala.inline
  implicit class `163MutableBuilder`[Self <: `163`[_], TState] (val x: Self with `163`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Property], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Property], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
