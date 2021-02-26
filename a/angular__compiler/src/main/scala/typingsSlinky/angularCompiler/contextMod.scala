package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/context", "I18nContext")
  @js.native
  class I18nContext protected () extends StObject {
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Double, meta: I18nMeta) = this()
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Null, meta: I18nMeta) = this()
    def this(
      index: Double,
      ref: ReadVarExpr,
      level: Double,
      templateIndex: Double,
      meta: I18nMeta,
      registry: js.Any
    ) = this()
    def this(
      index: Double,
      ref: ReadVarExpr,
      level: Double,
      templateIndex: Null,
      meta: I18nMeta,
      registry: js.Any
    ) = this()
    
    var _registry: js.Any = js.native
    
    var _unresolvedCtxCount: js.Any = js.native
    
    def appendBinding(binding: AST): Unit = js.native
    
    def appendBoundText(node: I18nMeta): Unit = js.native
    
    def appendElement(node: I18nMeta, index: Double): Unit = js.native
    def appendElement(node: I18nMeta, index: Double, closed: Boolean): Unit = js.native
    
    def appendIcu(name: String, ref: Expression): Unit = js.native
    
    def appendProjection(node: I18nMeta, index: Double): Unit = js.native
    
    var appendTag: js.Any = js.native
    
    def appendTemplate(node: I18nMeta, index: Double): Unit = js.native
    
    var bindings: Set[AST] = js.native
    
    /**
      * Generates an instance of a child context based on the root one,
      * when we enter a nested template within I18n section.
      *
      * @param index Instruction index of corresponding i18nStart, which initiates this context
      * @param templateIndex Instruction index of a template which this context belongs to
      * @param meta Meta information (id, meaning, description, etc) associated with this context
      *
      * @returns I18nContext instance
      */
    def forkChildContext(index: Double, templateIndex: Double, meta: I18nMeta): I18nContext = js.native
    
    def getSerializedPlaceholders(): Map[String, js.Array[_]] = js.native
    
    def icus: js.Any = js.native
    
    val id: Double = js.native
    
    val index: Double = js.native
    
    var isEmitted: Boolean = js.native
    
    def isResolved: Boolean = js.native
    
    def isRoot: Boolean = js.native
    
    val level: Double = js.native
    
    val meta: I18nMeta = js.native
    
    var placeholders: Map[String, js.Array[_]] = js.native
    
    /**
      * Reconciles child context into parent one once the end of the i18n block is reached (i18nEnd).
      *
      * @param context Child I18nContext instance to be reconciled with parent context.
      */
    def reconcileChildContext(context: I18nContext): Unit = js.native
    
    val ref: ReadVarExpr = js.native
    
    var registry: js.Any = js.native
    
    val templateIndex: Double | Null = js.native
  }
}
