package typingsSlinky.estraverse

import typingsSlinky.estraverse.estraverseStrings.iteration
import typingsSlinky.estree.mod.Comment
import typingsSlinky.estree.mod.Node
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estraverse", "Controller")
  @js.native
  class Controller () extends StObject {
    
    /**
      * Break the traversals.
      */
    def break(): Unit = js.native
    
    /**
      * The current node.
      */
    def current(): Node = js.native
    
    /**
      * Notify the controller to break the traversals, skip the child nodes of current node or remove the
      * current node.
      */
    def notify(flag: VisitorOption): Unit = js.native
    
    /**
      * An array of parent elements.
      */
    def parents(): js.Array[Node] = js.native
    
    /**
      * Obtain the property paths array from root to the current node.
      */
    def path(): (js.Array[String | Double]) | Null = js.native
    
    /**
      * Remove the current node.
      */
    def remove(): Unit = js.native
    
    /**
      * Traverse and replace the AST.
      */
    def replace(root: Node, visitor: Visitor): Node = js.native
    
    /**
      * Skip the child nodes of current node.
      */
    def skip(): Unit = js.native
    
    /**
      * Traverse the AST.
      */
    def traverse(root: Node, visitor: Visitor): Unit = js.native
    
    /**
      * The type of current node.
      */
    def `type`(): String = js.native
  }
  
  /* Inlined parent std.Record<estraverse.estraverse.NodeType, estraverse.estraverse.NodeType> */
  @js.native
  trait Syntax extends StObject {
    
    var ArrayExpression: NodeType = js.native
    
    var ArrayPattern: NodeType = js.native
    
    var ArrowFunctionExpression: NodeType = js.native
    
    var AssignmentExpression: NodeType = js.native
    
    var AssignmentPattern: NodeType = js.native
    
    var AwaitExpression: NodeType = js.native
    
    var BinaryExpression: NodeType = js.native
    
    var BlockStatement: NodeType = js.native
    
    var BreakStatement: NodeType = js.native
    
    var CallExpression: NodeType = js.native
    
    var CatchClause: NodeType = js.native
    
    var ClassBody: NodeType = js.native
    
    var ClassDeclaration: NodeType = js.native
    
    var ClassExpression: NodeType = js.native
    
    var ComprehensionBlock: NodeType = js.native
    
    var ComprehensionExpression: NodeType = js.native
    
    var ConditionalExpression: NodeType = js.native
    
    var ContinueStatement: NodeType = js.native
    
    var DebuggerStatement: NodeType = js.native
    
    var DirectiveStatement: NodeType = js.native
    
    var DoWhileStatement: NodeType = js.native
    
    var EmptyStatement: NodeType = js.native
    
    var ExportAllDeclaration: NodeType = js.native
    
    var ExportDefaultDeclaration: NodeType = js.native
    
    var ExportNamedDeclaration: NodeType = js.native
    
    var ExportSpecifier: NodeType = js.native
    
    var ExpressionStatement: NodeType = js.native
    
    var ForInStatement: NodeType = js.native
    
    var ForOfStatement: NodeType = js.native
    
    var ForStatement: NodeType = js.native
    
    var FunctionDeclaration: NodeType = js.native
    
    var FunctionExpression: NodeType = js.native
    
    var GeneratorExpression: NodeType = js.native
    
    var Identifier: NodeType = js.native
    
    var IfStatement: NodeType = js.native
    
    var ImportDeclaration: NodeType = js.native
    
    var ImportDefaultSpecifier: NodeType = js.native
    
    var ImportExpression: NodeType = js.native
    
    var ImportNamespaceSpecifier: NodeType = js.native
    
    var ImportSpecifier: NodeType = js.native
    
    var LabeledStatement: NodeType = js.native
    
    var Literal: NodeType = js.native
    
    var LogicalExpression: NodeType = js.native
    
    var MemberExpression: NodeType = js.native
    
    var MetaProperty: NodeType = js.native
    
    var MethodDefinition: NodeType = js.native
    
    var ModuleSpecifier: NodeType = js.native
    
    var NewExpression: NodeType = js.native
    
    var ObjectExpression: NodeType = js.native
    
    var ObjectPattern: NodeType = js.native
    
    var Program: NodeType = js.native
    
    var Property: NodeType = js.native
    
    var RestElement: NodeType = js.native
    
    var ReturnStatement: NodeType = js.native
    
    var SequenceExpression: NodeType = js.native
    
    var SpreadElement: NodeType = js.native
    
    var Super: NodeType = js.native
    
    var SwitchCase: NodeType = js.native
    
    var SwitchStatement: NodeType = js.native
    
    var TaggedTemplateExpression: NodeType = js.native
    
    var TemplateElement: NodeType = js.native
    
    var TemplateLiteral: NodeType = js.native
    
    var ThisExpression: NodeType = js.native
    
    var ThrowStatement: NodeType = js.native
    
    var TryStatement: NodeType = js.native
    
    var UnaryExpression: NodeType = js.native
    
    var UpdateExpression: NodeType = js.native
    
    var VariableDeclaration: NodeType = js.native
    
    var VariableDeclarator: NodeType = js.native
    
    var WhileStatement: NodeType = js.native
    
    var WithStatement: NodeType = js.native
    
    var YieldExpression: NodeType = js.native
  }
  object Syntax {
    
    @JSImport("estraverse", "Syntax")
    @js.native
    val ^ : Syntax = js.native
    
    @scala.inline
    implicit class SyntaxMutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayExpression(value: NodeType): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayPattern(value: NodeType): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowFunctionExpression(value: NodeType): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentExpression(value: NodeType): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentPattern(value: NodeType): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitExpression(value: NodeType): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryExpression(value: NodeType): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockStatement(value: NodeType): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakStatement(value: NodeType): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallExpression(value: NodeType): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchClause(value: NodeType): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassBody(value: NodeType): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassDeclaration(value: NodeType): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassExpression(value: NodeType): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComprehensionBlock(value: NodeType): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComprehensionExpression(value: NodeType): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalExpression(value: NodeType): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueStatement(value: NodeType): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggerStatement(value: NodeType): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectiveStatement(value: NodeType): Self = StObject.set(x, "DirectiveStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoWhileStatement(value: NodeType): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStatement(value: NodeType): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportAllDeclaration(value: NodeType): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportDefaultDeclaration(value: NodeType): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportNamedDeclaration(value: NodeType): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSpecifier(value: NodeType): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionStatement(value: NodeType): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForInStatement(value: NodeType): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForOfStatement(value: NodeType): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForStatement(value: NodeType): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionDeclaration(value: NodeType): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionExpression(value: NodeType): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorExpression(value: NodeType): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: NodeType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfStatement(value: NodeType): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDeclaration(value: NodeType): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDefaultSpecifier(value: NodeType): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportExpression(value: NodeType): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportNamespaceSpecifier(value: NodeType): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportSpecifier(value: NodeType): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeledStatement(value: NodeType): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteral(value: NodeType): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalExpression(value: NodeType): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberExpression(value: NodeType): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaProperty(value: NodeType): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodDefinition(value: NodeType): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleSpecifier(value: NodeType): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewExpression(value: NodeType): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectExpression(value: NodeType): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPattern(value: NodeType): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: NodeType): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: NodeType): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestElement(value: NodeType): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnStatement(value: NodeType): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceExpression(value: NodeType): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadElement(value: NodeType): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuper(value: NodeType): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchCase(value: NodeType): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchStatement(value: NodeType): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggedTemplateExpression(value: NodeType): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateElement(value: NodeType): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateLiteral(value: NodeType): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThisExpression(value: NodeType): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowStatement(value: NodeType): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryStatement(value: NodeType): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnaryExpression(value: NodeType): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpression(value: NodeType): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableDeclaration(value: NodeType): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableDeclarator(value: NodeType): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhileStatement(value: NodeType): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithStatement(value: NodeType): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYieldExpression(value: NodeType): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Record<estraverse.estraverse.NodeType, std.Array<string>> */
  @js.native
  trait VisitorKeys extends StObject {
    
    var ArrayExpression: js.Array[String] = js.native
    
    var ArrayPattern: js.Array[String] = js.native
    
    var ArrowFunctionExpression: js.Array[String] = js.native
    
    var AssignmentExpression: js.Array[String] = js.native
    
    var AssignmentPattern: js.Array[String] = js.native
    
    var AwaitExpression: js.Array[String] = js.native
    
    var BinaryExpression: js.Array[String] = js.native
    
    var BlockStatement: js.Array[String] = js.native
    
    var BreakStatement: js.Array[String] = js.native
    
    var CallExpression: js.Array[String] = js.native
    
    var CatchClause: js.Array[String] = js.native
    
    var ClassBody: js.Array[String] = js.native
    
    var ClassDeclaration: js.Array[String] = js.native
    
    var ClassExpression: js.Array[String] = js.native
    
    var ComprehensionBlock: js.Array[String] = js.native
    
    var ComprehensionExpression: js.Array[String] = js.native
    
    var ConditionalExpression: js.Array[String] = js.native
    
    var ContinueStatement: js.Array[String] = js.native
    
    var DebuggerStatement: js.Array[String] = js.native
    
    var DirectiveStatement: js.Array[String] = js.native
    
    var DoWhileStatement: js.Array[String] = js.native
    
    var EmptyStatement: js.Array[String] = js.native
    
    var ExportAllDeclaration: js.Array[String] = js.native
    
    var ExportDefaultDeclaration: js.Array[String] = js.native
    
    var ExportNamedDeclaration: js.Array[String] = js.native
    
    var ExportSpecifier: js.Array[String] = js.native
    
    var ExpressionStatement: js.Array[String] = js.native
    
    var ForInStatement: js.Array[String] = js.native
    
    var ForOfStatement: js.Array[String] = js.native
    
    var ForStatement: js.Array[String] = js.native
    
    var FunctionDeclaration: js.Array[String] = js.native
    
    var FunctionExpression: js.Array[String] = js.native
    
    var GeneratorExpression: js.Array[String] = js.native
    
    var Identifier: js.Array[String] = js.native
    
    var IfStatement: js.Array[String] = js.native
    
    var ImportDeclaration: js.Array[String] = js.native
    
    var ImportDefaultSpecifier: js.Array[String] = js.native
    
    var ImportExpression: js.Array[String] = js.native
    
    var ImportNamespaceSpecifier: js.Array[String] = js.native
    
    var ImportSpecifier: js.Array[String] = js.native
    
    var LabeledStatement: js.Array[String] = js.native
    
    var Literal: js.Array[String] = js.native
    
    var LogicalExpression: js.Array[String] = js.native
    
    var MemberExpression: js.Array[String] = js.native
    
    var MetaProperty: js.Array[String] = js.native
    
    var MethodDefinition: js.Array[String] = js.native
    
    var ModuleSpecifier: js.Array[String] = js.native
    
    var NewExpression: js.Array[String] = js.native
    
    var ObjectExpression: js.Array[String] = js.native
    
    var ObjectPattern: js.Array[String] = js.native
    
    var Program: js.Array[String] = js.native
    
    var Property: js.Array[String] = js.native
    
    var RestElement: js.Array[String] = js.native
    
    var ReturnStatement: js.Array[String] = js.native
    
    var SequenceExpression: js.Array[String] = js.native
    
    var SpreadElement: js.Array[String] = js.native
    
    var Super: js.Array[String] = js.native
    
    var SwitchCase: js.Array[String] = js.native
    
    var SwitchStatement: js.Array[String] = js.native
    
    var TaggedTemplateExpression: js.Array[String] = js.native
    
    var TemplateElement: js.Array[String] = js.native
    
    var TemplateLiteral: js.Array[String] = js.native
    
    var ThisExpression: js.Array[String] = js.native
    
    var ThrowStatement: js.Array[String] = js.native
    
    var TryStatement: js.Array[String] = js.native
    
    var UnaryExpression: js.Array[String] = js.native
    
    var UpdateExpression: js.Array[String] = js.native
    
    var VariableDeclaration: js.Array[String] = js.native
    
    var VariableDeclarator: js.Array[String] = js.native
    
    var WhileStatement: js.Array[String] = js.native
    
    var WithStatement: js.Array[String] = js.native
    
    var YieldExpression: js.Array[String] = js.native
  }
  object VisitorKeys {
    
    @JSImport("estraverse", "VisitorKeys")
    @js.native
    val ^ : VisitorKeys = js.native
    
    @scala.inline
    implicit class VisitorKeysMutableBuilder[Self <: VisitorKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayExpression(value: js.Array[String]): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayExpressionVarargs(value: String*): Self = StObject.set(x, "ArrayExpression", js.Array(value :_*))
      
      @scala.inline
      def setArrayPattern(value: js.Array[String]): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayPatternVarargs(value: String*): Self = StObject.set(x, "ArrayPattern", js.Array(value :_*))
      
      @scala.inline
      def setArrowFunctionExpression(value: js.Array[String]): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowFunctionExpressionVarargs(value: String*): Self = StObject.set(x, "ArrowFunctionExpression", js.Array(value :_*))
      
      @scala.inline
      def setAssignmentExpression(value: js.Array[String]): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentExpressionVarargs(value: String*): Self = StObject.set(x, "AssignmentExpression", js.Array(value :_*))
      
      @scala.inline
      def setAssignmentPattern(value: js.Array[String]): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentPatternVarargs(value: String*): Self = StObject.set(x, "AssignmentPattern", js.Array(value :_*))
      
      @scala.inline
      def setAwaitExpression(value: js.Array[String]): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitExpressionVarargs(value: String*): Self = StObject.set(x, "AwaitExpression", js.Array(value :_*))
      
      @scala.inline
      def setBinaryExpression(value: js.Array[String]): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryExpressionVarargs(value: String*): Self = StObject.set(x, "BinaryExpression", js.Array(value :_*))
      
      @scala.inline
      def setBlockStatement(value: js.Array[String]): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockStatementVarargs(value: String*): Self = StObject.set(x, "BlockStatement", js.Array(value :_*))
      
      @scala.inline
      def setBreakStatement(value: js.Array[String]): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakStatementVarargs(value: String*): Self = StObject.set(x, "BreakStatement", js.Array(value :_*))
      
      @scala.inline
      def setCallExpression(value: js.Array[String]): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallExpressionVarargs(value: String*): Self = StObject.set(x, "CallExpression", js.Array(value :_*))
      
      @scala.inline
      def setCatchClause(value: js.Array[String]): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchClauseVarargs(value: String*): Self = StObject.set(x, "CatchClause", js.Array(value :_*))
      
      @scala.inline
      def setClassBody(value: js.Array[String]): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassBodyVarargs(value: String*): Self = StObject.set(x, "ClassBody", js.Array(value :_*))
      
      @scala.inline
      def setClassDeclaration(value: js.Array[String]): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassDeclarationVarargs(value: String*): Self = StObject.set(x, "ClassDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setClassExpression(value: js.Array[String]): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassExpressionVarargs(value: String*): Self = StObject.set(x, "ClassExpression", js.Array(value :_*))
      
      @scala.inline
      def setComprehensionBlock(value: js.Array[String]): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComprehensionBlockVarargs(value: String*): Self = StObject.set(x, "ComprehensionBlock", js.Array(value :_*))
      
      @scala.inline
      def setComprehensionExpression(value: js.Array[String]): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComprehensionExpressionVarargs(value: String*): Self = StObject.set(x, "ComprehensionExpression", js.Array(value :_*))
      
      @scala.inline
      def setConditionalExpression(value: js.Array[String]): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalExpressionVarargs(value: String*): Self = StObject.set(x, "ConditionalExpression", js.Array(value :_*))
      
      @scala.inline
      def setContinueStatement(value: js.Array[String]): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueStatementVarargs(value: String*): Self = StObject.set(x, "ContinueStatement", js.Array(value :_*))
      
      @scala.inline
      def setDebuggerStatement(value: js.Array[String]): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggerStatementVarargs(value: String*): Self = StObject.set(x, "DebuggerStatement", js.Array(value :_*))
      
      @scala.inline
      def setDirectiveStatement(value: js.Array[String]): Self = StObject.set(x, "DirectiveStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectiveStatementVarargs(value: String*): Self = StObject.set(x, "DirectiveStatement", js.Array(value :_*))
      
      @scala.inline
      def setDoWhileStatement(value: js.Array[String]): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoWhileStatementVarargs(value: String*): Self = StObject.set(x, "DoWhileStatement", js.Array(value :_*))
      
      @scala.inline
      def setEmptyStatement(value: js.Array[String]): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStatementVarargs(value: String*): Self = StObject.set(x, "EmptyStatement", js.Array(value :_*))
      
      @scala.inline
      def setExportAllDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportAllDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportAllDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setExportDefaultDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportDefaultDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportDefaultDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setExportNamedDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportNamedDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportNamedDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setExportSpecifier(value: js.Array[String]): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSpecifierVarargs(value: String*): Self = StObject.set(x, "ExportSpecifier", js.Array(value :_*))
      
      @scala.inline
      def setExpressionStatement(value: js.Array[String]): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionStatementVarargs(value: String*): Self = StObject.set(x, "ExpressionStatement", js.Array(value :_*))
      
      @scala.inline
      def setForInStatement(value: js.Array[String]): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForInStatementVarargs(value: String*): Self = StObject.set(x, "ForInStatement", js.Array(value :_*))
      
      @scala.inline
      def setForOfStatement(value: js.Array[String]): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForOfStatementVarargs(value: String*): Self = StObject.set(x, "ForOfStatement", js.Array(value :_*))
      
      @scala.inline
      def setForStatement(value: js.Array[String]): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForStatementVarargs(value: String*): Self = StObject.set(x, "ForStatement", js.Array(value :_*))
      
      @scala.inline
      def setFunctionDeclaration(value: js.Array[String]): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionDeclarationVarargs(value: String*): Self = StObject.set(x, "FunctionDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setFunctionExpression(value: js.Array[String]): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionExpressionVarargs(value: String*): Self = StObject.set(x, "FunctionExpression", js.Array(value :_*))
      
      @scala.inline
      def setGeneratorExpression(value: js.Array[String]): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorExpressionVarargs(value: String*): Self = StObject.set(x, "GeneratorExpression", js.Array(value :_*))
      
      @scala.inline
      def setIdentifier(value: js.Array[String]): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierVarargs(value: String*): Self = StObject.set(x, "Identifier", js.Array(value :_*))
      
      @scala.inline
      def setIfStatement(value: js.Array[String]): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfStatementVarargs(value: String*): Self = StObject.set(x, "IfStatement", js.Array(value :_*))
      
      @scala.inline
      def setImportDeclaration(value: js.Array[String]): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDeclarationVarargs(value: String*): Self = StObject.set(x, "ImportDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setImportDefaultSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportDefaultSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportDefaultSpecifier", js.Array(value :_*))
      
      @scala.inline
      def setImportExpression(value: js.Array[String]): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportExpressionVarargs(value: String*): Self = StObject.set(x, "ImportExpression", js.Array(value :_*))
      
      @scala.inline
      def setImportNamespaceSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportNamespaceSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportNamespaceSpecifier", js.Array(value :_*))
      
      @scala.inline
      def setImportSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportSpecifier", js.Array(value :_*))
      
      @scala.inline
      def setLabeledStatement(value: js.Array[String]): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeledStatementVarargs(value: String*): Self = StObject.set(x, "LabeledStatement", js.Array(value :_*))
      
      @scala.inline
      def setLiteral(value: js.Array[String]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralVarargs(value: String*): Self = StObject.set(x, "Literal", js.Array(value :_*))
      
      @scala.inline
      def setLogicalExpression(value: js.Array[String]): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalExpressionVarargs(value: String*): Self = StObject.set(x, "LogicalExpression", js.Array(value :_*))
      
      @scala.inline
      def setMemberExpression(value: js.Array[String]): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberExpressionVarargs(value: String*): Self = StObject.set(x, "MemberExpression", js.Array(value :_*))
      
      @scala.inline
      def setMetaProperty(value: js.Array[String]): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaPropertyVarargs(value: String*): Self = StObject.set(x, "MetaProperty", js.Array(value :_*))
      
      @scala.inline
      def setMethodDefinition(value: js.Array[String]): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodDefinitionVarargs(value: String*): Self = StObject.set(x, "MethodDefinition", js.Array(value :_*))
      
      @scala.inline
      def setModuleSpecifier(value: js.Array[String]): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleSpecifierVarargs(value: String*): Self = StObject.set(x, "ModuleSpecifier", js.Array(value :_*))
      
      @scala.inline
      def setNewExpression(value: js.Array[String]): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewExpressionVarargs(value: String*): Self = StObject.set(x, "NewExpression", js.Array(value :_*))
      
      @scala.inline
      def setObjectExpression(value: js.Array[String]): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectExpressionVarargs(value: String*): Self = StObject.set(x, "ObjectExpression", js.Array(value :_*))
      
      @scala.inline
      def setObjectPattern(value: js.Array[String]): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPatternVarargs(value: String*): Self = StObject.set(x, "ObjectPattern", js.Array(value :_*))
      
      @scala.inline
      def setProgram(value: js.Array[String]): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramVarargs(value: String*): Self = StObject.set(x, "Program", js.Array(value :_*))
      
      @scala.inline
      def setProperty(value: js.Array[String]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyVarargs(value: String*): Self = StObject.set(x, "Property", js.Array(value :_*))
      
      @scala.inline
      def setRestElement(value: js.Array[String]): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestElementVarargs(value: String*): Self = StObject.set(x, "RestElement", js.Array(value :_*))
      
      @scala.inline
      def setReturnStatement(value: js.Array[String]): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnStatementVarargs(value: String*): Self = StObject.set(x, "ReturnStatement", js.Array(value :_*))
      
      @scala.inline
      def setSequenceExpression(value: js.Array[String]): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceExpressionVarargs(value: String*): Self = StObject.set(x, "SequenceExpression", js.Array(value :_*))
      
      @scala.inline
      def setSpreadElement(value: js.Array[String]): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadElementVarargs(value: String*): Self = StObject.set(x, "SpreadElement", js.Array(value :_*))
      
      @scala.inline
      def setSuper(value: js.Array[String]): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperVarargs(value: String*): Self = StObject.set(x, "Super", js.Array(value :_*))
      
      @scala.inline
      def setSwitchCase(value: js.Array[String]): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchCaseVarargs(value: String*): Self = StObject.set(x, "SwitchCase", js.Array(value :_*))
      
      @scala.inline
      def setSwitchStatement(value: js.Array[String]): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchStatementVarargs(value: String*): Self = StObject.set(x, "SwitchStatement", js.Array(value :_*))
      
      @scala.inline
      def setTaggedTemplateExpression(value: js.Array[String]): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggedTemplateExpressionVarargs(value: String*): Self = StObject.set(x, "TaggedTemplateExpression", js.Array(value :_*))
      
      @scala.inline
      def setTemplateElement(value: js.Array[String]): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateElementVarargs(value: String*): Self = StObject.set(x, "TemplateElement", js.Array(value :_*))
      
      @scala.inline
      def setTemplateLiteral(value: js.Array[String]): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateLiteralVarargs(value: String*): Self = StObject.set(x, "TemplateLiteral", js.Array(value :_*))
      
      @scala.inline
      def setThisExpression(value: js.Array[String]): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThisExpressionVarargs(value: String*): Self = StObject.set(x, "ThisExpression", js.Array(value :_*))
      
      @scala.inline
      def setThrowStatement(value: js.Array[String]): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowStatementVarargs(value: String*): Self = StObject.set(x, "ThrowStatement", js.Array(value :_*))
      
      @scala.inline
      def setTryStatement(value: js.Array[String]): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryStatementVarargs(value: String*): Self = StObject.set(x, "TryStatement", js.Array(value :_*))
      
      @scala.inline
      def setUnaryExpression(value: js.Array[String]): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnaryExpressionVarargs(value: String*): Self = StObject.set(x, "UnaryExpression", js.Array(value :_*))
      
      @scala.inline
      def setUpdateExpression(value: js.Array[String]): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpressionVarargs(value: String*): Self = StObject.set(x, "UpdateExpression", js.Array(value :_*))
      
      @scala.inline
      def setVariableDeclaration(value: js.Array[String]): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableDeclarationVarargs(value: String*): Self = StObject.set(x, "VariableDeclaration", js.Array(value :_*))
      
      @scala.inline
      def setVariableDeclarator(value: js.Array[String]): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableDeclaratorVarargs(value: String*): Self = StObject.set(x, "VariableDeclarator", js.Array(value :_*))
      
      @scala.inline
      def setWhileStatement(value: js.Array[String]): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhileStatementVarargs(value: String*): Self = StObject.set(x, "WhileStatement", js.Array(value :_*))
      
      @scala.inline
      def setWithStatement(value: js.Array[String]): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithStatementVarargs(value: String*): Self = StObject.set(x, "WithStatement", js.Array(value :_*))
      
      @scala.inline
      def setYieldExpression(value: js.Array[String]): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYieldExpressionVarargs(value: String*): Self = StObject.set(x, "YieldExpression", js.Array(value :_*))
    }
  }
  
  @js.native
  sealed trait VisitorOption extends StObject
  @JSImport("estraverse", "VisitorOption")
  @js.native
  object VisitorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VisitorOption with Double] = js.native
    
    @js.native
    sealed trait Break extends VisitorOption
    /* 0 */ val Break: typingsSlinky.estraverse.mod.VisitorOption.Break with Double = js.native
    
    @js.native
    sealed trait Remove extends VisitorOption
    /* 2 */ val Remove: typingsSlinky.estraverse.mod.VisitorOption.Remove with Double = js.native
    
    @js.native
    sealed trait Skip extends VisitorOption
    /* 1 */ val Skip: typingsSlinky.estraverse.mod.VisitorOption.Skip with Double = js.native
  }
  
  @JSImport("estraverse", "attachComments")
  @js.native
  def attachComments(tree: Node, providedComments: js.Array[Comment], tokens: js.Array[Node]): Node = js.native
  
  @JSImport("estraverse", "cloneEnvironment")
  @js.native
  def cloneEnvironment(): js.Any = js.native
  
  @JSImport("estraverse", "replace")
  @js.native
  def replace(root: Node, visitor: Visitor): Node = js.native
  
  @JSImport("estraverse", "traverse")
  @js.native
  def traverse(root: Node, visitor: Visitor): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.estraverse.estraverseStrings.AssignmentExpression
    - typingsSlinky.estraverse.estraverseStrings.AssignmentPattern
    - typingsSlinky.estraverse.estraverseStrings.ArrayExpression
    - typingsSlinky.estraverse.estraverseStrings.ArrayPattern
    - typingsSlinky.estraverse.estraverseStrings.ArrowFunctionExpression
    - typingsSlinky.estraverse.estraverseStrings.AwaitExpression
    - typingsSlinky.estraverse.estraverseStrings.BlockStatement
    - typingsSlinky.estraverse.estraverseStrings.BinaryExpression
    - typingsSlinky.estraverse.estraverseStrings.BreakStatement
    - typingsSlinky.estraverse.estraverseStrings.CallExpression
    - typingsSlinky.estraverse.estraverseStrings.CatchClause
    - typingsSlinky.estraverse.estraverseStrings.ClassBody
    - typingsSlinky.estraverse.estraverseStrings.ClassDeclaration
    - typingsSlinky.estraverse.estraverseStrings.ClassExpression
    - typingsSlinky.estraverse.estraverseStrings.ComprehensionBlock
    - typingsSlinky.estraverse.estraverseStrings.ComprehensionExpression
    - typingsSlinky.estraverse.estraverseStrings.ConditionalExpression
    - typingsSlinky.estraverse.estraverseStrings.ContinueStatement
    - typingsSlinky.estraverse.estraverseStrings.DebuggerStatement
    - typingsSlinky.estraverse.estraverseStrings.DirectiveStatement
    - typingsSlinky.estraverse.estraverseStrings.DoWhileStatement
    - typingsSlinky.estraverse.estraverseStrings.EmptyStatement
    - typingsSlinky.estraverse.estraverseStrings.ExportAllDeclaration
    - typingsSlinky.estraverse.estraverseStrings.ExportDefaultDeclaration
    - typingsSlinky.estraverse.estraverseStrings.ExportNamedDeclaration
    - typingsSlinky.estraverse.estraverseStrings.ExportSpecifier
    - typingsSlinky.estraverse.estraverseStrings.ExpressionStatement
    - typingsSlinky.estraverse.estraverseStrings.ForStatement
    - typingsSlinky.estraverse.estraverseStrings.ForInStatement
    - typingsSlinky.estraverse.estraverseStrings.ForOfStatement
    - typingsSlinky.estraverse.estraverseStrings.FunctionDeclaration
    - typingsSlinky.estraverse.estraverseStrings.FunctionExpression
    - typingsSlinky.estraverse.estraverseStrings.GeneratorExpression
    - typingsSlinky.estraverse.estraverseStrings.Identifier
    - typingsSlinky.estraverse.estraverseStrings.IfStatement
    - typingsSlinky.estraverse.estraverseStrings.ImportExpression
    - typingsSlinky.estraverse.estraverseStrings.ImportDeclaration
    - typingsSlinky.estraverse.estraverseStrings.ImportDefaultSpecifier
    - typingsSlinky.estraverse.estraverseStrings.ImportNamespaceSpecifier
    - typingsSlinky.estraverse.estraverseStrings.ImportSpecifier
    - typingsSlinky.estraverse.estraverseStrings.Literal
    - typingsSlinky.estraverse.estraverseStrings.LabeledStatement
    - typingsSlinky.estraverse.estraverseStrings.LogicalExpression
    - typingsSlinky.estraverse.estraverseStrings.MemberExpression
    - typingsSlinky.estraverse.estraverseStrings.MetaProperty
    - typingsSlinky.estraverse.estraverseStrings.MethodDefinition
    - typingsSlinky.estraverse.estraverseStrings.ModuleSpecifier
    - typingsSlinky.estraverse.estraverseStrings.NewExpression
    - typingsSlinky.estraverse.estraverseStrings.ObjectExpression
    - typingsSlinky.estraverse.estraverseStrings.ObjectPattern
    - typingsSlinky.estraverse.estraverseStrings.Program
    - typingsSlinky.estraverse.estraverseStrings.Property
    - typingsSlinky.estraverse.estraverseStrings.RestElement
    - typingsSlinky.estraverse.estraverseStrings.ReturnStatement
    - typingsSlinky.estraverse.estraverseStrings.SequenceExpression
    - typingsSlinky.estraverse.estraverseStrings.SpreadElement
    - typingsSlinky.estraverse.estraverseStrings.Super
    - typingsSlinky.estraverse.estraverseStrings.SwitchStatement
    - typingsSlinky.estraverse.estraverseStrings.SwitchCase
    - typingsSlinky.estraverse.estraverseStrings.TaggedTemplateExpression
    - typingsSlinky.estraverse.estraverseStrings.TemplateElement
    - typingsSlinky.estraverse.estraverseStrings.TemplateLiteral
    - typingsSlinky.estraverse.estraverseStrings.ThisExpression
    - typingsSlinky.estraverse.estraverseStrings.ThrowStatement
    - typingsSlinky.estraverse.estraverseStrings.TryStatement
    - typingsSlinky.estraverse.estraverseStrings.UnaryExpression
    - typingsSlinky.estraverse.estraverseStrings.UpdateExpression
    - typingsSlinky.estraverse.estraverseStrings.VariableDeclaration
    - typingsSlinky.estraverse.estraverseStrings.VariableDeclarator
    - typingsSlinky.estraverse.estraverseStrings.WhileStatement
    - typingsSlinky.estraverse.estraverseStrings.WithStatement
    - typingsSlinky.estraverse.estraverseStrings.YieldExpression
  */
  trait NodeType extends StObject
  object NodeType {
    
    @scala.inline
    def ArrayExpression: typingsSlinky.estraverse.estraverseStrings.ArrayExpression = "ArrayExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ArrayExpression]
    
    @scala.inline
    def ArrayPattern: typingsSlinky.estraverse.estraverseStrings.ArrayPattern = "ArrayPattern".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ArrayPattern]
    
    @scala.inline
    def ArrowFunctionExpression: typingsSlinky.estraverse.estraverseStrings.ArrowFunctionExpression = "ArrowFunctionExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ArrowFunctionExpression]
    
    @scala.inline
    def AssignmentExpression: typingsSlinky.estraverse.estraverseStrings.AssignmentExpression = "AssignmentExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.AssignmentExpression]
    
    @scala.inline
    def AssignmentPattern: typingsSlinky.estraverse.estraverseStrings.AssignmentPattern = "AssignmentPattern".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.AssignmentPattern]
    
    @scala.inline
    def AwaitExpression: typingsSlinky.estraverse.estraverseStrings.AwaitExpression = "AwaitExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.AwaitExpression]
    
    @scala.inline
    def BinaryExpression: typingsSlinky.estraverse.estraverseStrings.BinaryExpression = "BinaryExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.BinaryExpression]
    
    @scala.inline
    def BlockStatement: typingsSlinky.estraverse.estraverseStrings.BlockStatement = "BlockStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.BlockStatement]
    
    @scala.inline
    def BreakStatement: typingsSlinky.estraverse.estraverseStrings.BreakStatement = "BreakStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.BreakStatement]
    
    @scala.inline
    def CallExpression: typingsSlinky.estraverse.estraverseStrings.CallExpression = "CallExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.CallExpression]
    
    @scala.inline
    def CatchClause: typingsSlinky.estraverse.estraverseStrings.CatchClause = "CatchClause".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.CatchClause]
    
    @scala.inline
    def ClassBody: typingsSlinky.estraverse.estraverseStrings.ClassBody = "ClassBody".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ClassBody]
    
    @scala.inline
    def ClassDeclaration: typingsSlinky.estraverse.estraverseStrings.ClassDeclaration = "ClassDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ClassDeclaration]
    
    @scala.inline
    def ClassExpression: typingsSlinky.estraverse.estraverseStrings.ClassExpression = "ClassExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ClassExpression]
    
    @scala.inline
    def ComprehensionBlock: typingsSlinky.estraverse.estraverseStrings.ComprehensionBlock = "ComprehensionBlock".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ComprehensionBlock]
    
    @scala.inline
    def ComprehensionExpression: typingsSlinky.estraverse.estraverseStrings.ComprehensionExpression = "ComprehensionExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ComprehensionExpression]
    
    @scala.inline
    def ConditionalExpression: typingsSlinky.estraverse.estraverseStrings.ConditionalExpression = "ConditionalExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ConditionalExpression]
    
    @scala.inline
    def ContinueStatement: typingsSlinky.estraverse.estraverseStrings.ContinueStatement = "ContinueStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ContinueStatement]
    
    @scala.inline
    def DebuggerStatement: typingsSlinky.estraverse.estraverseStrings.DebuggerStatement = "DebuggerStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.DebuggerStatement]
    
    @scala.inline
    def DirectiveStatement: typingsSlinky.estraverse.estraverseStrings.DirectiveStatement = "DirectiveStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.DirectiveStatement]
    
    @scala.inline
    def DoWhileStatement: typingsSlinky.estraverse.estraverseStrings.DoWhileStatement = "DoWhileStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.DoWhileStatement]
    
    @scala.inline
    def EmptyStatement: typingsSlinky.estraverse.estraverseStrings.EmptyStatement = "EmptyStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.EmptyStatement]
    
    @scala.inline
    def ExportAllDeclaration: typingsSlinky.estraverse.estraverseStrings.ExportAllDeclaration = "ExportAllDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ExportAllDeclaration]
    
    @scala.inline
    def ExportDefaultDeclaration: typingsSlinky.estraverse.estraverseStrings.ExportDefaultDeclaration = "ExportDefaultDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ExportDefaultDeclaration]
    
    @scala.inline
    def ExportNamedDeclaration: typingsSlinky.estraverse.estraverseStrings.ExportNamedDeclaration = "ExportNamedDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ExportNamedDeclaration]
    
    @scala.inline
    def ExportSpecifier: typingsSlinky.estraverse.estraverseStrings.ExportSpecifier = "ExportSpecifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ExportSpecifier]
    
    @scala.inline
    def ExpressionStatement: typingsSlinky.estraverse.estraverseStrings.ExpressionStatement = "ExpressionStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ExpressionStatement]
    
    @scala.inline
    def ForInStatement: typingsSlinky.estraverse.estraverseStrings.ForInStatement = "ForInStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ForInStatement]
    
    @scala.inline
    def ForOfStatement: typingsSlinky.estraverse.estraverseStrings.ForOfStatement = "ForOfStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ForOfStatement]
    
    @scala.inline
    def ForStatement: typingsSlinky.estraverse.estraverseStrings.ForStatement = "ForStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ForStatement]
    
    @scala.inline
    def FunctionDeclaration: typingsSlinky.estraverse.estraverseStrings.FunctionDeclaration = "FunctionDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.FunctionDeclaration]
    
    @scala.inline
    def FunctionExpression: typingsSlinky.estraverse.estraverseStrings.FunctionExpression = "FunctionExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.FunctionExpression]
    
    @scala.inline
    def GeneratorExpression: typingsSlinky.estraverse.estraverseStrings.GeneratorExpression = "GeneratorExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.GeneratorExpression]
    
    @scala.inline
    def Identifier: typingsSlinky.estraverse.estraverseStrings.Identifier = "Identifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.Identifier]
    
    @scala.inline
    def IfStatement: typingsSlinky.estraverse.estraverseStrings.IfStatement = "IfStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.IfStatement]
    
    @scala.inline
    def ImportDeclaration: typingsSlinky.estraverse.estraverseStrings.ImportDeclaration = "ImportDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ImportDeclaration]
    
    @scala.inline
    def ImportDefaultSpecifier: typingsSlinky.estraverse.estraverseStrings.ImportDefaultSpecifier = "ImportDefaultSpecifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ImportDefaultSpecifier]
    
    @scala.inline
    def ImportExpression: typingsSlinky.estraverse.estraverseStrings.ImportExpression = "ImportExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ImportExpression]
    
    @scala.inline
    def ImportNamespaceSpecifier: typingsSlinky.estraverse.estraverseStrings.ImportNamespaceSpecifier = "ImportNamespaceSpecifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ImportNamespaceSpecifier]
    
    @scala.inline
    def ImportSpecifier: typingsSlinky.estraverse.estraverseStrings.ImportSpecifier = "ImportSpecifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ImportSpecifier]
    
    @scala.inline
    def LabeledStatement: typingsSlinky.estraverse.estraverseStrings.LabeledStatement = "LabeledStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.LabeledStatement]
    
    @scala.inline
    def Literal: typingsSlinky.estraverse.estraverseStrings.Literal = "Literal".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.Literal]
    
    @scala.inline
    def LogicalExpression: typingsSlinky.estraverse.estraverseStrings.LogicalExpression = "LogicalExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.LogicalExpression]
    
    @scala.inline
    def MemberExpression: typingsSlinky.estraverse.estraverseStrings.MemberExpression = "MemberExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.MemberExpression]
    
    @scala.inline
    def MetaProperty: typingsSlinky.estraverse.estraverseStrings.MetaProperty = "MetaProperty".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.MetaProperty]
    
    @scala.inline
    def MethodDefinition: typingsSlinky.estraverse.estraverseStrings.MethodDefinition = "MethodDefinition".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.MethodDefinition]
    
    @scala.inline
    def ModuleSpecifier: typingsSlinky.estraverse.estraverseStrings.ModuleSpecifier = "ModuleSpecifier".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ModuleSpecifier]
    
    @scala.inline
    def NewExpression: typingsSlinky.estraverse.estraverseStrings.NewExpression = "NewExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.NewExpression]
    
    @scala.inline
    def ObjectExpression: typingsSlinky.estraverse.estraverseStrings.ObjectExpression = "ObjectExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ObjectExpression]
    
    @scala.inline
    def ObjectPattern: typingsSlinky.estraverse.estraverseStrings.ObjectPattern = "ObjectPattern".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ObjectPattern]
    
    @scala.inline
    def Program: typingsSlinky.estraverse.estraverseStrings.Program = "Program".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.Program]
    
    @scala.inline
    def Property: typingsSlinky.estraverse.estraverseStrings.Property = "Property".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.Property]
    
    @scala.inline
    def RestElement: typingsSlinky.estraverse.estraverseStrings.RestElement = "RestElement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.RestElement]
    
    @scala.inline
    def ReturnStatement: typingsSlinky.estraverse.estraverseStrings.ReturnStatement = "ReturnStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ReturnStatement]
    
    @scala.inline
    def SequenceExpression: typingsSlinky.estraverse.estraverseStrings.SequenceExpression = "SequenceExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.SequenceExpression]
    
    @scala.inline
    def SpreadElement: typingsSlinky.estraverse.estraverseStrings.SpreadElement = "SpreadElement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.SpreadElement]
    
    @scala.inline
    def Super: typingsSlinky.estraverse.estraverseStrings.Super = "Super".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.Super]
    
    @scala.inline
    def SwitchCase: typingsSlinky.estraverse.estraverseStrings.SwitchCase = "SwitchCase".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.SwitchCase]
    
    @scala.inline
    def SwitchStatement: typingsSlinky.estraverse.estraverseStrings.SwitchStatement = "SwitchStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.SwitchStatement]
    
    @scala.inline
    def TaggedTemplateExpression: typingsSlinky.estraverse.estraverseStrings.TaggedTemplateExpression = "TaggedTemplateExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.TaggedTemplateExpression]
    
    @scala.inline
    def TemplateElement: typingsSlinky.estraverse.estraverseStrings.TemplateElement = "TemplateElement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.TemplateElement]
    
    @scala.inline
    def TemplateLiteral: typingsSlinky.estraverse.estraverseStrings.TemplateLiteral = "TemplateLiteral".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.TemplateLiteral]
    
    @scala.inline
    def ThisExpression: typingsSlinky.estraverse.estraverseStrings.ThisExpression = "ThisExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ThisExpression]
    
    @scala.inline
    def ThrowStatement: typingsSlinky.estraverse.estraverseStrings.ThrowStatement = "ThrowStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.ThrowStatement]
    
    @scala.inline
    def TryStatement: typingsSlinky.estraverse.estraverseStrings.TryStatement = "TryStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.TryStatement]
    
    @scala.inline
    def UnaryExpression: typingsSlinky.estraverse.estraverseStrings.UnaryExpression = "UnaryExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.UnaryExpression]
    
    @scala.inline
    def UpdateExpression: typingsSlinky.estraverse.estraverseStrings.UpdateExpression = "UpdateExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.UpdateExpression]
    
    @scala.inline
    def VariableDeclaration: typingsSlinky.estraverse.estraverseStrings.VariableDeclaration = "VariableDeclaration".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.VariableDeclaration]
    
    @scala.inline
    def VariableDeclarator: typingsSlinky.estraverse.estraverseStrings.VariableDeclarator = "VariableDeclarator".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.VariableDeclarator]
    
    @scala.inline
    def WhileStatement: typingsSlinky.estraverse.estraverseStrings.WhileStatement = "WhileStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.WhileStatement]
    
    @scala.inline
    def WithStatement: typingsSlinky.estraverse.estraverseStrings.WithStatement = "WithStatement".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.WithStatement]
    
    @scala.inline
    def YieldExpression: typingsSlinky.estraverse.estraverseStrings.YieldExpression = "YieldExpression".asInstanceOf[typingsSlinky.estraverse.estraverseStrings.YieldExpression]
  }
  
  @js.native
  trait Visitor extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
      ] = js.native
    
    var fallback: js.UndefOr[
        iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])
      ] = js.native
    
    var keys: js.UndefOr[Record[String, js.Array[String]]] = js.native
    
    var leave: js.UndefOr[
        js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
      ] = js.native
  }
  object Visitor {
    
    @scala.inline
    def apply(): Visitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Visitor]
    }
    
    @scala.inline
    implicit class VisitorMutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(
        value: js.ThisFunction2[
              /* this */ Controller, 
              /* node */ Node, 
              /* parent */ Node | Null, 
              VisitorOption | Node | Unit
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setFallback(value: iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setKeys(value: Record[String, js.Array[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setLeave(
        value: js.ThisFunction2[
              /* this */ Controller, 
              /* node */ Node, 
              /* parent */ Node | Null, 
              VisitorOption | Node | Unit
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
}
