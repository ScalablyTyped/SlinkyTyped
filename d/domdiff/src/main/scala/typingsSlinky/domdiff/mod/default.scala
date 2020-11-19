package typingsSlinky.domdiff.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domdiff", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](parentNode: Node, currentNodes: TCurrentItems, futureNodes: TFutureItems): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffNodeMarkerOptions[Node]
  ): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffOPtionsEachNodeCallbackFn
  ): Unit = js.native
  def apply[TCurrentItems /* <: js.Array[_] */, TFutureItems /* <: js.Array[_] */](
    parentNode: Node,
    currentNodes: TCurrentItems,
    futureNodes: TFutureItems,
    options: IDomDiffOptionsGenericComparisonFn
  ): Unit = js.native
}
