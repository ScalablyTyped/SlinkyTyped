package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "memoization")
@js.native
object memoization extends js.Object {
  
  def memoize(callback: js.Function1[/* val */ js.Any, Unit]): js.Array[Node] = js.native
  
  def parseMemoText(memoText: String): String = js.native
  
  def unmemoize(memoId: String, callbackParams: js.Array[_]): Unit = js.native
  
  def unmemoizeDomNodeAndDescendants(domNode: Node, extraCallbackParamsArray: js.Array[_]): Unit = js.native
}
