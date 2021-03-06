package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.VariableDeclaration
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `75`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VariableDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[VariableDeclaration, TState]] = js.native
}
object `75` {
  
  @scala.inline
  def apply[TState](): `75`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`75`[TState]]
  }
  
  @scala.inline
  implicit class `75MutableBuilder`[Self <: `75`[_], TState] (val x: Self with `75`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[VariableDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[VariableDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
