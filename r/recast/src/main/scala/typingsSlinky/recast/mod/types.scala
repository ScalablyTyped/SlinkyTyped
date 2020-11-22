package typingsSlinky.recast.mod

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast", "types")
@js.native
object types extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(builders, builtInTypes, defineMethod, eachField, finalize, getBuilderName, getFieldNames, getFieldValue, getSupertypeNames, NodePath, Path, PathVisitor, someField, Type, use, visit) */ @js.native
  object astNodesAreEquivalent extends js.Object {
    
    def apply(a: js.Any, b: js.Any): Boolean = js.native
    def apply(a: js.Any, b: js.Any, problemPath: js.Any): Boolean = js.native
    
    def assert(a: js.Any, b: js.Any): Unit = js.native
  }
  
  @js.native
  object namedTypes extends js.Object {
    
    var AnyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
    
    var ArrayExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
    
    var ArrayPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
    
    var ArrayTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
    
    var ArrowFunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
    
    var AssignmentExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
    
    var AssignmentPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
    
    var AwaitExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
    
    var BigIntLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
    
    var BigIntLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation] = js.native
    
    var BigIntTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation] = js.native
    
    var BinaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression] = js.native
    
    var BindExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression] = js.native
    
    var Block: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block] = js.native
    
    var BlockStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement] = js.native
    
    var BooleanLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral] = js.native
    
    var BooleanLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation] = js.native
    
    var BooleanTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation] = js.native
    
    var BreakStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement] = js.native
    
    var CallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression] = js.native
    
    var CatchClause: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CatchClause] = js.native
    
    var ChainElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainElement] = js.native
    
    var ChainExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression] = js.native
    
    var ClassBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody] = js.native
    
    var ClassDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration] = js.native
    
    var ClassExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression] = js.native
    
    var ClassImplements: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassImplements] = js.native
    
    var ClassMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod] = js.native
    
    var ClassPrivateMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod] = js.native
    
    var ClassPrivateProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty] = js.native
    
    var ClassProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty] = js.native
    
    var ClassPropertyDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition] = js.native
    
    var Comment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Comment] = js.native
    
    var CommentBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock] = js.native
    
    var CommentLine: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine] = js.native
    
    var ComprehensionBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock] = js.native
    
    var ComprehensionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression] = js.native
    
    var ConditionalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression] = js.native
    
    var ContinueStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement] = js.native
    
    var DebuggerStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement] = js.native
    
    var Declaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Declaration] = js.native
    
    var DeclareClass: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass] = js.native
    
    var DeclareExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration] = js.native
    
    var DeclareExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration] = js.native
    
    var DeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction] = js.native
    
    var DeclareInterface: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface] = js.native
    
    var DeclareModule: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule] = js.native
    
    var DeclareModuleExports: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports] = js.native
    
    var DeclareOpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType] = js.native
    
    var DeclareTypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias] = js.native
    
    var DeclareVariable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable] = js.native
    
    var DeclaredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate] = js.native
    
    var Decorator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator] = js.native
    
    var Directive: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive] = js.native
    
    var DirectiveLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral] = js.native
    
    var DoExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression] = js.native
    
    var DoWhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement] = js.native
    
    var EmptyStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement] = js.native
    
    var EmptyTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation] = js.native
    
    var EnumBooleanBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanBody] = js.native
    
    var EnumBooleanMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember] = js.native
    
    var EnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration] = js.native
    
    var EnumDefaultedMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember] = js.native
    
    var EnumNumberBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberBody] = js.native
    
    var EnumNumberMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumNumberMember] = js.native
    
    var EnumStringBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringBody] = js.native
    
    var EnumStringMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember] = js.native
    
    var EnumSymbolBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumSymbolBody] = js.native
    
    var ExistentialTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam] = js.native
    
    var ExistsTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation] = js.native
    
    var ExportAllDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration] = js.native
    
    var ExportBatchSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier] = js.native
    
    var ExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration] = js.native
    
    var ExportDefaultDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration] = js.native
    
    var ExportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier] = js.native
    
    var ExportNamedDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration] = js.native
    
    var ExportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier] = js.native
    
    var ExportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier] = js.native
    
    var Expression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Expression] = js.native
    
    var ExpressionStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement] = js.native
    
    var File: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.File] = js.native
    
    var Flow: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Flow] = js.native
    
    var FlowPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowPredicate] = js.native
    
    var FlowType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FlowType] = js.native
    
    var ForAwaitStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement] = js.native
    
    var ForInStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement] = js.native
    
    var ForOfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement] = js.native
    
    var ForStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement] = js.native
    
    var Function: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Function] = js.native
    
    var FunctionDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration] = js.native
    
    var FunctionExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression] = js.native
    
    var FunctionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation] = js.native
    
    var FunctionTypeParam: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam] = js.native
    
    var GeneratorExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression] = js.native
    
    var GenericTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation] = js.native
    
    var Identifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier] = js.native
    
    var IfStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement] = js.native
    
    var Import: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import] = js.native
    
    var ImportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration] = js.native
    
    var ImportDefaultSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier] = js.native
    
    var ImportExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression] = js.native
    
    var ImportNamespaceSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier] = js.native
    
    var ImportSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier] = js.native
    
    var InferredPredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate] = js.native
    
    var InterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration] = js.native
    
    var InterfaceExtends: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceExtends] = js.native
    
    var InterfaceTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation] = js.native
    
    var InterpreterDirective: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterpreterDirective] = js.native
    
    var IntersectionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation] = js.native
    
    var JSXAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXAttribute] = js.native
    
    var JSXClosingElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement] = js.native
    
    var JSXClosingFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingFragment] = js.native
    
    var JSXElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement] = js.native
    
    var JSXEmptyExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression] = js.native
    
    var JSXExpressionContainer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer] = js.native
    
    var JSXFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment] = js.native
    
    var JSXIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier] = js.native
    
    var JSXMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression] = js.native
    
    var JSXNamespacedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXNamespacedName] = js.native
    
    var JSXOpeningElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement] = js.native
    
    var JSXOpeningFragment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment] = js.native
    
    var JSXSpreadAttribute: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute] = js.native
    
    var JSXSpreadChild: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild] = js.native
    
    var JSXText: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText] = js.native
    
    var LabeledStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement] = js.native
    
    var Line: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line] = js.native
    
    var Literal: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal] = js.native
    
    var LogicalExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression] = js.native
    
    var MemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression] = js.native
    
    var MemberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation] = js.native
    
    var MetaProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty] = js.native
    
    var MethodDefinition: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition] = js.native
    
    var MixedTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation] = js.native
    
    var ModuleSpecifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ModuleSpecifier] = js.native
    
    var NewExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression] = js.native
    
    var Node: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Node] = js.native
    
    var Noop: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop] = js.native
    
    var NullLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral] = js.native
    
    var NullLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation] = js.native
    
    var NullTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation] = js.native
    
    var NullableTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation] = js.native
    
    var NumberLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation] = js.native
    
    var NumberTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation] = js.native
    
    var NumericLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral] = js.native
    
    var NumericLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation] = js.native
    
    var ObjectExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression] = js.native
    
    var ObjectMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod] = js.native
    
    var ObjectPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern] = js.native
    
    var ObjectProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty] = js.native
    
    var ObjectTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation] = js.native
    
    var ObjectTypeCallProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty] = js.native
    
    var ObjectTypeIndexer: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer] = js.native
    
    var ObjectTypeInternalSlot: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot] = js.native
    
    var ObjectTypeProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty] = js.native
    
    var ObjectTypeSpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty] = js.native
    
    var OpaqueType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType] = js.native
    
    var OptionalCallExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression] = js.native
    
    var OptionalMemberExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression] = js.native
    
    var ParenthesizedExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression] = js.native
    
    var Pattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Pattern] = js.native
    
    var Position: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Position] = js.native
    
    var Printable: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Printable] = js.native
    
    var PrivateName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName] = js.native
    
    var Program: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Program] = js.native
    
    var Property: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Property] = js.native
    
    var PropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern] = js.native
    
    var QualifiedTypeIdentifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier] = js.native
    
    var RegExpLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral] = js.native
    
    var RestElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement] = js.native
    
    var RestProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty] = js.native
    
    var ReturnStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement] = js.native
    
    var SequenceExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression] = js.native
    
    var SourceLocation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation] = js.native
    
    var Specifier: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Specifier] = js.native
    
    var SpreadElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElement] = js.native
    
    var SpreadElementPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern] = js.native
    
    var SpreadProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadProperty] = js.native
    
    var SpreadPropertyPattern: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern] = js.native
    
    var Statement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Statement] = js.native
    
    var StringLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral] = js.native
    
    var StringLiteralTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation] = js.native
    
    var StringTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation] = js.native
    
    var Super: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super] = js.native
    
    var SwitchCase: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchCase] = js.native
    
    var SwitchStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement] = js.native
    
    var SymbolTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation] = js.native
    
    var TSAnyKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAnyKeyword] = js.native
    
    var TSArrayType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSArrayType] = js.native
    
    var TSAsExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression] = js.native
    
    var TSBigIntKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword] = js.native
    
    var TSBooleanKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword] = js.native
    
    var TSCallSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration] = js.native
    
    var TSConditionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConditionalType] = js.native
    
    var TSConstructSignatureDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration] = js.native
    
    var TSConstructorType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructorType] = js.native
    
    var TSDeclareFunction: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction] = js.native
    
    var TSDeclareMethod: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod] = js.native
    
    var TSEnumDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration] = js.native
    
    var TSEnumMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember] = js.native
    
    var TSExportAssignment: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment] = js.native
    
    var TSExpressionWithTypeArguments: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments] = js.native
    
    var TSExternalModuleReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference] = js.native
    
    var TSFunctionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType] = js.native
    
    var TSHasOptionalTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation] = js.native
    
    var TSHasOptionalTypeParameterInstantiation: Type[
        typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
      ] = js.native
    
    var TSHasOptionalTypeParameters: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters] = js.native
    
    var TSImportEqualsDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration] = js.native
    
    var TSImportType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportType] = js.native
    
    var TSIndexSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature] = js.native
    
    var TSIndexedAccessType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType] = js.native
    
    var TSInferType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType] = js.native
    
    var TSInterfaceBody: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceBody] = js.native
    
    var TSInterfaceDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration] = js.native
    
    var TSIntersectionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIntersectionType] = js.native
    
    var TSLiteralType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType] = js.native
    
    var TSMappedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType] = js.native
    
    var TSMethodSignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature] = js.native
    
    var TSModuleBlock: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock] = js.native
    
    var TSModuleDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration] = js.native
    
    var TSNamedTupleMember: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember] = js.native
    
    var TSNamespaceExportDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration] = js.native
    
    var TSNeverKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNeverKeyword] = js.native
    
    var TSNonNullExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression] = js.native
    
    var TSNullKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNullKeyword] = js.native
    
    var TSNumberKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNumberKeyword] = js.native
    
    var TSObjectKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSObjectKeyword] = js.native
    
    var TSOptionalType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSOptionalType] = js.native
    
    var TSParameterProperty: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty] = js.native
    
    var TSParenthesizedType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParenthesizedType] = js.native
    
    var TSPropertySignature: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature] = js.native
    
    var TSQualifiedName: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSQualifiedName] = js.native
    
    var TSRestType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSRestType] = js.native
    
    var TSStringKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSStringKeyword] = js.native
    
    var TSSymbolKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword] = js.native
    
    var TSThisType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSThisType] = js.native
    
    var TSTupleType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType] = js.native
    
    var TSType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSType] = js.native
    
    var TSTypeAliasDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration] = js.native
    
    var TSTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation] = js.native
    
    var TSTypeAssertion: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion] = js.native
    
    var TSTypeLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral] = js.native
    
    var TSTypeOperator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeOperator] = js.native
    
    var TSTypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter] = js.native
    
    var TSTypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration] = js.native
    
    var TSTypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation] = js.native
    
    var TSTypePredicate: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate] = js.native
    
    var TSTypeQuery: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery] = js.native
    
    var TSTypeReference: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference] = js.native
    
    var TSUndefinedKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword] = js.native
    
    var TSUnionType: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType] = js.native
    
    var TSUnknownKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword] = js.native
    
    var TSVoidKeyword: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSVoidKeyword] = js.native
    
    var TaggedTemplateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression] = js.native
    
    var TemplateElement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement] = js.native
    
    var TemplateLiteral: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral] = js.native
    
    var ThisExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression] = js.native
    
    var ThisTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation] = js.native
    
    var ThrowStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement] = js.native
    
    var TryStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement] = js.native
    
    var TupleTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation] = js.native
    
    var TypeAlias: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias] = js.native
    
    var TypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation] = js.native
    
    var TypeCastExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression] = js.native
    
    var TypeParameter: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter] = js.native
    
    var TypeParameterDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration] = js.native
    
    var TypeParameterInstantiation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation] = js.native
    
    var TypeofTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation] = js.native
    
    var UnaryExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression] = js.native
    
    var UnionTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation] = js.native
    
    var UpdateExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression] = js.native
    
    var VariableDeclaration: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration] = js.native
    
    var VariableDeclarator: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclarator] = js.native
    
    var Variance: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.Variance] = js.native
    
    var VoidTypeAnnotation: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation] = js.native
    
    var WhileStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement] = js.native
    
    var WithStatement: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement] = js.native
    
    var YieldExpression: Type[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression] = js.native
  }
}
