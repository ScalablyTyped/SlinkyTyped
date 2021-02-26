package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.ClassImplements
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `245`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassImplements, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ClassImplements, TState]] = js.native
}
object `245` {
  
  @scala.inline
  def apply[TState](): `245`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`245`[TState]]
  }
  
  @scala.inline
  implicit class `245MutableBuilder`[Self <: `245`[_], TState] (val x: Self with `245`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassImplements], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassImplements], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
