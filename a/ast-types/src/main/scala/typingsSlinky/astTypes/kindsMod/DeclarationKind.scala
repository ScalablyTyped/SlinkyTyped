package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
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
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VariableDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
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
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
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
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
*/
trait DeclarationKind extends js.Object

object DeclarationKind {
  @scala.inline
  implicit def apply(value: ClassBody): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassMethod): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassPrivateProperty): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassProperty): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ClassPropertyDefinition): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareClass): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareExportAllDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareExportDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareInterface): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareOpaqueType): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareTypeAlias): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ExportAllDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ExportDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ExportDefaultDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ExportNamedDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: ImportDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: MethodDefinition): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: OpaqueType): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSCallSignatureDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSConstructSignatureDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSDeclareFunction): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSDeclareMethod): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSEnumDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSExternalModuleReference): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSImportEqualsDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSIndexSignature): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSInterfaceDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSMethodSignature): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSModuleDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSNamespaceExportDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSPropertySignature): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSTypeAliasDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TSTypeParameterDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: TypeAlias): DeclarationKind = value.asInstanceOf[DeclarationKind]
  @scala.inline
  implicit def apply(value: VariableDeclaration): DeclarationKind = value.asInstanceOf[DeclarationKind]
}

