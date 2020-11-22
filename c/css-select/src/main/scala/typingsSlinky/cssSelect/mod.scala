package typingsSlinky.cssSelect

import typingsSlinky.cssSelect.filtersMod.Filter
import typingsSlinky.cssSelect.pseudosMod.Pseudo
import typingsSlinky.cssSelect.typesMod.Adapter
import typingsSlinky.cssSelect.typesMod.CompiledQuery
import typingsSlinky.cssSelect.typesMod.InternalSelector
import typingsSlinky.cssSelect.typesMod.Options
import typingsSlinky.cssSelect.typesMod.Query
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: js.UndefOr[scala.Nothing], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  def compile[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  @JSName("_compileToken")
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]]): CompiledQuery[ElementNode] = js.native
  @JSName("_compileToken")
  def compileToken[Node_1, ElementNode /* <: Node_1 */](
    selector: js.Array[js.Array[InternalSelector]],
    options: js.UndefOr[scala.Nothing],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  @JSName("_compileToken")
  def compileToken[Node_1, ElementNode /* <: Node_1 */](selector: js.Array[js.Array[InternalSelector]], options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSName("_compileToken")
  def compileToken[Node_1, ElementNode /* <: Node_1 */](
    selector: js.Array[js.Array[InternalSelector]],
    options: Options[ElementNode, ElementNode],
    context: js.Array[ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  
  @JSName("_compileUnsafe")
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String): CompiledQuery[ElementNode] = js.native
  @JSName("_compileUnsafe")
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: js.UndefOr[scala.Nothing], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSName("_compileUnsafe")
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode]): CompiledQuery[ElementNode] = js.native
  @JSName("_compileUnsafe")
  def compileUnsafe[Node_1, ElementNode /* <: Node_1 */](selector: String, options: Options[ElementNode, ElementNode], context: js.Array[ElementNode]): CompiledQuery[ElementNode] = js.native
  
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = js.native
  def default[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  
  val filters: Record[String, Filter] = js.native
  
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode]): Boolean = js.native
  def is[Node, ElementNode /* <: Node */](elem: ElementNode, query: Query[ElementNode], options: Options[Node, ElementNode]): Boolean = js.native
  
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode]): js.Array[Node] = js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: ElementNode, adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode]): js.Array[Node] = js.native
  def prepareContext[Node, ElementNode /* <: Node */](elems: js.Array[ElementNode], adapter: Adapter[Node, ElementNode], shouldTestNextSiblings: Boolean): js.Array[Node] = js.native
  
  val pseudos: Record[String, Pseudo] = js.native
  
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): js.Array[ElementNode] = js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): js.Array[ElementNode] = js.native
  def selectAll[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): js.Array[ElementNode] = js.native
  
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode): ElementNode | Null = js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: ElementNode, options: Options[Node_1, ElementNode]): ElementNode | Null = js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode]): ElementNode | Null = js.native
  def selectOne[Node_1, ElementNode /* <: Node_1 */](query: Query[ElementNode], elements: js.Array[ElementNode], options: Options[Node_1, ElementNode]): ElementNode | Null = js.native
}
