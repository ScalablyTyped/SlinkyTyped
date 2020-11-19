package typingsSlinky.babylonWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorStatelessVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.mod.Node], 
    scala.Unit
  ]
  
  type AncestorVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.mod.Node], 
    scala.Unit
  ]
  
  type NodeTypes = typingsSlinky.babylonWalk.mod.coreTypes | typingsSlinky.babylonWalk.mod.es2015Types | typingsSlinky.babylonWalk.mod.flowTypes | typingsSlinky.babylonWalk.mod.jsxTypes | typingsSlinky.babylonWalk.mod.miscTypes
  
  type RecursiveVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* next */ js.Function1[/* node */ typingsSlinky.babelTypes.mod.Node, scala.Unit], 
    scala.Unit
  ]
  
  type SimpleVisitor = js.Function2[/* node */ typingsSlinky.babylonWalk.mod.NodeTypes, /* state */ js.Any, scala.Unit]
  
  type Visitor = js.Function2[
    /* commentBlock */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    scala.Unit
  ]
  
  type coreTypes = typingsSlinky.babelTypes.mod.ArrayExpression_ | typingsSlinky.babelTypes.mod.AssignmentExpression_ | typingsSlinky.babelTypes.mod.BinaryExpression_ | typingsSlinky.babelTypes.mod.Directive_ | typingsSlinky.babelTypes.mod.DirectiveLiteral_ | typingsSlinky.babelTypes.mod.BlockStatement_ | typingsSlinky.babelTypes.mod.BreakStatement_ | typingsSlinky.babelTypes.mod.CallExpression_ | typingsSlinky.babelTypes.mod.CatchClause_ | typingsSlinky.babelTypes.mod.ConditionalExpression_ | typingsSlinky.babelTypes.mod.ContinueStatement_ | typingsSlinky.babelTypes.mod.DebuggerStatement_ | typingsSlinky.babelTypes.mod.DoWhileStatement_ | typingsSlinky.babelTypes.mod.EmptyStatement_ | typingsSlinky.babelTypes.mod.ExpressionStatement_ | typingsSlinky.babelTypes.mod.File_ | typingsSlinky.babelTypes.mod.ForInStatement_ | typingsSlinky.babelTypes.mod.ForStatement_ | typingsSlinky.babelTypes.mod.FunctionDeclaration_ | typingsSlinky.babelTypes.mod.FunctionExpression_ | typingsSlinky.babelTypes.mod.Identifier_ | typingsSlinky.babelTypes.mod.IfStatement_ | typingsSlinky.babelTypes.mod.LabeledStatement_ | typingsSlinky.babelTypes.mod.StringLiteral_ | typingsSlinky.babelTypes.mod.NumericLiteral_ | typingsSlinky.babelTypes.mod.NullLiteral_ | typingsSlinky.babelTypes.mod.BooleanLiteral_ | typingsSlinky.babelTypes.mod.RegExpLiteral_ | typingsSlinky.babelTypes.mod.LogicalExpression_ | typingsSlinky.babelTypes.mod.MemberExpression_ | typingsSlinky.babelTypes.mod.NewExpression_ | typingsSlinky.babelTypes.mod.Program_ | typingsSlinky.babelTypes.mod.ObjectExpression_ | typingsSlinky.babelTypes.mod.ObjectMethod_ | typingsSlinky.babelTypes.mod.ObjectProperty_ | typingsSlinky.babelTypes.mod.RestElement_ | typingsSlinky.babelTypes.mod.ReturnStatement_ | typingsSlinky.babelTypes.mod.SequenceExpression_ | typingsSlinky.babelTypes.mod.SwitchCase_ | typingsSlinky.babelTypes.mod.SwitchStatement_ | typingsSlinky.babelTypes.mod.ThisExpression_ | typingsSlinky.babelTypes.mod.ThrowStatement_ | typingsSlinky.babelTypes.mod.TryStatement_ | typingsSlinky.babelTypes.mod.UnaryExpression_ | typingsSlinky.babelTypes.mod.UpdateExpression_ | typingsSlinky.babelTypes.mod.VariableDeclaration_ | typingsSlinky.babelTypes.mod.VariableDeclarator_ | typingsSlinky.babelTypes.mod.WhileStatement_ | typingsSlinky.babelTypes.mod.WithStatement_
  
  type es2015Types = typingsSlinky.babelTypes.mod.AssignmentPattern_ | typingsSlinky.babelTypes.mod.ArrayPattern_ | typingsSlinky.babelTypes.mod.ArrowFunctionExpression_ | typingsSlinky.babelTypes.mod.ClassBody_ | typingsSlinky.babelTypes.mod.ClassDeclaration_ | typingsSlinky.babelTypes.mod.ClassExpression_ | typingsSlinky.babelTypes.mod.ExportAllDeclaration_ | typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_ | typingsSlinky.babelTypes.mod.ExportNamedDeclaration_ | typingsSlinky.babelTypes.mod.ExportSpecifier_ | typingsSlinky.babelTypes.mod.ForOfStatement_ | typingsSlinky.babelTypes.mod.ImportDeclaration_ | typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_ | typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_ | typingsSlinky.babelTypes.mod.ImportSpecifier_ | typingsSlinky.babelTypes.mod.MetaProperty_ | typingsSlinky.babelTypes.mod.ClassMethod_ | typingsSlinky.babelTypes.mod.ObjectPattern_ | typingsSlinky.babelTypes.mod.SpreadElement_ | typingsSlinky.babelTypes.mod.Super | typingsSlinky.babelTypes.mod.TaggedTemplateExpression_ | typingsSlinky.babelTypes.mod.TemplateElement_ | typingsSlinky.babelTypes.mod.TemplateLiteral_ | typingsSlinky.babelTypes.mod.YieldExpression_ | typingsSlinky.babelTypes.mod.AwaitExpression_ | typingsSlinky.babelTypes.mod.BindExpression_ | typingsSlinky.babelTypes.mod.ClassProperty_ | typingsSlinky.babelTypes.mod.Decorator_ | typingsSlinky.babelTypes.mod.DoExpression_ | typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_ | typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_
  
  type flowTypes = typingsSlinky.babelTypes.mod.AnyTypeAnnotation_ | typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_ | typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_ | typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_ | typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_ | typingsSlinky.babelTypes.mod.ClassImplements_ | typingsSlinky.babelTypes.mod.DeclareClass_ | typingsSlinky.babelTypes.mod.DeclareFunction_ | typingsSlinky.babelTypes.mod.DeclareInterface_ | typingsSlinky.babelTypes.mod.DeclareModule_ | typingsSlinky.babelTypes.mod.DeclareTypeAlias_ | typingsSlinky.babelTypes.mod.DeclareVariable_ | typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_ | typingsSlinky.babelTypes.mod.FunctionTypeParam_ | typingsSlinky.babelTypes.mod.GenericTypeAnnotation_ | typingsSlinky.babelTypes.mod.InterfaceExtends_ | typingsSlinky.babelTypes.mod.InterfaceDeclaration_ | typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_ | typingsSlinky.babelTypes.mod.MixedTypeAnnotation_ | typingsSlinky.babelTypes.mod.NullableTypeAnnotation_ | typingsSlinky.babelTypes.mod.NumberTypeAnnotation_ | typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_ | typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_ | typingsSlinky.babelTypes.mod.ObjectTypeIndexer_ | typingsSlinky.babelTypes.mod.ObjectTypeProperty_ | typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_ | typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_ | typingsSlinky.babelTypes.mod.StringTypeAnnotation_ | typingsSlinky.babelTypes.mod.ThisTypeAnnotation_ | typingsSlinky.babelTypes.mod.TupleTypeAnnotation_ | typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_ | typingsSlinky.babelTypes.mod.TypeAlias_ | typingsSlinky.babelTypes.mod.TypeAnnotation_ | typingsSlinky.babelTypes.mod.TypeCastExpression_ | typingsSlinky.babelTypes.mod.TypeParameterDeclaration_ | typingsSlinky.babelTypes.mod.TypeParameterInstantiation_ | typingsSlinky.babelTypes.mod.UnionTypeAnnotation_ | typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
  
  type jsxTypes = typingsSlinky.babelTypes.mod.JSXAttribute_ | typingsSlinky.babelTypes.mod.JSXClosingElement_ | typingsSlinky.babelTypes.mod.JSXElement_ | typingsSlinky.babelTypes.mod.JSXEmptyExpression_ | typingsSlinky.babelTypes.mod.JSXExpressionContainer_ | typingsSlinky.babelTypes.mod.JSXIdentifier_ | typingsSlinky.babelTypes.mod.JSXMemberExpression_ | typingsSlinky.babelTypes.mod.JSXNamespacedName_ | typingsSlinky.babelTypes.mod.JSXOpeningElement_ | typingsSlinky.babelTypes.mod.JSXSpreadAttribute_ | typingsSlinky.babelTypes.mod.JSXText_
  
  type miscTypes = typingsSlinky.babelTypes.mod.Noop_ | typingsSlinky.babelTypes.mod.ParenthesizedExpression_
}
