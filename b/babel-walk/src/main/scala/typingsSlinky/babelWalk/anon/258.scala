package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSParenthesizedType
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `258`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSParenthesizedType, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSParenthesizedType, TState]] = js.native
}
object `258` {
  
  @scala.inline
  def apply[TState](): `258`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`258`[TState]]
  }
  
  @scala.inline
  implicit class `258MutableBuilder`[Self <: `258`[_], TState] (val x: Self with `258`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSParenthesizedType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSParenthesizedType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
