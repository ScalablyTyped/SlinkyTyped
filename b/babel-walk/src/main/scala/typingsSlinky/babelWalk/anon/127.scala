package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.EnumBooleanMember
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBooleanMember, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[EnumBooleanMember, TState]] = js.native
}
object `127` {
  
  @scala.inline
  def apply[TState](): `127`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`127`[TState]]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`[_], TState] (val x: Self with `127`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumBooleanMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumBooleanMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
