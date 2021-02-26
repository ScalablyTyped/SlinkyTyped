package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSUndefinedKeyword
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `191`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSUndefinedKeyword, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSUndefinedKeyword, TState]] = js.native
}
object `191` {
  
  @scala.inline
  def apply[TState](): `191`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`191`[TState]]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`[_], TState] (val x: Self with `191`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSUndefinedKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSUndefinedKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
