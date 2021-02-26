package typingsSlinky.babelWalk.anon

import typingsSlinky.babelWalk.babelWalkStrings.PipelinePrimaryTopicReference
import typingsSlinky.babelWalk.mod.NodeType
import typingsSlinky.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `35`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PipelinePrimaryTopicReference, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[PipelinePrimaryTopicReference, TState]] = js.native
}
object `35` {
  
  @scala.inline
  def apply[TState](): `35`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`35`[TState]]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`[_], TState] (val x: Self with `35`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
