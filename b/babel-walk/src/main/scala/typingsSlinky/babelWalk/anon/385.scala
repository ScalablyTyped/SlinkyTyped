package typingsSlinky.babelWalk.anon

import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.babelWalk.babelWalkStrings.TSNamespaceExportDeclaration
import typingsSlinky.babelWalk.mod.AncestorFunction
import typingsSlinky.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `385`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSNamespaceExportDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSNamespaceExportDeclaration, TState]] = js.native
}
object `385` {
  
  @scala.inline
  def apply[TState](): `385`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`385`[TState]]
  }
  
  @scala.inline
  implicit class `385MutableBuilder`[Self <: `385`[_], TState] (val x: Self with `385`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(
      value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(
      value: (/* node */ NodeType[TSNamespaceExportDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
