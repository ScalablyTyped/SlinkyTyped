package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.TSVoidKeyword
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `351`[TState] extends js.Object {
  
  var enter: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.native
}
object `351` {
  
  @scala.inline
  def apply[TState](): `351`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`351`[TState]]
  }
  
  @scala.inline
  implicit class `351Ops`[Self <: `351`[_], TState] (val x: Self with `351`[TState]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
