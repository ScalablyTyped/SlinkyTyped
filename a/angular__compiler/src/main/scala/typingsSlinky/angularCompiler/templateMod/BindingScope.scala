package typingsSlinky.angularCompiler.templateMod

import typingsSlinky.angularCompiler.angularCompilerBooleans.`true`
import typingsSlinky.angularCompiler.expressionConverterMod.LocalResolver
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/template", "BindingScope")
@js.native
class BindingScope protected () extends LocalResolver {
  
  var bindingLevel: Double = js.native
  
  def freshReferenceName(): String = js.native
  
  def generateSharedContextVar(retrievalLevel: Double): Unit = js.native
  
  def get(name: String): Expression | Null = js.native
  
  def getComponentProperty(name: String): Expression = js.native
  
  /**
    * Gets or creates a shared context variable and returns its expression. Note that
    * this does not mean that the shared variable will be declared. Variables in the
    * binding scope will be only declared if they are used.
    */
  def getOrCreateSharedContextVar(retrievalLevel: Double): ReadVarExpr = js.native
  
  def getSharedContextName(retrievalLevel: Double): ReadVarExpr | Null = js.native
  
  def isListenerScope(): Boolean | Null = js.native
  
  /** Keeps a map from local variables to their BindingData. */
  var map: js.Any = js.native
  
  def maybeGenerateSharedContextVar(value: BindingData): Unit = js.native
  
  def maybeRestoreView(retrievalLevel: Double, localRefLookup: Boolean): Unit = js.native
  
  def nestedScope(level: Double): BindingScope = js.native
  def nestedScope(level: Double, globals: Set[String]): BindingScope = js.native
  
  var parent: js.Any = js.native
  
  var referenceNameIndex: js.Any = js.native
  
  def restoreViewStatement(): js.Array[Statement] = js.native
  
  var restoreViewVariable: js.Any = js.native
  
  /**
    * Create a local variable for later reference.
    *
    * @param retrievalLevel The level from which this value can be retrieved
    * @param name Name of the variable.
    * @param lhs AST representing the left hand side of the `let lhs = rhs;`.
    * @param priority The sorting priority of this var
    * @param declareLocalCallback The callback to invoke when declaring this local var
    * @param localRef Whether or not this is a local ref
    */
  def set(retrievalLevel: Double, name: String, lhs: Expression): BindingScope = js.native
  def set(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: js.UndefOr[scala.Nothing],
    declareLocalCallback: DeclareLocalVarCallback
  ): BindingScope = js.native
  def set(retrievalLevel: Double, name: String, lhs: Expression, priority: Double): BindingScope = js.native
  def set(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: Double,
    declareLocalCallback: DeclareLocalVarCallback
  ): BindingScope = js.native
  @JSName("set")
  def set_true(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: js.UndefOr[scala.Nothing],
    declareLocalCallback: js.UndefOr[scala.Nothing],
    localRef: `true`
  ): BindingScope = js.native
  @JSName("set")
  def set_true(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: js.UndefOr[scala.Nothing],
    declareLocalCallback: DeclareLocalVarCallback,
    localRef: `true`
  ): BindingScope = js.native
  @JSName("set")
  def set_true(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: Double,
    declareLocalCallback: js.UndefOr[scala.Nothing],
    localRef: `true`
  ): BindingScope = js.native
  @JSName("set")
  def set_true(
    retrievalLevel: Double,
    name: String,
    lhs: Expression,
    priority: Double,
    declareLocalCallback: DeclareLocalVarCallback,
    localRef: `true`
  ): BindingScope = js.native
  
  def variableDeclarations(): js.Array[Statement] = js.native
  
  def viewSnapshotStatements(): js.Array[Statement] = js.native
}
/* static members */
@JSImport("@angular/compiler/src/render3/view/template", "BindingScope")
@js.native
object BindingScope extends js.Object {
  
  def createRootScope(): BindingScope = js.native
}
