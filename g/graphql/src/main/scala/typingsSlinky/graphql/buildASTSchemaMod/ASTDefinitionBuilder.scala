package typingsSlinky.graphql.buildASTSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.TypeDefinitionNode
import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
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

