package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import typingsSlinky.graphql.utilitiesTypeInfoMod.getFieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "TypeInfo")
@js.native
class TypeInfo protected ()
  extends typingsSlinky.graphql.utilitiesMod.TypeInfo {
  def this(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema) = this()
  def this(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef
  ) = this()
  def this(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef,
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
}

