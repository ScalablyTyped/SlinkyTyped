package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSCallSignatureDeclaration
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `170`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSCallSignatureDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSCallSignatureDeclaration, TState]] = js.native
}
object `170` {
  
  @scala.inline
  def apply[TState](): `170`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`170`[TState]]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`[_], TState] (val x: Self with `170`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSCallSignatureDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSCallSignatureDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
