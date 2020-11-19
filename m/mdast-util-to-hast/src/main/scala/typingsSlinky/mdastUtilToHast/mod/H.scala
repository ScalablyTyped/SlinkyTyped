package typingsSlinky.mdastUtilToHast.mod

import typingsSlinky.mdast.mod.Definition
import typingsSlinky.mdastUtilDefinitions.mod.DefinitionCache
import typingsSlinky.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H extends js.Object {
  
  def apply(node: Node, tagName: String): Node = js.native
  def apply(node: Node, tagName: String, props: js.UndefOr[scala.Nothing], children: js.Array[Node]): Node = js.native
  def apply(node: Node, tagName: String, props: js.Object): Node = js.native
  def apply(node: Node, tagName: String, props: js.Object, children: js.Array[Node]): Node = js.native
  
  def augment(left: Node, right: Node): Node = js.native
  
  var dangerous: js.UndefOr[Boolean] = js.native
  
  def definition(identifier: String): Definition | Null = js.native
  @JSName("definition")
  var definition_Original: DefinitionCache = js.native
  
  var footNoteById: Definition = js.native
  
  var footnoreOrder: js.Array[String] = js.native
  
  var handlers: Handlers = js.native
  
  def unknownHandler(h: H, node: Node): js.Any = js.native
  @JSName("unknownHandler")
  var unknownHandler_Original: Handler = js.native
}
