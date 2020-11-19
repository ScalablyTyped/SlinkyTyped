package typingsSlinky.angularCompiler.t2ApiMod

import typingsSlinky.angularCompiler.anon.Directive
import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.r3AstMod.BoundAttribute
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import typingsSlinky.angularCompiler.r3AstMod.Element
import typingsSlinky.angularCompiler.r3AstMod.Reference
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.r3AstMod.TextAttribute
import typingsSlinky.angularCompiler.r3AstMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundTarget[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  
  /**
    * For a given binding, get the entity to which the binding is being made.
    *
    * This will either be a directive or the node itself.
    */
  def getConsumerOfBinding(binding: BoundAttribute): DirectiveT | Element | Template | Null = js.native
  def getConsumerOfBinding(binding: BoundEvent): DirectiveT | Element | Template | Null = js.native
  def getConsumerOfBinding(binding: TextAttribute): DirectiveT | Element | Template | Null = js.native
  
  /**
    * For a given template node (either an `Element` or a `Template`), get the set of directives
    * which matched the node, if any.
    */
  def getDirectivesOfNode(node: Element): js.Array[DirectiveT] | Null = js.native
  def getDirectivesOfNode(node: Template): js.Array[DirectiveT] | Null = js.native
  
  /**
    * If the given `AST` expression refers to a `Reference` or `Variable` within the `Target`, then
    * return that.
    *
    * Otherwise, returns `null`.
    *
    * This is only defined for `AST` expressions that read or write to a property of an
    * `ImplicitReceiver`.
    */
  def getExpressionTarget(expr: AST): Reference | Variable | Null = js.native
  
  /**
    * Get the nesting level of a particular `Template`.
    *
    * This starts at 1 for top-level `Template`s within the `Target` and increases for `Template`s
    * nested at deeper levels.
    */
  def getNestingLevel(template: Template): Double = js.native
  
  /**
    * For a given `Reference`, get the reference's target - either an `Element`, a `Template`, or
    * a directive on a particular node.
    */
  def getReferenceTarget(ref: Reference): Directive[DirectiveT] | Element | Template | Null = js.native
  
  /**
    * Given a particular `Reference` or `Variable`, get the `Template` which created it.
    *
    * All `Variable`s are defined on templates, so this will always return a value for a `Variable`
    * from the `Target`. For `Reference`s this only returns a value if the `Reference` points to a
    * `Template`. Returns `null` otherwise.
    */
  def getTemplateOfSymbol(symbol: Reference): Template | Null = js.native
  def getTemplateOfSymbol(symbol: Variable): Template | Null = js.native
  
  /**
    * Get a list of all the directives used by the target.
    */
  def getUsedDirectives(): js.Array[DirectiveT] = js.native
  
  /**
    * Get a list of all the pipes used by the target.
    */
  def getUsedPipes(): js.Array[String] = js.native
  
  /**
    * Get the original `Target` that was bound.
    */
  val target: Target = js.native
}
