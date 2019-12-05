package typingsSlinky.atBabelTypes.atBabelTypesMod

import typingsSlinky.atBabelTypes.Anon_Body
import typingsSlinky.std.Extract
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  def apply(node: Extract[Node, Anon_Body]): BlockStatement = js.native
  def apply[K /* <: String */](node: Extract[Node, Record[K, BlockStatement | Statement | Expression]], key: K): BlockStatement = js.native
}

