package typingsSlinky.angularCompiler.templateMod

import typingsSlinky.angularCompiler.constantPoolMod.ConstantPool
import typingsSlinky.angularCompiler.contextMod.I18nContext
import typingsSlinky.angularCompiler.expressionConverterMod.LocalResolver
import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.outputAstMod.FunctionExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.angularCompiler.r3AstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.Variable
import typingsSlinky.angularCompiler.r3AstMod.Visitor
import typingsSlinky.angularCompiler.selectorMod.SelectorMatcher
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/template", "TemplateDefinitionBuilder")
@js.native
class TemplateDefinitionBuilder protected ()
  extends Visitor[Unit]
     with LocalResolver {
  def this(
    constantPool: ConstantPool,
    parentBindingScope: BindingScope,
    level: Double,
    contextName: String | Null,
    i18nContext: I18nContext | Null,
    templateIndex: Double | Null,
    templateName: String | Null,
    directiveMatcher: SelectorMatcher[_] | Null,
    directives: Set[Expression],
    pipeTypeByName: Map[String, Expression],
    pipes: Set[Expression],
    _namespace: ExternalReference,
    relativeContextFilePath: String,
    i18nUseExternalIds: Boolean,
    _constants: js.UndefOr[js.Array[Expression]]
  ) = this()
  
  var _bindingContext: js.Any = js.native
  
  /**
    * This scope contains local variables declared in the update mode block of the template.
    * (e.g. refs and context vars in bindings)
    */
  var _bindingScope: js.Any = js.native
  
  var _bindingSlots: js.Any = js.native
  
  var _constants: js.Any = js.native
  
  /**
    * List of callbacks to generate creation mode instructions. We store them here as we process
    * the template so bindings in listeners are resolved only once all nodes have been visited.
    * This ensures all local refs and context variables are available for matching.
    */
  var _creationCodeFns: js.Any = js.native
  
  /** Index of the currently-selected node. */
  var _currentIndex: js.Any = js.native
  
  var _dataIndex: js.Any = js.native
  
  var _implicitReceiverExpr: js.Any = js.native
  
  var _namespace: js.Any = js.native
  
  /**
    * List of callbacks to build nested templates. Nested templates must not be visited until
    * after the parent template has finished visiting all of its nodes. This ensures that all
    * local ref bindings in nested templates are able to find local ref values if the refs
    * are defined after the template declaration.
    */
  var _nestedTemplateFns: js.Any = js.native
  
  var _ngContentReservedSlots: js.Any = js.native
  
  var _ngContentSelectorsOffset: js.Any = js.native
  
  var _prefixCode: js.Any = js.native
  
  var _pureFunctionSlots: js.Any = js.native
  
  /** Temporary variable declarations generated from visiting pipes, literals, etc. */
  var _tempVariables: js.Any = js.native
  
  var _unsupported: js.Any = js.native
  
  /**
    * List of callbacks to generate update mode instructions. We store them here as we process
    * the template so bindings are resolved only once all nodes have been visited. This ensures
    * all local refs and context variables are available for matching.
    */
  var _updateCodeFns: js.Any = js.native
  
  var _valueConverter: js.Any = js.native
  
  var addAdvanceInstructionIfNecessary: js.Any = js.native
  
  var addAttrsToConsts: js.Any = js.native
  
  var addNamespaceInstruction: js.Any = js.native
  
  var addToConsts: js.Any = js.native
  
  var allocateBindingSlots: js.Any = js.native
  
  var allocateDataSlot: js.Any = js.native
  
  var allocatePureFunctionSlots: js.Any = js.native
  
  var bindingContext: js.Any = js.native
  
  def buildTemplateFunction(nodes: js.Array[Node], variables: js.Array[Variable]): FunctionExpr = js.native
  def buildTemplateFunction(
    nodes: js.Array[Node],
    variables: js.Array[Variable],
    ngContentSelectorsOffset: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
  ): FunctionExpr = js.native
  def buildTemplateFunction(nodes: js.Array[Node], variables: js.Array[Variable], ngContentSelectorsOffset: Double): FunctionExpr = js.native
  def buildTemplateFunction(
    nodes: js.Array[Node],
    variables: js.Array[Variable],
    ngContentSelectorsOffset: Double,
    i18n: I18nMeta
  ): FunctionExpr = js.native
  
  var constantPool: js.Any = js.native
  
  var contextName: js.Any = js.native
  
  var convertPropertyBinding: js.Any = js.native
  
  var creationInstruction: js.Any = js.native
  
  var creationInstructionChain: js.Any = js.native
  
  var directiveMatcher: js.Any = js.native
  
  var directives: js.Any = js.native
  
  var fileBasedI18nSuffix: js.Any = js.native
  
  /**
    * Prepares all attribute expression values for the `TAttributes` array.
    *
    * The purpose of this function is to properly construct an attributes array that
    * is passed into the `elementStart` (or just `element`) functions. Because there
    * are many different types of attributes, the array needs to be constructed in a
    * special way so that `elementStart` can properly evaluate them.
    *
    * The format looks like this:
    *
    * ```
    * attrs = [prop, value, prop2, value2,
    *   PROJECT_AS, selector,
    *   CLASSES, class1, class2,
    *   STYLES, style1, value1, style2, value2,
    *   BINDINGS, name1, name2, name3,
    *   TEMPLATE, name4, name5, name6,
    *   I18N, name7, name8, ...]
    * ```
    *
    * Note that this function will fully ignore all synthetic (@foo) attribute values
    * because those values are intended to always be generated as property instructions.
    */
  var getAttributeExpressions: js.Any = js.native
  
  def getConstCount(): Double = js.native
  
  def getConsts(): js.Array[Expression] = js.native
  
  /**
    * Gets an expression that refers to the implicit receiver. The implicit
    * receiver is always the root level context.
    */
  var getImplicitReceiverExpr: js.Any = js.native
  
  var getNamespaceInstruction: js.Any = js.native
  
  def getNgContentSelectors(): Expression | Null = js.native
  
  /**
    * Gets a list of argument expressions to pass to an update instruction expression. Also updates
    * the temp variables state with temp variables that were identified as needing to be created
    * while visiting the arguments.
    * @param value The original expression we will be resolving an arguments list from.
    */
  var getUpdateInstructionArguments: js.Any = js.native
  
  def getVarCount(): Double = js.native
  
  var i18n: js.Any = js.native
  
  var i18nAppendBindings: js.Any = js.native
  
  var i18nAttributesInstruction: js.Any = js.native
  
  var i18nBindProps: js.Any = js.native
  
  var i18nContext: js.Any = js.native
  
  var i18nEnd: js.Any = js.native
  
  var i18nGenerateClosureVar: js.Any = js.native
  
  var i18nStart: js.Any = js.native
  
  var i18nTranslate: js.Any = js.native
  
  var i18nUpdateRef: js.Any = js.native
  
  var i18nUseExternalIds: js.Any = js.native
  
  var instructionFn: js.Any = js.native
  
  /**
    * Adds an update instruction for an interpolated property or attribute, such as
    * `prop="{{value}}"` or `attr.title="{{value}}"`
    */
  var interpolatedUpdateInstruction: js.Any = js.native
  
  var level: js.Any = js.native
  
  var matchDirectives: js.Any = js.native
  
  var pipeTypeByName: js.Any = js.native
  
  var pipes: js.Any = js.native
  
  var prepareListenerParameter: js.Any = js.native
  
  var prepareRefsArray: js.Any = js.native
  
  var processStylingUpdateInstruction: js.Any = js.native
  
  var registerContextVariables: js.Any = js.native
  
  var templateIndex: js.Any = js.native
  
  var templateName: js.Any = js.native
  
  var templatePropertyBindings: js.Any = js.native
  
  var updateInstruction: js.Any = js.native
  
  var updateInstructionChain: js.Any = js.native
  
  var updateInstructionChainWithAdvance: js.Any = js.native
  
  var updateInstructionWithAdvance: js.Any = js.native
  
  def visitBoundAttribute[T](arg: Expression): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: Statement): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: Node): scala.Nothing = js.native
  
  def visitBoundEvent[T](arg: Expression): scala.Nothing = js.native
  def visitBoundEvent[T](arg: Statement): scala.Nothing = js.native
  def visitBoundEvent[T](arg: Node): scala.Nothing = js.native
  
  def visitReference[T](arg: Expression): scala.Nothing = js.native
  def visitReference[T](arg: Statement): scala.Nothing = js.native
  def visitReference[T](arg: Node): scala.Nothing = js.native
  
  def visitTextAttribute[T](arg: Expression): scala.Nothing = js.native
  def visitTextAttribute[T](arg: Statement): scala.Nothing = js.native
  def visitTextAttribute[T](arg: Node): scala.Nothing = js.native
  
  def visitVariable[T](arg: Expression): scala.Nothing = js.native
  def visitVariable[T](arg: Statement): scala.Nothing = js.native
  def visitVariable[T](arg: Node): scala.Nothing = js.native
}
