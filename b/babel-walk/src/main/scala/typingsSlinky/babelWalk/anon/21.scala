package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSTypeParameterDeclaration
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `21`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeParameterDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSTypeParameterDeclaration, TState]] = js.native
}
object `21` {
  
  @scala.inline
  def apply[TState](): `21`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`[TState]]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`[_], TState] (val x: Self with `21`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSTypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSTypeParameterDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
