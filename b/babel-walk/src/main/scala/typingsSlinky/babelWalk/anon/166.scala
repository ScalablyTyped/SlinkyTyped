package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.TSExportAssignment
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `166`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExportAssignment, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSExportAssignment, TState]] = js.native
}
object `166` {
  
  @scala.inline
  def apply[TState](): `166`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`166`[TState]]
  }
  
  @scala.inline
  implicit class `166MutableBuilder`[Self <: `166`[_], TState] (val x: Self with `166`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSExportAssignment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSExportAssignment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
