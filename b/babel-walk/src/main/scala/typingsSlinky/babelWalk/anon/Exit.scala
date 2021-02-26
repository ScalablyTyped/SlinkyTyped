package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSArrayType
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exit[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.native
}
object Exit {
  
  @scala.inline
  def apply[TState](): Exit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit[TState]]
  }
  
  @scala.inline
  implicit class ExitMutableBuilder[Self <: Exit[_], TState] (val x: Self with Exit[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
