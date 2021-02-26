package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSUnionType
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `101`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSUnionType, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSUnionType, TState]] = js.native
}
object `101` {
  
  @scala.inline
  def apply[TState](): `101`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`101`[TState]]
  }
  
  @scala.inline
  implicit class `101MutableBuilder`[Self <: `101`[_], TState] (val x: Self with `101`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSUnionType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSUnionType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
