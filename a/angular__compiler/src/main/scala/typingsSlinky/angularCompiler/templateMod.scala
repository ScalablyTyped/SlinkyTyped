package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.angularCompilerBooleans.`true`
import typingsSlinky.angularCompiler.astMod.AstMemoryEfficientTransformer
import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import typingsSlinky.angularCompiler.constantPoolMod.ConstantPool
import typingsSlinky.angularCompiler.contextMod.I18nContext
import typingsSlinky.angularCompiler.coreMod.RenderFlags
import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.expressionConverterMod.LocalResolver
import typingsSlinky.angularCompiler.i18nAstMod.I18nMeta
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.mlParserLexerMod.LexerRange
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalExpr
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.outputAstMod.FunctionExpr
import typingsSlinky.angularCompiler.outputAstMod.IfStmt_
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import typingsSlinky.angularCompiler.r3AstMod.Node
import typingsSlinky.angularCompiler.r3AstMod.Variable
import typingsSlinky.angularCompiler.r3AstMod.Visitor
import typingsSlinky.angularCompiler.selectorMod.CssSelector
import typingsSlinky.angularCompiler.selectorMod.SelectorMatcher
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
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
  object BindingScope {
    
    @JSImport("@angular/compiler/src/render3/view/template", "BindingScope.createRootScope")
    @js.native
    def createRootScope(): BindingScope = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/template", "LEADING_TRIVIA_CHARS")
  @js.native
  val LEADING_TRIVIA_CHARS: js.Array[String] = js.native
  
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
      _constants: js.UndefOr[ComponentDefConsts]
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
    
    def getConsts(): ComponentDefConsts = js.native
    
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
    
    var i18nGenerateMainBlockVar: js.Any = js.native
    
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
  
  @JSImport("@angular/compiler/src/render3/view/template", "ValueConverter")
  @js.native
  class ValueConverter protected () extends AstMemoryEfficientTransformer {
    def this(
      constantPool: ConstantPool,
      allocateSlot: js.Function0[Double],
      allocatePureFunctionSlots: js.Function1[/* numSlots */ Double, Double],
      definePipe: js.Function4[
            /* name */ String, 
            /* localName */ String, 
            /* slot */ Double, 
            /* value */ Expression, 
            Unit
          ]
    ) = this()
    
    var _pipeBindExprs: js.Any = js.native
    
    var allocatePureFunctionSlots: js.Any = js.native
    
    var allocateSlot: js.Any = js.native
    
    var constantPool: js.Any = js.native
    
    var definePipe: js.Any = js.native
    
    def updatePipeSlotOffsets(bindingSlots: Double): Unit = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/template", "createCssSelector")
  @js.native
  def createCssSelector(elementName: String, attributes: StringDictionary[String]): CssSelector = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "getTranslationDeclStmts")
  @js.native
  def getTranslationDeclStmts(message: Message, variable: ReadVarExpr, closureVar: ReadVarExpr): js.Array[Statement] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "getTranslationDeclStmts")
  @js.native
  def getTranslationDeclStmts(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: js.UndefOr[scala.Nothing],
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): js.Array[Statement] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "getTranslationDeclStmts")
  @js.native
  def getTranslationDeclStmts(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "getTranslationDeclStmts")
  @js.native
  def getTranslationDeclStmts(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression],
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): js.Array[Statement] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "makeBindingParser")
  @js.native
  def makeBindingParser(): BindingParser = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "makeBindingParser")
  @js.native
  def makeBindingParser(interpolationConfig: InterpolationConfig): BindingParser = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "parseTemplate")
  @js.native
  def parseTemplate(template: String, templateUrl: String): ParsedTemplate = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "parseTemplate")
  @js.native
  def parseTemplate(template: String, templateUrl: String, options: ParseTemplateOptions): ParsedTemplate = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
  @js.native
  def prepareEventListenerParameters(eventAst: BoundEvent): js.Array[Expression] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
  @js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: js.UndefOr[scala.Nothing], scope: BindingScope): js.Array[Expression] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
  @js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: String): js.Array[Expression] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
  @js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: String, scope: BindingScope): js.Array[Expression] = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
  @js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: Null, scope: BindingScope): js.Array[Expression] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "renderFlagCheckIfStmt")
  @js.native
  def renderFlagCheckIfStmt(flags: RenderFlags, statements: js.Array[Statement]): IfStmt_ = js.native
  
  @JSImport("@angular/compiler/src/render3/view/template", "resolveSanitizationFn")
  @js.native
  def resolveSanitizationFn(context: SecurityContext): ExternalExpr | Null = js.native
  @JSImport("@angular/compiler/src/render3/view/template", "resolveSanitizationFn")
  @js.native
  def resolveSanitizationFn(context: SecurityContext, isAttribute: Boolean): ExternalExpr | Null = js.native
  
  /**
    * This is used when one refers to variable such as: 'let abc = nextContext(2).$implicit`.
    * - key to the map is the string literal `"abc"`.
    * - value `retrievalLevel` is the level from which this value can be retrieved, which is 2 levels
    * up in example.
    * - value `lhs` is the left hand side which is an AST representing `abc`.
    * - value `declareLocalCallback` is a callback that is invoked when declaring the local.
    * - value `declare` is true if this value needs to be declared.
    * - value `localRef` is true if we are storing a local reference
    * - value `priority` dictates the sorting priority of this var declaration compared
    * to other var declarations on the same retrieval level. For example, if there is a
    * context variable and a local ref accessing the same parent view, the context var
    * declaration should always come before the local ref declaration.
    */
  @js.native
  trait BindingData extends StObject {
    
    var declare: Boolean = js.native
    
    var declareLocalCallback: js.UndefOr[DeclareLocalVarCallback] = js.native
    
    var lhs: Expression = js.native
    
    var localRef: Boolean = js.native
    
    var priority: Double = js.native
    
    var retrievalLevel: Double = js.native
  }
  object BindingData {
    
    @scala.inline
    def apply(declare: Boolean, lhs: Expression, localRef: Boolean, priority: Double, retrievalLevel: Double): BindingData = {
      val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], localRef = localRef.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], retrievalLevel = retrievalLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingData]
    }
    
    @scala.inline
    implicit class BindingDataMutableBuilder[Self <: BindingData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclareLocalCallback(value: (/* scope */ BindingScope, /* relativeLevel */ Double) => js.Array[Statement]): Self = StObject.set(x, "declareLocalCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeclareLocalCallbackUndefined: Self = StObject.set(x, "declareLocalCallback", js.undefined)
      
      @scala.inline
      def setLhs(value: Expression): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalRef(value: Boolean): Self = StObject.set(x, "localRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetrievalLevel(value: Double): Self = StObject.set(x, "retrievalLevel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentDefConsts extends StObject {
    
    var constExpressions: js.Array[Expression] = js.native
    
    var prepareStatements: js.Array[Statement] = js.native
  }
  object ComponentDefConsts {
    
    @scala.inline
    def apply(constExpressions: js.Array[Expression], prepareStatements: js.Array[Statement]): ComponentDefConsts = {
      val __obj = js.Dynamic.literal(constExpressions = constExpressions.asInstanceOf[js.Any], prepareStatements = prepareStatements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDefConsts]
    }
    
    @scala.inline
    implicit class ComponentDefConstsMutableBuilder[Self <: ComponentDefConsts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstExpressions(value: js.Array[Expression]): Self = StObject.set(x, "constExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstExpressionsVarargs(value: Expression*): Self = StObject.set(x, "constExpressions", js.Array(value :_*))
      
      @scala.inline
      def setPrepareStatements(value: js.Array[Statement]): Self = StObject.set(x, "prepareStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepareStatementsVarargs(value: Statement*): Self = StObject.set(x, "prepareStatements", js.Array(value :_*))
    }
  }
  
  type DeclareLocalVarCallback = js.Function2[/* scope */ BindingScope, /* relativeLevel */ Double, js.Array[Statement]]
  
  @js.native
  trait ParseTemplateOptions extends StObject {
    
    /**
      * Render `$localize` message ids with additional legacy message ids.
      *
      * This option defaults to `true` but in the future the defaul will be flipped.
      *
      * For now set this option to false if you have migrated the translation files to use the new
      * `$localize` message id format and you are not using compile time translation merging.
      */
    var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.native
    
    /**
      * If this text is stored in a JavaScript string, then we have to deal with escape sequences.
      *
      * **Example 1:**
      *
      * ```
      * "abc\"def\nghi"
      * ```
      *
      * - The `\"` must be converted to `"`.
      * - The `\n` must be converted to a new line character in a token,
      *   but it should not increment the current line for source mapping.
      *
      * **Example 2:**
      *
      * ```
      * "abc\
      *  def"
      * ```
      *
      * The line continuation (`\` followed by a newline) should be removed from a token
      * but the new line should increment the current line for source mapping.
      */
    var escapedString: js.UndefOr[Boolean] = js.native
    
    /**
      * If this text is stored in an external template (e.g. via `templateUrl`) then we need to decide
      * whether or not to normalize the line-endings (from `\r\n` to `\n`) when processing ICU
      * expressions.
      *
      * If `true` then we will normalize ICU expression line endings.
      * The default is `false`, but this will be switched in a future major release.
      */
    var i18nNormalizeLineEndingsInICUs: js.UndefOr[Boolean] = js.native
    
    /**
      * How to parse interpolation markers.
      */
    var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
    
    /**
      * An array of characters that should be considered as leading trivia.
      * Leading trivia are characters that are not important to the developer, and so should not be
      * included in source-map segments.  A common example is whitespace.
      */
    var leadingTriviaChars: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Include whitespace nodes in the parsed output.
      */
    var preserveWhitespaces: js.UndefOr[Boolean] = js.native
    
    /**
      * The start and end point of the text to parse within the `source` string.
      * The entire `source` string is parsed if this is not provided.
      * */
    var range: js.UndefOr[LexerRange] = js.native
  }
  object ParseTemplateOptions {
    
    @scala.inline
    def apply(): ParseTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseTemplateOptions]
    }
    
    @scala.inline
    implicit class ParseTemplateOptionsMutableBuilder[Self <: ParseTemplateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableI18nLegacyMessageIdFormatUndefined: Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", js.undefined)
      
      @scala.inline
      def setEscapedString(value: Boolean): Self = StObject.set(x, "escapedString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapedStringUndefined: Self = StObject.set(x, "escapedString", js.undefined)
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nNormalizeLineEndingsInICUsUndefined: Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", js.undefined)
      
      @scala.inline
      def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
      
      @scala.inline
      def setLeadingTriviaChars(value: js.Array[String]): Self = StObject.set(x, "leadingTriviaChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingTriviaCharsUndefined: Self = StObject.set(x, "leadingTriviaChars", js.undefined)
      
      @scala.inline
      def setLeadingTriviaCharsVarargs(value: String*): Self = StObject.set(x, "leadingTriviaChars", js.Array(value :_*))
      
      @scala.inline
      def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
      
      @scala.inline
      def setRange(value: LexerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  @js.native
  trait ParsedTemplate extends StObject {
    
    /**
      * Any errors from parsing the template the first time.
      *
      * `null` if there are no errors. Otherwise, the array of errors is guaranteed to be non-empty.
      */
    var errors: js.Array[ParseError] | Null = js.native
    
    /**
      * How to parse interpolation markers.
      */
    var interpolationConfig: js.UndefOr[InterpolationConfig] = js.native
    
    /**
      * Any ng-content selectors extracted from the template.
      */
    var ngContentSelectors: js.Array[String] = js.native
    
    /**
      * The template AST, parsed from the template.
      */
    var nodes: js.Array[Node] = js.native
    
    /**
      * Include whitespace nodes in the parsed output.
      */
    var preserveWhitespaces: js.UndefOr[Boolean] = js.native
    
    /**
      * Any styleUrls extracted from the metadata.
      */
    var styleUrls: js.Array[String] = js.native
    
    /**
      * Any inline styles extracted from the metadata.
      */
    var styles: js.Array[String] = js.native
    
    /**
      * The string contents of the template.
      *
      * This is the "logical" template string, after expansion of any escaped characters (for inline
      * templates). This may differ from the actual template bytes as they appear in the .ts file.
      */
    var template: String = js.native
  }
  object ParsedTemplate {
    
    @scala.inline
    def apply(
      ngContentSelectors: js.Array[String],
      nodes: js.Array[Node],
      styleUrls: js.Array[String],
      styles: js.Array[String],
      template: String
    ): ParsedTemplate = {
      val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTemplate]
    }
    
    @scala.inline
    implicit class ParsedTemplateMutableBuilder[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      @scala.inline
      def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setInterpolationConfig(value: InterpolationConfig): Self = StObject.set(x, "interpolationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationConfigUndefined: Self = StObject.set(x, "interpolationConfig", js.undefined)
      
      @scala.inline
      def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
      
      @scala.inline
      def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
