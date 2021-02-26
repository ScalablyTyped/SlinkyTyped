package typingsSlinky.cssSelect

import typingsSlinky.cssSelect.filtersMod.Filter
import typingsSlinky.cssSelect.pseudosMod.Pseudo
import typingsSlinky.cssSelect.typesMod.CompileToken
import typingsSlinky.cssSelect.typesMod.CompiledQuery
import typingsSlinky.cssSelect.typesMod.InternalOptions
import typingsSlinky.cssWhat.parseMod.PseudoSelector
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pseudoSelectorsMod {
  
  @JSImport("css-select/lib/pseudo-selectors", "compilePseudoSelector")
  @js.native
  def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.UndefOr[scala.Nothing],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  @JSImport("css-select/lib/pseudo-selectors", "compilePseudoSelector")
  @js.native
  def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[ElementNode],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  @JSImport("css-select/lib/pseudo-selectors", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
}
