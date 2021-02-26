package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.JSXOpeningElement
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `80`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.native
}
object `80` {
  
  @scala.inline
  def apply[TState](): `80`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`80`[TState]]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`[_], TState] (val x: Self with `80`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
