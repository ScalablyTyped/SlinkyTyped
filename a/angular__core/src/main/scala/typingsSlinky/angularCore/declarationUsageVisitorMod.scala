package typingsSlinky.angularCore

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Map
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/declaration_usage_visitor", JSImport.Namespace)
@js.native
object declarationUsageVisitorMod extends js.Object {
  
  @js.native
  class DeclarationUsageVisitor protected () extends js.Object {
    def this(declaration: Node, typeChecker: TypeChecker) = this()
    def this(declaration: Node, typeChecker: TypeChecker, baseContext: FunctionContext) = this()
    
    /**
      * Gets the declaration symbol of a given TypeScript node. Resolves aliased
      * symbols to the symbol containing the value declaration.
      */
    var _getDeclarationSymbolOfNode: js.Any = js.native
    
    /** Gets the symbol of the given property access expression. */
    var _getPropertyAccessSymbol: js.Any = js.native
    
    /**
      * Resolves the declaration of a given TypeScript node. For example an identifier can
      * refer to a function parameter. This parameter can then be resolved through the
      * function context.
      */
    var _resolveDeclarationOfNode: js.Any = js.native
    
    /**
      * Resolves a given node from the context. In case the node is not mapped in
      * the context, the original node is returned.
      */
    var _resolveNodeFromContext: js.Any = js.native
    
    /**
      * Updates the context to reflect the newly set parameter values. This allows future
      * references to function parameters to be resolved to the actual node through the context.
      */
    var _updateContext: js.Any = js.native
    
    var addJumpExpressionToQueue: js.Any = js.native
    
    var addNewExpressionToQueue: js.Any = js.native
    
    /**
      * Nodes which need to be checked for declaration usage but aren't
      * guaranteed to execute synchronously.
      */
    var ambiguousNodeQueue: js.Any = js.native
    
    var baseContext: js.Any = js.native
    
    /**
      * Function context that holds the TypeScript node values for all parameters
      * of the currently analyzed function block.
      */
    var context: js.Any = js.native
    
    var declaration: js.Any = js.native
    
    def getResolvedNodeUsage(searchNode: Node): ResolvedUsage = js.native
    
    var isReferringToSymbol: js.Any = js.native
    
    var isSynchronouslyUsedInNode: js.Any = js.native
    
    /**
      * Queue of nodes that need to be checked for declaration usage and
      * are guaranteed to be executed synchronously.
      */
    var nodeQueue: js.Any = js.native
    
    /**
      * Peeks into the given jump expression by adding all function like declarations
      * which are referenced in the jump expression arguments to the ambiguous node
      * queue. These arguments could technically access the given declaration but it's
      * not guaranteed that the jump expression is executed. In that case the resolved
      * usage is ambiguous.
      */
    var peekIntoJumpExpression: js.Any = js.native
    
    var typeChecker: js.Any = js.native
    
    var visitBinaryExpression: js.Any = js.native
    
    var visitPropertyAccessors: js.Any = js.native
    
    /** Set of visited symbols that caused a jump in control flow. */
    var visitedJumpExprNodes: js.Any = js.native
  }
  
  @js.native
  sealed trait ResolvedUsage extends js.Object
  @js.native
  object ResolvedUsage extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResolvedUsage with Double] = js.native
    
    @js.native
    sealed trait AMBIGUOUS extends ResolvedUsage
    /* 2 */ @js.native
    object AMBIGUOUS extends TopLevel[AMBIGUOUS with Double]
    
    @js.native
    sealed trait ASYNCHRONOUS extends ResolvedUsage
    /* 1 */ @js.native
    object ASYNCHRONOUS extends TopLevel[ASYNCHRONOUS with Double]
    
    @js.native
    sealed trait SYNCHRONOUS extends ResolvedUsage
    /* 0 */ @js.native
    object SYNCHRONOUS extends TopLevel[SYNCHRONOUS with Double]
  }
  
  type FunctionContext = Map[Node, Node]
}
