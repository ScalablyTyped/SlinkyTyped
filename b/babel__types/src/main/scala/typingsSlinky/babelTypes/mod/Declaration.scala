package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareClass
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareFunction
import typingsSlinky.babelTypes.babelTypesStrings.DeclareInterface
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModule
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModuleExports
import typingsSlinky.babelTypes.babelTypesStrings.DeclareOpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.DeclareTypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.DeclareVariable
import typingsSlinky.babelTypes.babelTypesStrings.EnumDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.FunctionDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ImportDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.OpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.TSDeclareFunction
import typingsSlinky.babelTypes.babelTypesStrings.TSEnumDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSInterfaceDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSModuleDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.VariableDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.`var`
import typingsSlinky.babelTypes.babelTypesStrings.const
import typingsSlinky.babelTypes.babelTypesStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.VariableDeclaration_
  - typingsSlinky.babelTypes.mod.ClassDeclaration_
  - typingsSlinky.babelTypes.mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.mod.ExportNamedDeclaration_
  - typingsSlinky.babelTypes.mod.ImportDeclaration_
  - typingsSlinky.babelTypes.mod.DeclareClass_
  - typingsSlinky.babelTypes.mod.DeclareFunction_
  - typingsSlinky.babelTypes.mod.DeclareInterface_
  - typingsSlinky.babelTypes.mod.DeclareModule_
  - typingsSlinky.babelTypes.mod.DeclareModuleExports_
  - typingsSlinky.babelTypes.mod.DeclareTypeAlias_
  - typingsSlinky.babelTypes.mod.DeclareOpaqueType_
  - typingsSlinky.babelTypes.mod.DeclareVariable_
  - typingsSlinky.babelTypes.mod.DeclareExportDeclaration_
  - typingsSlinky.babelTypes.mod.DeclareExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.InterfaceDeclaration_
  - typingsSlinky.babelTypes.mod.OpaqueType_
  - typingsSlinky.babelTypes.mod.TypeAlias_
  - typingsSlinky.babelTypes.mod.EnumDeclaration_
  - typingsSlinky.babelTypes.mod.TSDeclareFunction_
  - typingsSlinky.babelTypes.mod.TSInterfaceDeclaration_
  - typingsSlinky.babelTypes.mod.TSTypeAliasDeclaration_
  - typingsSlinky.babelTypes.mod.TSEnumDeclaration_
  - typingsSlinky.babelTypes.mod.TSModuleDeclaration_
*/
trait Declaration extends _Node

object Declaration {
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): Declaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    `type`: ImportDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TSEnumDeclaration_(id: Identifier_, members: js.Array[TSEnumMember_], `type`: TSEnumDeclaration): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def VariableDeclaration_(
    declarations: js.Array[VariableDeclarator_],
    kind: `var` | let | const,
    `type`: VariableDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): Declaration = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TSDeclareFunction_(
    async: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: TSDeclareFunction
  ): Declaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TSInterfaceDeclaration_(body: TSInterfaceBody_, id: Identifier_, `type`: TSInterfaceDeclaration): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def EnumDeclaration_(
    body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_,
    id: Identifier_,
    `type`: EnumDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression,
    `type`: ExportDefaultDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def ExportAllDeclaration_(source: StringLiteral_, `type`: ExportAllDeclaration): Declaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TSModuleDeclaration_(
    body: TSModuleBlock_ | typingsSlinky.babelTypes.mod.TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TSTypeAliasDeclaration_(id: Identifier_, `type`: TSTypeAliasDeclaration, typeAnnotation: TSType): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): Declaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def ClassDeclaration_(
    body: js.Any,
    decorators: js.Any,
    id: js.Any,
    implements: js.Any,
    mixins: js.Any,
    superClass: js.Any,
    superTypeParameters: js.Any,
    `type`: ClassDeclaration,
    typeParameters: js.Any
  ): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): Declaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): Declaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  def ExportNamedDeclaration_(
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    `type`: ExportNamedDeclaration
  ): Declaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

