package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.anon.Body
import typingsSlinky.std.Extract
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  
  def apply(node: Extract[Node, Body]): BlockStatement_ = js.native
  def apply[K /* <: /* keyof std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Body> */ String */](node: Extract[Node, Record[K, BlockStatement_ | Statement | Expression]], key: K): BlockStatement_ = js.native
}
