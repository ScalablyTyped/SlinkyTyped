package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.Method
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `422`[TState] extends js.Object {
  
  var enter: js.UndefOr[AncestorFunction[Method, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[Method, TState]] = js.native
}
object `422` {
  
  @scala.inline
  def apply[TState](): `422`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`422`[TState]]
  }
  
  @scala.inline
  implicit class `422Ops`[Self <: `422`[_], TState] (val x: Self with `422`[TState]) extends AnyVal {
    
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
    def setEnter(value: (/* node */ NodeType[Method], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Method], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
