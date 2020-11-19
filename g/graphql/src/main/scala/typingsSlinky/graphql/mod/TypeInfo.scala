package typingsSlinky.graphql.mod

import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.typeInfoMod.getFieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "TypeInfo")
@js.native
class TypeInfo protected ()
  extends typingsSlinky.graphql.utilitiesMod.TypeInfo {
  def this(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema) = this()
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef
  ) = this()
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: js.UndefOr[scala.Nothing],
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef,
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
}
