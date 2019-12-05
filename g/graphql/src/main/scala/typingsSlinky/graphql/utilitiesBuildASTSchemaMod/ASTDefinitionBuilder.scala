package typingsSlinky.graphql.utilitiesBuildASTSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.DirectiveDefinitionNode
import typingsSlinky.graphql.languageAstMod.EnumValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.FieldDefinitionNode
import typingsSlinky.graphql.languageAstMod.InputValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.NamedTypeNode
import typingsSlinky.graphql.languageAstMod.TypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.TypeNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumValueConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "ASTDefinitionBuilder")
@js.native
class ASTDefinitionBuilder protected () extends js.Object {
  def this(options: Maybe[BuildSchemaOptions], resolveType: TypeResolver) = this()
  def buildArg(value: InputValueDefinitionNode): GraphQLArgumentConfig = js.native
  def buildDirective(directive: DirectiveDefinitionNode): GraphQLDirective = js.native
  def buildEnumValue(value: EnumValueDefinitionNode): GraphQLEnumValueConfig = js.native
  def buildField(field: FieldDefinitionNode): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def buildInputField(value: InputValueDefinitionNode): GraphQLInputFieldConfig = js.native
  def buildType(node: NamedTypeNode): GraphQLNamedType = js.native
  def buildType(node: TypeDefinitionNode): GraphQLNamedType = js.native
  def getNamedType(node: NamedTypeNode): GraphQLNamedType = js.native
  def getWrappedType(node: TypeNode): GraphQLType = js.native
}

