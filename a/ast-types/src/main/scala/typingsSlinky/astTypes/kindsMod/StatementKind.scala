package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BlockStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExpressionStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.IfStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ContinueStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.WithStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SwitchStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ReturnStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThrowStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.WhileStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForInStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DebuggerStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForOfStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareVariable
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareFunction
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModule
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Noop
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExportAssignment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
*/
trait StatementKind extends js.Object

object StatementKind {
  @scala.inline
  implicit def apply(value: BlockStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: BreakStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassBody): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassMethod): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassPrivateProperty): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassProperty): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ClassPropertyDefinition): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ContinueStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DebuggerStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareClass): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareExportAllDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareExportDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareFunction): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareInterface): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareModule): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareModuleExports): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareOpaqueType): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareTypeAlias): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DeclareVariable): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: DoWhileStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: EmptyStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ExportAllDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ExportDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ExpressionStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ForAwaitStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ForInStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ForOfStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ForStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: IfStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ImportDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: LabeledStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: MethodDefinition): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: Noop): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: OpaqueType): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ReturnStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: SwitchStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSDeclareFunction): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSDeclareMethod): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSEnumDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSExportAssignment): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSExternalModuleReference): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSImportEqualsDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSIndexSignature): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSInterfaceDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSMethodSignature): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSModuleDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSNamespaceExportDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSPropertySignature): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSTypeAliasDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TSTypeParameterDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: ThrowStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TryStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: TypeAlias): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: VariableDeclaration): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: WhileStatement): StatementKind = value.asInstanceOf[StatementKind]
  @scala.inline
  implicit def apply(value: WithStatement): StatementKind = value.asInstanceOf[StatementKind]
}

