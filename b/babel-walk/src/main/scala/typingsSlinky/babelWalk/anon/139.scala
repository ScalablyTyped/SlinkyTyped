package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.ModuleDeclaration
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `139`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ModuleDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ModuleDeclaration, TState]] = js.native
}
object `139` {
  
  @scala.inline
  def apply[TState](): `139`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`139`[TState]]
  }
  
  @scala.inline
  implicit class `139MutableBuilder`[Self <: `139`[_], TState] (val x: Self with `139`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ModuleDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ModuleDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
