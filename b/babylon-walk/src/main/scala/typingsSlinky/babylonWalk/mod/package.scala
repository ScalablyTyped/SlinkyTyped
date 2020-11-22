package typingsSlinky.babylonWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorStatelessVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.ts36Mod.Node], 
    scala.Unit
  ]
  
  type AncestorVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.ts36Mod.Node], 
    scala.Unit
  ]
  
  type NodeTypes = typingsSlinky.babylonWalk.mod.coreTypes | typingsSlinky.babylonWalk.mod.es2015Types | typingsSlinky.babylonWalk.mod.flowTypes | typingsSlinky.babylonWalk.mod.jsxTypes | typingsSlinky.babylonWalk.mod.miscTypes
  
  type RecursiveVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* next */ js.Function1[/* node */ typingsSlinky.babelTypes.ts36Mod.Node, scala.Unit], 
    scala.Unit
  ]
  
  type SimpleVisitor = js.Function2[/* node */ typingsSlinky.babylonWalk.mod.NodeTypes, /* state */ js.Any, scala.Unit]
  
  type Visitor = js.Function2[
    /* commentBlock */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    scala.Unit
  ]
  
  type coreTypes = typingsSlinky.babelTypes.ts36Mod.ArrayExpression_ | typingsSlinky.babelTypes.ts36Mod.AssignmentExpression_ | typingsSlinky.babelTypes.ts36Mod.BinaryExpression_ | typingsSlinky.babelTypes.ts36Mod.Directive_ | typingsSlinky.babelTypes.ts36Mod.DirectiveLiteral_ | typingsSlinky.babelTypes.ts36Mod.BlockStatement_ | typingsSlinky.babelTypes.ts36Mod.BreakStatement_ | typingsSlinky.babelTypes.ts36Mod.CallExpression_ | typingsSlinky.babelTypes.ts36Mod.CatchClause_ | typingsSlinky.babelTypes.ts36Mod.ConditionalExpression_ | typingsSlinky.babelTypes.ts36Mod.ContinueStatement_ | typingsSlinky.babelTypes.ts36Mod.DebuggerStatement_ | typingsSlinky.babelTypes.ts36Mod.DoWhileStatement_ | typingsSlinky.babelTypes.ts36Mod.EmptyStatement_ | typingsSlinky.babelTypes.ts36Mod.ExpressionStatement_ | typingsSlinky.babelTypes.ts36Mod.File_ | typingsSlinky.babelTypes.ts36Mod.ForInStatement_ | typingsSlinky.babelTypes.ts36Mod.ForStatement_ | typingsSlinky.babelTypes.ts36Mod.FunctionDeclaration_ | typingsSlinky.babelTypes.ts36Mod.FunctionExpression_ | typingsSlinky.babelTypes.ts36Mod.Identifier_ | typingsSlinky.babelTypes.ts36Mod.IfStatement_ | typingsSlinky.babelTypes.ts36Mod.LabeledStatement_ | typingsSlinky.babelTypes.ts36Mod.StringLiteral_ | typingsSlinky.babelTypes.ts36Mod.NumericLiteral_ | typingsSlinky.babelTypes.ts36Mod.NullLiteral_ | typingsSlinky.babelTypes.ts36Mod.BooleanLiteral_ | typingsSlinky.babelTypes.ts36Mod.RegExpLiteral_ | typingsSlinky.babelTypes.ts36Mod.LogicalExpression_ | typingsSlinky.babelTypes.ts36Mod.MemberExpression_ | typingsSlinky.babelTypes.ts36Mod.NewExpression_ | typingsSlinky.babelTypes.ts36Mod.Program_ | typingsSlinky.babelTypes.ts36Mod.ObjectExpression_ | typingsSlinky.babelTypes.ts36Mod.ObjectMethod_ | typingsSlinky.babelTypes.ts36Mod.ObjectProperty_ | typingsSlinky.babelTypes.ts36Mod.RestElement_ | typingsSlinky.babelTypes.ts36Mod.ReturnStatement_ | typingsSlinky.babelTypes.ts36Mod.SequenceExpression_ | typingsSlinky.babelTypes.ts36Mod.SwitchCase_ | typingsSlinky.babelTypes.ts36Mod.SwitchStatement_ | typingsSlinky.babelTypes.ts36Mod.ThisExpression_ | typingsSlinky.babelTypes.ts36Mod.ThrowStatement_ | typingsSlinky.babelTypes.ts36Mod.TryStatement_ | typingsSlinky.babelTypes.ts36Mod.UnaryExpression_ | typingsSlinky.babelTypes.ts36Mod.UpdateExpression_ | typingsSlinky.babelTypes.ts36Mod.VariableDeclaration_ | typingsSlinky.babelTypes.ts36Mod.VariableDeclarator_ | typingsSlinky.babelTypes.ts36Mod.WhileStatement_ | typingsSlinky.babelTypes.ts36Mod.WithStatement_
  
  type es2015Types = typingsSlinky.babelTypes.ts36Mod.AssignmentPattern_ | typingsSlinky.babelTypes.ts36Mod.ArrayPattern_ | typingsSlinky.babelTypes.ts36Mod.ArrowFunctionExpression_ | typingsSlinky.babelTypes.ts36Mod.ClassBody_ | typingsSlinky.babelTypes.ts36Mod.ClassDeclaration_ | typingsSlinky.babelTypes.ts36Mod.ClassExpression_ | typingsSlinky.babelTypes.ts36Mod.ExportAllDeclaration_ | typingsSlinky.babelTypes.ts36Mod.ExportDefaultDeclaration_ | typingsSlinky.babelTypes.ts36Mod.ExportNamedDeclaration_ | typingsSlinky.babelTypes.ts36Mod.ExportSpecifier_ | typingsSlinky.babelTypes.ts36Mod.ForOfStatement_ | typingsSlinky.babelTypes.ts36Mod.ImportDeclaration_ | typingsSlinky.babelTypes.ts36Mod.ImportDefaultSpecifier_ | typingsSlinky.babelTypes.ts36Mod.ImportNamespaceSpecifier_ | typingsSlinky.babelTypes.ts36Mod.ImportSpecifier_ | typingsSlinky.babelTypes.ts36Mod.MetaProperty_ | typingsSlinky.babelTypes.ts36Mod.ClassMethod_ | typingsSlinky.babelTypes.ts36Mod.ObjectPattern_ | typingsSlinky.babelTypes.ts36Mod.SpreadElement_ | typingsSlinky.babelTypes.ts36Mod.Super | typingsSlinky.babelTypes.ts36Mod.TaggedTemplateExpression_ | typingsSlinky.babelTypes.ts36Mod.TemplateElement_ | typingsSlinky.babelTypes.ts36Mod.TemplateLiteral_ | typingsSlinky.babelTypes.ts36Mod.YieldExpression_ | typingsSlinky.babelTypes.ts36Mod.AwaitExpression_ | typingsSlinky.babelTypes.ts36Mod.BindExpression_ | typingsSlinky.babelTypes.ts36Mod.ClassProperty_ | typingsSlinky.babelTypes.ts36Mod.Decorator_ | typingsSlinky.babelTypes.ts36Mod.DoExpression_ | typingsSlinky.babelTypes.ts36Mod.ExportDefaultSpecifier_ | typingsSlinky.babelTypes.ts36Mod.ExportNamespaceSpecifier_
  
  type flowTypes = typingsSlinky.babelTypes.ts36Mod.AnyTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.ArrayTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.BooleanTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.NullLiteralTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.ClassImplements_ | typingsSlinky.babelTypes.ts36Mod.DeclareClass_ | typingsSlinky.babelTypes.ts36Mod.DeclareFunction_ | typingsSlinky.babelTypes.ts36Mod.DeclareInterface_ | typingsSlinky.babelTypes.ts36Mod.DeclareModule_ | typingsSlinky.babelTypes.ts36Mod.DeclareTypeAlias_ | typingsSlinky.babelTypes.ts36Mod.DeclareVariable_ | typingsSlinky.babelTypes.ts36Mod.FunctionTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.FunctionTypeParam_ | typingsSlinky.babelTypes.ts36Mod.GenericTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.InterfaceExtends_ | typingsSlinky.babelTypes.ts36Mod.InterfaceDeclaration_ | typingsSlinky.babelTypes.ts36Mod.IntersectionTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.MixedTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.NullableTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.NumberTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.ObjectTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.ObjectTypeCallProperty_ | typingsSlinky.babelTypes.ts36Mod.ObjectTypeIndexer_ | typingsSlinky.babelTypes.ts36Mod.ObjectTypeProperty_ | typingsSlinky.babelTypes.ts36Mod.QualifiedTypeIdentifier_ | typingsSlinky.babelTypes.ts36Mod.StringLiteralTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.StringTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.ThisTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.TupleTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.TypeofTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.TypeAlias_ | typingsSlinky.babelTypes.ts36Mod.TypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.TypeCastExpression_ | typingsSlinky.babelTypes.ts36Mod.TypeParameterDeclaration_ | typingsSlinky.babelTypes.ts36Mod.TypeParameterInstantiation_ | typingsSlinky.babelTypes.ts36Mod.UnionTypeAnnotation_ | typingsSlinky.babelTypes.ts36Mod.VoidTypeAnnotation_
  
  type jsxTypes = typingsSlinky.babelTypes.ts36Mod.JSXAttribute_ | typingsSlinky.babelTypes.ts36Mod.JSXClosingElement_ | typingsSlinky.babelTypes.ts36Mod.JSXElement_ | typingsSlinky.babelTypes.ts36Mod.JSXEmptyExpression_ | typingsSlinky.babelTypes.ts36Mod.JSXExpressionContainer_ | typingsSlinky.babelTypes.ts36Mod.JSXIdentifier_ | typingsSlinky.babelTypes.ts36Mod.JSXMemberExpression_ | typingsSlinky.babelTypes.ts36Mod.JSXNamespacedName_ | typingsSlinky.babelTypes.ts36Mod.JSXOpeningElement_ | typingsSlinky.babelTypes.ts36Mod.JSXSpreadAttribute_ | typingsSlinky.babelTypes.ts36Mod.JSXText_
  
  type miscTypes = typingsSlinky.babelTypes.ts36Mod.Noop_ | typingsSlinky.babelTypes.ts36Mod.ParenthesizedExpression_
}
